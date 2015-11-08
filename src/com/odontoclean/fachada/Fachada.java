package com.odontoclean.fachada;

import java.util.ArrayList;

import com.odontoclean.endereco.EnderecoJaCadastradoException;
import com.odontoclean.endereco.EnderecoNaoEncontradoException;
import com.odontoclean.paciente.CPFInvalidoException;
import com.odontoclean.paciente.ControladorPaciente;
import com.odontoclean.paciente.Paciente;
import com.odontoclean.paciente.PacienteJaCadastradoException;
import com.odontoclean.paciente.PacienteNaoEncontradoException;
import com.odontoclean.util.CampoObritarorioInvalidoException;



public class Fachada {
	private static Fachada instance;
	private ControladorPaciente controladorPaciente;
	
	
	private Fachada() {
		this.controladorPaciente = new ControladorPaciente();
	}
	
	
	public static Fachada getInstance() {
		if (Fachada.instance == null) {
			Fachada.instance = new Fachada();
		}
		return Fachada.instance;
	}
	
	
	public void cadastrarPaciente(Paciente paciente) throws IllegalArgumentException, CPFInvalidoException, PacienteJaCadastradoException, CampoObritarorioInvalidoException, EnderecoJaCadastradoException { 
		this.controladorPaciente.cadastrar(paciente);
		
	}
	
	
	public void atualizarPaciente(Paciente paciente) throws CPFInvalidoException, CampoObritarorioInvalidoException, PacienteNaoEncontradoException, EnderecoNaoEncontradoException { 
		this.controladorPaciente.atualizar(paciente);
	}
	
	
	public void removerPaciente(String cpf) throws CPFInvalidoException, PacienteNaoEncontradoException, EnderecoNaoEncontradoException, CampoObritarorioInvalidoException { 
		this.controladorPaciente.remover(cpf);
	}
	
	
	public Paciente procurarPaciente(String cpf) throws CPFInvalidoException, PacienteNaoEncontradoException, EnderecoNaoEncontradoException { 
		return this.controladorPaciente.procurar(cpf);
	}
	
	
	public ArrayList<Paciente> listarPaciente() { 
		return this.controladorPaciente.listar();
	}

}
