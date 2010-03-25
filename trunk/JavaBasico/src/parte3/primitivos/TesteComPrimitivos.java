package parte3.primitivos;

public class TesteComPrimitivos {
	
	public byte umByte = 1;
	public short umShort = 1; 
	public int umInt = 1;
	
	/*
	 * Aqui, estamos utilizando o "L" para definir que o número será um long.
	 * Caso não fizessemos isso, seria entendido como int, já que um literal inteiro
	 * é entendido como int por padrão 
	 */
	public long umLong = 1L;
	
	/*
	 * Aqui estemos utilizando 1.0F porque se usássemos
	 * apenas 1.0, seria entendido como double (padrão 
	 * para numeros com casas decimais)
	 * 
	 * Ou seja:
	 * public float umFloat = 1.0; Teria um erro de compilação, 
	 * pois double não cabe em um float
	 */
	public float umFloat = 1.0F; 
	
	/*
	 * Poderiamos ter omitido o "D" já que seria double por padrão
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
