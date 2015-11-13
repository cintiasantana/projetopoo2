package com.odontoclean.consulta;
import com.odontoclean.dentista.Dentista;
import com.odontoclean.paciente.Paciente;
import com.odontoclean.procedimento.Procedimento;

public class Consulta {
	private Dentista dentista;
	private Paciente paciente;
	private String dataConsulta;
	private Procedimento procedimento;
	
	public Consulta(Dentista dentista, Paciente paciente, String dataConsulta, Procedimento procedimento){
		this.dentista=dentista;
		this.paciente=paciente;
		this.dataConsulta=dataConsulta;
		this.procedimento=procedimento;
	}
	
	public Dentista getDentista(){
		return dentista;
	}
	
	public void setDentista(Dentista dentista){
		this.dentista=dentista;
	}
	
	public Paciente getPaciente(){
		return paciente;
	}
	
	public void setPaciente(Paciente paciente){
		this.paciente=paciente;
	}
	
	public String getdataConsulta(){
		return dataConsulta;
	}
	
	public void setdataConsulta(String dataConsulta){
		this.dataConsulta=dataConsulta;
	}
	
	public Procedimento getProcedimento(){
		return procedimento;
	}
	
	public void setprocedimento(Procedimento procedimento){
		this.procedimento=procedimento;
	}
}
