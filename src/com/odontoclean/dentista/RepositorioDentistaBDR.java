package com.odontoclean.dentista;

import java.util.ArrayList;

public class RepositorioDentistaBDR implements IRepositorioDentista{

	@Override
	public void cadastrar(Dentista dentista)
			throws DentistaJaCadastradoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Dentista dentista)
			throws DentistaNaoEncontradoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(String cpf) throws DentistaNaoEncontradoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Dentista procurar(String cpf) throws DentistaNaoEncontradoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existe(String cpf) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Dentista> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
