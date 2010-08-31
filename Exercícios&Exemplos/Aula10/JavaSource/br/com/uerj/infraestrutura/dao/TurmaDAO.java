package br.com.uerj.infraestrutura.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;
import javax.faces.application.Application;
import javax.faces.context.FacesContext;

import br.com.uerj.controller.MenuBean;
import br.com.uerj.model.Turma;

public class TurmaDAO {

	public List<Turma> carregarTurmas(){
		
		List<Turma> turmas = new ArrayList<Turma>();
		
		turmas.add(new Turma(1, new Date(), 40));
		turmas.add(new Turma(2, new Date(), 20));
		turmas.add(new Turma(3, new Date(), 30));
		
		return turmas;
		
	}
	
	public List<Turma> obterTurmasCadastradas(){
		
		FacesContext facesContext = FacesContext.getCurrentInstance(); 
		ELContext elContext = facesContext.getELContext(); 
		Application jsfApp = facesContext.getApplication(); 
		ExpressionFactory exprFactory = jsfApp.getExpressionFactory(); 
		ValueExpression vExpr = exprFactory.createValueExpression(elContext, "#{menuBean}", Object.class); 
		MenuBean menuBean = (MenuBean) vExpr.getValue(elContext); 
		
		return menuBean.getTurmasCadastradas();
		
	}
	
	public void persistirTurma(Turma turma){
		
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
		
		menuBean.getTurmasCadastradas().add(turma);
		
	}
	
}
