package com.odontoclean.paciente;

import java.util.ArrayList;
import java.util.List;

import com.odontoclean.endereco.EnderecoJaCadastradoException;
import com.odontoclean.endereco.EnderecoNaoEncontradoException;
import com.odontoclean.util.CampoObritarorioInvalidoException;


public interface IRepositorioPaciente {
	public void cadastrar(Paciente paciente) throws PacienteJaCadastradoException, IllegalArgumentException, CPFInvalidoException, CampoObritarorioInvalidoException, EnderecoJaCadastradoException;
	public void atualizar(Paciente paciente) throws PacienteNaoEncontradoException, CPFInvalidoException, CampoObritarorioInvalidoException, EnderecoNaoEncontradoException;
	public void remover(String cpf) throws PacienteNaoEncontradoException, CPFInvalidoException, EnderecoNaoEncontradoException, CampoObritarorioInvalidoException;
	public Paciente procurar(String cpf) throws PacienteNaoEncontradoException;
	public boolean Existe(String cpf);
	public ArrayList<Paciente> listar();
}
