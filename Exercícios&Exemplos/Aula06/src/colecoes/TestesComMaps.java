package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestesComMaps {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Map<Integer,String> mapa = new HashMap<Integer,String>();
		mapa.put(1, "Marcelo");
		mapa.put(2, "Pedro");
		
		System.out.println(mapa.entrySet());
			
		System.out.println(mapa.get(2));
		
		Set<Integer> chaves = mapa.keySet();
		for (Integer chave : chaves) {
			System.out.println(mapa.get(chave));
		}

	}

}
