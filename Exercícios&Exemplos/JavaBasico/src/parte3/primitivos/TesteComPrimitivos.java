package parte3.primitivos;

public class TesteComPrimitivos {
	
	public byte umByte = 1;
	public short umShort = 1; 
	public int umInt = 1;
	
	/*
	 * Aqui, estamos utilizando o "L" para definir que o n�mero ser� um long.
	 * Caso n�o fizessemos isso, seria entendido como int, j� que um literal inteiro
	 * � entendido como int por padr�o 
	 */
	public long umLong = 1L;
	
	/*
	 * Aqui estemos utilizando 1.0F porque se us�ssemos
	 * apenas 1.0, seria entendido como double (padr�o 
	 * para numeros com casas decimais)
	 * 
	 * Ou seja:
	 * public float umFloat = 1.0; Teria um erro de compila��o, 
	 * pois double n�o cabe em um float
	 */
	public float umFloat = 1.0F; 
	
	/*
	 * Poderiamos ter omitido o "D" j� que seria double por padr�o
	 */
	public double umDouble = 1.0D;
		
	public char umChar = 'a';
	
	public boolean umBoolean = true;
	

	public static void main(String[] args) {

		TesteComPrimitivos teste = new TesteComPrimitivos();
		
		System.out.println(teste.umByte);
		System.out.println(teste.umShort);
		System.out.println(teste.umInt);
		System.out.println(teste.umLong);
		
		System.out.println(teste.umFloat);
		System.out.println(teste.umDouble);
		
		System.out.println(teste.umChar);
		
		System.out.println(teste.umBoolean);
				
	}

}
