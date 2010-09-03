package aula08.acesso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AcessoADados {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		try {
			
			Connection conn = DriverManager.getConnection("jdbc:derby:testeDB;create=true");
			
			Statement stmt = conn.createStatement();   
			
			ResultSet rs = stmt.executeQuery("SELECT * from aluno");
			
			while(rs.next()){
				
				System.out.print(rs.getInt("codigo") + " - ");
				System.out.print(rs.getString("nome") + " - ");
				System.out.println(rs.getInt("turma"));
				
			}
			
		
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		
		
	}

}
