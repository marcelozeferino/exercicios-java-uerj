package test.br.com.siscov.usuario;

import static org.junit.Assert.*;

import main.br.com.siscov.usuario.TipoAcesso;

import org.junit.Before;
import org.junit.Test;

public class TipoAcessoTest {
	

	@Test
	public void testGetTipoAdministrador() {
		
		TipoAcesso tipoAcesso = TipoAcesso.getTipoAdministrador();
		
		assertTrue( tipoAcesso.getCodigo() == 1);
		assertTrue( tipoAcesso.getTipoAcesso().equalsIgnoreCase("Administrador"));
		
		
	}

	@Test
	public void testGetTipoUsuario() {

		TipoAcesso tipoAcesso = TipoAcesso.getTipoUsuario();	
		
		assertTrue( tipoAcesso.getCodigo() == 2);
		assertTrue( tipoAcesso.getTipoAcesso().equalsIgnoreCase("Usuário"));
		
	}

}
