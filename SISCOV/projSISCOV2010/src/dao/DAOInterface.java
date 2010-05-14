package main.br.com.siscov.dao;

public interface DAOInterface {

	/**
	 * M√©todo com as funcionalidades para a alteraÁ„o de registros
	 * 
	 * @param objetoPersistente
	 *            Objeto que ser√° persistido no banco. Deve implementar
	 *            Persistible
	 * @exception DaoException
	 */
	public abstract void alterar(Object objetoPersistente) throws Exception;

	/**
	 * M√©todo para a exclus„o de registros
	 * 
	 * @param objetoPersistente
	 *            Objeto que ser√° persistido no banco. Deve implementar
	 *            Persistible
	 * @exception DaoException
	 */
	public abstract void excluir(Object objetoPersistente) throws Exception;

	/**
	 * MÈtodo para salvamento de novo registro na base de dados.
	 * @param objetoPersistente Objeto que ser· persistido
	 * @throws Exception
	 */
	public abstract void salvar(Object objetoPersistente) throws Exception;

}