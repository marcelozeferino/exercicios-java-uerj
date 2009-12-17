package parte3.operadores;

public class TesteComOperadores {

	
	public static void main(String[] args) {
		
		System.out.println("Operadores aritméticos");
		System.out.println( 1 + 1 );
		System.out.println( 10 / 10 );
		System.out.println( 1 * 3 );
		System.out.println( 3 - 1 );
		
		//Módulo (resto da divisão)
		System.out.println( 5 % 2 );
		
		System.out.println("Operadores de atribuição");		
		int umInt = 10;
		System.out.println( umInt += 1 );
		System.out.println( umInt -= 1 );
		System.out.println( umInt /= 2 );
		System.out.println( umInt *= 2 );
		System.out.println( umInt %= 2 );

		int outroInt = 10;
		System.out.println("Incremento e decremento");
		System.out.println( ++ outroInt );
		System.out.println( outroInt ++ ); //Primeiro exibe o valor e depois incrementa
		System.out.println( outroInt ); //Só aqui veremos o valor incrementado acima
		
		System.out.println( -- outroInt );
		System.out.println( outroInt -- );//Primeiro exibe o valor e depois decrementa
		System.out.println( outroInt );//Só aqui veremos o valor decrementado acima
		
	}

}
