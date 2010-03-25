package br.com.uerj.estruturas_controle;

public class TestesComIf {

	
	
	public static void main(String[] args) {
		
		int idade = 10;
		
		if (idade > 10){
			
			System.out.println("Maior que 10");
			
		}else if (idade == 10){
			
			System.out.println("Igual a 10");
			
		}else{
			
			System.out.println("Menor que 10");
			
		}
		
		boolean testeBool = false;
		
		if (!testeBool){
			System.out.println("verdadeiro");
		}else{
			System.out.println("falso");
		}
		
		
	}

}
