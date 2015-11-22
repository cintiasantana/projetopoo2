package com.odontoclean.fachada;

import java.util.ArrayList;
import java.util.List;

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
	public void cadastrar(Dentista dentista)throws DentistaJaCadastradoException, IllegalArgumentException, CPFInvalidoException, CampoObritarorioInvalidoException, EnderecoJaCadastradoException {
		// TODO Auto-generated method stub
		this.controladorDentista.cadastrar(dentista);
	
	}


	@Override
	public void atualizar(Dentista dentista)throws DentistaNaoEncontradoException, CPFInvalidoException, CampoObritarorioInvalidoException, EnderecoNaoEncontradoException {
		// TODO Auto-generated method stub
		this.controladorDentista.atualizar(dentista);
		
	}


	@Override
	public void remover(String cpf) throws DentistaNaoEncontradoException, CPFInvalidoException, EnderecoNaoEncontradoException, CampoObritarorioInvalidoException {
		// TODO Auto-generated method stub
		this.controladorDentista.remover(cpf);
		
	}


	public Dentista procurar(Dentista dentista) throws DentistaNaoEncontradoException {
		// TODO Auto-generated method stub
		return this.controladorDentista.procurar(dentista);
	}


	@Override
	public boolean existe(String cpf) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public List<Dentista> listar() {
		// TODO Auto-generated method stub
		return this.controladorDentista.listar();
	}


	@Override
	public void cadastrar(Endereco endereco)throws EnderecoJaCadastradoException, CampoObritarorioInvalidoException {
		// TODO Auto-generated method stub
		this.controladorEndereco.cadastrar(endereco);
		
	}


	@Override
	public void atualizar(Endereco endereco)throws EnderecoNaoEncontradoException, CampoObritarorioInvalidoException {
		this.controladorEndereco.atualizar(endereco);
	}


	@Override
	public void remover(Integer id) throws EnderecoNaoEncontradoException {
		this.controladorEndereco.remover(id);
	}


	@Override
	public Endereco procurar(Integer id) throws EnderecoNaoEncontradoException {
		// TODO Auto-generated method stub
		return this.controladorEndereco.procurar(id);
	}


	@Override
	public Endereco procurarPorPaciente(Integer pacienteId)throws EnderecoNaoEncontradoException {
		// TODO Auto-generated method stub
		return this.controladorEndereco.procurarPorPaciente(pacienteId);
	}


	@Override
	public boolean existe(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public ArrayList<Endereco> listar() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Dentista procurar(String cpf) throws DentistaNaoEncontradoException {
		// TODO Auto-generated method stub
		return null;
	}
}
