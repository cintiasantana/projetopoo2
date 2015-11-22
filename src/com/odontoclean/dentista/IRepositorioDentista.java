package com.odontoclean.dentista;

import java.util.ArrayList;

import com.odontoclean.endereco.EnderecoJaCadastradoException;
import com.odontoclean.endereco.EnderecoNaoEncontradoException;
import com.odontoclean.paciente.CPFInvalidoException;
import com.odontoclean.util.CampoObritarorioInvalidoException;

public interface IRepositorioDentista {
	public void cadastrar(Dentista dentista) throws DentistaJaCadastradoException, IllegalArgumentException, CPFInvalidoException, CampoObritarorioInvalidoException, EnderecoJaCadastradoException;
	public void atualizar(Dentista dentista) throws DentistaNaoEncontradoException, CPFInvalidoException, CampoObritarorioInvalidoException, EnderecoNaoEncontradoException;
	public void remover(String cpf) throws DentistaNaoEncontradoException, CPFInvalidoException, EnderecoNaoEncontradoException, CampoObritarorioInvalidoException;
	public Dentista procurar(String cpf) throws DentistaNaoEncontradoException;
	public boolean existe(String cpf);
	public ArrayList<Dentista> listar();
}
