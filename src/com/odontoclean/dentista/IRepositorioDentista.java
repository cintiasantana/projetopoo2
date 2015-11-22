package com.odontoclean.dentista;

import java.util.ArrayList;
import java.util.List;

import com.odontoclean.endereco.EnderecoJaCadastradoException;
import com.odontoclean.endereco.EnderecoNaoEncontradoException;
import com.odontoclean.paciente.CPFInvalidoException;
import com.odontoclean.util.CampoObritarorioInvalidoException;

public interface IRepositorioDentista {
	public void cadastrarDentista(Dentista dentista) throws DentistaJaCadastradoException, IllegalArgumentException, CPFInvalidoException, CampoObritarorioInvalidoException, EnderecoJaCadastradoException;
	public void atualizarDentista(Dentista dentista) throws DentistaNaoEncontradoException, CPFInvalidoException, CampoObritarorioInvalidoException, EnderecoNaoEncontradoException;
	public void removerDentista(String cpf) throws DentistaNaoEncontradoException, CPFInvalidoException, EnderecoNaoEncontradoException, CampoObritarorioInvalidoException;
	public Dentista procurarDentista(String cpf) throws DentistaNaoEncontradoException;
	public boolean dentistaExiste(String cpf);
	public ArrayList<Dentista> listarDentista();
}
