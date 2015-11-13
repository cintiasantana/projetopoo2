package com.odontoclean.procedimento;

public class Procedimento {
	private Integer codigo;
	private String procedimento;
	private double valor;
	
	public Procedimento(String procedimento, double valor){
		this.procedimento=procedimento;
		this.valor=valor;
	}
	
	public Procedimento(Integer codigo, String procedimento, double valor){
		this.codigo=codigo;
		this.procedimento=procedimento;
		this.valor=valor;
	}
	
	public Integer getCodigo(){
		return codigo;
	}
	
	public void setCodigo(Integer codigo){
		this.codigo =codigo;
	}
	
	public String getDescricao(){
		return procedimento;
	}
	
	public void setDescricao(String procedimento){
		this.procedimento = procedimento;
	}
	
	public double getValor(){
		return valor;
	}
	
	public void setValor(double valor){
		this.valor = valor;
	}
}
