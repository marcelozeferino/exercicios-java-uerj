package main.java.infrastructure.persistence;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import main.java.domain.model.Contato;
import main.java.domain.repository.ContatoRepository;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;


public class ContatoRepositoryImpl implements ContatoRepository {

	public void atualizar(Contato novoTelefone) {
		// TODO Auto-generated method stub
		return ;
	}

	public Contato procurarPorId(Integer idContato) {
		
		try {

			EntityManager entityManager = DefaultEntityManager.getEntityManager();     

			Contato contatoSalvo = (Contato) entityManager.find(Contato.class, idContato);
			
			return contatoSalvo;

		} catch (Exception e) {
			Logger.getLogger(this.getClass()).error(e.getMessage());
			throw new RuntimeException(e);
		}
	
	}

	@SuppressWarnings("unchecked")
	public List<Contato> procurarPorNome(String nomeDoContato){
		
		EntityManager entityManager = DefaultEntityManager.getEntityManager();   
		
		Session sessaoHibernate = (Session) entityManager.getDelegate();

		Criteria criteria = sessaoHibernate.createCriteria(Contato.class)
									.add(Restrictions.like("nome", "%" + nomeDoContato + "%").ignoreCase());

		return (ArrayList<Contato>) criteria.list();
		
	}

	public void remover(Contato novoTelefone) {
		// TODO Auto-generated method stub
		return ;
	}

	public Contato salvar(Contato novoContato) {
		
		try {

			EntityManager entityManager = DefaultEntityManager.getEntityManager();     
		
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

			EntityManager entityManager = DefaultEntityManager.getEntityManager();     
		
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
 