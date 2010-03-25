package colecoes;

import java.util.LinkedList;
import java.util.List;

public class TesteComGenerics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> minhaLista = new LinkedList<Integer>();
		minhaLista.add(new Integer(10));
		minhaLista.add(new Integer(11));
		minhaLista.add(new Integer(13));
						
		for (Integer i : minhaLista) {
			System.out.println(i.intValue());
			minhaLista.get(1);
		}

	}

}
