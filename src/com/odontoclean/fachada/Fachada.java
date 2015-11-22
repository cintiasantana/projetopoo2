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



public class Fachada implements IRepositorioDentista, IRepositorioEndereco, IRepositorioPaciente{
	
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


	@Override
	public void cadastrarEndereco(Endereco endereco)
			throws EnderecoJaCadastradoException,
			CampoObritarorioInvalidoException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void atualizarEndereco(Endereco endereco)
			throws EnderecoNaoEncontradoException,
			CampoObritarorioInvalidoException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void removerEndereco(Integer id)
			throws EnderecoNaoEncontradoException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Endereco procurarEndereco(Integer id)
			throws EnderecoNaoEncontradoException {
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
	public boolean enderecoExiste(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public List<Endereco> listarEndereco() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void cadastrarDentista(Dentista dentista)
			throws DentistaJaCadastradoException, IllegalArgumentException,
			CPFInvalidoException, CampoObritarorioInvalidoException,
			EnderecoJaCadastradoException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void atualizarDentista(Dentista dentista)
			throws DentistaNaoEncontradoException, CPFInvalidoException,
			CampoObritarorioInvalidoException, EnderecoNaoEncontradoException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void removerDentista(String cpf)
			throws DentistaNaoEncontradoException, CPFInvalidoException,
			EnderecoNaoEncontradoException, CampoObritarorioInvalidoException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Dentista procurarDentista(String cpf)
			throws DentistaNaoEncontradoException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean dentistaExiste(String cpf) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public ArrayList<Dentista> listarDentista() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void cadastrarPaciente(Paciente paciente)
			throws PacienteJaCadastradoException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void atualizarPaciente(Paciente paciente)
			throws PacienteNaoEncontradoException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void removerPaciente(String cpf)
			throws PacienteNaoEncontradoException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Paciente procurarPaciente(String cpf)
			throws PacienteNaoEncontradoException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean pacienteExiste(String cpf) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public ArrayList<Paciente> listarPaciente() {
		// TODO Auto-generated method stub
		return null;
	}
	
}