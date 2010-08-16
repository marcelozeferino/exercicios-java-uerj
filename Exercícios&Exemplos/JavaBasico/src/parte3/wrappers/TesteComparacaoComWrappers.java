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
		 * Como integer3 e integer4 possuem referências diferentes 
		 * (apontam para duas instância diferentes) a comparação com "=="
		 * indica que são objetos diferentes
		 */
		System.out.println( integer3 == integer4 );
		
		/*
		 * Lembrando: SEMPRE, para comparar se dois objetos são equivalentes
		 * devemos utilizar o método equals. 
		 * Nos wrappers e String, o equals é sobrescrito pela linguagem para funcionar
		 * perfeitamente. Porém, quando criamos nosssa classes, precisamos nós
		 * mesmos sobrescrever equals.
		 */
		System.out.println( integer3.equals( integer4 ) ); //Ah! Agora sim...
		
		Integer integer5 = integer3;
		Integer integer6 = Integer.valueOf( integer3 );
		
		/*
		 * Wrappers também são imutáveis, logo integer5 e integer6 apontam para instâncias
		 * diferentes na memória, mesmo que com conteúdo equivalente
		 */
		System.out.println( integer5 == integer6 );
		
		//Com equals, funciona bem...
		System.out.println( integer5.equals(integer6) );
		
	}

}
