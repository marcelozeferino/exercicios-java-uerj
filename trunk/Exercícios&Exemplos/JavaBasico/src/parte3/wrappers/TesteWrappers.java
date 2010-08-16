package parte3.wrappers;

public class TesteWrappers {


	public static void main(String[] args) {
		
		//Tipo Integer encapsula primitivo int
		Integer integer = new Integer(1);
		
		//Pode ser criado com construtor que pode receber int ou String
		Integer integer2 = new Integer("2");
		
		//Ou, ainda, pode receber um literal primitivo.
		/*
		 * Aqui, ocorre o boxing automático transformando o primitivo int 
		 * em uma instância do BoxedPrimitive Integer
		 */
		Integer integer3 = 3;
		
		/*
		 * Aqui acontece o auto unboxing, transformando de BoxedPrimitive(wrapper) 
		 * para primitivo int
		 */
		int valorInt = integer3;
		
		System.out.println(integer);
		System.out.println(integer2);
		System.out.println(integer3);
		System.out.println(valorInt);
		
		
		
		

	}

}
