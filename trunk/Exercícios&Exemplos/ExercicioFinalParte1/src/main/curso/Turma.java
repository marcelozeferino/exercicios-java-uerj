package main.curso;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Turma {
	
	private int codigo;
	private Date dataInicio;
	private String nome;
	private Especialidade assunto;
	private Professor professor;
	private int qtdeTotalVagas;
	private Set<Aluno> alunosMatriculados = new HashSet<Aluno>();
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Especialidade getAssunto() {
		return assunto;
	}
	public void setAssunto(Especialidade assunto) {
		this.assunto = assunto;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Set<Aluno> getAlunosMatriculados() {
		return alunosMatriculados;
	}
	public void setAlunosMatriculados(Set<Aluno> alunosMatriculados) {
		this.alunosMatriculados = alunosMatriculados;
	}
	public int getQtdeTotalVagas() {
		return qtdeTotalVagas;
	}
	public void setQtdeTotalVagas(int qtdeTotalVagas) {
		this.qtdeTotalVagas = qtdeTotalVagas;
	}
	
	
	public int vagasDisponiveis(){
	
		return this.qtdeTotalVagas - this.alunosMatriculados.size();
		
	}
	
	public void matricularAluno(Aluno aluno) throws VagasEsgotadasException{
		
		if (vagasDisponiveis() > 0){
			this.alunosMatriculados.add(aluno);
		}else{
			throw new VagasEsgotadasException();
		}
		
	}
	
	public void definirProfessor(Professor professor) throws Exception{
		
		if (professor.getEspecialidades().contains(this.getAssunto())){
			
			this.professor = professor;
			
		}else{
			
			throw new Exception("O professor não possui a especialidade assunto da turma.");
			
		}
		
	}
	
}
