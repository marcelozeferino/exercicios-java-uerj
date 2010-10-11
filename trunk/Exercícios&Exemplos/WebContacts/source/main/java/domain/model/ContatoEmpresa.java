package main.java.domain.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import main.java.domain.repository.ContatoRepository;

@Entity
@Table(name="contato_empresa")
public class ContatoEmpresa extends Contato {

	@Transient
	protected ContatoRepository repository;
	
	@Column(name="nome_fantasia")
	private String nomeFantasia;
		
	/**
	 * Metodo set para permitir tamb�m inje��o de depend�ncia p�s constru��o.
	 * @param repository
	 */
	public void setRepository(ContatoRepository repository){
		this.repository = repository;
	}
	
	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	
	public List<Contato> getSubContatos() {
		
		if (repository == null){
			throw new RuntimeException("Implementa��o de reposit�rio n�o definida.");
		}
		
		return repository.obterSubContatos(this);
		
	}
	
	
}
