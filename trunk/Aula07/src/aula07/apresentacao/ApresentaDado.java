package aula07.apresentacao;

import java.util.List;

import aula07.dao.AlunoDAO;
import aula07.dominio.Aluno;

public class ApresentaDado {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Aluno> alunos = AlunoDAO.getAlunos();
		
		for (Aluno aluno : alunos) {
			
			System.out.println("Codigo: " + aluno.getCodigo() + " Nome: "+ aluno.getNome());;
			
		}

	}

}
