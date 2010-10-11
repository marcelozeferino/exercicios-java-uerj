package test.java.application;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Random;

import main.java.application.ContatoFacade;
import main.java.domain.model.Contato;
import main.java.domain.model.ContatoEmpresa;
import main.java.infrastructure.ContatoRepositoryImpl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ContatoFacadeTest {

	private ContatoFacade contatoFacade;
	
	@Before
	public void setUp() throws Exception {
		contatoFacade = new ContatoFacade(new ContatoRepositoryImpl());
	}

	@After
	public void tearDown() throws Exception {
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
	public void testSalvarContatoEmpresa() {
		
		ContatoEmpresa novoContato = new ContatoEmpresa();
		novoContato.setIdContato(new Random().nextInt(100));
		novoContato.setNome("Fulano Numero " + new Random().nextInt(100));

		ContatoEmpresa contatoSalvo = (ContatoEmpresa) contatoFacade.salvar(novoContato);
		
		assertEquals(novoContato.getNome(), contatoSalvo.getNome());
		
		Contato novoSubContato = new Contato();
		novoSubContato.setIdContato(new Random().nextInt(100));
		novoSubContato.setNome("Fulano Numero " + new Random().nextInt(100));
		novoSubContato.setContatoPrincipal((ContatoEmpresa)contatoSalvo);
		
		Contato subContatoSalvo = contatoFacade.salvar(novoSubContato);
		
		assertEquals(subContatoSalvo.getNome(), subContatoSalvo.getNome());
				
		contatoSalvo.setRepository(new ContatoRepositoryImpl());
		List<Contato> subContatos = contatoSalvo.getSubContatos();
		assertEquals(true, subContatos.contains(subContatoSalvo));
		
		
	}
	
	@Test
	public void testObterContatoPorId() {
		
		Contato contatoSalvo = contatoFacade.obterContatoPorId(1);
		
		assertNotNull(contatoSalvo);
		assertEquals(1, contatoSalvo.getIdContato());
	
	}


}
