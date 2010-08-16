package parte3.wrappers;

public class TesteMetodosConversores {

	
	public static void main(String[] args) {

		Integer integer = 1;
		System.out.println( integer.intValue() );
		System.out.println( integer.doubleValue() );
		System.out.println( integer.floatValue() );
		System.out.println( integer.longValue() );
		
		String strValor = "100";
		Integer intConvertido = Integer.parseInt(strValor);
		System.out.println( intConvertido );
		
		Double doubleConvertido = Double.parseDouble(strValor);
		System.out.println( doubleConvertido );
		
		Long valorLong = Long.valueOf(strValor);
		System.out.println( valorLong );
		
		Float valorFloat = Float.valueOf(strValor);
		System.out.println( valorFloat );
		
	}

}
