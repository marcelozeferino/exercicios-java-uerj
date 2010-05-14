package main.br.com.siscov.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;


/**
 * Classe abstrata que cont�m os m�todos b�sicos para acesso �
 * dados compartilhados com todas as outras classes DAO.
 *
 *
 */
public abstract class AbstractDAO implements DAOInterface{

	private Session session = null;
	private Transaction transaction = null;

	public Session getSession() {
		
		return session;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	/**
	 * Método para início de uma transação. Após executar as alterações
	 * nos dados, o método commitTransaction deve ser chamado para encerrar a
	 * persistência
	 * 
	 * @exception HibernateException,
	 *                Exception
	 */
	protected final void beginTransaction() throws HibernateException,
			Exception {
			
				if (session == null || !session.isOpen()) {
					session = HibernateUtil.getSessionFactory().openSession();
				}
			
				if (transaction == null || !transaction.isActive()) {
					transaction = session.beginTransaction();
				}
			
			}

	/**
	 * M�todo para conclus�o de uma transa��o. Quando executado efetua a
	 * persist�ncia dos objetos no banco.
	 * 
	 * @exception HibernateException,
	 *                Exception
	 */
	protected final void commitTransaction() throws HibernateException,
			Exception {
			
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
							"Transa��o e/ou sess�o n�o foram iniciadas. \nO M�todo beginTransaction deve ser executado antes da utiliza��o de commitTransaction.");
				}
			
			}

	/**
	 * Método com as funcionalidades para a altera��o de registros
	 * 
	 * @param objetoPersistente
	 *            Objeto que será persistido no banco. Deve implementar
	 *            Persistible
	 * @exception DaoException
	 */
	public void alterar(Object objetoPersistente) throws Exception {
	
		try {
			beginTransaction();
			
			getSession().update(objetoPersistente);
	
			commitTransaction();
		} catch (Exception e) {
			throw new Exception("Erro na atualiza��o do registro: " + e.getMessage());
		}
	
	}

	/**
	 * Método para a exclus�o de registros
	 * 
	 * @param objetoPersistente
	 *            Objeto que será persistido no banco. Deve implementar
	 *            Persistible
	 * @exception DaoException
	 */
	public void excluir(Object objetoPersistente) throws Exception {
	
		try {
	
			beginTransaction();
	
			getSession().delete(objetoPersistente);
	
			commitTransaction();
	
		} catch (Exception e) {
			throw new Exception("Erro ao excluir o registro: " + e.getMessage());
		}
	
	}
	
	/**
	 * M�todo para salvamento de novo registro na base de dados.
	 * @param objetoPersistente Objeto que ser� persistido
	 * @throws Exception
	 */
	public void salvar(Object objetoPersistente) throws Exception{
		
		try {
			
			beginTransaction();
	
			getSession().save(objetoPersistente);
	
			commitTransaction();
	
		} catch (Exception e) {
			throw new Exception("Erro ao salvar o registro: " + e.getMessage());
		}
				
		
	}

}
