package br.com.uerj.classes_utilitarias;

import java.math.BigDecimal;

/**
 * Testes com classe BigDecimal, apresentando problemas
 * de utilização de números com casas decimais.
 * 
 * Veremos alguns problemas e maneiras de utilizar, mas o principal
 * recado aqui é 1) nem sempre coisas óbvias acontecerão como esperado e 
 * precisamos nos cercar de testes que comprovem as teorias e 2) Precisamos
 * estudar a API que pretendemos utilizar e suas formas de utilização, para utilizar
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
		 * Como double está utilizando dízimas, não consegue
		 * trabalhar corretamente com a operação acima. No entanto,
		 * a operação abaixo é bem sucedida, pois  0.25 é entendido
		 * facilmente como 1/4.
		 */
		d1 = 0.25;
		d2 = 0.25;
		System.out.println(d1+d2);
		
		/*/
		 * Para resolução do problema, poderíamos utilizar BigDecimal.
		 */
		BigDecimal bd1 = new BigDecimal(0.2);
		BigDecimal bd2 = new BigDecimal(0.1);
		System.out.println(bd1.add(bd2));
		
		/*
		 * Oops, a operação acima teve um resultado ainda pior...
		 * Isto porque o construtor BigDecimal(double) tem resultados 
		 * imprevisíveis, pelo próprio javadoc do método.
		 * 
		 * A maneira correta seria utilizar o construtor com String. Abaixo temos 
		 * a operação, com o resultado esperado.
		 */
		BigDecimal bd3 = new BigDecimal("0.2");
		BigDecimal bd4 = new BigDecimal("0.1");
		System.out.println(bd3.add(bd4));
		
	
		
	}

}
