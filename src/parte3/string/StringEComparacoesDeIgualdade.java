package parte3.string;

public class StringEComparacoesDeIgualdade {

	
	public static void main (String args[]){
		
		String nome = "marcelo";
		String nome2 = "marcelo";
		
		System.out.println( nome == "marcelo" );
		System.out.println( nome == nome2 );
		System.out.println( nome.equals(nome2) );
		System.out.println( nome.equals("marcelo") );
		
		String nome3 = nome.toUpperCase();
		String nome4 = nome.toUpperCase();
		
		System.out.println("Nome3: " + nome3);
		System.out.println("Nome4: " + nome4);				
		System.out.println(nome3.equals(nome4));
		
		/*
		 * ??? False ???
		 * 
		 * Atribuimos o resultado de upperCase de nome a nome3 e 
		 * o resultado de upperCase de nome a nome4. Logo, foram criadas
		 * duas instancias diferentes de String (uma em nome3 e outra em nome4.
		 * 
		 * O operador "==" compara (quando comparando objetos) se objetos
		 * possuem a mesma refer�ncia (ou seja, mesma inst�ncia) e como nome3 e nome4
		 * s�o duas inst�ncias diferentes na mem�ria (mesmo que com o mesmo conte�do)
		 * o resultado � false! Por isso SEMPRE devemos usar o m�todo equals() para 
		 * comparar duas Strings ou quaisquer outros objetos.
		 */
		 System.out.println(nome3 == nome4);
		 
		 /*
		 * E o que acontece no trecho abaixo, que retorna true como resultado da compara��o?
		 */		 
		 String nome5 = "marcelo";
		 String nome6 = "marcelo";
		 System.out.println( nome5 == "marcelo" );
		 System.out.println( nome == nome6 );
		 
		 /*
		 * O Java possui um pool de Strings onde s�o armazenadas strings literais
		 * de acordo com sua utiliza��o. Assim, no trecho acima n�o � criada uma outra inst�ncia
		 * de String para "marcelo" e sim a inst�ncia criada anteriormente � re-utilizada. 
		 * 
		 * Logo, nome e nome2 apontam para a mesma refer�ncia de mem�ria.
		 */
		
		
		
		
	}
}
