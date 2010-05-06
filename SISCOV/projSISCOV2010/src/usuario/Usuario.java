package usuario;

import java.sql.SQLException;
import java.util.ArrayList;




public class Usuario {

  private int matricula;
  private String login;
  private String senha;
  private String nome;
  private String cargo;
  private String endereco;
  private String cidade;
  private int telefone;
  private String email;
  private int tipoAcesso;
  private int nepat;   //chave estrangeira de Equipamento
  private int numero;  //chave estrangeira de Chamado
  
  
public int getMatricula() {
	return matricula;
}

public void setMatricula(int matricula) {
	this.matricula = matricula;
}

public String getLogin() {
	return login;
}

public void setLogin(String login) {
	this.login = login;
}

public String getSenha() {
	return senha;
}

public void setSenha(String senha) {
	this.senha = senha;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getCargo() {
	return cargo;
}

public void setCargo(String cargo) {
	this.cargo = cargo;
}

public String getEndereco() {
	return endereco;
}

public void setEndereco(String endereco) {
	this.endereco = endereco;
}

public String getCidade() {
	return cidade;
}

public void setCidade(String cidade) {
	this.cidade = cidade;
}

public int getTelefone() {
	return telefone;
}

public void setTelefone(int telefone) {
	this.telefone = telefone;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public int getTipoAcesso() {
	return tipoAcesso;
}

public void setTipoAcesso(int tipoAcesso) {
	this.tipoAcesso = tipoAcesso;
}

public int getNepat() {
	return nepat;
}

public void setNepat(int nepat) {
	this.nepat = nepat;
}

public int getNumero() {
	return numero;
}

public void setNumero(int numero) {
	this.numero = numero;
}


	public Usuario() {}


	/**
	 * @param matricula
	 * @param login
	 * @param senha
	 * @param nome
	 * @param cargo
	 * @param endereco
	 * @param cidade
	 * @param telefone
	 * @param email
	 * @param tipoAcesso
	 */
	public Usuario(int matricula, String login, String senha, String nome,
		String cargo, String endereco, String cidade, int telefone,
		String email, int tipoAcesso) {
	this.matricula = matricula;
	this.login = login;
	this.senha = senha;
	this.nome = nome;
	this.cargo = cargo;
	this.endereco = endereco;
	this.cidade = cidade;
	this.telefone = telefone;
	this.email = email;
	this.tipoAcesso = tipoAcesso;
}
	
	
		
	
	
	
	
	
	
	
	
	
	
	/**
	 * 
	 * @param usuario
	 * @return valor inteiro 0 se a operaçaõ não for executada e 1 se for executada
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	  public int alterar(Usuario usuario) throws SQLException, ClassNotFoundException   {
		// se retornar 0, não executado
		// se retornar 1 , update realizado
		  UsuarioDAO dao = new UsuarioDAO();
		  return  dao.alterarUsuario(usuario);

	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
	  
	/**
	 * 
	 * @param usuario
	 * @return valor inteiro 0 se a operaçaõ não for executada e 1 se for executada
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public int cadastrarUsuario(Usuario usuario) throws SQLException, ClassNotFoundException {
		// se retornar 0, não executado
		// se retornar 1 , update realizado
		UsuarioDAO dao = new UsuarioDAO();
		return dao.cadastrarUsuario(usuario);
		

	}


  
  
  
  
  
  
  
  
  
  
  
  /**
   * 
   * @param usuario
   * @return valor inteiro 0 se a operaçaõ não for executada e 1 se for executada
   * @throws SQLException
   * @throws ClassNotFoundException
   */
  public int excluir(Usuario usuario) throws SQLException, ClassNotFoundException  {
	  pesquisarUsuario(usuario);
	// se retornar 0, não executado
	// se retornar 1 , update realizado
	  UsuarioDAO dao = new UsuarioDAO();
	  return dao.excluirUsuario(usuario);
	  
	  

  }

  
  
  
  
  
  

  /**
   * 
   * @param usuario
   * @return retorna um ArrayList de Usuario
   * @throws SQLException
   * @throws ClassNotFoundException
   */
  public ArrayList<Usuario> pesquisarUsuario(Usuario usuario) throws SQLException, ClassNotFoundException {
	  
	  	UsuarioDAO dao = new UsuarioDAO();
	  	return dao.pesquisarUsuario(usuario);
  }
  


}

