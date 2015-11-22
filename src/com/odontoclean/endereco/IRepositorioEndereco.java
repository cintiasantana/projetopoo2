package com.odontoclean.endereco;

import java.util.ArrayList;

import com.odontoclean.util.CampoObritarorioInvalidoException;



public interface IRepositorioEndereco {
	public void cadastrar(Endereco endereco) throws EnderecoJaCadastradoException, CampoObritarorioInvalidoException; 
	public void atualizar(Endereco endereco) throws EnderecoNaoEncontradoException, CampoObritarorioInvalidoException; 
	public void remover(Integer id) throws EnderecoNaoEncontradoException; 
	public Endereco procurar(Integer id) throws EnderecoNaoEncontradoException;
	public Endereco procurarPorPaciente(Integer pacienteId) throws EnderecoNaoEncontradoException; 
	public boolean existe(Integer id);
	public ArrayList<Endereco> listar();
}
