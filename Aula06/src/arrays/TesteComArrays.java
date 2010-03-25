package arrays;

import java.io.IOException;

public class TesteComArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		int  arrayDeInt [] = new int[5];
		Long arrayDeLong[] = new Long[2];
		
		for(int i = 0; i < 2; i++){
			
			//System.out.println(arrayDeInt[i]);
			System.out.println(arrayDeLong[i]);
			
		}
		
		arrayDeInt[0] = 10;
		arrayDeInt[1] = 11;
		arrayDeInt[2] = 12;
		arrayDeInt[3] = 13;
		arrayDeInt[4] = 14;
		
		try{
			arrayDeInt[5] = 14;	
		}catch (ArrayIndexOutOfBoundsException a){
			System.out.println("Indice nao encontrado");
		
		}catch (Exception e) {
			System.out.println("Indice nao encontrado");
		}
		
		
		for(int valorInt : arrayDeInt){
			
			System.out.print(valorInt);
			
		}
		

	}

}
