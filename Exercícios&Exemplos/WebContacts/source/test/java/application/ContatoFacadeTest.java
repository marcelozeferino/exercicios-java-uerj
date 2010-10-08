package test.java.application;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import main.java.application.ContatoFacade;
import main.java.application.TelefoneFacade;
import main.java.domain.model.Contato;
import main.java.domain.model.Telefone;
import main.java.infrastructure.ContatoRepositoryImpl;
import main.java.infrastructure.TelefoneRepositoryImpl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ContatoFacadeTest {

	private TelefoneFacade telefoneFacade;
	private ContatoFacade contatoFacade;
	
	@Before
	public void setUp() throws Exception {
		telefoneFacade = new TelefoneFacade(new TelefoneRepositoryImpl());
		contatoFacade = new ContatoFacade(new ContatoRepositoryImpl());
	}

	@After
	public void tearDown() throws Exception {
		telefoneFacade = null;
		contatoFacade = null;
	}

	
	@Test
	public void testSalvar() {
		
		Contato novoContato = new Contato();
		novoContato.setIdContato(new Random().nextInt(100));
		novoContato.setNome("Fulano Numero " + new Random().nextInt(100));
		
		Contato contatoSalvo = contatoFacade.salvar(novoContato);
		
		assertEquals(novoContato.getNome(), contatoSalvo.getNome());
				
	}
	
	@Test
	public void testObterContatoPorId() {
		fail("Not yet implemented");
	}


}
