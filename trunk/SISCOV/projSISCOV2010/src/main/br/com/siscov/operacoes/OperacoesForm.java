package main.br.com.siscov.operacoes;

import org.apache.struts.action.ActionForm;

public class OperacoesForm extends ActionForm{

	private String operacao = "";

	public String getOperacao() {
		return operacao;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}
	
	
}
