package main.br.com.siscov.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.br.com.siscov.usuario.TipoAcesso;
import main.br.com.siscov.usuario.Usuario;

import org.apache.log4j.Logger;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class ControladoraLogin extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		ActionErrors errors = new ActionErrors();

		String target = "login";

		String login = ((LoginForm) form).getLogin();
		String senha = ((LoginForm) form).getSenha();

		try {

			Usuario usuario = new Usuario().logar(login, senha);

			if (usuario == null) {

				((LoginForm) form)
						.setMensagem("Usuário não encontrado com Login e Senha informados.");
				Logger.getLogger(this.getClass()).error(errors.toString());

			} else {

				Logger.getLogger(this.getClass()).error(
						"UsuarioLogado: " + login);

				HttpSession session = request.getSession();
				session.setAttribute("usuarioLogado", usuario);

				if (usuario.getTipoAcesso().getCodigo() == TipoAcesso.COD_TIPO_ADM) {
					target = "operacoesAdministrador";
				} else {
					target = "operacoesUsuario";
				}

			}

		} catch (Exception e) {

			((LoginForm) form).setMensagem(e.getMessage());
			Logger.getLogger(this.getClass()).error(errors.toString());

		}

		return mapping.findForward(target);

	}

}
