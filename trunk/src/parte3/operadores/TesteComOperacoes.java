package parte3.operadores;

public class TesteComOperacoes {
	
	public static void main(String [] args){
		
		int umInt = 1;
		int outroInt = 2;
		int resultadoInt = umInt + outroInt;
		long resultadoLong = umInt + outroInt;
		
		System.out.println(resultadoInt);
		System.out.println(resultadoLong);
		
		//Erro de compliçãoção, pois um int não cabe em um byte
		//byte resultadoByte = umInt + outroInt;
		
		byte umByte = 1;
		byte outroByte = 1;
		
		//Erro de compilação?! Em operações com números menores de int, 
		//o resultado sempre será um int. Como int não cabe em byte...
		//byte resultadoSomaBytes = umByte + outroByte;
		
		//System.out.println(resultadoSomaBytes);
		
		long umLong = 1L;
		//OK! Soma de um int com long terá como resultado um long
		long resultadosomaIntLong = umInt + umLong;
		
		System.out.println(resultadosomaIntLong);
		
		//Erro de compilação. Long nao cabe em um int
		//int resultadoIntSomaIntLong = umInt + umLong;
		
		//System.out.println(resultadoIntSomaIntLong);
		
		//Mas, posso fazer uma conversão (cast)
		int resultadoIntSomaIntLong2 = (int) (umInt + umLong);
		
		System.out.println(resultadoIntSomaIntLong2);
		
				
		
	}

}
