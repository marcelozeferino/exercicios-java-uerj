package br.com.uerj;

public class Computador extends Equipamento {

	@Override
	public float valorDeVenda() {
		
		return getValor() * 1.15F;
		
	}
	
	
	/**
	 * M�todo para retorno de valor de venda <br/>
	 * com <b> percentual.
	 * 
	 * @param percent No formato 1.percent onde
	 * percent � um float entre 00 e 99.
	 * 
	 * @return Valor de venda de acordo com o percentual
	 * 
	 */
	public float valorDeVenda(float percent){
		
		return getValor() * percent;
		
	}

	
	
}
