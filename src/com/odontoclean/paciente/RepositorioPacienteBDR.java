package com.odontoclean.paciente;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.odontoclean.jdbc.*;

public class RepositorioPacienteBDR implements IRepositorioPaciente{

	@Override
	public void cadastrarPaciente(Paciente paciente)
			throws PacienteJaCadastradoException {
		try {

			PreparedStatement pstmt;
			pstmt = ConectaBD.AbriConexao().prepareStatement("INSERT INTO PACIENTE (CODIGO, NOME, CPF, TELEFONE, EMAIL, DATANASCIMENTO) values (?,?,?,?,?,?)");
			pstmt.setString(1, ""); // NÃO ESTOU CONSEGUINDO PASSAR O PARAMETRO AQUI

			pstmt.executeUpdate();

			JOptionPane.showMessageDialog(null,"XML Gerado com sucesso!!!!");
			pstmt.close();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,"Não foi possivel inserir o XML\n" + e);
		}
		
	}

	@Override
	public void atualizarPaciente(Paciente paciente)
			throws PacienteNaoEncontradoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removerPaciente(String cpf) throws PacienteNaoEncontradoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Paciente procurarPaciente(String cpf) throws PacienteNaoEncontradoException {
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
