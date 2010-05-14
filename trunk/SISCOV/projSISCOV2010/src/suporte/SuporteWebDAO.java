package main.br.com.siscov.suporte;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import main.br.com.siscov.dao.DAO;

public class SuporteWebDAO {

	SuporteWeb suporteweb;
	Area area = new SuporteWeb();
	DAO dao;
	

	public void alterarSuporteWeb() throws Exception{
		
		
		Statement stmt = dao.getConnection().createStatement();
    	String sql = "update SUPORTEWEB set codigo ='"+suporteweb.getCodigo()+"'," +
    										"codigoArea='"+area.getCodigo()+"')";
    	stmt.executeUpdate(sql);
    	stmt.close();
		
	}
	
	
	public void excluirSuporteWeb() throws Exception{
		
		Statement stmt = dao.getConnection().createStatement();
	      String sql = "delete * from SUPORTEWEB where codigo ='"+suporteweb.getCodigo()+"'";
	      stmt.executeUpdate(sql);
	      
	      stmt.close();

	}

	
	public void incluirSuporteWeb() throws Exception {
	      
    		
    	Statement stmt = dao.getConnection().createStatement();
    	String SQL = "insert into SUPORTEWEB(codigo, codigoArea) values('" +
    										suporteweb.getCodigo()+"','" +
    										area.getCodigo()+"')";
    										
    	stmt.executeUpdate(SQL);
    	stmt.close();
    	
    }
	
	

	
	public Vector pesquisarSuporteWeb(SuporteWeb suporteweb) throws Exception{
		
		Vector vector = null;
		String sql = "";
		Statement stmt = dao.getConnection().createStatement();
		
		sql = "select * from SUPORTEWEB where (codigo='"+suporteweb.getCodigo()+"'or"+"nome like'%"+area.getNome()+"%')";
		
		ResultSet resultSet = stmt.executeQuery(sql);
		
		while(resultSet.next()){
			vector.add(resultSet.getString("nome"));
		}
			
			
		resultSet.close();
		stmt.close();	
		return vector;	
	}
	
	public Vector listarSuporteWeb()throws Exception{
		Vector vector = null;
		String sql = "";
		
		sql = "SELECT  A.NOME, WEB.CODIGO FROM SUPORTEWEB WEB " +
				"		JOIN  AREA	A	ON (WEB.CODIGORAREA	= A.CODIGO)" +
				"WHERE A.NOME = LIKE'%"+area.getNome()+"%'";
		
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
