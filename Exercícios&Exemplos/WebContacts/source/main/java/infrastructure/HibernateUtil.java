package main.java.infrastructure;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

/**
 * Classe utilitária para obtenção de SessionFactory do Hibernate
 * 
 * 
 */
public class HibernateUtil {

	private Session session = null;
	private Transaction transaction = null;
	
	private static final SessionFactory sessionFactory = null;

	/*static {
		try {
			sessionFactory = new AnnotationConfiguration().configure()
					.buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
*/
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public Session getSession() {
		
		return session;
	}

	public Transaction getTransaction() {
		return transaction;
	}


	protected final void beginTransaction() throws HibernateException, Exception {

		if (session == null || !session.isOpen()) {
			session = HibernateUtil.getSessionFactory().openSession();
		}

		if (transaction == null || !transaction.isActive()) {
			transaction = session.beginTransaction();
		}

	}

	
	protected final void commitTransaction() throws HibernateException,	Exception {

		if (transaction != null && session != null) {

			try {
				transaction.commit();
			} catch (Exception e) {
				transaction.rollback();
				throw e;
			}

			session.close();

			transaction = null;
			session = null;
			
		} else {

			throw new HibernateException(
					"Transação e/ou sessão não foram iniciadas. \nO Método beginTransaction deve ser executado antes da utilização de commitTransaction.");
		}

	}

}
