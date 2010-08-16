package br.com.uerj.infraestrutura.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.uerj.model.Turma;

public class TurmaDAO {

	public List<Turma> obterTurmasCadastradas(){
		
		List<Turma> turmas = new ArrayList<Turma>();
		
		turmas.add(new Turma(1, new Date(), 40));
		turmas.add(new Turma(2, new Date(), 20));
		turmas.add(new Turma(3, new Date(), 30));
		
		return turmas;
		
	}
	
	public void persistirTurma(Turma turma){
		
	}
	
}
