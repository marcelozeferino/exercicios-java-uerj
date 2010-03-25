package parte3.operadores;

public class TesteComOperacoes {
	
	public static void main(String [] args){
		
		int umInt = 1;
		int outroInt = 2;
		int resultadoInt = umInt + outroInt;
		long resultadoLong = umInt + outroInt;
		
		System.out.println(resultadoInt);
		System.out.println(resultadoLong);
		
		//Erro de compli��o��o, pois um int n�o cabe em um byte
		//byte resultadoByte = umInt + outroInt;
		
		byte umByte = 1;
		byte outroByte = 1;
		
		//Erro de compila��o?! Em opera��es com n�meros menores de int, 
		//o resultado sempre ser� um int. Como int n�o cabe em byte...
		//byte resultadoSomaBytes = umByte + outroByte;
		
		//System.out.println(resultadoSomaBytes);
		
		long umLong = 1L;
		//OK! Soma de um int com long ter� como resultado um long
		long resultadosomaIntLong = umInt + umLong;
		
		System.out.println(resultadosomaIntLong);
		
		//Erro de compila��o. Long nao cabe em um int
		//int resultadoIntSomaIntLong = umInt + umLong;
		
		//System.out.println(resultadoIntSomaIntLong);
		
		//Mas, posso fazer uma convers�o (cast)
		int resultadoIntSomaIntLong2 = (int) (umInt + umLong);
		
		System.out.println(resultadoIntSomaIntLong2);
		
				
		
	}

}
