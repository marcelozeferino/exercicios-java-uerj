

public class TesteAula3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Inteiros
		byte tipoByte = 1;
		short tipoShort = 1;
		int tipoInt = 1;
		long tipoLong = 1L;
		
		tipoInt = (int)tipoLong;
		
		System.out.println(tipoInt);
		
		//Flutuante
		float tipoFloat = 1.0F;
		double tipoDouble = 100.10;
		
		tipoFloat = (float)tipoDouble;
		
		System.out.println(tipoDouble);
		System.out.println((byte)tipoDouble);
		
		//Conversoes
		int novoInt = tipoByte + tipoByte;
		tipoByte += 1;
		
		System.out.println(tipoByte);
		
		
		
	}

}
