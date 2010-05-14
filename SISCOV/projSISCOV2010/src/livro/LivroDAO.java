package main.br.com.siscov.livro;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import main.br.com.siscov.dao.DAO;
import main.br.com.siscov.software.Software;
import main.br.com.siscov.tecnico.Tecnico;
import main.br.com.siscov.tecnicolivro.TecnicoLivro;

public class LivroDAO {

	Tecnico tecnico;
	Livro livro;
	Software software;
	TecnicoLivro tecnicoLivro;
	DAO dao;
	

	
	public void alterarLivro() throws Exception{
		
		
		Statement stmt = dao.getConnection().createStatement();
    	String sql = "update LIVRO set codigo ='"+livro.getCodigo()+"'," +
    										"numeroSerie='"+livro.getNumeroSerie()+"'," +
    										"nome='"+livro.getNome()+"'," +
    										"tipoSuporte='"+livro.getTipoSuporte()+"'," + 
    										"quantidade='"+livro.getQuantidade()+"'," +
    										"isbn='"+livro.getISBN()+"'," +
    										"codigoSoftware='"+software.getCodigo()+"'," +
    										"matricula='"+tecnico.getMatricula()+"')";
    	stmt.executeUpdate(sql);
    	stmt.close();
		
	}
	
	
	
	public void excluirLivro() throws Exception{
		
		Statement stmt = dao.getConnection().createStatement();
	      String sql = "delete * from LIVRO where codigo ='"+livro.getCodigo()+"'";
	      stmt.executeUpdate(sql);
	      
	      stmt.close();

	}
	
	public void incluirLivro() throws Exception {
	      
    		
    	Statement stmt = dao.getConnection().createStatement();
    	String SQL = "insert into LIVRO(codigo, numeroSerie, nome, tipoSuporte, quantidade, isbn, codigoSoftware, matricula ) values('" +
    										livro.getCodigo()+"','" +
    										livro.getNumeroSerie()+"','" +
    										livro.getNome()+"','" +
    										livro.getTipoSuporte()+"','" +
    										livro.getQuantidade()+"','" +
    										livro.getISBN()+"','" +
    										software.getCodigo()+"','" +
    									    tecnico.getMatricula()+"')";
    	stmt.executeUpdate(SQL);
    	stmt.close();
    	
    }
	
	
	
	public Vector pesquisarLivro(Livro livro) throws Exception{
		
		Vector vector = null;
		String sql = "";
		Statement stmt = dao.getConnection().createStatement();
		
		sql = "select * from LIVRO where (codigo='"+livro.getCodigo()+"'or"+"nome like'%"+livro.getNome()+"%')";
		
		ResultSet resultSet = stmt.executeQuery(sql);
		
		while(resultSet.next()){
			vector.add(resultSet.getString("nome"));
		}
			
			
		resultSet.close();
		stmt.close();	
		return vector;	
	}
	
	public Vector listarLivro ()throws Exception{
		Vector vector = null;
		String sql = "";
		
		sql = "SELECT NOME FROM LIVRO WHERE NOME = LIKE'%"+livro.getNome()+"%'";
		
		Statement statement = dao.getConnection().createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		
		while (resultSet.next()){
			vector.add(resultSet.getString("nome"));
			
		}
		resultSet.close();
		statement.close();
		return vector ;	
	}
	
}
