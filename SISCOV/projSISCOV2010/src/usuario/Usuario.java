package main.br.com.siscov.usuario;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import main.br.com.siscov.dao.DAOInterface;

import org.apache.log4j.Logger;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable{

	public enum CamposPesquisa{
		
		MATRICULA, LOGIN, NOME;
		
	}
	
	@Id
	@Column(name = "matricula")
	private int matricula;

	private String login;
	private String senha;
	private String nome;
	private String cargo;
	private String endereco;
	private String cidade;
	private Integer telefone;
	private String email;
	
	
	@JoinColumn(name = "tipo_acesso", referencedColumnName = "codigo")
	@ManyToOne
	private TipoAcesso tipoAcesso;

	/**
	 * DAO utilizado para persistência de valores no banco de dados
	 */
	@Transient
	private DAOInterface usuarioDAO = new UsuarioDAO();

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

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public TipoAcesso getTipoAcesso() {
		return tipoAcesso;
	}

	public void setTipoAcesso(TipoAcesso tipoAcesso) {
		this.tipoAcesso = tipoAcesso;
	}

	public Usuario() {
	}

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
			String email, TipoAcesso tipoAcesso) {
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

	public void validar() throws Exception{
		
		if (this.getMatricula()== 0 
				|| this.getLogin() == null || this.getLogin().isEmpty()
				|| this.getNome() == null || this.getNome().isEmpty()
				|| this.getTipoAcesso() == null || this.getTipoAcesso().getTipoAcesso() == null 
				|| this.getTipoAcesso().getTipoAcesso().isEmpty()){
			
			throw new Exception("Os campos Matrícula, Login, Nome e Tipo de Acesso são obrigatórios.");
			
		}
		
	}
	
	public void incluir(Usuario novoUsuario) throws Exception {

		try{
			
			novoUsuario.validar();
			
			Usuario usuarioExistente = obterUsuario(CamposPesquisa.LOGIN, novoUsuario.getLogin());
			
			if (usuarioExistente != null && usuarioExistente.getLogin() != null){
				throw new Exception("Já existe usuário com o Login informado.");
			}
			
			usuarioDAO.salvar(novoUsuario);
			
		}catch (Exception e) {

			Logger.getLogger(Usuario.class).error("Erro ao incluir o registro no banco de dados (" + e.getMessage() + ")");
			throw e;
			
		}

	}
	
	public void excluir(Usuario usuarioParaExclusao) throws Exception{
		
		try{
			
			usuarioDAO.excluir(usuarioParaExclusao);
			
		}catch (Exception e) {

			Logger.getLogger(Usuario.class).error("Erro ao Excluir o registro do banco de dados (" + e.getMessage() + ")");
			throw e;
			
		}
	}
	
	public void alterar(Usuario usuarioParaAlteracao) throws Exception{
		
		
		try{
						
			usuarioParaAlteracao.validar();
			
			Usuario usuarioAtual = obterUsuario(CamposPesquisa.MATRICULA, Integer.toString(usuarioParaAlteracao.getMatricula()));
			
			if (usuarioAtual.getMatricula() != usuarioParaAlteracao.getMatricula()){
				throw new Exception("O campo Matrícula é o identificador do usuário e não pode ser alterado.");
			}
			
			usuarioDAO.alterar(usuarioParaAlteracao);
			
		}catch (Exception e) {

			Logger.getLogger(Usuario.class).error("Erro ao alterar o registro do banco de dados (" + e.getMessage() + ")");
			throw e;
			
		}
		
		
	}

	public Usuario obterUsuario(CamposPesquisa campo, String valor) throws Exception {
		
		Usuario usuarioObtido = null;
		
		try{
						
			switch (campo){
			case LOGIN:
				
				usuarioObtido = ((UsuarioDAO)usuarioDAO).obterUsuarioPorLogin(valor);
				break;
				
			case MATRICULA:
				
				usuarioObtido = ((UsuarioDAO)usuarioDAO).obterUsuarioPorMatricula(Integer.valueOf(valor));
				break;
				
			case NOME:
				
				usuarioObtido = ((UsuarioDAO)usuarioDAO).obterUsuarioPorNome(valor);
				break;
				
			}
				
		}catch (Exception e) {

			Logger.getLogger(Usuario.class).error("Erro ao obter o registro no banco de dados (" + e.getMessage() + ")");
			throw e;
			
		}
		
		return usuarioObtido;
		
	}
	
	public Usuario logar(String login, String senha) throws Exception{
		
		Usuario usuarioLogado =	 null;
		
		try{
			usuarioLogado = ((UsuarioDAO)usuarioDAO).obterUsuarioPorLogin(login);
		}catch (Exception e) {

			Logger.getLogger(Usuario.class).error("Erro ao obter o registro no banco de dados (" + e.getMessage() + ")");
			throw e;
			
		}
		
		if ( !(usuarioLogado != null && usuarioLogado.getSenha().equals(senha)) ){
			
			Logger.getLogger(Usuario.class).error("Usuário não encotrado com os dados informados.");
			
		}
		                                           
		return usuarioLogado;
		
	}
	
}
