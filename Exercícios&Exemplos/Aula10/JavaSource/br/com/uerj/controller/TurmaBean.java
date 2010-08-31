package br.com.uerj.controller;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import br.com.uerj.model.Turma;

public class TurmaBean {
	
	private Turma turma = new Turma();
	private String mensagem =  "";
	
	public String salvarTurma(){
		
		turma.persistir();
		
		this.mensagem = "Turma código " + this.turma.getCodigo() + " salva com sucesso.";
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(mensagem));
		
		return "cadastroTurma";
	}
	
	
	public List<Turma> getTurmas(){
		
		return turma.getTurmas();
		
	}
	
	public String selecionarTurma(){
		
		FacesContext context = FacesContext.getCurrentInstance();
		HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();
		
		int index = getTurmas().indexOf( (Turma)request.getAttribute("turma") );
		
		turma = getTurmas().get(index);
		
		return "cadastroTurma";
		
	}
	
	
	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
	
	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	
	

}
