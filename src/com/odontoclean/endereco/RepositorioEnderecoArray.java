package com.odontoclean.endereco;

import java.util.ArrayList;

import com.odontoclean.util.CampoObritarorioInvalidoException;


public class RepositorioEnderecoArray implements IRepositorioEndereco {
	 private Endereco[] enderecos;
	    private int indice;
	    private int id;
	    public static final int TAMANHO_DAFAULT = 100;
	    
	    public RepositorioEnderecoArray() {
	    	enderecos = new Endereco[TAMANHO_DAFAULT];
	        indice = 0;
	        id = 1;
	    }
	    /**
	     * Propositadamente com visibilidade default
	     */
	    RepositorioEnderecoArray(Endereco[] enderecos, int indice) {
	        this.enderecos = enderecos;
	        this.indice = indice;
	        id = 1;
	    }
		/**
		* Método que cadastrar um objeto de classe Paciente no Repositório
		*
		* @param Objeto da Classe Paciente.
		* @return void
		* @throws EnderecoJaCadastradoException  
		*/
	    public void cadastrarEnderco(Endereco endereco) throws EnderecoJaCadastradoException {
	    	// Verifica se o Paciente existe no repositório
	    	if (this.enderecoExiste(endereco.getId())) throw new EnderecoJaCadastradoException();
	    	endereco.setId(this.id);
	    	enderecos[this.indice] = endereco;
			this.indice = this.indice + 1;
			this.id = this.id + 1; 
	    }
		/**
		* Método que remove um objeto de classe Paciente no Repositório
		*
		* @param Objeto da Classe Paciente.
		* @return void
		* @throws EnderecoNaoEncontradoException 
		*/
	    public void removerEndereco(Integer id) throws EnderecoNaoEncontradoException {
	        int i = getIndice(id);
	        if (i == -1) throw new EnderecoNaoEncontradoException();
	        enderecos[i] = enderecos[indice-1];
	        indice = indice - 1;
	        enderecos[indice] = null;
	    }
		/**
		* Método que procura um objeto de classe Paciente no Repositório
		*
		* @param CPF Paciente.
		* @return Paciente
		* @throws EnderecoNaoEncontradoException 
		*/
	    public Endereco procurarEndereco(Integer id) throws EnderecoNaoEncontradoException {
	    	Endereco endereco = null;
	        int i = getIndice(id);
	        if (i == -1) throw new EnderecoNaoEncontradoException();
	        
	        return enderecos[i];
	        
	    }
		/**
		* Método que atualiza um objeto de classe Paciente no Repositório
		*
		* @param Objeto da Classe Paciente.
		* @return Paciente
		* @throws EnderecoNaoEncontradoException 
		*/
	    public void atualizarEndereco(Endereco endereco) throws EnderecoNaoEncontradoException {
	        int i = getIndice(endereco.getId());
	        if (i == -1) throw new EnderecoNaoEncontradoException();
	        enderecos[i] = endereco;
	    }
		/**
		* Método que verifica se um objeto de classe Paciente existe no Repositório
		*
		* @param CPF Paciente.
		* @return Boolean
		* @throws  
		*/
	    public boolean enderecoExiste(Integer id) {
	        boolean resposta;
	            if (getIndice(id) >= 0) resposta = true;
	            else resposta = false;
	        return resposta;
	    }
	    
		/**
		* Método que lista objetos de classe Paciente no Repositório
		*
		* @param 
		* @return ArrayList<Paciente>
		* @throws  
		*/
	    public ArrayList<Endereco> listarEndereco() { 
	    	ArrayList<Endereco> lista = new ArrayList<Endereco>();
	    	for (int i = 0; i < indice; i = i + 1) {
	            lista.add(enderecos[i]);
	        }
	    	return lista;
	    }
	    
		/**
		* Método que retorna um indice valido para o Repositório
		*
		* @param CPF do Paciente
		* @return int
		* @throws  
		*/
	    private int getIndice(Integer id) {
	        int resposta = -1;
	        boolean achou = false;
	        for (int i = 0; !achou && (i < indice); i = i + 1) {
	            if (enderecos[i].getId().equals(id)) {
	                resposta = i;
	                achou = true;
	            }
	        }
	        return resposta;
	    }
	    
		public Endereco procurarPorPaciente(Integer pacienteId)
				throws EnderecoNaoEncontradoException {
			boolean achou = false;
			Endereco endereco = null;
	        
	        for (int i = 0; !achou && (i < indice); i = i + 1) {
	            if (enderecos[i].getPaciente().getCodigo().equals(pacienteId)) {
	                endereco = enderecos[i];
	                achou = true; 
	                break;
	            }
	        }
	        return endereco;
		}
		@Override
		public void cadastrarEndereco(Endereco endereco)throws EnderecoJaCadastradoException,
				CampoObritarorioInvalidoException {
			// TODO Auto-generated method stub
			
		}
}
