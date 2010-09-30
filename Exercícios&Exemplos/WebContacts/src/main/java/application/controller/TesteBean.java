 package main.java.application.controller;

import java.util.ArrayList;
import java.util.List;

public class TesteBean {
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String executar(){
		this.nome = "Teste: " + this.nome.toUpperCase();
		return "testeAction";
	}
	

}
