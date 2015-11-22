package com.odontoclean.fachada;

import java.util.ArrayList;

import com.odontoclean.dentista.ControladorDentista;
import com.odontoclean.dentista.Dentista;
import com.odontoclean.dentista.DentistaJaCadastradoException;
import com.odontoclean.dentista.DentistaNaoEncontradoException;
import com.odontoclean.dentista.IRepositorioDentista;
import com.odontoclean.endereco.ControladorEndereco;
import com.odontoclean.endereco.Endereco;
import com.odontoclean.endereco.EnderecoJaCadastradoException;
import com.odontoclean.endereco.EnderecoNaoEncontradoException;
import com.odontoclean.endereco.IRepositorioEndereco;
import com.odontoclean.paciente.CPFInvalidoException;
import com.odontoclean.paciente.ControladorPaciente;
import com.odontoclean.paciente.Paciente;
import com.odontoclean.paciente.PacienteJaCadastradoException;
import com.odontoclean.paciente.PacienteNaoEncontradoException;
import com.odontoclean.util.CampoObritarorioInvalidoException;



public class Fachada implements IRepositorioDentista, IRepositorioEndereco {
	private static Fachada instance;
	
	private ControladorPaciente controladorPaciente;
	private ControladorEndereco controladorEndereco;
	private ControladorDentista controladorDentista;
	
	
	
	private Fachada() {
		this.controladorPaciente = new ControladorPaciente();
		this.controladorDentista= new ControladorDentista();
		this.controladorEndereco = new ControladorEndereco();
	}
	
	
	public static Fachada getInstance() {
		if (Fachada.instance == null) {
			Fachada.instance = new Fachada();
		}
		return Fachada.instance;
	}
	
	
	public void cadastrarPaciente(Paciente paciente) throws IllegalArgumentException, CPFInvalidoException, PacienteJaCadastradoException, CampoObritarorioInvalidoException, EnderecoJaCadastradoException { 
		this.controladorPaciente.cadastrar(paciente);
		
	}
	
	
	public void atualizarPaciente(Paciente paciente) throws CPFInvalidoException, CampoObritarorioInvalidoException, PacienteNaoEncontradoException, EnderecoNaoEncontradoException { 
		this.controladorPaciente.atualizar(paciente);
	}
	
	
	public void removerPaciente(String cpf) throws CPFInvalidoException, PacienteNaoEncontradoException, EnderecoNaoEncontradoException, CampoObritarorioInvalidoException { 
		this.controladorPaciente.remover(cpf);
	}
	
	
	public Paciente procurarPaciente(String cpf) throws CPFInvalidoException, PacienteNaoEncontradoException, EnderecoNaoEncontradoException { 
		return this.controladorPaciente.procurar(cpf);
	}
	

	public ArrayList<Paciente> listarPaciente() { 
		return this.controladorPaciente.listar();
	}


	@Override
	public void cadastrar(Dentista dentista)throws DentistaJaCadastradoException {
		// TODO Auto-generated method stub
	
	}


	@Override
	public void atualizar(Dentista dentista)
			throws DentistaNaoEncontradoException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void remover(String cpf) throws DentistaNaoEncontradoException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Dentista procurar(String cpf) throws DentistaNaoEncontradoException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean existe(String cpf) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public ArrayList<Dentista> listar() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void cadastrar(Endereco endereco)
			throws EnderecoJaCadastradoException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void atualizar(Endereco endereco)
			throws EnderecoNaoEncontradoException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void remover(Integer id) throws EnderecoNaoEncontradoException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Endereco procurar(Integer id) throws EnderecoNaoEncontradoException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Endereco procurarPorPaciente(Integer pacienteId)
			throws EnderecoNaoEncontradoException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean existe(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}
}
