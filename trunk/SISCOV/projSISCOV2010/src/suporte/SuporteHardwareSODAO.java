package main.br.com.siscov.suporte;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import main.br.com.siscov.dao.DAO;



public class SuporteHardwareSODAO {

	SuporteHardwareSO suportehardwareso;
	Area area = new SuporteHardwareSO();
	DAO dao;
	

	public void alterarSuporteHardwareSO() throws Exception{
		
		
		Statement stmt = dao.getConnection().createStatement();
    	String sql = "update SUPORTEHARDWARESO set codigo ='"+suportehardwareso.getCodigo()+"'," +
    										"codigoArea='"+area.getCodigo()+"')";
    	stmt.executeUpdate(sql);
    	stmt.close();
		
	}
	
	
	public void excluirSuporteHardwareSO() throws Exception{
		
		Statement stmt = dao.getConnection().createStatement();
	      String sql = "delete * from SUPORTEHARDWARESO where codigo ='"+suportehardwareso.getCodigo()+"'";
	      stmt.executeUpdate(sql);
	      
	      stmt.close();

	}

	
	public void incluirSuporteHardwareSO() throws Exception {
	      
    		
    	Statement stmt = dao.getConnection().createStatement();
    	String SQL = "insert into SUPORTEHARDWARESO(codigo, codigoArea) values('" +
    										suportehardwareso.getCodigo()+"','" +
    										area.getCodigo()+"')";
    										
    	stmt.executeUpdate(SQL);
    	stmt.close();
    	
    }
	
	

	
	public Vector pesquisarSuporteHardwareSO(SuporteHardwareSO suporteHardwareSO) throws Exception{
		
		Vector vector = null;
		String sql = "";
		Statement stmt = dao.getConnection().createStatement();
		
		sql = "select * from SUPORTEHARDWARESO where (codigo='"+suporteHardwareSO.getCodigo()+"'or"+"nome like'%"+area.getNome()+"%')";
		
		ResultSet resultSet = stmt.executeQuery(sql);
		
		while(resultSet.next()){
			vector.add(resultSet.getString("nome"));
		}
			
			
		resultSet.close();
		stmt.close();	
		return vector;	
	}
	
	public Vector listarSuporteHardwareSO()throws Exception{
		Vector vector = null;
		String sql = "";
		
		sql = "SELECT  A.NOME, HSO.CODIGO FROM SUPORTEHARDWARESO HSO " +
				"		JOIN  AREA	A	ON (HSO.CODIGORAREA	= A.CODIGO)" +
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
