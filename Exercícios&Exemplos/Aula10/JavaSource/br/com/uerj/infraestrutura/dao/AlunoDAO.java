package br.com.uerj.infraestrutura.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;
import javax.faces.application.Application;
import javax.faces.context.FacesContext;

import br.com.uerj.controller.MenuBean;
import br.com.uerj.model.Aluno;
import br.com.uerj.model.Turma;

public class AlunoDAO {
	
	public List<Aluno> carregarAlunos(){
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		Turma turma1 = new Turma(1, new Date(), 40);
		Turma turma2 = new Turma(2, new Date(), 20);
		Turma turma3 = new Turma(3, new Date(), 30);
		
		alunos.add(new Aluno(1, "Marcelo", turma1));
		alunos.add(new Aluno(2, "Pedro", turma2));
		alunos.add(new Aluno(3, "Marcela", turma3));
		
		return alunos;
		
	}

	public List<Aluno> obterAlunosCadastrados(){
		
		FacesContext facesContext = FacesContext.getCurrentInstance(); 
		ELContext elContext = facesContext.getELContext(); 
		Application jsfApp = facesContext.getApplication(); 
		ExpressionFactory exprFactory = jsfApp.getExpressionFactory(); 
		ValueExpression vExpr = exprFactory.createValueExpression(elContext, "#{menuBean}", Object.class); 
		MenuBean menuBean = (MenuBean) vExpr.getValue(elContext); 
	
		return menuBean.getAlunosCadastrados();
		
	}
	
	public void persistirAluno(Aluno aluno){
		
		/*
		 * Está é a forma correta de recuperar um ManagedBean, desde a versão
		 * 1.2 do JSF, utilizando ValueExpression
		*/
		FacesContext facesContext = FacesContext.getCurrentInstance(); 
		ELContext elContext = facesContext.getELContext(); 
		Application jsfApp = facesContext.getApplication(); 
		ExpressionFactory exprFactory = jsfApp.getExpressionFactory(); 
		ValueExpression vExpr = exprFactory.createValueExpression(elContext, "#{menuBean}", Object.class); 
		MenuBean menuBean = (MenuBean) vExpr.getValue(elContext); 
		
		menuBean.getAlunosCadastrados().add(aluno);
		
		Logger.getLogger("AlunoDAO").log(Level.WARNING,(menuBean.getAlunosCadastrados().get(3).getNome()));
		
	}

}
