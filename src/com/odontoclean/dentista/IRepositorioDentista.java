package com.odontoclean.dentista;

import java.util.ArrayList;

public interface IRepositorioDentista {
	public void cadastrar(Dentista dentista) throws DentistaJaCadastradoException;
	public void atualizar(Dentista dentista) throws DentistaNaoEncontradoException;
	public void remover(String cpf) throws DentistaNaoEncontradoException;
	public Dentista procurar(String cpf) throws DentistaNaoEncontradoException;
	public boolean existe(String cpf);
	public ArrayList<Dentista> listar();
}
