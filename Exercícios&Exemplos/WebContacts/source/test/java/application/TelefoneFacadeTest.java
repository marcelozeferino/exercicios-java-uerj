package test.java.application;

import static org.junit.Assert.assertEquals;

import java.util.List;

import main.java.application.ContatoFacade;
import main.java.application.TelefoneFacade;
import main.java.domain.model.Telefone;
import main.java.domain.model.Tipo;
import main.java.infrastructure.ContatoRepositoryHibernate;
import main.java.infrastructure.TelefoneRepositoryHibernate;

import org.junit.Before;
import org.junit.Test;

public class TelefoneFacadeTest {

	private TelefoneFacade telefoneFacade;
	private ContatoFacade contatoFacade;
	
	@Before
	public void setUp() throws Exception {
		telefoneFacade = new TelefoneFacade(new TelefoneRepositoryHibernate());
		contatoFacade = new ContatoFacade(new ContatoRepositoryHibernate());
	}
	
	@Test
	public void testObterTipos(){
		
		List<Tipo> tipos = telefoneFacade.obterTipos();
		
		assertEquals(2, tipos.size());	
		
		
		Tipo residencial = new Tipo(1, "Residencial");
		Tipo comercial = new Tipo(2, "Comercial");
		
		assertEquals("Não contém residencial", true, tipos.contains(residencial));
		assertEquals("Não contém comercial", true, tipos.contains(comercial));
		
	}
	
	/*@Test
	public void testObterTipo(){
		
		Tipo residencial = telefoneFacade.tipoResidencial();
		Tipo comercial = telefoneFacade.tipoComercial();
		
		assertEquals(residencial.getDescricao(), "Residencial" );
		assertEquals(comercial.getDescricao(), "Comercial" );
		
	}
	
	@Test
	public void testCadastrarTelefone(){
		
		Telefone tel = new Telefone();
		tel.setNumero("8131-4775");
		tel.setTipo(telefoneFacade.tipoResidencial());
		tel.setContato(contatoFacade.obterContato(1));
		
		Telefone telefoneSalvo = telefoneFacade.salvar(tel);
		
		tel.setIdTelefone(telefoneSalvo.getIdTelefone());
		
		assertEquals(tel, telefoneSalvo);
		
	}*/

}


