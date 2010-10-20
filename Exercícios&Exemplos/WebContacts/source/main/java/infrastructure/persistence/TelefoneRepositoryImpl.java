package main.java.infrastructure.persistence;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import main.java.domain.model.Telefone;
import main.java.domain.model.Tipo;
import main.java.domain.repository.TelefoneRepositoy;

import org.apache.log4j.Logger;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Restrictions;


public class TelefoneRepositoryImpl implements TelefoneRepositoy {

	public  void atualizar(Telefone novoTelefone) {
		// TODO Auto-generated method stub
		return ;
	}


	
	public void remover(Telefone novoTelefone) {
		// TODO Auto-generated method stub
		
	}

	public void salvar(Telefone novoTelefone) {

		try {

			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");  
			EntityManager entityManager = entityManagerFactory.createEntityManager();     
		
			entityManager.getTransaction().begin();
			
			entityManager.persist(novoTelefone);
			
			entityManager.getTransaction().commit();

		} catch (Exception e) {
			Logger.getLogger(this.getClass()).error(e.getMessage());
			throw new RuntimeException(e);
		}

		
	}

	@SuppressWarnings("unchecked")
	public List<Tipo> obterTipos() {

		List<Tipo> tiposCadastrados = new ArrayList<Tipo>();

		try {
			
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");  
			EntityManager entityManager = entityManagerFactory.createEntityManager();     
						
	        tiposCadastrados = (List<Tipo>) entityManager.createQuery("from Tipo order by idTipo").getResultList();
	        
	        
		} catch (Exception e) {
			Logger.getLogger(this.getClass()).error(e.getMessage());
			e.printStackTrace();
			throw new RuntimeException(e);
		}

		return tiposCadastrados;

	}

	public Telefone procurarPorId(Integer id) {
	
		try {
			
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");  
			EntityManager entityManager = entityManagerFactory.createEntityManager();     
		
			Telefone telefoneRecuperado = (Telefone) entityManager.find(Telefone.class, id);
			
			return telefoneRecuperado;

		} catch (Exception e) {
			Logger.getLogger(this.getClass()).error(e.getMessage());
			throw new RuntimeException(e);
		}

		
		
	}
	
	public Telefone procurarPorNumero(String numeroTelefone) {
		
		try {
			
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");  
			EntityManager entityManager = entityManagerFactory.createEntityManager();     
		
			Session session = (Session) entityManager.getDelegate();

			Telefone telefoneRecuperado = (Telefone) session.createCriteria(
					Telefone.class)
					.add(Restrictions.like("numero", numeroTelefone))
					.uniqueResult();

			return telefoneRecuperado;

		} catch (Exception e) {
			Logger.getLogger(this.getClass()).error(e.getMessage());
			throw new RuntimeException(e);
		}

		
		
	}

	
}
