package main.br.com.siscov.usuario;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


public class ControladoraUsuario extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
	
		UsuarioForm usuarioForm = (UsuarioForm)form;
		
		
		if (usuarioForm == null || usuarioForm.getAcao() == null){
			
			usuarioForm.carregarDados(new Usuario());
			usuarioForm.setAcao("");
			
			return mapping.findForward("cadastroUsuario");	
			
		}else if (usuarioForm.getAcao().equalsIgnoreCase("pesquisar")){
			
			Usuario usuario = new Usuario();
			
			try{
			
				if ( usuarioForm.getMatriculaPesquisa() != null && !usuarioForm.getMatriculaPesquisa().isEmpty() ){
					
					usuario = usuario.obterUsuario(Usuario.CamposPesquisa.MATRICULA, usuarioForm.getMatriculaPesquisa());
									
				}else if (usuarioForm.getNomePesquisa() != null && !usuarioForm.getNomePesquisa().isEmpty()){
					
					usuario = usuario.obterUsuario(Usuario.CamposPesquisa.NOME, usuarioForm.getNomePesquisa());
					
				}
				
			}catch (Exception e) {
				
				usuarioForm.setMensagem(e.getMessage());
				
			}
			
			if (usuario == null || usuario.getMatricula() == 0 
					|| usuario.getLogin() == null || usuario.getLogin().isEmpty()){
				
				usuarioForm.setMensagem("Nenhum registro encontrado. Favor redigite a Matrícula ou Nome do usuário.");
				
			}else{
				
				usuarioForm.setMatriculaPesquisa("");
				usuarioForm.setNomePesquisa("");
				
				usuarioForm.carregarDados(usuario);
				
				usuarioForm.setAcao("");
				
			}
			
			
			
		}else if (usuarioForm != null 
				&& (usuarioForm.getAcao().equalsIgnoreCase("cadastrar"))
					|| usuarioForm.getAcao().equalsIgnoreCase("alterar")){
			
			Usuario novoUsuario = new Usuario();
			
			novoUsuario = usuarioForm.gerarObjeto();
						
			try {
				
				if (usuarioForm.getAcao().equalsIgnoreCase("cadastrar")){
					novoUsuario.incluir(novoUsuario);	
				}else {
					novoUsuario.alterar(novoUsuario);
				}
								
				usuarioForm.setAcao("");
				usuarioForm.setMensagem("Registro salvo com sucesso.");
				
			} catch (Exception e) {
				
				usuarioForm.setMensagem(e.getMessage());
				
			}
						
		}else if (usuarioForm != null && usuarioForm.getAcao().equalsIgnoreCase("limpar")){
			
			usuarioForm.carregarDados(new Usuario());
			usuarioForm.setAcao("");
			
			
		}else if (usuarioForm != null && usuarioForm.getAcao().equalsIgnoreCase("excluir")){
			
			try {
				
				if (usuarioForm.getLogin().isEmpty() || usuarioForm.getNome().isEmpty()){
					
					usuarioForm.setMensagem("Nenhum usuário selecionado.");
				
				}else{
					
					Usuario usuario = new Usuario().obterUsuario(Usuario.CamposPesquisa.LOGIN, usuarioForm.getLogin());
					
					if (usuario != null && usuario.getLogin().equals(usuarioForm.getLogin())){
						
						usuario.excluir(usuario);
						
					}else{
						
						throw new Exception("Usuário não encontrado na exclusão.");
						
					}
					
				}
				
				
				usuarioForm.carregarDados(new Usuario());
				usuarioForm.setAcao("");
				usuarioForm.setMensagem("Registro excluído com sucesso.");
				
			} catch (Exception e) {
				
				usuarioForm.setMensagem(e.getMessage());
				
			}
			
		}
		
		return mapping.findForward("cadastroUsuario");
		
	}
	
	
	
       
  
}
