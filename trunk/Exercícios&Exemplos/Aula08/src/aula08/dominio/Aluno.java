package aula08.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="aluno")
public class Aluno {

	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="codigo",nullable=false)
	private int codigo;
	
	@Column(name="nome",nullable=false)
	private String nome;
	
	//@JoinColumn(name = "turma", referencedColumnName = "codigo")
	@ManyToOne
	@JoinColumn(name = "turma", referencedColumnName = "codigo")
	private Turma turma;
			
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
