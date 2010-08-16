package br.com.uerj.classes_utilitarias;

import java.math.BigDecimal;

/**
 * Testes com classe BigDecimal, apresentando problemas
 * de utiliza��o de n�meros com casas decimais.
 * 
 * Veremos alguns problemas e maneiras de utilizar, mas o principal
 * recado aqui � 1) nem sempre coisas �bvias acontecer�o como esperado e 
 * precisamos nos cercar de testes que comprovem as teorias e 2) Precisamos
 * estudar a API que pretendemos utilizar e suas formas de utiliza��o, para utilizar
 * de forma correta.
 * 
 * @author Marcelo Zeferino
 *
 */
public class TestesComBigDecimal {
	
	
	public static void main(String[] args) {
	
		double d1 = 0.1;
		double d2 = 0.2;
		
		//Deveria imprimir 0.3, mas...
		System.out.println(d1+d2);
		
		/*
		 * Como double est� utilizando d�zimas, n�o consegue
		 * trabalhar corretamente com a opera��o acima. No entanto,
		 * a opera��o abaixo � bem sucedida, pois  0.25 � entendido
		 * facilmente como 1/4.
		 */
		d1 = 0.25;
		d2 = 0.25;
		System.out.println(d1+d2);
		
		/*/
		 * Para resolu��o do problema, poder�amos utilizar BigDecimal.
		 */
		BigDecimal bd1 = new BigDecimal(0.2);
		BigDecimal bd2 = new BigDecimal(0.1);
		System.out.println(bd1.add(bd2));
		
		/*
		 * Oops, a opera��o acima teve um resultado ainda pior...
		 * Isto porque o construtor BigDecimal(double) tem resultados 
		 * imprevis�veis, pelo pr�prio javadoc do m�todo.
		 * 
		 * A maneira correta seria utilizar o construtor com String. Abaixo temos 
		 * a opera��o, com o resultado esperado.
		 */
		BigDecimal bd3 = new BigDecimal("0.2");
		BigDecimal bd4 = new BigDecimal("0.1");
		System.out.println(bd3.add(bd4));
		
	
		
	}

}
