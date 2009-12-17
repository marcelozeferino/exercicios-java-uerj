package parte3.wrappers;

public class TesteComparacaoComWrappers {


	public static void main(String[] args) {
		
		Integer integer1 = 100;
		Integer integer2 = 100;
		System.out.println( integer1 == integer2 );
		
		Integer integer3 = new Integer(100);
		Integer integer4 = new Integer(100);
		
		//??? False ???
		/*
		 * Como integer3 e integer4 possuem refer�ncias diferentes 
		 * (apontam para duas inst�ncia diferentes) a compara��o com "=="
		 * indica que s�o objetos diferentes
		 */
		System.out.println( integer3 == integer4 );
		
		/*
		 * Lembrando: SEMPRE, para comparar se dois objetos s�o equivalentes
		 * devemos utilizar o m�todo equals. 
		 * Nos wrappers e String, o equals � sobrescrito pela linguagem para funcionar
		 * perfeitamente. Por�m, quando criamos nosssa classes, precisamos n�s
		 * mesmos sobrescrever equals.
		 */
		System.out.println( integer3.equals( integer4 ) ); //Ah! Agora sim...
		
		Integer integer5 = integer3;
		Integer integer6 = Integer.valueOf( integer3 );
		
		/*
		 * Wrappers tamb�m s�o imut�veis, logo integer5 e integer6 apontam para inst�ncias
		 * diferentes na mem�ria, mesmo que com conte�do equivalente
		 */
		System.out.println( integer5 == integer6 );
		
		//Com equals, funciona bem...
		System.out.println( integer5.equals(integer6) );
		
	}

}
