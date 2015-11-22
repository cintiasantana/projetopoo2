package com.odontoclean.dentista;

import java.io.Serializable;
import java.util.ArrayList;

import com.odontoclean.fachada.Fachada;



public class RepositorioDentistaList implements IRepositorioDentista, Serializable{

private ArrayList<Dentista> repositorio;
private int id;

public RepositorioDentistaList() {
	repositorio = new ArrayList<Dentista>();
	id = 1;
}
@Override
public void cadastrarDentista(Dentista dentista) throws DentistaJaCadastradoException {
	dentista.setCodigo(id);
	repositorio.add(dentista);
	id++;
	
}

@Override
public void atualizarDentista(Dentista dentista ) throws DentistaNaoEncontradoException {
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
