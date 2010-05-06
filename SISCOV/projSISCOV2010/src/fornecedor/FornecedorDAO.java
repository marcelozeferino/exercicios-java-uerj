package fornecedor;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import software.Software;

import dao.DAO;
import equipamento.Equipamento;


public class FornecedorDAO {

	Fornecedor fornecedor;
	Equipamento equipamento;	
	Software software;
	DAO dao;
	
	
	
	public void alterarFornecedor() throws Exception{
	
		
		Statement stmt = dao.getConnection().createStatement();
    	String sql = "update FORNECEDOR set cnpj ='"+fornecedor.getCNPJ()+"'," +
    										"nome='"+fornecedor.getNome()+"'," +
    										"nomeFantasia='"+fornecedor.getNomeFantasia()+"'," +
    										"endereco='"+fornecedor.getEndereco()+"'," +
    										"cep='"+fornecedor.getCEP()+"'," +
    										"telefone='"+fornecedor.getTelefone()+"'," +
    										"ramoAtividade='"+fornecedor.getRamoAtividade()+"'," +
    										"nepat='"+equipamento.getNepat()+"'," +
    										"codigoSoftware='"+software.getCodigo()+"')";
    	stmt.executeUpdate(sql);
    	stmt.close();
		
	}
	
	

	
	
	public void excluirFornecedor() throws Exception{
		
		Statement stmt = dao.getConnection().createStatement();
	      String sql = "delete * from FORNECEDOR where cnpj ='"+fornecedor.getCNPJ()+"'";
	      stmt.executeUpdate(sql);
	      
	      stmt.close();

	}
	
	
	
	
	public void incluirFornecedor() throws Exception {
	      
    		
    	Statement stmt = dao.getConnection().createStatement();
    	String SQL = "insert into FORNECEDOR (cnpj, nome, nomeFantasia, cep, endereco, telefone, ramoAtividade, nepat, codigoSoftware) values('" +
    										fornecedor.getCNPJ()+"','" +
    										fornecedor.getNome()+"','" +
    										fornecedor.getNomeFantasia()+"','" +
    										fornecedor.getCEP()+"','" +
    										fornecedor.getEndereco()+"','" +
    										fornecedor.getTelefone()+"','" +
    										fornecedor.getRamoAtividade()+"','" +
    										equipamento.getNepat()+"','" +   								
    										software.getCodigo()+"')";
    	stmt.executeUpdate(SQL);
    	stmt.close();
    	
    }
	
		
	
	public Vector pesquisarFornecedor(Fornecedor fornecedor) throws Exception{
		
		Vector vector = null;
		String sql = "";
		Statement stmt = dao.getConnection().createStatement();
		
		sql = "select * from FORNECEDOR where (cnpj ='"+fornecedor.getCNPJ()+"'or"+"nome like'%"+fornecedor.getNome()+"%')";
		
		ResultSet resultSet = stmt.executeQuery(sql);
		
		while(resultSet.next()){
			vector.add(resultSet.getString("nome"));
		}
			
			
		resultSet.close();
		stmt.close();	
		return vector;	
	}
	
	public Vector listarFornecedor ()throws Exception{
		Vector vector = null;
		String sql = "";
		
		sql = "SELECT NOME FROM FORNECEDOR WHERE NOME = LIKE'%"+fornecedor.getNome()+"%'";
		
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
