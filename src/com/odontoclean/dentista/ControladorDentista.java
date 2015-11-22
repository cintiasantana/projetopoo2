package com.odontoclean.dentista;

import java.util.ArrayList;

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
		// Valida��es das Informa��es
		if (dentista == null) throw new IllegalArgumentException("Dentista Inv�lido.");
	    if (!ValidarCPF.validaCPF(dentista.getCpf())) throw new CPFInvalidoException(dentista.getCpf());
	    if (dentista.getNome().equals("")) throw new CampoObritarorioInvalidoException("Nome");
	    
	    // Cadastrando Paciente
	    this.repositorioDentista.cadastrar(dentista);
	    // Cadastrando Endereco
	    controladorEndereco.cadastrar(dentista.getEndereco());
	}
	public void atualizar(Dentista dentista) throws CPFInvalidoException, 
												  CampoObritarorioInvalidoException, 
												  DentistaNaoEncontradoException, 
												  EnderecoNaoEncontradoException {
		// Valida��es da Classe Paciente		
		if (!ValidarCPF.validaCPF(dentista.getCpf())) throw new CPFInvalidoException(dentista.getCpf());
		if (dentista.getNome() == "") 			throw new CampoObritarorioInvalidoException("Nome � nulo ou Inv�lido.");
		
		this.repositorioDentista.atualizar(dentista);
		controladorEndereco.atualizar(dentista.getEndereco());
	}
	public void remover(String cpf) throws CPFInvalidoException, DentistaNaoEncontradoException, EnderecoNaoEncontradoException, CampoObritarorioInvalidoException {
		Dentista dentista = null;
		// Limpando a formata��o do CPF;
		cpf = cpf.replaceAll("\\.|\\-|\\ ", "");
		// Valida��es da Classe Paciente
		if (!ValidarCPF.validaCPF(cpf)) throw new CPFInvalidoException(cpf);
		dentista = this.procurar(cpf);
		controladorEndereco.remover(dentista.getEndereco().getId());
		this.repositorioDentista.remover(cpf);
	}
	public Dentista procurar(String cpf) throws CPFInvalidoException, DentistaNaoEncontradoException, EnderecoNaoEncontradoException {
		Dentista dentista = null;
		Endereco endereco = null;
		// Limpando a formata��o do CPF;
		cpf = cpf.replaceAll("\\.|\\-|\\ ", "");
		// Valida��es da Classe Paciente
		if (!ValidarCPF.validaCPF(cpf)) throw new CPFInvalidoException(cpf);
		
		dentista = this.repositorioDentista.procurar(cpf);
		endereco = controladorEndereco.procurarPorPaciente(dentista.getEndereco().getId());
		dentista.setEndereco(endereco);
		return dentista;
	}
	public ArrayList<Dentista> listar() {
		ArrayList<Dentista> dentistas = null;
		Endereco endereco = null;
		
		dentistas =  this.repositorioDentista.listar();
		for(Dentista dentista : dentistas) {
			try {
				endereco = controladorEndereco.procurarPorPaciente(dentista.getCodigo());
				dentista.setEndereco(endereco);
			} catch (EnderecoNaoEncontradoException e) {}
		}
		return dentistas;
	}
}
