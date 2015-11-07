package com.odontoclean.paciente;

import java.util.ArrayList;


public interface IRepositorioPaciente {
	public void cadastrar(Paciente paciente) throws PacienteJaCadastradoException;
	public void atualizar(Paciente paciente) throws PacienteNaoEncontradoException;
	public void remover(String cpf) throws PacienteNaoEncontradoException;
	public Paciente procurar(String cpf) throws PacienteNaoEncontradoException;
	public boolean existe(String cpf);
	public ArrayList<Paciente> listar();
}
