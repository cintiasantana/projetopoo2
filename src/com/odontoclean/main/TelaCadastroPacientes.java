package com.odontoclean.main;

import java.util.ArrayList;





import com.odontoclean.endereco.Endereco;
import com.odontoclean.endereco.EnderecoJaCadastradoException;
import com.odontoclean.endereco.EnderecoNaoEncontradoException;
import com.odontoclean.fachada.Fachada;
import com.odontoclean.paciente.CPFInvalidoException;
import com.odontoclean.paciente.Paciente;
import com.odontoclean.paciente.PacienteJaCadastradoException;
import com.odontoclean.paciente.PacienteNaoEncontradoException;
import com.odontoclean.util.CampoObritarorioInvalidoException;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;



public class TelaCadastroPacientes {

	public static void main(String[] args) throws IllegalArgumentException, CPFInvalidoException, PacienteJaCadastradoException, CampoObritarorioInvalidoException, EnderecoJaCadastradoException, PacienteNaoEncontradoException, EnderecoNaoEncontradoException {
	
		Fachada fachada = Fachada.getInstance();
		Paciente paciente = new Paciente(1, "Danilo", "345.135.354-74", "(81)82231656", "danilo@gmail.com", "03/05/1992");
		Endereco endereco = new Endereco(paciente, "Vargas", "03", "Nassal", "Caruaru", "PE");
		paciente.setEndereco(endereco);
		fachada.cadastrarPaciente(paciente);
		
		Paciente paciente2 = new Paciente(2, "Rafinha", "404.632.152-06", "(82)92332387", "rafinha@gmail", "04/05/1992");
		Endereco endereco2 = new Endereco(paciente2, "logradouro2", "numero", "bairro", "cidade", "PE");
		paciente2.setEndereco(endereco2);
		fachada.cadastrarPaciente(paciente2);
	
		
		ArrayList<Paciente> pacientes = fachada.listarPaciente();
		for(Paciente c: pacientes) {
			System.out.println(c);
		}
	fachada.removerPaciente("404.632.152-06");
	System.out.println("");
	System.out.println("APÓS REMOÇÃO DO PACIENTE\n");
		pacientes = fachada.listarPaciente();
		for(Paciente c: pacientes) {
			System.out.println(c);
		}
		
		
		
		
	}

}
