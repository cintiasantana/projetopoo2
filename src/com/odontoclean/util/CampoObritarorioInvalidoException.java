package com.odontoclean.util;

public class CampoObritarorioInvalidoException extends Exception{
	public CampoObritarorioInvalidoException(String msg){
        super("O campo " + msg + " é nulo ou inválido.");
    }
}
