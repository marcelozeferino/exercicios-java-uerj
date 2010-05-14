package main.br.com.siscov.manutencao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import main.br.com.siscov.chamado.Chamado;
import main.br.com.siscov.dao.DAO;
import main.br.com.siscov.tecnico.Tecnico;


public class ManutencaoDAO {

	Chamado chamado;
	Tecnico tecnico;
	Manutencao manutencao;
	Status status;
	DAO dao;
	
	public void alterarManutencao() throws Exception{
		
		
		Statement stmt = dao.getConnection().createStatement();
    	String sql = "update MANUTENCAO set codigo='"+manutencao.getCodigo()+"'," +
    										"data='"+manutencao.getData()+"'," +
    										"hora='"+manutencao.getHora()+"'," +
    										"problema='"+manutencao.getProblema()+"'," + 
    										"solucao='"+manutencao.getSolucao()+"'," +
    										"status='"+status.getCodigo()+"'," +
    										"numeroChamado='"+chamado.getNumero()+"'," +
    										"matriculaTecnico='"+tecnico.getMatricula()+"')";
    										
    	stmt.executeUpdate(sql);
    	stmt.close();
		
	}
	
	
	
	public void excluirManutencao() throws Exception{
		
		Statement stmt = dao.getConnection().createStatement();
	      String sql = "delete * from MANUTENCAO where codigo ='"+manutencao.getCodigo()+"'";
	      stmt.executeUpdate(sql);
	      
	      stmt.close();

	}
	
	public void incluirChamado() throws Exception {
	      
    		
    	Statement stmt = dao.getConnection().createStatement();
    	String SQL = "insert into CHAMADO(codigo, data, hora, problema, solucao, status, numeroChamado, matriculaTecnico ) values('" +
									    	manutencao.getCodigo()+"','" +
											manutencao.getData()+"','" +
											manutencao.getHora()+"','" +
											manutencao.getProblema()+"','" + 
											manutencao.getSolucao()+"','" +
											status.getCodigo()+"','" +
											chamado.getNumero()+"','" +
											tecnico.getMatricula()+"')";
    	stmt.executeUpdate(SQL);
    	stmt.close();
    	
    }
	
	
	
	public Vector pesquisarManutencao(Manutencao manutencao) throws Exception{
		
		Vector vector = null;
		String sql = "";
		Statement stmt = dao.getConnection().createStatement();
		
		sql = "select * from MANUTENCAO where codigo ='"+manutencao.getCodigo()+"'";
		
		ResultSet resultSet = stmt.executeQuery(sql);
		
		while(resultSet.next()){
			vector.add(resultSet.getString("codigo"));
		}
			
			
		resultSet.close();
		stmt.close();	
		return vector;	
	}
	
	public Vector listarManutencao ()throws Exception{
		Vector vector = null;
		String sql = "";
		
		sql = "SELECT CODIGO FROM MANUTENCAO WHERE CODIGO ='"+manutencao.getCodigo()+"'";
		
		Statement statement = dao.getConnection().createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		
		while (resultSet.next()){
			vector.add(resultSet.getString("codigo"));
			
		}
		resultSet.close();
		statement.close();
		return vector ;	
	}
	
}
