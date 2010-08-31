package aula08.dao.fabrica;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;



public class HibernateSessionFactory {

    /** Instancia Session */
	@SuppressWarnings("unchecked")
	private static final ThreadLocal threadLocal = new ThreadLocal();

    /** Instancia hibernate SessionFactory */
    private static org.hibernate.SessionFactory sessionFactory;

    /**
	 * Retorna a intancia do ThreadLocal Session. Inicializa Lazy
	 * <code>SessionFactory</code> se necessário.
	 * 
	 * @return Session
	 * @throws HibernateException
	 */
    @SuppressWarnings("unchecked")
	public static Session currentSession() throws HibernateException {
        Session session = (Session) threadLocal.get();

		if (session == null || !session.isOpen()) {
			if (sessionFactory == null) {
				try {
					sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
				} catch (Exception e) {
					System.err.println("%%%% Error Creating SessionFactory %%%%");
					e.printStackTrace();
				}
			}
			
			session = (sessionFactory != null) ? sessionFactory.openSession(): null;
			threadLocal.set(session);
		}

        return session;
        
    }

    /**
	 * Fecha session do hibernate.
	 * 
	 * @throws HibernateException
	 */
    @SuppressWarnings("unchecked")
	public static void closeSession() throws HibernateException {
    	
        Session session = (Session) threadLocal.get();
        threadLocal.set(null);

        if (session != null) {
            session.close();
        }
    }

    /**
	 * Construtor default.
	 */
    private HibernateSessionFactory() {
    }

}
