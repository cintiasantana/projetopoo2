package com.odontoclean.endereco;

import java.util.ArrayList;
import java.util.List;

import com.odontoclean.util.CampoObritarorioInvalidoException;


public class ControladorEndereco {
private IRepositorioEndereco repositorioEndereco;
	
	public ControladorEndereco() {
		this.repositorioEndereco = new RepositorioEnderecoArray();
	}
	public void cadastrar(Endereco endereco) throws EnderecoJaCadastradoException, 
													CampoObritarorioInvalidoException  {
		if (endereco == null) throw new IllegalArgumentException("Endereco Inválido.");
	    if (endereco.getRua().equals("")) throw new CampoObritarorioInvalidoException("Rua");
	    
	    this.repositorioEndereco.cadastrarEndereco(endereco);
	}
	public void atualizar(Endereco endereco) throws EnderecoNaoEncontradoException, 
													CampoObritarorioInvalidoException {
		if (endereco == null) throw new IllegalArgumentException("Endereco Inválido.");
	    if (endereco.getRua().equals("")) throw new CampoObritarorioInvalidoException("Rua");
		this.repositorioEndereco.atualizarEndereco(endereco);
	}
	public void remover(Integer id) throws EnderecoNaoEncontradoException {
		this.repositorioEndereco.removerEndereco(id);
	}
	public Endereco procurar(Integer id) throws EnderecoNaoEncontradoException  {
		return this.repositorioEndereco.procurarEndereco(id);
	}
	public Endereco procurarPorPaciente(Integer pacienteId) throws EnderecoNaoEncontradoException  {
		return this.repositorioEndereco.procurarPorPaciente(pacienteId);
	}
	public List<Endereco> listar() {
		return this.repositorioEndereco.listarEndereco();
	}
}
