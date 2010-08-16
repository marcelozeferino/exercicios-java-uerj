package colecoes;

import java.util.TreeSet;
import java.util.Set;

public class TestesComSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Set<String> meuSet = new TreeSet<String>();
		meuSet.add("A");
		meuSet.add("");
		meuSet.add("B");
		meuSet.add("D");
		
		System.out.println(meuSet.toString());
		
		System.out.println("Tamanho: " + meuSet.size());
		
		for (String i : meuSet) {
			System.out.println(i);
		}
		

	}

}
