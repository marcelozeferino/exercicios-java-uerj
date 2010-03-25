package aula08.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import aula08.dao.fabrica.FabricaDeConexao;
import aula08.dominio.Aluno;
import aula08.dominio.Turma;

public class AlunoDAO extends GenericDAO implements IDAO {
	
	public static List<Aluno> getAlunos(){
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		try{
			Connection conn = new FabricaDeConexao().getConn();
			
			Statement stm = conn.createStatement();  
			
			ResultSet rs = stm.executeQuery("SELECT * from aluno");
				
			while(rs.next()){
				
				Aluno aluno = new Aluno();
				aluno.setCodigo(rs.getInt("codigo"));
				aluno.setNome(rs.getString("nome"));
				alunos.add(aluno);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return alunos;
	}

	@SuppressWarnings("unchecked")
	public  List<Aluno> getAlunosComHibernate() {

		List<Aluno> alunos = new ArrayList<Aluno>();

		alunos = (List<Aluno>) query("from Aluno");

		return alunos;

	}
}
