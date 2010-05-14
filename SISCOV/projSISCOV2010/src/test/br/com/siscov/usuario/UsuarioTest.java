package test.br.com.siscov.usuario;


import junit.framework.TestCase;
import main.br.com.siscov.usuario.TipoAcesso;
import main.br.com.siscov.usuario.Usuario;

import org.junit.Before;
import org.junit.Test;

public class UsuarioTest extends TestCase {

	Usuario novoUsuario = new Usuario();
	
	@Before
	public void setUp() throws Exception {
		
		novoUsuario.setLogin("bruno");		
		novoUsuario.setNome("Bruno Silva"); 
		novoUsuario.setSenha("1234");
		novoUsuario.setCargo("Analista");
		novoUsuario.setTelefone(2132-4182);
		novoUsuario.setEmail("bruno@siscov.com.br");
		novoUsuario.setTipoAcesso(TipoAcesso.getTipoAdministrador());		
		
	}
	
/*	@Test
	public void testIncluir(){
		
		try {
			novoUsuario.incluir(novoUsuario);
		} catch (Exception e) {
			fail(e.getMessage());
			e.printStackTrace();
		}
		
	}*/

	@Test
	public void testLogar(){
		
		Usuario usuarioLogado = null;
		
		try {
			usuarioLogado = novoUsuario.logar(novoUsuario.getLogin(), novoUsuario.getSenha());
		} catch (Exception e) {
			fail(e.getMessage());
			e.printStackTrace();
		}
		
		assertNotNull(usuarioLogado);
		assertEquals( usuarioLogado.getNome() , novoUsuario.getNome());
		assertEquals( usuarioLogado.getLogin() , novoUsuario.getLogin());
		assertEquals( usuarioLogado.getSenha() , novoUsuario.getSenha());
		
	}

}
