package main.br.com.siscov.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;


/**
 * Classe abstrata que contém os métodos básicos para acesso à
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
	 * MÃ©todo para inÃ­cio de uma transaÃ§Ã£o. ApÃ³s executar as alteraÃ§Ãµes
	 * nos dados, o mÃ©todo commitTransaction deve ser chamado para encerrar a
	 * persistÃªncia
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
	 * Método para conclusão de uma transação. Quando executado efetua a
	 * persistência dos objetos no banco.
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
							"Transação e/ou sessão não foram iniciadas. \nO Método beginTransaction deve ser executado antes da utilização de commitTransaction.");
				}
			
			}

	/**
	 * MÃ©todo com as funcionalidades para a alteração de registros
	 * 
	 * @param objetoPersistente
	 *            Objeto que serÃ¡ persistido no banco. Deve implementar
	 *            Persistible
	 * @exception DaoException
	 */
	public void alterar(Object objetoPersistente) throws Exception {
	
		try {
			beginTransaction();
			
			getSession().update(objetoPersistente);
	
			commitTransaction();
		} catch (Exception e) {
			throw new Exception("Erro na atualização do registro: " + e.getMessage());
		}
	
	}

	/**
	 * MÃ©todo para a exclusão de registros
	 * 
	 * @param objetoPersistente
	 *            Objeto que serÃ¡ persistido no banco. Deve implementar
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
	 * Método para salvamento de novo registro na base de dados.
	 * @param objetoPersistente Objeto que será persistido
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
