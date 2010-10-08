package main.java.domain.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import main.java.domain.repository.ContatoRepository;


@Entity
@Table(name = "contato")
@Inheritance(strategy = InheritanceType.JOINED)
public class Contato {

	@Id
	@GeneratedValue
	private int idContato;

	@Column(name = "nome", nullable = false)
	private String nome;
	
	@ManyToOne	
	private ContatoEmpresa contatoPrincipal;

	@OneToMany(mappedBy = "contato", cascade = CascadeType.ALL)
	private List<Telefone> telefones;

	@Transient
	protected ContatoRepository repository;
	
	public Contato(){
		
	}
	
    /**
     * Construtor injetando Repository
     */
	public Contato(ContatoRepository repository){
		this.repository = repository;
	}
	
	/**
	 * Metodo set para permitir também injeção de dependência pós construção.
	 * @param repository
	 */
	protected void setRepository(ContatoRepository repository){
		this.repository = repository;
	}
	
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public final ContatoEmpresa getContatoPrincipal() {
		return contatoPrincipal;
	}

	public final void setContatoPrincipal(ContatoEmpresa contatoPrincipal) {
		this.contatoPrincipal = contatoPrincipal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idContato;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		if (idContato != other.idContato)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

}
