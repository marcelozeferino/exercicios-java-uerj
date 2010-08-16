package br.com.uerj.estruturas_controle;

public class TestesComWhile {



	public static void main(String[] args) {

		int cont = 0;

		marcacao:
		while(cont < 10){
			
			System.out.println("Repetição 1: " + cont );
			
			if (cont == 5){
				break;
			}
			
			int cont2 = 0;
			marcacao2:
			while(cont2 < 10){
				
				System.out.print("Repetição 2: ");
				System.out.print(cont2 + ", ");
				
				if (cont2 == 3){
					cont++;
					continue marcacao;
				}
				
				cont2++;
				
			}
			
			System.out.println();
			
			
			
		}
		
		System.out.println("Fim");
		

	}

}
