package main.br.com.siscov.software;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import main.br.com.siscov.dao.DAO;
import main.br.com.siscov.equipamento.Equipamento;
import main.br.com.siscov.fabricante.Fabricante;
import main.br.com.siscov.fornecedor.Fornecedor;
import main.br.com.siscov.livro.Livro;

public class SoftwareDAO {
	Fabricante fabricante;
	Fornecedor fornecedor;
	Equipamento equipamento;
	Livro livro;
	Software software;
	DAO dao;
	
	
	
	public void alterarSoftware() throws Exception{
	
		
		Statement stmt = dao.getConnection().createStatement();
    	String sql = "updatSOFTWARE set codigo ='"+software.getCodigo()+"'," +
    										"qtdLicensas='"+software.getQtdLicencas()+"'," +
    										"nome='"+software.getNome()+"'," +
    										"descricao='"+software.getDescricao()+"'," +
    										"versao='"+software.getVersao()+"'," +
    										"dataCompra='"+software.getDataCompra()+"'," +
    										"dataAtualizacao='"+software.getDataAtualizacao()+"'," +
    										"cnpjFornecedor='"+fornecedor.getCNPJ()+"'," +
    										"cnpjFabricante='"+fabricante.getCNPJ()+"'," +
    										"nepat='"+equipamento.getNepat()+"'," +
    										"codigoLivro='"+livro.getCodigo()+"')";
    	stmt.executeUpdate(sql);
    	stmt.close();
		
	}
	
	

	
	
	public void excluirSoftware() throws Exception{
		
		Statement stmt = dao.getConnection().createStatement();
	      String sql = "delete * from SOFTWARE where codigo ='"+software.getCodigo()+"'";
	      stmt.executeUpdate(sql);
	      
	      stmt.close();

	}
	
	
	
	public void incluirSoftware() throws Exception {
	      
    		
    	Statement stmt = dao.getConnection().createStatement();
    	String SQL = "insert into SOFTWARE (codigo, qtdLicensas, nome, descricao, versao, dataCompra, dataAtualizacao, cnpjFornecedor, cnpjFabricante, nepat, codigoLivro) values('" +
    										software.getCodigo()+"','" +
    										software.getQtdLicencas()+"','" +
											software.getNome()+"','" +
											software.getDescricao()+"','" +
											software.getVersao()+"','" +
											software.getDataCompra()+"','" +
											software.getDataAtualizacao()+"','" +
											fornecedor.getCNPJ()+"','" +
											fabricante.getCNPJ()+"','" +
											equipamento.getNepat()+"','" +
											livro.getCodigo()+"')";
    	stmt.executeUpdate(SQL);
    	stmt.close();
    	
    }
	
		
	
	public Vector pesquisarSoftware(Software software) throws Exception{
		
		Vector vector = null;
		String sql = "";
		Statement stmt = dao.getConnection().createStatement();
		
		sql = "select * from SOFTWARE where (codigo ='"+software.getCodigo()+"'or"+"nome like'%"+software.getNome()+"%')";
		
		ResultSet resultSet = stmt.executeQuery(sql);
		
		while(resultSet.next()){
			vector.add(resultSet.getString("nome"));
		}
			
			
		resultSet.close();
		stmt.close();	
		return vector;	
	}
	
	public Vector listarSoftware ()throws Exception{
		Vector vector = null;
		String sql = "";
		
		sql = "SELECT NOME FROM SOFTWARE WHERE NOME = LIKE'%"+software.getNome()+"%'";
		
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
