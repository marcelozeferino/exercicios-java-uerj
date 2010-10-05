package main.java.domain.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="contato_empresa")
public class ContatoEmpresa extends Contato {

	@Column(name="nome_fantasia")
	private String nomeFantasia;
	
	@OneToMany
	private List<Contato> subContatos;

	public List<Contato> getSubContatos() {
		return subContatos;
	}

	public void setSubContatos(List<Contato> subContatos) {
		this.subContatos = subContatos;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}


	
}
