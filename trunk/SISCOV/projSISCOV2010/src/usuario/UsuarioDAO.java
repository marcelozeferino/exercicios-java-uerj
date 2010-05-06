package usuario;


import java.sql.SQLException;
import java.util.ArrayList;

import chamado.Chamado;
import dao.DAO;
import equipamento.Equipamento;


public class UsuarioDAO {
	
	Usuario usuario;
	Equipamento equipamento;
	Chamado chamado;
	
	
	
	/**
	 * 
	 * @param usuario
	 * @return valor inteiro 0 se a operaçaõ não for executada e 1 se for executada
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public int alterarUsuario(Usuario usuario) throws SQLException, ClassNotFoundException{
		
		DAO dao = new DAO();
		
		String sql = "update USUARIO set matricula ="+usuario.getMatricula()+"," +
    										"nome='"+usuario.getNome()+"'," +
    										"cargo="+usuario.getCargo()+"," +
    										"endereco="+usuario.getEndereco()+"," +
    										"cidade="+usuario.getCidade()+"," +
    										"telefone="+usuario.getTelefone()+"," +
    										"email="+usuario.getEmail()+"," +
    										"tipoAcesso="+usuario.getTipoAcesso()+")";
    	// se retornar 0, não executado
		// se retornar 1 , update realizado
    	return dao.atualizaSQL(sql); 
	}
	
	
	
	
	
	
	
	
	
	public int excluirUsuario(Usuario usuario) throws SQLException, ClassNotFoundException {
		
		DAO dao = new DAO();

	      String sql = "delete * from USUARIO where matricula = "+usuario.getMatricula();
	      	      
	      // se retornar 0, não executado
	      // se retornar 1 , update realizado
	      return dao.atualizaSQL(sql);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * 
	 * @param usuario
	 * @return valor inteiro 0 se a operação não for executada e 1 se for executada
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public int cadastrarUsuario(Usuario usuario) throws SQLException, ClassNotFoundException {
		
		DAO dao = new DAO();
		
    	String sql = "insert into USUARIO(matricula, nome, login, senha, cargo, endereco, cidade, telefone, email, tipoAcesso) values(" +
    										usuario.getMatricula()+",'" +
    										usuario.getNome()+"'," +
    										usuario.getLogin()+"," +
    										usuario.getSenha()+"," +
    										usuario.getCargo()+"," +
    										usuario.getEndereco()+"," +
    										usuario.getCidade()+"," +
    										usuario.getTelefone()+"," +
    										usuario.getEmail()+"," +
    										usuario.getTipoAcesso()+")";
    	
    	return dao.atualizaSQL(sql);
    	
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public ArrayList<Usuario> pesquisarUsuario(Usuario usuario) throws SQLException, ClassNotFoundException{
		
		DAO dao = new DAO();
		
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		String sql = "select * from USUARIO where (matricula="+usuario.getMatricula()+" or "+" nome like'%"+usuario.getNome()+"%')";
		
		dao.setResultSet(dao.selecionaSQL(sql));
		
		while(dao.getResultSet().next()){
			lista.add(usuario);
			
		}
			
	
		return lista;
	}
	
	
	
	
	
	

}
