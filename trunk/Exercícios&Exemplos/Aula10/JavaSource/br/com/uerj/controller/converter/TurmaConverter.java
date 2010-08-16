package br.com.uerj.controller.converter;

import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import br.com.uerj.model.Turma;

public class TurmaConverter implements Converter {

	public Object getAsObject(FacesContext context, UIComponent component,	String value) {

		Turma turma = null;
		
		List<Turma> turmas = new Turma().getTurmas();
		for (Turma t : turmas) {
			if (t.toString().equals(value)){
				turma = t;
			}
		}
		
		return turma;

	}

	public String getAsString(FacesContext context, UIComponent component,	Object value) {

		return ((Turma) value).toString();

	}
}
