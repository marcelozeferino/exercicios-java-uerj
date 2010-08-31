package main.curso;

import java.util.HashSet;
import java.util.Set;

public class Professor {
	
	private int codigo;
	private String nome;
	private Set<Especialidade> especialidades = new HashSet<Especialidade>();
	
	public Professor(int codigo, String nome){
		this.codigo = codigo;
		this.nome = nome;
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
	public Set<Especialidade> getEspecialidades() {
		return especialidades;
	}
	public void setEspecialidades(Set<Especialidade> especialidades) {
		this.especialidades = especialidades;
	}
	
	

}
