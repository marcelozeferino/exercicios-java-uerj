package test.java.application;

import java.util.List;
import java.util.Random;

import junit.framework.TestCase;

import main.java.application.ContatoFacade;
import main.java.application.TelefoneFacade;
import main.java.domain.model.Telefone;
import main.java.domain.model.Tipo;
import main.java.infrastructure.persistence.ContatoRepositoryImpl;
import main.java.infrastructure.persistence.TelefoneRepositoryImpl;

import org.junit.Before;
import org.junit.Test;

public class TelefoneFacadeTest extends TestCase {

	private TelefoneFacade telefoneFacade;
	private ContatoFacade contatoFacade;
	
	@Before
	public void setUp() throws Exception {
		telefoneFacade = new TelefoneFacade(new TelefoneRepositoryImpl());
		contatoFacade = new ContatoFacade(new ContatoRepositoryImpl());
	}
	
	@Test
	public void testObterTipos(){
		
		List<Tipo> tipos = telefoneFacade.obterTipos();
		
		assertEquals(2, tipos.size());	
		
		
		Tipo residencial = new Tipo(1, "Comercial");
		Tipo comercial = new Tipo(2, "Residencial");
		
		assertEquals("Não contém residencial", true, tipos.contains(residencial));
		assertEquals("Não contém comercial", true, tipos.contains(comercial));
		
	}
	
	@Test
	public void testObterTipo(){
		
		Tipo residencial = telefoneFacade.tipoResidencial();
		Tipo comercial = telefoneFacade.tipoComercial();
		
		assertEquals(residencial.getDescricao(), "Residencial" );
		assertEquals(comercial.getDescricao(), "Comercial" );
		
	}
	
	@Test
	public void testCadastrarTelefone(){
		
		Telefone tel = new Telefone();
		tel.setNumero("8131-" + new Random().nextInt(10000));
		tel.setTipo(telefoneFacade.obterTipos().get(0));
		tel.setContato(contatoFacade.obterContatoPorId(1));
		
		Telefone telefoneSalvo = telefoneFacade.salvar(tel);
		
		tel.setIdTelefone(telefoneSalvo.getIdTelefone());
		
		assertEquals(tel, telefoneSalvo);
		
	}

}


