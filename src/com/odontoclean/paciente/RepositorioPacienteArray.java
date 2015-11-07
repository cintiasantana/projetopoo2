package com.odontoclean.paciente;

import java.util.ArrayList;




public class RepositorioPacienteArray {
	private Paciente[] pacientes;
    private int indice;
    private int id;
    public static final int TAMANHO_DAFAULT = 100;
    
    public RepositorioPacienteArray() {
        pacientes = new Paciente[TAMANHO_DAFAULT];
        indice = 0;
        id = 1;
    }
    /**
     * Propositadamente com visibilidade default
     */
    RepositorioPacienteArray(Paciente[] pacientes, int indice) {
        this.pacientes = pacientes;
        this.indice = indice;
        id = 1;
    }
	/**
	* M�todo que cadastrar um objeto de classe Paciente no Reposit�rio
	*
	* @param Objeto da Classe Paciente.
	* @return void
	* @throws PacienteJaCadastradoException  
	*/
    public void cadastrar(Paciente paciente) throws PacienteJaCadastradoException {
    	// Verifica se o cliente existe no reposit�rio
    	if (this.existe(paciente.getCpf())) throw new PacienteJaCadastradoException();
		
    	paciente.setCodigo(this.id);
		pacientes[this.indice] = paciente;
		this.indice = this.indice + 1;
		this.id = this.id + 1; 
    }
	/**
	* M�todo que remove um objeto de classe Paciente no Reposit�rio
	*
	* @param Objeto da Classe Paciente.
	* @return void
	* @throws PacienteNaoEncontradoException 
	*/
    public void remover(String cpf) throws PacienteNaoEncontradoException {
        int i = getIndice(cpf);
        if (i == -1) throw new PacienteNaoEncontradoException();
        pacientes[i] = pacientes[indice-1];
        indice = indice - 1;
        pacientes[indice] = null;
    }
	/**
	* M�todo que procura um objeto de classe Paciente no Reposit�rio
	*
	* @param CPF Paciente.
	* @return Paciente
	* @throws PacienteNaoEncontradoException 
	*/
    public Paciente procurar(String cpf) throws PacienteNaoEncontradoException {
    	Paciente paciente = null;
        int i = getIndice(cpf);
        if (i == -1) throw new PacienteNaoEncontradoException();
        
        return pacientes[i];
        
    }
	/**
	* M�todo que atualiza um objeto de classe Paciente no Reposit�rio
	*
	* @param Objeto da Classe Paciente.
	* @return Paciente
	* @throws PacienteNaoEncontradoException 
	*/
    public void atualizar(Paciente paciente) throws PacienteNaoEncontradoException {
        int i = getIndice(paciente.getCpf());
        if (i == -1) throw new PacienteNaoEncontradoException();
        pacientes[i] = paciente;
    }
	/**
	* M�todo que verifica se um objeto de classe Paciente existe no Reposit�rio
	*
	* @param CPF Paciente.
	* @return Boolean
	* @throws  
	*/
    public boolean existe(String cpf) {
        boolean resposta;
            if (getIndice(cpf) >= 0) resposta = true;
            else resposta = false;
        return resposta;
    }
    
	/**
	* M�todo que lista objetos de classe Paciente no Reposit�rio
	*
	* @param 
	* @return ArrayList<Paciente>
	* @throws  
	*/
    public ArrayList<Paciente> listar() { 
    	ArrayList<Paciente> lista = new ArrayList<Paciente>();
    	for (int i = 0; i < indice; i = i + 1) {
            lista.add(pacientes[i]);
        }
    	
    	return lista;
    }
    
	/**
	* M�todo que retorna um indice valido para o Reposit�rio
	*
	* @param CPF do Paciente
	* @return int
	* @throws  
	*/
    private int getIndice(String cpf) {
        int resposta = -1;
        boolean achou = false;
        for (int i = 0; !achou && (i < indice); i = i + 1) {
            if (pacientes[i].getCpf().equals(cpf)) {
                resposta = i;
                achou = true;
            }
        }
        return resposta;
    }
}
