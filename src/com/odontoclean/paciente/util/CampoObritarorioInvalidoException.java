package com.odontoclean.paciente.util;

public class CampoObritarorioInvalidoException extends Exception{
	public CampoObritarorioInvalidoException(String msg){
        super("O campo " + msg + " � nulo ou inv�lido.");
    }
}
