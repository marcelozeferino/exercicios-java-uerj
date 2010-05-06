package login;


import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAO;
import usuario.Usuario;





/**
 * Servlet implementation class Controladora
 */
public class ControladoraLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
  
    

	/**
	 * 
	 * LISTA DE OPERAÇÕES:
	 * 
	 * 0 = login
	 * 1 = logoff
	 *  
	 *  LISTA DE PARAMETROS DOS FORMULÁRIOS:
	 *  
	 */
	
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			
			try{
				
				
				DAO dao = new DAO();
				Usuario usuario = new Usuario();
				usuario.setLogin(request.getParameter("login"));
				usuario.setSenha(request.getParameter("senha"));
				
								
				String tipoAcesso;
				
				String sql = "select tipoAcesso from USUARIO " +
						"where login='"+usuario.getLogin()+"' and " +
								"senha='"+usuario.getSenha()+"' ;";
				dao.abrirConexao();
				dao.setResultSet(dao.selecionaSQL(sql));
				 
				tipoAcesso = dao.getResultSet().getString("tipoAcesso");
				
				if(tipoAcesso.equals("USUARIO")){
						response.sendRedirect("/paginas/OperacoesUsuario.jsp");
				}
				else if(tipoAcesso.equals("ADMINISTRADOR")){
					response.sendRedirect("/paginas/OperacoesAdministrador.jsp");
				}else 
					if(tipoAcesso.equals("")){
						String mensagem = "login ou senha errado!!!";
						request.setAttribute("mensagem" , mensagem);
						RequestDispatcher rd = request.getRequestDispatcher("/Login.jsp");
						rd.forward(request, response);						
					}
			}
			catch(Exception e){
				request.setAttribute("mensagem" , e.getMessage());
				RequestDispatcher rd = request.getRequestDispatcher("/paginas/Erro.jsp");
				rd.forward(request, response);
			}
			
	}
	
	
	
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 *//*
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException {
			
		
					
		try{
			String operacaoStr , formulario;
			int operacao;
			
			formulario = request.getParameter("formulario");
			operacaoStr= request.getParameter("operacao");
			operacao = Integer.parseInt(operacaoStr);
			
			
				if(formulario.equals("abrirchamado")){					
						switch (operacao) {
								case 3:{ // = cadastrar
									
								break;
								}
								
								case 6:{ // = voltar
									response.sendRedirect("paginas/OperacoesUsuario.jsp");
									break;
								}
			
						}
				}
				
				if(formulario.equals("alterarsenha")){
						switch (operacao){
								case 2:{ // alterar
								break;
								}
								case 6:{ // voltar
								break;
								}
						
						}
				}
				if(formulario.equals("cadastrodeareatecnica")){
					switch (operacao){
							case 2:{ // alterar
							break;
							}
							case 3:{ // cadastrar
							break;
							}
							case 4:{ // excluir
							break;
							}
							case 6:{ // voltar
							break;
							}
					
					}
				}
			
				if(formulario.equals("cadastrodeequipamento")){
					switch (operacao){
							case 2:{ // alterar
							break;
							}
							case 3:{ //cadastrar
							break;
							}
							case 4:{ // excluir
							break;
							}
							case 6:{ // voltar
							break;
							}
					
					}
				}
				
				if(formulario.equals("cadastrodefabricante")){
					switch (operacao){
						case 2:{ // alterar
						break;
						}
						case 3:{ //cadastrar
						break;
						}
						case 4:{ // excluir
						break;
						}
						case 6:{ // voltar
						break;
						}
					
					}
				}
				
				if(formulario.equals("cadastrodefornecedor")){
					switch (operacao){
						case 2:{ // alterar
						break;
						}
						case 3:{ //cadastrar
						break;
						}
						case 4:{ // excluir
						break;
						}
						case 6:{ // voltar
						break;
						}
					
					}
				}
				
				
				if(formulario.equals("cadastrodelivro")){
					switch (operacao){
						case 2:{ // alterar
						break;
						}
						case 3:{ //cadastrar
						break;
						}
						case 4:{ // excluir
						break;
						}
						case 6:{ // voltar
						break;
						}
					
					}
				}
				
				

				if(formulario.equals("cadastrodesoftware")){
					switch (operacao){
							case 2:{ // alterar
							break;
							}
							case 3:{ // cadastrar
							break;
							}
							case 4:{ // excluir
							break;
							}
							case 6:{ // voltar
							break;
							}
					
					}
				}
			
				if(formulario.equals("cadastrodetecnico")){
					switch (operacao){
							case 2:{ // alterar
							break;
							}
							case 3:{ //cadastrar
							break;
							}
							case 4:{ // excluir
							break;
							}
							case 6:{ // voltar
							break;
							}
					
					}
				}
				
				
				if(formulario.equals("consultarchamado")){
					switch (operacao){
						case 2:{ // alterar
						break;
						}
						case 3:{ //cadastrar
						break;
						}
						case 4:{ // excluir
						break;
						}
						case 6:{ // voltar
						break;
						}
					
					}
				}
				
				
				if(formulario.equals("definirsuporteatendimento")){
					switch (operacao){
						case 2:{ // alterar
						break;
						}
						case 3:{ //cadastrar
						break;
						}
						case 4:{ // excluir
						break;
						}
						case 6:{ // voltar
						break;
						}
					
					}
				}
				

				
				if(formulario.equals("relatorios")){
					switch (operacao){
						case 2:{ // alterar
						break;
						}
						case 3:{ //cadastrar
						break;
						}
						case 4:{ // excluir
						break;
						}
						case 6:{ // voltar
						break;
						}
					
					}
				}

				
				
				if(formulario.equals("tratarchamdo")){
					switch (operacao){
						case 2:{ // alterar
						break;
						}
						case 3:{ //cadastrar
						break;
						}
						case 4:{ // excluir
						break;
						}
						case 6:{ // voltar
						break;
						}
					
					}
				}

				
				
				if(formulario.equals("")){
					switch (operacao){
						case 2:{ // alterar
						break;
						}
						case 3:{ //cadastrar
						break;
						}
						case 4:{ // excluir
						break;
						}
						case 6:{ // voltar
						break;
						}
					
					}
				}
				
				
				
				
				
		}
		
		
		
		
		catch (Exception e) {
			request.setAttribute("mensagem", e.getMessage());
			RequestDispatcher rd = request.getRequestDispatcher("/paginas/Erro.jsp");
			rd.forward(request,response);
			
		}
		
		*/
		
		
		
		
		
		
		
		
		
		
		

		
}

