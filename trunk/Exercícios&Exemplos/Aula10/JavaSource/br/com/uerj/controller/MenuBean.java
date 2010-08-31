package br.com.uerj.controller;

import java.util.Date;
import java.util.List;

import br.com.uerj.infraestrutura.dao.AlunoDAO;
import br.com.uerj.infraestrutura.dao.TurmaDAO;
import br.com.uerj.model.Aluno;
import br.com.uerj.model.Turma;

public class MenuBean {
	
	private List<Turma> turmasCadastradas = new TurmaDAO().carregarTurmas();
	private List<Aluno> alunosCadastrados = new AlunoDAO().carregarAlunos();
	
	
	private Date dataAtual = new Date();

	public Date getDataAtual() {
		return dataAtual;
	}

	public void setDataAtual(Date dataAtual) {
		this.dataAtual = dataAtual;
	}

	public List<Turma> getTurmasCadastradas() {
		return turmasCadastradas;
	}

	public List<Aluno> getAlunosCadastrados() {
		return alunosCadastrados;
	}

}
	
