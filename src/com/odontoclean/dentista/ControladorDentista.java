package com.odontoclean.dentista;

import java.util.ArrayList;
import java.util.List;

import com.odontoclean.endereco.ControladorEndereco;
import com.odontoclean.endereco.Endereco;
import com.odontoclean.endereco.EnderecoJaCadastradoException;
import com.odontoclean.endereco.EnderecoNaoEncontradoException;
import com.odontoclean.paciente.CPFInvalidoException;
import com.odontoclean.util.CampoObritarorioInvalidoException;
import com.odontoclean.util.ValidarCPF;





public class ControladorDentista {

	private IRepositorioDentista repositorioDentista;
	private ControladorEndereco controladorEndereco;
	
	public ControladorDentista() {
		this.repositorioDentista = new RepositorioDentistaArray();
		this.controladorEndereco = new ControladorEndereco();
	}
	public void cadastrar(Dentista dentista) throws IllegalArgumentException, 
												  CPFInvalidoException, 
												  DentistaJaCadastradoException, 
												  CampoObritarorioInvalidoException, 
												  EnderecoJaCadastradoException  {
		// Validações das Informações
		if (dentista == null) throw new IllegalArgumentException("Dentista Inválido.");
	    if (!ValidarCPF.validaCPF(dentista.getCpf())) throw new CPFInvalidoException(dentista.getCpf());
	    if (dentista.getNome().equals("")) throw new CampoObritarorioInvalidoException("Nome");
	    
	    // Cadastrando Paciente
	    this.repositorioDentista.cadastrarDentista(dentista);
	    // Cadastrando Endereco
	    controladorEndereco.cadastrar(dentista.getEndereco());
	}
	public void atualizar(Dentista dentista) throws CPFInvalidoException, 
												  CampoObritarorioInvalidoException, 
												  DentistaNaoEncontradoException, 
												  EnderecoNaoEncontradoException {
		// Validações da Classe Paciente		
		if (!ValidarCPF.validaCPF(dentista.getCpf())) throw new CPFInvalidoException(dentista.getCpf());
		if (dentista.getNome() == "") 			throw new CampoObritarorioInvalidoException("Nome é nulo ou Inválido.");
		
		this.repositorioDentista.atualizarDentista(dentista);
		controladorEndereco.atualizar(dentista.getEndereco());
	}
	public void remover(String cpf) throws CPFInvalidoException, DentistaNaoEncontradoException, EnderecoNaoEncontradoException, CampoObritarorioInvalidoException {
		Dentista dentista = null;
		// Limpando a formatação do CPF;
		cpf = cpf.replaceAll("\\.|\\-|\\ ", "");
		// Validações da Classe Paciente
		if (!ValidarCPF.validaCPF(cpf)) throw new CPFInvalidoException(cpf);
		dentista = this.procurar(cpf);
		controladorEndereco.remover(dentista.getEndereco().getId());
		this.repositorioDentista.removerDentista(cpf);
	}
	public Dentista procurar(String cpf) throws CPFInvalidoException, DentistaNaoEncontradoException, EnderecoNaoEncontradoException {
		Dentista dentista = null;
		Endereco endereco = null;
		// Limpando a formatação do CPF;
		cpf = cpf.replaceAll("\\.|\\-|\\ ", "");
		// Validações da Classe Paciente
		if (!ValidarCPF.validaCPF(cpf)) throw new CPFInvalidoException(cpf);
		
		dentista = this.repositorioDentista.procurarDentista(cpf);
		endereco = controladorEndereco.procurarPorPaciente(dentista.getEndereco().getId());
		dentista.setEndereco(endereco);
		return dentista;
	}
	public ArrayList<Dentista> listar() {
		ArrayList<Dentista> dentistas = null;
		Endereco endereco = null;
		
		dentistas = this.repositorioDentista.listarDentista();
		for(Dentista dentista : dentistas) {
			try {
				endereco = controladorEndereco.procurarPorPaciente(dentista.getCodigo());
				dentista.setEndereco(endereco);
			} catch (EnderecoNaoEncontradoException e) {}
		}
		return dentistas;
	}
}
