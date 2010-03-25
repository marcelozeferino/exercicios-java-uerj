package aula08.dao.fabrica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaDeConexao implements IFabricaDeConn {

	@Override
	/**
	 * Retorna uma conexão com o Banco
	 */
	public Connection getConn() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.
			getConnection("jdbc:mysql://localhost:3309/aula07bd?user=root&password=root");
		
		return conn;
		
	}

}
