package com.odontoclean.dentista;

import java.util.ArrayList;

public class RepositorioDentistaBDR implements IRepositorioDentista{

	@Override
	public void cadastrarDentista(Dentista dentista)
			throws DentistaJaCadastradoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizarDentista(Dentista dentista)
			throws DentistaNaoEncontradoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removerDentista(String cpf) throws DentistaNaoEncontradoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Dentista procurarDentista(String cpf) throws DentistaNaoEncontradoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean dentistaExiste(String cpf) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Dentista> listarDentista() {
		// TODO Auto-generated method stub
		return null;
	}

}
