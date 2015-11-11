package com.odontoclean.dentista;

import java.util.ArrayList;



public class RepositorioDentistaArrayList implements IRepositorioDentista{

private ArrayList<Dentista> dentistas;
private int id;

public RepositorioDentistaArrayList() {
	dentistas = new ArrayList<Dentista>();
	id = 1;
}
@Override
public void cadastrar(Dentista dentista) throws DentistaJaCadastradoException {
	dentista.setCodigo(id);
	dentistas.add(dentista);
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
	return dentistas;
}
}
