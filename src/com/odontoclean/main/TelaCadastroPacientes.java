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

public class TelaCadastroPacientes {

	public static void main(String[] args) throws IllegalArgumentException, CPFInvalidoException, PacienteJaCadastradoException, CampoObritarorioInvalidoException, EnderecoJaCadastradoException, PacienteNaoEncontradoException, EnderecoNaoEncontradoException {
		Fachada fachada = Fachada.getInstance();
		Paciente paciente = new Paciente("Danilo", "820.472.937-58", "(81)8223-1656", "danilo@gmail.com", "03/05/1992");
		Endereco endereco = new Endereco(paciente, "centro", "12", "nassal", "caruaru", "pe");
		paciente.setEndereco(endereco);
		fachada.cadastrarPaciente(paciente);
		
		Paciente paciente2 = new Paciente("Rafinha", "171.093.227-93", "(81)8233-1221", "rafinha@gmail.com", "07/05/1995");
		Endereco endereco2 = new Endereco(paciente2, "Vibes", "15", "Universitário", "Caruaru", "PE");
		paciente2.setEndereco(endereco2);
		fachada.cadastrarPaciente(paciente2);
		
		Paciente paciente3 = new Paciente("Maria", "335.498.582-80", "(81)9233-2386","maria@gmail.com", "12/03/1993");
		Endereco endereco3 = new Endereco(paciente3, "logradouro3", "numero", "bairro", "cidade", "PE");
		paciente3.setEndereco(endereco3);
		fachada.cadastrarPaciente(paciente3);
		
		ArrayList<Paciente> pacientes = fachada.listarPaciente();
		for (Paciente c : pacientes) {
			System.out.println(c);
		}
		//Removendo um paciente
		fachada.removerPaciente("335.498.582-80");
		System.out.println("Após a Remoção");
		pacientes = fachada.listarPaciente();
		for(Paciente c: pacientes) {
			System.out.println(c);
		}
		
		Paciente paciente4 = new Paciente("Debora", "177.891.942-16", "(81)9865-0966", "debora@gmail.com", "09/03/1990");
		Endereco endereco4 = new Endereco(paciente4, "logradouro4", "numero", "bairro", "cidade", "PE");
		paciente4.setEndereco(endereco4);
		fachada.cadastrarPaciente(paciente4);
		
		System.out.println("Após Adicionar");
		pacientes = fachada.listarPaciente();
		for(Paciente c: pacientes) {
			System.out.println(c);
		}
	}

}
