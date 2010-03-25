package colecoes;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class TesteComListas {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		List minhaLista = new LinkedList();
		minhaLista.add(new Integer(10));
		minhaLista.add(new Integer(11));
		minhaLista.add(new Integer(13));
		
		System.out.println(minhaLista.toString());
		System.out.println( ((LinkedList)minhaLista).get(2));
		System.out.println(minhaLista.contains(10));
		System.out.println(minhaLista.indexOf(13));
		System.out.println( ((LinkedList)minhaLista).getFirst());
		
		for (Object i : minhaLista) {
			System.out.println(i);
		}
	
	}

}
