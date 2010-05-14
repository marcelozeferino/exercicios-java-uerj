package main.br.com.siscov.tecnicolivro;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import main.br.com.siscov.dao.DAO;
import main.br.com.siscov.livro.Livro;
import main.br.com.siscov.tecnico.Tecnico;

public class TecnicoLivroDAO {
	
	TecnicoLivro tecnicolivro;		
	Tecnico tecnico;
	Livro livro;
	DAO dao;
	
	

	
	public void alterarTecnicoLivro() throws Exception{
		
		
		Statement stmt = dao.getConnection().createStatement();
    	String sql = "update TECNICOLIVRO set codigo ='"+tecnicolivro.getCodigo()+"'," +
    										"dataAtualizacao='"+tecnicolivro.getDataAtualizacao()+"'," +
    										"codigoLivro='"+livro.getCodigo()+"'," +
    										"matriculaTecnico='"+tecnico.getMatricula()+"')";
    	stmt.executeUpdate(sql);
    	stmt.close();
		
	}
	
	
	
	public void excluirTecnicoLivro() throws Exception{
		
		Statement stmt = dao.getConnection().createStatement();
	      String sql = "delete * from TECNICOLIVRO where codigo ='"+tecnicolivro.getCodigo()+"'";
	      stmt.executeUpdate(sql);
	      
	      stmt.close();

	}
	
	public void incluirTecnicoLivro() throws Exception {
	      
    		
    	Statement stmt = dao.getConnection().createStatement();
    	String SQL = "insert into TECNICOLIVRO(codigo,dataAtualizacao, codigoLivro, matriculaTecnico ) values('" +
										    	tecnicolivro.getCodigo()+"','" +
												tecnicolivro.getDataAtualizacao()+"','" +
												livro.getCodigo()+"','" +
												tecnico.getMatricula()+"')";
    	stmt.executeUpdate(SQL);
    	stmt.close();
    	
    }
	
	
	
	public Vector pesquisarTecnicoLivro(TecnicoLivro tecnicolivro) throws Exception{
		
		Vector vector = null;
		String sql = "";
		Statement stmt = dao.getConnection().createStatement();
		
		sql = "select * from TECNICOLIVRO where codigo='"+tecnicolivro.getCodigo()+"'";
		
		ResultSet resultSet = stmt.executeQuery(sql);
		
		while(resultSet.next()){
			vector.add(resultSet.getString("codigo"));
		}
			
			
		resultSet.close();
		stmt.close();	
		return vector;	
	}
	
	
	
}
