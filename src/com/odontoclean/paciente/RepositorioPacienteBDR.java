package com.odontoclean.paciente;

import java.util.ArrayList;

public class RepositorioPacienteBDR implements IRepositorioPaciente{

	@Override
	public void cadastrar(Paciente paciente)
			throws PacienteJaCadastradoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Paciente paciente)
			throws PacienteNaoEncontradoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(String cpf) throws PacienteNaoEncontradoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Paciente procurar(String cpf) throws PacienteNaoEncontradoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existe(String cpf) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Paciente> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
