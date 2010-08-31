package aula08.dao.fabrica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaDeConexao implements IFabricaDeConn {

	@Override
	/**
	 * Retorna uma conex�o com o Banco
	 */
	public Connection getConn() throws ClassNotFoundException, SQLException {
		
		Connection conn = DriverManager.getConnection("jdbc:derby:testeDB;create=true");
		
		return conn;
		
	}

}
