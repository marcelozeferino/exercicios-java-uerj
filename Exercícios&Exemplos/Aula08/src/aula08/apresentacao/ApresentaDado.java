package aula08.apresentacao;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;

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
			
		}
		*/
		
		/*List<Turma> turmas = new TurmaDAO().getTurmas();
		
		for (Turma turma : turmas) {
			System.out.println("Codigo: " + turma.getCodigo() + " Data Inicio: " + turma.getDataInicio());
		}*/
		
		List<Aluno> alunos = new AlunoDAO().getAlunosComHibernate();
		
		System.out.println("\nAlunos Cadastrados:\n");
		for (Aluno aluno : alunos) {
			System.out.println("Codigo: " + aluno.getCodigo() + " Data Inicio Turma: " + aluno.getTurma().getDataInicio());
		}
		
		System.out.println("\nCadastrando e imprimindo um novo aluno e turma:\n");
		
		//Criando nova turma
		Turma novaTurma = new Turma();
		novaTurma.setCodigo(new Random().nextInt(1000));
		novaTurma.setDataInicio(new Date());
		
		//Criando a Data Fim como data atual + 2 meses
		Calendar dataFimNovaTurma  = new GregorianCalendar();
		dataFimNovaTurma.add(GregorianCalendar.MONTH, 2);
		novaTurma.setDataFim(dataFimNovaTurma.getTime());
		
		new TurmaDAO().salvarNovaTurma(novaTurma);
		
		//Criando novo aluno e atribuindo a turma criada anteriormente
		Aluno novoAluno = new Aluno();
		novoAluno.setCodigo(new Random().nextInt(1000));
		novoAluno.setNome("Kurt Cobain");
		novoAluno.setTurma(novaTurma);
		
		//Persistindo novo aluno no banco
		new AlunoDAO().salvarNovoAluno(novoAluno);
		
		//Recuperando e exibindo a lista de alunos, agora com o aluno novo
		alunos = new AlunoDAO().getAlunosComHibernate();
		
		for (Aluno aluno : alunos) {
			System.out.println("Codigo: " + aluno.getCodigo() + " Data Fim Turma: " + aluno.getTurma().getDataFim());
		}

	}

}
