package aula08.dao.fabrica;

import java.sql.Connection;
import java.sql.SQLException;

public interface IFabricaDeConn  {

	public Connection getConn() throws ClassNotFoundException, SQLException;
	
}
