package main.br.com.siscov.usuario;

import main.br.com.siscov.dao.AbstractDAO;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class UsuarioDAO extends AbstractDAO {

	public Usuario obterUsuarioPorLogin(String login) throws Exception{

		Usuario usuarioEncontrado = null;
		
		try {
			beginTransaction();

			Criteria crit = getSession().createCriteria(Usuario.class);
			crit.add(Restrictions.like("login", login));

			usuarioEncontrado = (Usuario) crit.uniqueResult();
			
			commitTransaction();
			
		} catch (Exception e) {
			
			throw new Exception("Erro na busca do usuário pelo Login: "
					+ e.getMessage());
			
		}
		
		return usuarioEncontrado;

	}
	
	public Usuario obterUsuarioPorMatricula(Integer matricula) throws Exception{

		Usuario usuarioEncontrado = null;
		
		try {
			beginTransaction();

			Criteria crit = getSession().createCriteria(Usuario.class);
			crit.add(Restrictions.like("matricula", matricula));

			usuarioEncontrado = (Usuario) crit.uniqueResult();
			
			commitTransaction();
			
		} catch (Exception e) {
			
			throw new Exception("Erro na busca do usuário pela Matrícula: "
					+ e.getMessage());
			
		}
		
		return usuarioEncontrado;

	}
	
	public Usuario obterUsuarioPorNome(String nome) throws Exception{

		Usuario usuarioEncontrado = null;
		
		try {
			beginTransaction();

			Criteria crit = getSession().createCriteria(Usuario.class);
			crit.add(Restrictions.like("nome", nome));

			usuarioEncontrado = (Usuario) crit.uniqueResult();
			
			commitTransaction();
			
		} catch (Exception e) {
			
			throw new Exception("Erro na busca do usuário pela Nome: "
					+ e.getMessage());
			
		}
		
		return usuarioEncontrado;

	}

}
