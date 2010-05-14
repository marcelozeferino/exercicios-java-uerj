package main.br.com.siscov.operacoes;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.br.com.siscov.login.LoginForm;
import main.br.com.siscov.usuario.TipoAcesso;
import main.br.com.siscov.usuario.Usuario;

import org.apache.log4j.Logger;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class ControladoraOperacoes extends Action {
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		ActionErrors errors = new ActionErrors();

		String target = "logout";

		OperacoesForm opForm = (OperacoesForm)form;

		if (opForm != null && opForm.getOperacao().equalsIgnoreCase("voltar")){
			
			HttpSession session = request.getSession();
			Usuario usuarioLogado = (Usuario)session.getAttribute("usuarioLogado");
			
			if (usuarioLogado != null && usuarioLogado.getTipoAcesso() != null
					&& usuarioLogado.getTipoAcesso().getCodigo() == TipoAcesso.getTipoAdministrador().getCodigo()){
				
				target = "operacoesAdministrador";
				
			}else if (usuarioLogado != null && usuarioLogado.getTipoAcesso() != null
					&& usuarioLogado.getTipoAcesso().getCodigo() == TipoAcesso.getTipoUsuario().getCodigo()){
				
				target = "operacoesUsuario";
				
			}
				
		}else if (opForm != null && opForm.getOperacao().equalsIgnoreCase("logout")) {
			
			HttpSession session = request.getSession();
			session.setAttribute("usuarioLogado", null);
			session.invalidate();
			
		}
		

		return mapping.findForward(target);

	}

	
	

}
