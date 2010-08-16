package objetos;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestaFuncionario {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Setor setor1 = new Setor(3, "DP");
		Setor setor2 = new Setor(2, "RH");
		Setor setor3 = new Setor(1, "PRJ");
						
		Set<Setor> setores = new TreeSet<Setor>();
		setores.add(setor1);
		setores.add(setor2);
		setores.add(setor3);
		
		Funcionario func = new Funcionario();
		func.setMatricula(123);
		func.setNome("Pedro");
		func.setIdade(1);
		
		func.setSetor(setores);
		
		System.out.println(setor1.equals(setor3));
		System.out.println( func.getSetor().size() );
		
		System.out.println("Setores em ordem numérica - Comparable na classe Setor");
		for(Setor s : func.getSetor()){
			System.out.println(s.getCodigo());
		}

		
		Set<Setor> setoresOrdemInversa = new TreeSet<Setor>(new Comparator<Setor>() {

			@Override
			public int compare(Setor arg0, Setor arg1) {

				if (arg1.getCodigo() == arg0.getCodigo())
					return 0;
				else if (arg1.getCodigo() < arg0.getCodigo())
					return -1;
				else
					return 1;
			}

		});

		setoresOrdemInversa.add(setor1);
		setoresOrdemInversa.add(setor2);
		setoresOrdemInversa.add(setor3);
		
		System.out.println("Setores em ordem inversa - Comparator");
		for(Setor s : setoresOrdemInversa){
			System.out.println(s.getCodigo());
		}

	}

}
