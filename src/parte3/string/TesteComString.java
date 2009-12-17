package parte3.string;

public class TesteComString {

	public static void main(String[] args) {

		String nome = "Marcelo";
		
		System.out.println( nome );
		System.out.println( nome.toUpperCase() );
		System.out.println( nome.toLowerCase() );
		System.out.println( nome.isEmpty() );
		
		System.out.println( nome.equals("Marcelo"));
		System.out.println( nome == "Marcelo" );
		
		System.out.println("---------");
		
		String nome2 = "Marcela";
		nome2.toUpperCase();
		
		/*
		 * Não exibirá em maiúsculas pois String é imutável.
		 * Terá após o toUpperCase() foi criada uma nova instancia de String com
		 * o conteúdo "MARCELA", mas como não foi atribuída a nenhuma variável
		 * esta instância se perde
		 */
		System.out.println(nome2);
		
		nome2 = nome2.toUpperCase();
		
		//Agora sim...
		System.out.println(nome2);
	}

}
