package com.odontoclean.endereco;

import java.util.ArrayList;

import com.odontoclean.util.CampoObritarorioInvalidoException;


public class ControladorEndereco {
private IRepositorioEndereco repositorioEndereco;
	
	public ControladorEndereco() {
		this.repositorioEndereco = new RepositorioEnderecoArray();
	}
	public void cadastrar(Endereco endereco) throws EnderecoJaCadastradoException, 
													CampoObritarorioInvalidoException  {
		if (endereco == null) throw new IllegalArgumentException("Endereco Inv�lido.");
	    if (endereco.getRua().equals("")) throw new CampoObritarorioInvalidoException("Rua");
	    
	    this.repositorioEndereco.cadastrar(endereco);
	}
	public void atualizar(Endereco endereco) throws EnderecoNaoEncontradoException, 
													CampoObritarorioInvalidoException {
		if (endereco == null) throw new IllegalArgumentException("Endereco Inv�lido.");
	    if (endereco.getRua().equals("")) throw new CampoObritarorioInvalidoException("Rua");
		this.repositorioEndereco.atualizar(endereco);
	}
	public void remover(Integer id) throws EnderecoNaoEncontradoException {
		this.repositorioEndereco.remover(id);
	}
	public Endereco procurar(Integer id) throws EnderecoNaoEncontradoException  {
		return this.repositorioEndereco.procurar(id);
	}
	public Endereco procurarPorPaciente(Integer pacienteId) throws EnderecoNaoEncontradoException  {
		return this.repositorioEndereco.procurarPorPaciente(pacienteId);
	}
	public ArrayList<Endereco> listar() {
		return this.repositorioEndereco.listar();
	}
}
