package parte3.classeobject;

/**
 * 
 * Como dito em nossas aulas, todas as classes em java são 
 * descendentes da classe mãe Object e delas herdam alguns
 * comportamentos.
 *
 * A classe abaixo não deixa explícita a herança (extends) com
 * nenhuma outra, porém implicitamente herda de Object.
 * 
 * @author Marcelo Zeferino
 *
 */
public class TestesComClasseObject {

	//Definimos um atributo público chamado nome, do tipo String
	public String nome;
	
	/*
	 * Criamos, aqui, um método main para rodar o programa e exibir algumas
	 * coisas no console
	 */
	public static void main(String [] args){
		
		//Aqui, estamos instanciando a classe TestesComClasseObject na variavel "teste"
		TestesComClasseObject teste = new TestesComClasseObject();

		//Atribuimos "Pedro" ao atributo "nome", de "teste"
		teste.nome = "Pedro";
		
		//Imprimimos no console o nome que atribuimos anteriormente ao atributo nome
		System.out.println("Nome: " + teste.nome);

		/*
		 * ???? Não escrevemos os métodos toString, hashCode e equals para
		 * a classe TestesComClasseObject ???? Como eles estão aí?
		 * 
		 * Simples, são comportamentos herdados de Object. Inclusive, podem 
		 * ter seu comportamento alterado através de sobrescrita (override)
		 */
		System.out.println("toString: " + teste.toString());
		System.out.println("hashCode: " + teste.hashCode());
		System.out.println("equals: " + teste.equals(teste));
		
	}
	
	
}
