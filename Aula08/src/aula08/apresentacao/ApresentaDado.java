package aula08.apresentacao;

import java.util.List;

import aula08.dao.AlunoDAO;
import aula08.dao.TurmaDAO;
import aula08.dominio.Aluno;
import aula08.dominio.Turma;

public class ApresentaDado {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*List<Aluno> alunos = AlunoDAO.getAlunos();
		
		for (Aluno aluno : alunos) {
			
			System.out.println("Codigo: " + aluno.getCodigo() + " Nome: "+ aluno.getNome());;
			
		}*/
		
	/*	List<Turma> turmas = new TurmaDAO().getTurmas();
		
		for (Turma turma : turmas) {
			System.out.println("Codigo: " + turma.getCodigo() + " Data Inicio: " + turma.getDataInicio());
		}*/
		
		List<Aluno> alunos = new AlunoDAO().getAlunosComHibernate();
		
		for (Aluno aluno : alunos) {
			System.out.println("Codigo: " + aluno.getCodigo() + " Data Inicio: " + aluno.getTurma());
		}

	}

}
