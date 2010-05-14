package main.br.com.siscov.usuario;

import org.apache.struts.action.ActionForm;

@SuppressWarnings("serial")
public class UsuarioForm extends ActionForm {

	private String acao;

	private String nomePesquisa;
	private String matriculaPesquisa;
	
	private String nome;
	private String login;
	private String matricula;
	private String senha;
	private String email;
	private String cargo;
	private String endereco;
	private String cidade;
	private String telefone;
	private String tipoAcesso;
	
	private String mensagem;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAcao() {
		return acao;
	}
	public void setAcao(String acao) {
		this.acao = acao;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getTipoAcesso() {
		return tipoAcesso;
	}
	public void setTipoAcesso(String tipoAcesso) {
		this.tipoAcesso = tipoAcesso;
	}
	public String getNomePesquisa() {
		return nomePesquisa;
	}
	public void setNomePesquisa(String nomePesquisa) {
		this.nomePesquisa = nomePesquisa;
	}
	public String getMatriculaPesquisa() {
		return matriculaPesquisa;
	}
	public void setMatriculaPesquisa(String matriculaPesquisa) {
		this.matriculaPesquisa = matriculaPesquisa;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public void carregarDados(final Usuario usuarioPreenchido){
		
		this.setMatricula(String.valueOf(usuarioPreenchido.getMatricula()));
		this.setLogin(usuarioPreenchido.getLogin());
		this.setNome(usuarioPreenchido.getNome());
		this.setSenha(usuarioPreenchido.getSenha());
		this.setEndereco(usuarioPreenchido.getEndereco());
		this.setCidade(usuarioPreenchido.getCidade());
		
		this.setTelefone(String.valueOf(usuarioPreenchido.getTelefone()));
		
		this.setEmail(usuarioPreenchido.getEmail());
		this.setCargo(usuarioPreenchido.getCargo());
		
		if (usuarioPreenchido.getTipoAcesso() == null){
			this.setTipoAcesso(TipoAcesso.getTipoUsuario().getTipoAcesso());
		}else{
			this.setTipoAcesso(usuarioPreenchido.getTipoAcesso().getTipoAcesso());
		}
		
		
		
		
	}
	
	public Usuario gerarObjeto(){
		
		Usuario novoUsuario = new Usuario();
		
		novoUsuario.setMatricula(Integer.valueOf(this.getMatricula()));
		novoUsuario.setLogin(this.getLogin());
		novoUsuario.setNome(this.getNome());
		novoUsuario.setSenha(this.getSenha());
		novoUsuario.setEndereco(this.getEndereco());
		novoUsuario.setCidade(this.getCidade());
		
		if (this.getTelefone() == null || this.getTelefone().isEmpty()){
			novoUsuario.setTelefone(0);
		}else{
			novoUsuario.setTelefone(Integer.valueOf(this.getTelefone()));
		}
		
		novoUsuario.setEmail(this.getEmail());
		novoUsuario.setCargo(this.getCargo());
		
		if ("Administrador".equalsIgnoreCase(this.getTipoAcesso())){
			
			novoUsuario.setTipoAcesso(TipoAcesso.getTipoAdministrador());
			
		}else {
			
			novoUsuario.setTipoAcesso(TipoAcesso.getTipoUsuario());
		}
		
		return novoUsuario;
		
	}
	
	
	
}
