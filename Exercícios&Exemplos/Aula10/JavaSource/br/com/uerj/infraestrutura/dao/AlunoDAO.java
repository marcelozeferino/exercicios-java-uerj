package br.com.uerj.infraestrutura.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.uerj.model.Aluno;
import br.com.uerj.model.Turma;

public class AlunoDAO {
	
public List<Aluno> obterAlunosCadastradas(){
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		Turma turma1 = new Turma(1, new Date(), 40);
		Turma turma2 = new Turma(2, new Date(), 20);
		Turma turma3 = new Turma(3, new Date(), 30);
		
		alunos.add(new Aluno(1, "Marcelo", turma1));
		alunos.add(new Aluno(2, "Pedro", turma2));
		alunos.add(new Aluno(3, "Marcela", turma3));
		
		return alunos;
		
	}
	
	public void persistirAluno(Aluno alunos){
		
	}

}
