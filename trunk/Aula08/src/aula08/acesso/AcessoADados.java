package aula08.acesso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AcessoADados {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");

			Connection conn = DriverManager.
				getConnection("jdbc:mysql://localhost:3309/aula08bd?user=root&password=root");
			
			Statement stm = conn.createStatement();  
			ResultSet rs = stm.executeQuery("SELECT * from aluno");
			rs.next();
			System.out.println(rs.getString("nome"));
			
			while(rs.next()){
				
				System.out.println(rs.getInt("codigo"));
				
			}
			
		
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		
/*
		while (rs.next()) {  
		    String coluna1 = rs.getString("coluna1");  
		    int coluna2 = rs.getInt("coluna2");  
		     
		} */

		
		

	}

}
