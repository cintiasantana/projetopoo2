package com.odontoclean.paciente;

import java.util.ArrayList;
import java.util.List;


public class RepositorioPacienteArrayList implements IRepositorioPaciente {

	private ArrayList<Paciente> pacientes;
	private int id;
	
	public RepositorioPacienteArrayList() {
		pacientes = new ArrayList<Paciente>();
		id = 1;
	}
	@Override
	public void cadastrarPaciente(Paciente paciente) throws PacienteJaCadastradoException {
		paciente.setCodigo(id);
		pacientes.add(paciente);
		id++;
		
	}

	@Override
	public void atualizarPaciente(Paciente paciente) throws PacienteNaoEncontradoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removerPaciente(String cpf) throws PacienteNaoEncontradoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Paciente procurarPaciente(String cpf) throws PacienteNaoEncontradoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean pacienteExiste(String cpf) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Paciente> listarPaciente() {
		// TODO Auto-generated method stub
		return pacientes;
	}

}
