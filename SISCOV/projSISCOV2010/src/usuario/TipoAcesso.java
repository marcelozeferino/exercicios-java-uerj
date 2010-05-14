package main.br.com.siscov.usuario;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipo_acesso")
public class TipoAcesso implements Serializable{

	public static int COD_TIPO_ADM = 1;
	public static int COD_TIPO_USUARIO = 2;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="codigo")
	private int codigo;
	
	@Column(name="descricao_tipo_acesso")
	private String descricaoTipoAcessp;
	
	/**
	 * Construtor vazio fornecido para funcionalidades do Hibernate
	 */
	protected TipoAcesso(){
	}
	
	/**Método de fábrica para criação de tipo de
	 * acesso nível Administrador
	 * 
	 * @return TipoAcesso 
	 */
	public static TipoAcesso  getTipoAdministrador(){
		
		TipoAcesso tipoAdm = new TipoAcesso();
		tipoAdm.setCodigo(1);
		tipoAdm.setTipoAcesso("Administrador");
		return tipoAdm;
		
	}
	
	/**Método de fábrica para criação de tipo de
	 * acesso nível Usuário
	 * 
	 * @return TipoAcesso 
	 */
	public static TipoAcesso getTipoUsuario(){
		
		TipoAcesso tipoUsuario = new TipoAcesso();
		tipoUsuario.setCodigo(2);
		tipoUsuario.setTipoAcesso("Usuário");
		
		return tipoUsuario;
		
	}
	
	//Getters and Settters
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getTipoAcesso() {
		return descricaoTipoAcessp;
	}
	public void setTipoAcesso(String tipoAcesso) {
		this.descricaoTipoAcessp = tipoAcesso;
	}
	
	

}
