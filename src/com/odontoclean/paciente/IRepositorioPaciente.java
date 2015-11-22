package com.odontoclean.paciente;

import java.util.ArrayList;
import java.util.List;


public interface IRepositorioPaciente {
	public void cadastrarPaciente(Paciente paciente) throws PacienteJaCadastradoException;
	public void atualizarPaciente(Paciente paciente) throws PacienteNaoEncontradoException;
	public void removerPaciente(String cpf) throws PacienteNaoEncontradoException;
	public Paciente procurarPaciente(String cpf) throws PacienteNaoEncontradoException;
	public boolean pacienteExiste(String cpf);
	public ArrayList<Paciente> listarPaciente();
}
