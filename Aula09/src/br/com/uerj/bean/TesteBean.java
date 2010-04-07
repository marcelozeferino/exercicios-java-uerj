package br.com.uerj.bean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class TesteBean implements Serializable {
	
	private String mensagem = "";
	private String cpf = "";
	
	public TesteBean(){
		cpf = "";
	}
	
	public TesteBean(String cpf){
		this.cpf = cpf;
	}
		
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}



	public void validar(){
		
		//aqui poderia entrar alguma lib para validação do CPF
		if (cpf == null || cpf.isEmpty()){
			mensagem = "Invalido";
		}else{
			mensagem =  "Valido";
			
		}
	}
	

}
