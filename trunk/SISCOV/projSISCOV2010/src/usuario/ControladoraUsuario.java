package usuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControladoraUsuario
 */
public class ControladoraUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladoraUsuario() {
    }



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 * 
	 * LISTA DE OPERAÇÕES BÁSICAS:
	 * 
	 * 0 = login
	 * 1 = logoff
	 * 
	 * 2 - > alterar
	 * 3 - > cadastrar
	 * 4 - > excluir
	 * 5 - > pesquisar
	 * 6 - > voltar
	 *   
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		try {
			String formulario;
			String stringOperacao;
			int operacao;
			
			formulario = request.getParameter("formulario");
			stringOperacao = request.getParameter("operacao");
			operacao = Integer.parseInt(stringOperacao);
				


				switch (operacao){
					case 2:{ // alterar
							Usuario usuario = new Usuario();
							
							usuario.setNome(request.getParameter("consultanome"));
							usuario.setLogin(request.getParameter("login"));
							usuario.setMatricula(Integer.parseInt(request.getParameter("matricula")));
							usuario.setSenha(request.getParameter("senha"));
							usuario.setEmail(request.getParameter("email"));
							usuario.setCargo(request.getParameter("cargo"));
							usuario.setEndereco(request.getParameter("endereco"));
							usuario.setCidade(request.getParameter("cidade"));
							usuario.setTelefone(Integer.parseInt(request.getParameter("telefone")));
							usuario.setTipoAcesso(Integer.parseInt(request.getParameter("tipoacesso")));
															
							usuario.alterar(usuario);
					break;
					}
					case 3:{ //cadastrar
						
							Usuario usuario = new Usuario();
							
							usuario.setNome(request.getParameter("consultanome"));
							usuario.setLogin(request.getParameter("login"));
							usuario.setMatricula(Integer.parseInt(request.getParameter("matricula")));
							usuario.setSenha(request.getParameter("senha"));
							usuario.setEmail(request.getParameter("email"));
							usuario.setCargo(request.getParameter("cargo"));
							usuario.setEndereco(request.getParameter("endereco"));
							usuario.setCidade(request.getParameter("cidade"));
							usuario.setTelefone(Integer.parseInt(request.getParameter("telefone")));
							usuario.setTipoAcesso(Integer.parseInt(request.getParameter("tipoacesso")));
							
							usuario.cadastrarUsuario(usuario);
						
					break;
					}
					case 4:{ // excluir
							Usuario usuario = new Usuario();
							usuario.setMatricula(Integer.parseInt(request.getParameter("matricula")));
							usuario.excluir(usuario);
						
					break;
					}
					case 6:{ // voltar
							response.sendRedirect("/paginas/OperacoesAdministrador.jsp");
							
					break;
					}

				}
			}
			catch (Exception e) {
				request.setAttribute("mensagem", e.getMessage());
				RequestDispatcher rd = request.getRequestDispatcher("/Erro.jsp");
				rd.forward(request, response);
			}

		}
}
