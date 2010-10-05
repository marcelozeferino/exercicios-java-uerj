package main.java.infrastructure;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import main.java.domain.model.Telefone;
import main.java.domain.model.Tipo;
import main.java.domain.repository.TelefoneRepositoy;

import org.apache.log4j.Logger;

public class TelefoneRepositoryHibernate implements TelefoneRepositoy {

	HibernateUtil util = new HibernateUtil();

	public Integer atualizar(Telefone novoTelefone) {
		// TODO Auto-generated method stub
		return null;
	}

	public Telefone procurarPorNumero(String numero) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void remover(Telefone novoTelefone) {
		// TODO Auto-generated method stub
		
	}

	public Integer salvar(Telefone novoTelefone) {

		try {

			util.beginTransaction();

			Integer idTelefoneSalvo = (Integer) util.getSession().save(novoTelefone);
			
			util.commitTransaction();
			
			return idTelefoneSalvo;

		} catch (Exception e) {
			Logger.getLogger(this.getClass()).error(e.getMessage());
			throw new RuntimeException(e);
		}

		
	}

	@SuppressWarnings("unchecked")
	public List<Tipo> obterTipos() {

		List<Tipo> tiposCadastrados = new ArrayList<Tipo>();

		try {

			/*util.beginTransaction();

			tiposCadastrados = (List<Tipo>) util.getSession().createCriteria(
					Tipo.class).list();

			util.commitTransaction();
			
			
*/
			
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");  
			EntityManager entityManager = entityManagerFactory.createEntityManager();     
			      
	        tiposCadastrados = (List<Tipo>) entityManager.createQuery("from Tipo").getResultList();
	        
	        
		} catch (Exception e) {
			Logger.getLogger(this.getClass()).error(e.getMessage());
			e.printStackTrace();
			throw new RuntimeException(e);
		}

		return tiposCadastrados;

	}

	public Telefone procurarPorId(Integer id) {
	
		try {

			util.beginTransaction();

			Telefone telefoneRecuperado = (Telefone) util.getSession().load(Telefone.class, id);

			util.commitTransaction();
			
			return telefoneRecuperado;

		} catch (Exception e) {
			Logger.getLogger(this.getClass()).error(e.getMessage());
			throw new RuntimeException(e);
		}

		
		
	}

	
}
