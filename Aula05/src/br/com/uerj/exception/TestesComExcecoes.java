package br.com.uerj.exception;

import java.io.File;
import java.io.IOException;



public class TestesComExcecoes {

	public static void main(String[] args)  {

		File f = null ; //new File("c:\test.txt");
				
		try{
			f.createNewFile();
			
			if (f == null){
				throw new MinhaExcecao();
			}
			
		}catch (Exception e) {
			System.out.println("ERRO " + e.getMessage());
			
		}
		
		

	}

}
