package main.java.infrastructure.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Fabrica para a criação de EntityManagers
 * @author mzeferino
 *
 */
public class DefaultEntityManager {

	/**
	 * Utilitário para criação de EntityManager para o PU "defaul"
	 * 
	 * @return EntityManager 
	 */
	public static EntityManager getEntityManager() {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");  
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager;

	}

}
