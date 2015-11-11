package com.odontoclean.dentista;

import com.odontoclean.endereco.Endereco;

public class Dentista {
	private Integer codigo;
	private String nome;
	private String cpf;
	private String telefone;
	private String email;
	private Endereco endereco;
	
	public Dentista(String nome, String cpf, String telefone, String email) {
		this.nome=nome;
		this.cpf=cpf;
		this.telefone=telefone;
		this.email=email;
	}
	public Dentista(Integer codigo, String nome, String cpf, String telefone, String email) {
		this.codigo=codigo;
		this.nome=nome;
		this.cpf=cpf;
		this.telefone=telefone;
		this.email=email;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public String toString(){
		return "Nome: "+nome+"\nCPF: "+cpf+"\nTelefone: "+telefone+"\nE-mail: "+email+"\nEndereço: "+endereco;
	}
	
	
}
