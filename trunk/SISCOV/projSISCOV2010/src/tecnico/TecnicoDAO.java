package tecnico;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import suporte.Area;
import tecnicolivro.TecnicoLivro;

import livro.Livro;
import manutencao.Manutencao;

import chamado.Chamado;

import dao.DAO;



public class TecnicoDAO {

	Tecnico tecnico;
	Manutencao manutencao;
	Chamado chamado;
	Area area;
	TecnicoLivro tecnicolivro;
	Livro livro;
	DAO dao;
	
	
	
	
	public void alterarUsuario() throws Exception{
		
		
		Statement stmt = dao.getConnection().createStatement();
    	String sql = "update TECNICO set matricula ='"+tecnico.getMatricula()+"'," +
    										"nome='"+tecnico.getNomeTecnico()+"'," +
    										"login='"+tecnico.getLogin()+"'," +
    										"senha='"+tecnico.getSenha()+"'," + 
    										"telefone='"+tecnico.getTelefone()+"'," +
    										"numero='"+chamado.getNumero()+"'," +
    										"codigoArea='"+area.getCodigo()+"'," +
    										"codigoLivro='"+livro.getCodigo()+"')";
    	stmt.executeUpdate(sql);
    	stmt.close();
		
	}
	
	
	
	public void excluirTecnico() throws Exception{
		
		Statement stmt = dao.getConnection().createStatement();
	      String sql = "delete * from TECNICO where matricula ='"+tecnico.getMatricula()+"'";
	      stmt.executeUpdate(sql);
	      
	      stmt.close();

	}
	

	
	
	public void incluirTecnico() throws Exception {
	      
    		
    	Statement stmt = dao.getConnection().createStatement();
    	String SQL = "insert into TECNICO(matricula, nome, login, senha, telefone, numero, codigoArea, codigoLivro ) values('" +
    										tecnico.getMatricula()+"','" +
    										tecnico.getNomeTecnico()+"','" +
    										tecnico.getLogin()+"','" +
    										tecnico.getSenha()+"','" +
    										tecnico.getTelefone()+"','" +
    										chamado.getNumero()+"','" +
    										area.getCodigo()+"','" +
    									    livro.getCodigo()+"')";
    	stmt.executeUpdate(SQL);
    	stmt.close();
    	
    }
	
	
	
	
	public Vector pesquisarTecnico(Tecnico tecnico) throws Exception{
		
		Vector vector = null;
		String sql = "";
		Statement stmt = dao.getConnection().createStatement();
		
		sql = "select * from TECNICO where (matricula='"+tecnico.getMatricula()+"'or"+"nomeTecnico like'%"+tecnico.getNomeTecnico()+"%')";
		
		ResultSet resultSet = stmt.executeQuery(sql);
		
		while(resultSet.next()){
			vector.add(resultSet.getString("nomeTecnico"));
		}
			
			
		resultSet.close();
		stmt.close();	
		return vector;	
	}
	
	public Vector listarTecnico ()throws Exception{
		Vector vector = null;
		String sql = "";
		
		sql = "SELECT NOMETECNICO FROM TECNICO WHERE NOMETECNICO = LIKE'%"+tecnico.getNomeTecnico()+"%'";
		
		Statement statement = dao.getConnection().createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		
		while (resultSet.next()){
			vector.add(resultSet.getString("nomeTecnico"));
			
		}
		resultSet.close();
		statement.close();
		return vector ;	
	}



}
