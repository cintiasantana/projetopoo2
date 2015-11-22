package com.odontoclean.endereco;

import java.util.ArrayList;
import java.util.List;

import com.odontoclean.util.CampoObritarorioInvalidoException;



public interface IRepositorioEndereco {
	public void cadastrarEndereco(Endereco endereco) throws EnderecoJaCadastradoException, CampoObritarorioInvalidoException; 
	public void atualizarEndereco(Endereco endereco) throws EnderecoNaoEncontradoException, CampoObritarorioInvalidoException; 
	public void removerEndereco(Integer id) throws EnderecoNaoEncontradoException; 
	public Endereco procurarEndereco(Integer id) throws EnderecoNaoEncontradoException;
	public Endereco procurarPorPaciente(Integer pacienteId) throws EnderecoNaoEncontradoException; 
	public boolean enderecoExiste(Integer id);
	public List<Endereco> listarEndereco();
}
