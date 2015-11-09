package com.odontoclean.paciente;

import java.util.ArrayList;


public class RepositorioPacienteArrayList implements IRepositorioPaciente{
	private ArrayList<Paciente> pacientes;
	private int id;
	
	public RepositorioPacienteArrayList() {
		pacientes = new ArrayList<Paciente>();
		id = 1;
	}
	@Override
	public void cadastrar(Paciente paciente) throws PacienteJaCadastradoException {
		paciente.setCodigo(id);
		pacientes.add(paciente);
		id++;
		
	}

	@Override
	public void atualizar(Paciente paciente) throws PacienteNaoEncontradoException {

		
	}

	@Override
	public void remover(String cpf) throws PacienteNaoEncontradoException {
	pacientes.remove(cpf);
	id--;
		
	}

	@Override
	public Paciente procurar(String cpf) throws PacienteNaoEncontradoException {
	
		return null;
	}

	@Override
	public boolean existe(String cpf) {
	if(cpf.contains(cpf)){
		return true;
	}else{
		return false;
	}
	}

	@Override
	public ArrayList<Paciente> listar() {
		for (int i = 0; i < pacientes.size()-1; i++) {
		 pacientes.get(i).toString();
		}
		return pacientes;
	}
}
