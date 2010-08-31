package br.com.uerj;

public class Equipamento {
	
	private int id;
	private String nome;
	private float valor;
	
	public int getId(){
		return this.id;
	}
	
	public void setId(int id){
		
		this.id = id;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public float valorDeVenda(){
		
		return this.getValor() * 1.10F;
		
	}

}
