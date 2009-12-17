package parte3.classeobject;

/**
 * 
 * Como dito em nossas aulas, todas as classes em java s�o 
 * descendentes da classe m�e Object e delas herdam alguns
 * comportamentos.
 *
 * A classe abaixo n�o deixa expl�cita a heran�a (extends) com
 * nenhuma outra, por�m implicitamente herda de Object.
 * 
 * @author Marcelo Zeferino
 *
 */
public class TestesComClasseObject {

	//Definimos um atributo p�blico chamado nome, do tipo String
	public String nome;
	
	/*
	 * Criamos, aqui, um m�todo main para rodar o programa e exibir algumas
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
		 * ???? N�o escrevemos os m�todos toString, hashCode e equals para
		 * a classe TestesComClasseObject ???? Como eles est�o a�?
		 * 
		 * Simples, s�o comportamentos herdados de Object. Inclusive, podem 
		 * ter seu comportamento alterado atrav�s de sobrescrita (override)
		 */
		System.out.println("toString: " + teste.toString());
		System.out.println("hashCode: " + teste.hashCode());
		System.out.println("equals: " + teste.equals(teste));
		
	}
	
	
}
