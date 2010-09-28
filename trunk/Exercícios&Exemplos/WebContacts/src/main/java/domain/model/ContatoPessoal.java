package main.java.domain.model;

import java.util.List;


public class ContatoPessoal implements Contato {

	private int idContato;
	 
	private List<Telefone> telefones;

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public int getIdContato() {
		return idContato;
	}

	public void setIdContato(int idContato) {
		this.idContato = idContato;
	}

	
}
