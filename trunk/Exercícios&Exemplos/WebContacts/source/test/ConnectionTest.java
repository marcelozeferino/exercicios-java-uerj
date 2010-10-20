package test;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ConnectionTest extends TestCase {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCriarConexao(){
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");  
		EntityManager entityManager = entityManagerFactory.createEntityManager();     
		
		assertNotNull(entityManager);
		
		
	}
	
	@After
	public void tearDown() throws Exception {
	}

}
