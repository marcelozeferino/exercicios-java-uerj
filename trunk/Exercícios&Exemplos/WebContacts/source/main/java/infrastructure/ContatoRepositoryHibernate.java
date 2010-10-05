package main.java.infrastructure;

import org.apache.log4j.Logger;

import main.java.domain.model.Contato;
import main.java.domain.model.Telefone;
import main.java.domain.repository.ContatoRepository;

public class ContatoRepositoryHibernate implements ContatoRepository {

	private HibernateUtil util = new HibernateUtil();
	
	public Contato atualizar(Contato novoTelefone) {
		// TODO Auto-generated method stub
		return null;
	}

	public Contato procurarPorId(Integer idContato) {
		
		try {

			util.beginTransaction();

			Contato contatoSalvo = (Contato) util.getSession().load(Contato.class, idContato);
			
			util.commitTransaction();
			
			return contatoSalvo;

		} catch (Exception e) {
			Logger.getLogger(this.getClass()).error(e.getMessage());
			throw new RuntimeException(e);
		}
	
	}

	public Contato remover(Contato novoTelefone) {
		// TODO Auto-generated method stub
		return null;
	}

	public Contato salvar(Contato novoTelefone) {
		// TODO Auto-generated method stub
		return null;
	}

}
