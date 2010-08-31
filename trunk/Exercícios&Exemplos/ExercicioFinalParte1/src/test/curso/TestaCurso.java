package test.curso;

import main.curso.Aluno;
import main.curso.Especialidade;
import main.curso.Professor;
import main.curso.Turma;
import main.curso.VagasEsgotadasException;

public class TestaCurso {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Especialidade esp1 = new Especialidade(1,"Java");
		Especialidade esp2 = new Especialidade(1,"POO");
		
		Professor prof1 = new Professor(1, "Marcelo");
		prof1.getEspecialidades().add(esp1);
		prof1.getEspecialidades().add(esp2);
		
		Professor prof2 = new Professor(1, "Carlos");
		prof2.getEspecialidades().add(esp2);
		
		Aluno aluno1 = new Aluno(124, "Pedro");
		Aluno aluno2 = new Aluno(231, "João");
		Aluno aluno3 = new Aluno(231, "Zé");
		
		
		Turma turmaJava = new Turma();
		turmaJava.setQtdeTotalVagas(2);
		turmaJava.setAssunto(esp1);
		
		try {
			turmaJava.definirProfessor(prof1);
			System.out.println("Professor definido!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			turmaJava.matricularAluno(aluno1);
			turmaJava.matricularAluno(aluno2);
			//turmaJava.matricularAluno(aluno3);
			
			System.out.println("Todos alunos matriculados!");
			
		} catch (VagasEsgotadasException e) {
			e.printStackTrace();
		}
		
	}

}
