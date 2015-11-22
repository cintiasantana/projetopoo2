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
import com.odontoclean.paciente.IRepositorioPaciente;
import com.odontoclean.paciente.Paciente;
import com.odontoclean.paciente.PacienteJaCadastradoException;
import com.odontoclean.paciente.PacienteNaoEncontradoException;
import com.odontoclean.util.CampoObritarorioInvalidoException;



public class Fachada {
	
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


	public void cadastrarEndereco(Endereco endereco)throws EnderecoJaCadastradoException,CampoObritarorioInvalidoException {
		this.controladorEndereco.cadastrar(endereco);
		
	}


	public void atualizarEndereco(Endereco endereco)throws EnderecoNaoEncontradoException,CampoObritarorioInvalidoException {
		this.controladorEndereco.atualizar(endereco);
		
	}


	public void removerEndereco(Integer id)throws EnderecoNaoEncontradoException {
		this.controladorEndereco.remover(id);
		
	}


	public Endereco procurarEndereco(Integer id)throws EnderecoNaoEncontradoException {
		
		return this.controladorEndereco.procurar(id);
	}


	public Endereco procurarPorPaciente(Integer pacienteId)throws EnderecoNaoEncontradoException {
		// TODO Auto-generated method stub
		return this.controladorEndereco.procurarPorPaciente(pacienteId);
	}


	public boolean enderecoExiste(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}


	public List<Endereco> listarEndereco() {
		// TODO Auto-generated method stub
		return this.controladorEndereco.listar();
	}


	public void cadastrarDentista(Dentista dentista)throws DentistaJaCadastradoException, IllegalArgumentException,CPFInvalidoException, CampoObritarorioInvalidoException,EnderecoJaCadastradoException {
		// TODO Auto-generated method stub
		this.controladorDentista.cadastrar(dentista);
		
	}


	public void atualizarDentista(Dentista dentista)throws DentistaNaoEncontradoException, CPFInvalidoException,CampoObritarorioInvalidoException, EnderecoNaoEncontradoException {
		this.controladorDentista.atualizar(dentista);
		
	}


	public void removerDentista(String cpf)throws DentistaNaoEncontradoException, CPFInvalidoException,EnderecoNaoEncontradoException, CampoObritarorioInvalidoException {
		this.controladorDentista.remover(cpf);
		
	}


	public Dentista procurarDentista(String cpf)throws DentistaNaoEncontradoException {
		// TODO Auto-generated method stub
		return null;
	}


	public boolean dentistaExiste(String cpf) {
		// TODO Auto-generated method stub
		return false;
	}


	public ArrayList<Dentista> listarDentista() {
		// TODO Auto-generated method stub
		return this.controladorDentista.listar();
	}


	public void cadastrarPaciente(Paciente paciente)throws PacienteJaCadastradoException, IllegalArgumentException, CPFInvalidoException, CampoObritarorioInvalidoException, EnderecoJaCadastradoException {
		this.controladorPaciente.cadastrar(paciente);
		
	}


	public void atualizarPaciente(Paciente paciente)throws PacienteNaoEncontradoException, CPFInvalidoException, CampoObritarorioInvalidoException, EnderecoNaoEncontradoException {
		this.controladorPaciente.atualizar(paciente);
		
	}


	public void removerPaciente(String cpf)throws PacienteNaoEncontradoException, CPFInvalidoException, EnderecoNaoEncontradoException, CampoObritarorioInvalidoException {
		this.controladorPaciente.remover(cpf);
		
	}


	public Paciente procurarPaciente(String cpf)throws PacienteNaoEncontradoException {
		// TODO Auto-generated method stub
		return null;
	}


	public boolean pacienteExiste(String cpf) {
		// TODO Auto-generated method stub
		return false;
	}


	public ArrayList<Paciente> listarPaciente() {
		// TODO Auto-generated method stub
		return this.controladorPaciente.listar();
	}
	
}