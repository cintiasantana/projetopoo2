package com.odontoclean.pacientes;
import com.odontoclean.endereco.Endereco;

public class Pacientes {
	private Integer codigo;
	private String nome;
	private String cpf;
	private String telefone;
	private String email;
	private String dataNascimento;
	private Endereco endereco;
	
	public Pacientes(String nome, String cpf, String telefone, String email, String dataNascimento, Endereco endereco){
		this.setCodigo(codigo);
		this.setNome(nome);
		this.setCpf(cpf);
		this.setTelefone(telefone);
		this.setEmail(email);
		this.setDataNascimento(dataNascimento);		
	}
	
	public Pacientes(Integer codigo, String nome, String cpf, String telefone, String email, String dataNascimento, Endereco endereco){
		this.setCodigo(codigo);
		this.setNome(nome);
		this.setCpf(cpf);
		this.setTelefone(telefone);
		this.setEmail(email);
		this.setDataNascimento(dataNascimento);		
	}
	
	public Integer getCodigo(){
		return codigo;
	}
	
	public void setCodigo(Integer codigo){
		this.codigo = codigo;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
    public String getCpf() {
        return cpf;
    }
    
    public String getCpfFormatado() {
        return cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9, 11);
    }
    
    private void setCpf(String cpf) {
    	this.cpf = cpf.replaceAll("\\.|\\-|\\ ", "");
    }
    
    public String getTelefone(){
    	return telefone;
    }
    
    public void setTelefone(String telefone){
    	this.telefone = telefone;
    }
    
    public String getEmail(){
    	return email;
    }
    
    public void setEmail(String email){
    	this.email = email;
    }
    
    public String getDataNascimento(){
    	return dataNascimento;
    }
    
    public void setDataNascimento(String dataNascimento){
    	this.dataNascimento = dataNascimento;
    }
    
    public Endereco getEndereco(){
    	return endereco;
    }
    
    public void setEndereco(Endereco endereco){
    	this.endereco = endereco;
    }
}
