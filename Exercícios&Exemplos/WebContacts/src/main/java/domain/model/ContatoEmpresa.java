package main.java.domain.model;

import java.util.List;

public class ContatoEmpresa implements Contato {

	private int idContato;
	private List<Telefone> telefones;
	private List<Contato> subContatos;

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

	public List<Contato> getSubContatos() {
		return subContatos;
	}

	public void setSubContatos(List<Contato> subContatos) {
		this.subContatos = subContatos;
	}


	
}
