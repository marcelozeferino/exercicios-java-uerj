package main.br.com.siscov.login;

import javax.servlet.http.HttpServletRequest;


import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

@SuppressWarnings("serial")
public class LoginForm extends ActionForm {
	
	private String login;
	private String senha;
	private String mensagem;
	
	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void reset(ActionMapping mapping, HttpServletRequest request) {

		this.login = null;
		this.senha = null;

	}

	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {

		ActionErrors errors = new ActionErrors();
		
		if ((login == null) || (login.length() < 1))
			
			errors.add("username", new ActionMessage(
					"O campo Login não pode ser vazio."));
		if ((senha == null) || (senha.length() < 1))
			errors.add("password",
					new ActionMessage("Informe a senha de acesso."));

		return errors;

	}

}
