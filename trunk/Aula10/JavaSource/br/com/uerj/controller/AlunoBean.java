package br.com.uerj.controller;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.servlet.http.HttpServletRequest;

import br.com.uerj.model.Aluno;
import br.com.uerj.model.Turma;


public class AlunoBean {
	
	private Aluno aluno = new Aluno();
	private String mensagem =  "";
	
	public String salvarAluno(){
		
		this.mensagem = "Aluno Matrícula " + this.aluno.getMatricula() + " salvo com sucesso.";
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(mensagem));
		
		this.aluno.setMatricula(0);
		this.aluno.setNome("");
		this.aluno.setTurma(new Turma());
		
		return "cadastroAluno";
	}
	
	
	public List<Aluno> getAlunos(){
		
		return aluno.getAlunos();
		
	}
	
	public SelectItem[] getTurmasCadastradas(){
		
		List<Turma> turmas =  new Turma().getTurmas();
		
		SelectItem[] items = new SelectItem[turmas.size()];
		
		for(int i = 0; i < turmas.size(); i++){
			
			items[i] = new SelectItem(turmas.get(i), turmas.get(i).toString());	
			
		}
		
		return items;
		
	}
	
	public String selecionarAluno(){
		
		FacesContext context = FacesContext.getCurrentInstance();
		HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();
		
		int index = getAlunos().indexOf( (Aluno)request.getAttribute("aluno") );
		
		aluno = getAlunos().get(index);
		
		return "cadastroAluno";
		
	}
	
	
	
	
	public Aluno getAluno() {
		return aluno;
	}


	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}


	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	
	

}
