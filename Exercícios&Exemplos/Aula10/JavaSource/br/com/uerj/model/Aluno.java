package br.com.uerj.model;

import java.util.List;

import br.com.uerj.infraestrutura.dao.AlunoDAO;

public class Aluno {

	private int matricula;
	private String nome;
	private Turma turma;
	
	public Aluno(){
		super();
	}
	
	public Aluno(int matricula, String nome, Turma turma){
		
		this.matricula = matricula;
		this.nome = nome;
		this.turma = turma;
		
	}
	
	
	
	//Getters and Setters
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
	
	public List<Aluno> getAlunos(){
		
		return new AlunoDAO().obterAlunosCadastrados();
		
	}
	
	public void persistir(Aluno aluno){
		new AlunoDAO().persistirAluno(this);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + matricula;
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
		Aluno other = (Aluno) obj;
		if (matricula != other.matricula)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
	
	
	
}
