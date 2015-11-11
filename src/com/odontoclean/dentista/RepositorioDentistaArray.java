package com.odontoclean.dentista;

import java.util.ArrayList;



public class RepositorioDentistaArray implements IRepositorioDentista{

	private Dentista [] dentistas;
    private int indice;
    private int id;
    public static final int TAMANHO_DAFAULT = 100;
    
    public RepositorioDentistaArray() {
        dentistas = new Dentista[TAMANHO_DAFAULT];
        indice = 0;
        id = 1;
    }
   
    
    RepositorioDentistaArray(Dentista[] dentistas, int indice) {
        this.dentistas = dentistas;
        this.indice = indice;
        id = 1;
    }
	
    public void cadastrar(Dentista dentista) throws DentistaJaCadastradoException {
    	
    	
    	if (this.existe(dentista.getCpf())) throw new DentistaJaCadastradoException();
		
    	dentista.setCodigo(this.id);
		dentistas[this.indice] = dentista;
		this.indice = this.indice + 1;
		this.id = this.id + 1; 
    }
	
    public void remover(String cpf) throws DentistaNaoEncontradoException {
        int i = getIndice(cpf);
        if (i == -1) throw new DentistaNaoEncontradoException();
        dentistas[i] = dentistas[indice-1];
        indice = indice - 1;
        dentistas[indice] = null;
    }
	
    public Dentista procurar(String cpf) throws DentistaNaoEncontradoException {
    	Dentista dentista = null;
        int i = getIndice(cpf);
        if (i == -1) throw new DentistaNaoEncontradoException();
        
        return dentistas[i];
        
    }
	
    public void atualizar(Dentista dentista) throws DentistaNaoEncontradoException {
        int i = getIndice(dentista.getCpf());
        if (i == -1) throw new DentistaNaoEncontradoException();
        dentistas[i] = dentista;
    }
	
    public boolean existe(String cpf) {
        boolean resposta;
            if (getIndice(cpf) >= 0) resposta = true;
            else resposta = false;
        return resposta;
    }
    
	
    public ArrayList<Dentista> listar() { 
    	ArrayList<Dentista> lista = new ArrayList<Dentista>();
    	for (int i = 0; i < indice; i = i + 1) {
            lista.add(dentistas[i]);
        }
    	
    	return lista;
    }
    
	
    private int getIndice(String cpf) {
        int resposta = -1;
        boolean achou = false;
        for (int i = 0; !achou && (i < indice); i = i + 1) {
            if (dentistas[i].getCpf().equals(cpf)) {
                resposta = i;
                achou = true;
            }
        }
        return resposta;
    }

}
