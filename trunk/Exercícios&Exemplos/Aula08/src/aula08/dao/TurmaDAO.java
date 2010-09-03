package aula08.dao;

import java.util.ArrayList;
import java.util.List;

import aula08.dominio.Turma;

public class TurmaDAO extends GenericDAO {

	@SuppressWarnings("unchecked")
	public  List<Turma> getTurmas() {

		List<Turma> turmas = new ArrayList<Turma>();

		turmas = (List<Turma>) query("from Turma");

		return turmas;

	}
	
	public void salvarNovaTurma(Turma novaTurma){
		
		insert(novaTurma);
		
	}
	

}
