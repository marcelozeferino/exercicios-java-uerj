package br.com.uerj.pacotenovo;

import br.com.uerj.Computador;
import br.com.uerj.Equipamento;


public class Classe extends Equipamento {

	
	public static void main(String [] args){
		
		Computador e = new Computador();
		e.setId(10);
		e.setValor(100.00F);
		
		System.out.println(e.getId());
		System.out.println(e.valorDeVenda());
		System.out.println(e.valorDeVenda(1.90F));
		
		
		
	}
	
	
	
}
