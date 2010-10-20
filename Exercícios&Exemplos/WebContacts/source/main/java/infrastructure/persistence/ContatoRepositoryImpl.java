package main.java.infrastructure.persistence;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import main.java.domain.model.Contato;
import main.java.domain.repository.ContatoRepository;

import org.apache.log4j.Logger;


public class ContatoRepositoryImpl implements ContatoRepository {

	public void atualizar(Contato novoTelefone) {
		// TODO Auto-generated method stub
		return ;
	}

	public Contato procurarPorId(Integer idContato) {
		
		try {

			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");  
			EntityManager entityManager = entityManagerFactory.createEntityManager();     

			Contato contatoSalvo = (Contato) entityManager.find(Contato.class, idContato);
			
			return contatoSalvo;

		} catch (Exception e) {
			Logger.getLogger(this.getClass()).error(e.getMessage());
			throw new RuntimeException(e);
		}
	
	}

	public void remover(Contato novoTelefone) {
		// TODO Auto-generated method stub
		return ;
	}

	public Contato salvar(Contato novoContato) {
		
		try {

			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");  
			EntityManager entityManager = entityManagerFactory.createEntityManager();     
		
			entityManager.getTransaction().begin();
			
			Contato contatoSalvo = entityManager.merge(novoContato);
			
			entityManager.getTransaction().commit();
			
			return contatoSalvo;

		} catch (Exception e) {
			Logger.getLogger(this.getClass()).error(e.getMessage());
			throw new RuntimeException(e);
		}
		
	}

	@SuppressWarnings("unchecked")
	public List<Contato> obterSubContatos(Contato contatoPrincipal) {
		
		List<Contato> contatos = new ArrayList<Contato>();
		
		try {

			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");  
			EntityManager entityManager = entityManagerFactory.createEntityManager();     
		
			Query query = entityManager.createQuery("from Contato c where c.contatoPrincipal.idContato = :id" );
			query.setParameter("id", contatoPrincipal.getIdContato());

			contatos = (List<Contato>) query.getResultList();
			
			return contatos;
			
		} catch (Exception e) {
			Logger.getLogger(this.getClass()).error(e.getMessage());
			throw new RuntimeException(e);
		}
		
	}

}
 