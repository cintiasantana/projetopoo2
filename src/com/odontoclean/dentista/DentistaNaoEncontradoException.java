package com.odontoclean.dentista;

public class DentistaNaoEncontradoException extends Exception {
	public DentistaNaoEncontradoException(){
        super ("Dentista não encontrado!");
    }
}
