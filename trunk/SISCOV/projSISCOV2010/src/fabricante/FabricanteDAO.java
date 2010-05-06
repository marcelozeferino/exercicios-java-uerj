package fabricante;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import software.Software;

import dao.DAO;

public class FabricanteDAO {
	
	Fabricante fabricante;	
	Software software;
	DAO dao;
	
	
	
	public void alterarFabricante() throws Exception{
	
		
		Statement stmt = dao.getConnection().createStatement();
    	String sql = "update FABRICANTE set cnpj ='"+fabricante.getCNPJ()+"'," +
    										"nome='"+fabricante.getNome()+"'," +
    										"nomeFantasia='"+fabricante.getNomeFantasia()+"'," +
    										"endereco='"+fabricante.getEndereco()+"'," +
    										"cep='"+fabricante.getCEP()+"'," +
    										"telefone='"+fabricante.getTelefone()+"'," +
    										"ramoAtividade='"+fabricante.getRamoAtividade()+"'," +
    										"codigoSoftware='"+software.getCodigo()+"')";
    	stmt.executeUpdate(sql);
    	stmt.close();
		
	}
	
	

	
	
	public void excluirFabricante() throws Exception{
		
		Statement stmt = dao.getConnection().createStatement();
	      String sql = "delete * from FABRICANTE where cnpj ='"+fabricante.getCNPJ()+"'";
	      stmt.executeUpdate(sql);
	      
	      stmt.close();

	}
	
	
	
	
	public void incluirFabricante() throws Exception {
	      
    		
    	Statement stmt = dao.getConnection().createStatement();
    	String SQL = "insert into FORNECEDOR (cnpj, nome, nomeFantasia, cep, endereco, telefone, ramoAtividade,codigoSoftware) values('" +
    										fabricante.getCNPJ()+"','" +
    										fabricante.getNome()+"','" +
    										fabricante.getNomeFantasia()+"','" +
    										fabricante.getCEP()+"','" +
    										fabricante.getEndereco()+"','" +
    										fabricante.getTelefone()+"','" +
    										fabricante.getRamoAtividade()+"','" +  								
    										software.getCodigo()+"')";
    	stmt.executeUpdate(SQL);
    	stmt.close();
    	
    }
	
		
	
	public Vector pesquisarFabricante(Fabricante fabricante) throws Exception{
		
		Vector vector = null;
		String sql = "";
		Statement stmt = dao.getConnection().createStatement();
		
		sql = "select * from FABRICANTE where (cnpj ='"+fabricante.getCNPJ()+"'or"+"nome like'%"+fabricante.getNome()+"%')";
		
		ResultSet resultSet = stmt.executeQuery(sql);
		
		while(resultSet.next()){
			vector.add(resultSet.getString("nome"));
		}
			
			
		resultSet.close();
		stmt.close();	
		return vector;	
	}
	
	public Vector listarFabricante ()throws Exception{
		Vector vector = null;
		String sql = "";
		
		sql = "SELECT NOME FROM FABRICANTE WHERE NOME = LIKE'%"+fabricante.getNome()+"%'";
		
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
