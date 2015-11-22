package com.odontoclean.paciente;

import java.util.ArrayList;
import java.util.List;

import com.odontoclean.endereco.ControladorEndereco;
import com.odontoclean.endereco.Endereco;
import com.odontoclean.endereco.EnderecoJaCadastradoException;
import com.odontoclean.endereco.EnderecoNaoEncontradoException;
import com.odontoclean.util.CampoObritarorioInvalidoException;
import com.odontoclean.util.ValidarCPF;



public class ControladorPaciente {
	private IRepositorioPaciente repositorioPaciente;
	private ControladorEndereco controladorEndereco;
	
	public ControladorPaciente() {
		this.repositorioPaciente = new RepositorioPacienteArray();
		this.controladorEndereco = new ControladorEndereco();
	}
	public void cadastrarPaciente(Paciente paciente) throws IllegalArgumentException, 
												  CPFInvalidoException, 
												  PacienteJaCadastradoException, 
												  CampoObritarorioInvalidoException, 
												  EnderecoJaCadastradoException  {
		// Validações das Informações
		if (paciente == null) throw new IllegalArgumentException("Paciente Inválido.");
	    if (!ValidarCPF.validaCPF(paciente.getCpf())) throw new CPFInvalidoException(paciente.getCpf());
	    if (paciente.getNome().equals("")) throw new CampoObritarorioInvalidoException("Nome");
	    
	    // Cadastrando Paciente
	    this.repositorioPaciente.cadastrarPaciente(paciente);
	    // Cadastrando Endereco
	    controladorEndereco.cadastrarEndereco(paciente.getEndereco());
	}
	public void atualizar(Paciente paciente) throws CPFInvalidoException, 
												  CampoObritarorioInvalidoException, 
												  PacienteNaoEncontradoException, 
												  EnderecoNaoEncontradoException {
		// Validações da Classe Paciente		
		if (!ValidarCPF.validaCPF(paciente.getCpf())) throw new CPFInvalidoException(paciente.getCpf());
		if (paciente.getNome() == "") 			throw new CampoObritarorioInvalidoException("Nome é nulo ou Inválido.");
		
		this.repositorioPaciente.atualizarPaciente(paciente);
		controladorEndereco.atualizar(paciente.getEndereco());
	}
	public void remover(String cpf) throws CPFInvalidoException, PacienteNaoEncontradoException, EnderecoNaoEncontradoException, CampoObritarorioInvalidoException {
		Paciente paciente = null;
		// Limpando a formatação do CPF;
		cpf = cpf.replaceAll("\\.|\\-|\\ ", "");
		// Validações da Classe Paciente
		if (!ValidarCPF.validaCPF(cpf)) throw new CPFInvalidoException(cpf);
		paciente = this.procurar(cpf);
		controladorEndereco.removerEndereco(paciente.getEndereco().getId());
		this.repositorioPaciente.removerPaciente(cpf);
	}
	public Paciente procurar(String cpf) throws CPFInvalidoException, PacienteNaoEncontradoException, EnderecoNaoEncontradoException {
		Paciente paciente = null;
		Endereco endereco = null;
		// Limpando a formatação do CPF;
		cpf = cpf.replaceAll("\\.|\\-|\\ ", "");
		// Validações da Classe Paciente
		if (!ValidarCPF.validaCPF(cpf)) throw new CPFInvalidoException(cpf);
		
		paciente = this.repositorioPaciente.procurarPaciente(cpf);
		endereco = controladorEndereco.procurarPorPaciente(paciente.getEndereco().getId());
		paciente.setEndereco(endereco);
		return paciente;
	}
	public List<Paciente> listarPaciente() {
		List<Paciente> pacientes = null;
		Endereco endereco = null;
		
		pacientes =  this.repositorioPaciente.listarPaciente();
		for(Paciente paciente: pacientes) {
			try {
				endereco = controladorEndereco.procurarPorPaciente(paciente.getCodigo());
				paciente.setEndereco(endereco);
			} catch (EnderecoNaoEncontradoException e) {}
		}
		return pacientes;
	}
}
