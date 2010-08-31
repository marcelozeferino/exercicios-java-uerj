package aula08.dao;	

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import aula08.dao.fabrica.HibernateSessionFactory;


public class GenericDAO {

	/**
	 * Método genérico que tem como finalidade fazer uma consulta no BD.
	 * 
	 * @param String
	 * @return List
	 */
	@SuppressWarnings("unchecked")
	public List query(String query) {
		
		Session session = HibernateSessionFactory.currentSession();
		List list = session.createQuery(query).list();
		session.close();
		
		return list;

	}
	
	@SuppressWarnings("unchecked")
	public List listObjects(Class<?> entityObjectClass){
		
		Session session = HibernateSessionFactory.currentSession();
		List list = session.createCriteria(entityObjectClass).list();
		session.close();
		
		return list;
		
	}
	
	public Object getUniqueElement(String query) {
		
		Object resultado = new Object();
		Session session = HibernateSessionFactory.currentSession();
		resultado = session.createQuery(query).uniqueResult();
		session.close();
		return resultado;

	}	

	/**
	 * Método genérico que tem como finalidade inserir o objeto passado de
	 * qualquer VO.
	 * 
	 * @param Object
	 */
	public void insert(Object object) {
		
		Session session = HibernateSessionFactory.currentSession();
		Transaction transaction = session.beginTransaction();
		session.save(object);
		transaction.commit();
		session.close();
		
	}

	/**
	 * Método genérico que tem como finalidade atualizar o objeto passado de
	 * qualquer VO.
	 * 
	 * @param Object
	 */
	public void update(Object object) {
		
		Session session = HibernateSessionFactory.currentSession();
		Transaction transaction = session.beginTransaction();
		session.update(object);
		transaction.commit();
		session.close();

	}
	
	public void delete(Object object) {
		
		Session session = HibernateSessionFactory.currentSession();
		Transaction transaction = session.beginTransaction();
		session.delete(object);
		transaction.commit();
		session.close();

	}
	
}
