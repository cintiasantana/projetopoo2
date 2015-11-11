package com.odontoclean.endereco;
import com.odontoclean.paciente.Paciente;

public class Endereco {
	private Integer id;
	private String rua;
	private String numero;
	private String bairro;
	private String cidade;
	private String uf;
	private Paciente paciente;
	
	public Endereco( Paciente paciente, String rua, String numero, String bairro, String cidade, String uf){
		this.id = 0;
		this.setRua(rua);
		this.setNumero(numero);
		this.setBairro(bairro);
		this.setCidade(cidade);
		this.setUf(uf);
		this.setPaciente(paciente);
	}
	
	public Endereco(Integer id, String rua, String numero, String bairro, String cidade, String uf, Paciente paciente){
		this.setId(id);
		this.setRua(rua);
		this.setNumero(numero);
		this.setBairro(bairro);
		this.setCidade(cidade);
		this.setUf(uf);
		this.setPaciente(paciente);
	}
	
	public Integer getId(){
		return id;
	}
	
	public void setId(Integer id){
		this.id = id;
	}
	
	public String getRua(){
		return rua;
	}
	
	public void setRua(String rua){
		this.rua = rua;
	}
	
	public String getNumero(){
		return numero;
	}
	
	public void setNumero(String numero){
		this.numero = numero;
	}
	
	public String getBairro(){
		return bairro;
	}
	
	public void setBairro(String bairro){
		this.bairro = bairro;
	}
	
	public String getCidade(){
		return cidade;
	}
	
	public void setCidade(String cidade){
		this.cidade = cidade;
	}
	
	public String getUf(){
		return uf;
	}
	
	public void setUf(String uf){
		this.uf = uf;
	}
	
	public Paciente getPaciente(){
		return paciente;
	}
	
	public void setPaciente(Paciente paciente){
		this.paciente = paciente;
	}
	
	@Override
	public String toString(){
		return "Endereco [id=" + id + ", rua=" + rua + ", numero=" + numero + ", bairro=" + bairro + ", cidade=" + cidade + ", uf=" + uf + "]";
	
	}
}
