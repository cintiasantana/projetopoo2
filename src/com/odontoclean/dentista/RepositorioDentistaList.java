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
public void cadastrar(Dentista dentista) throws DentistaJaCadastradoException {
	dentista.setCodigo(id);
	repositorio.add(dentista);
	id++;
	
}

@Override
public void atualizar(Dentista dentista ) throws DentistaNaoEncontradoException {
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
