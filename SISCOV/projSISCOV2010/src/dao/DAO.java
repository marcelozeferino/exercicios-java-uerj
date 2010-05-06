package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {

	private Connection connection;
	private Statement statement;
	private ResultSet resultSet;
	
	private String usuario = "postgres";
	private String senha = "123456";
	private String driverBD = "org.postgresql.Driver";
	private String caminhoBD = "jdbc:postgresql://localhost:5432/siscov";
	
	
	
		
	public Connection getConnection() {
		return connection;
	}
	public ResultSet getResultSet(){
		return resultSet;
	}
	public void setResultSet(ResultSet resultSet) {
		this.resultSet = resultSet;
	}
	
	
	
	
	
	
	
	public void abrirConexao() throws ClassNotFoundException,  SQLException {
		Class.forName(driverBD);
		connection = DriverManager.getConnection(caminhoBD , usuario, senha);
	}

	public void fecharConexao() throws SQLException{
		statement.close();
		connection.close();
	}
	
	
	
	
	
	
	
	
	
	

	public synchronized int atualizaSQL(String sql) throws SQLException, ClassNotFoundException{
		
		abrirConexao();
		
		int retorno;
		// se retorna 0, mal sucedido sucedida a atualização sql
		// se retronar 1 , bem sucedida a atualização sql
		retorno = statement.executeUpdate(sql);
		
		fecharConexao();
		
		return retorno;
	}
	


	
	
	public synchronized ResultSet selecionaSQL(String sql) throws SQLException, ClassNotFoundException{
		
		abrirConexao();
		
		// o resultset pode vir preenchido ou vazio, se vazio significa
		// que não achou nada. 
		
		resultSet = statement.executeQuery(sql);
		
		fecharConexao();
		
		return resultSet;
	}

	
	
	

	


 
}
