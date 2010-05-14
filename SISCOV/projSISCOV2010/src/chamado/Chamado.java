package main.br.com.siscov.chamado;


import java.sql.SQLException;
import java.util.Date;

import main.br.com.siscov.equipamento.Equipamento;
import main.br.com.siscov.manutencao.Manutencao;
import main.br.com.siscov.suporte.Area;
import main.br.com.siscov.usuario.Usuario;



public class Chamado {

  private int numero;
  private String problema;
  private String ajuda;
  private Date data;
  private int severidade;
  private Date hora;

  public Usuario usuario;
  public Manutencao manutencao;
  public Equipamento equipamento;
  public Area area;
    
    
    
    
    
    
    
    

  public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getProblema() {
		return problema;
	}

	public void setProblema(String problema) {
		this.problema = problema;
	}

	public String getAjuda() {
		return ajuda;
	}

	public void setAjuda(String ajuda) {
		this.ajuda = ajuda;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getSeveridade() {
		return severidade;
	}

	public void setSeveridade(int severidade) {
		this.severidade = severidade;
	}

	public Date getHora() {
		return hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Manutencao getManutencao() {
		return manutencao;
	}

	public void setManutencao(Manutencao manutencao) {
		this.manutencao = manutencao;
	}

	public Equipamento getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(Equipamento equipamento) {
		this.equipamento = equipamento;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	
	
	
	
	
	
	
	
	
	
public Chamado() {

  }



  public Chamado(int numero, String problema, String ajuda, Date data,
		int severidade, Date hora, Usuario usuario, Manutencao manutencao,
		Equipamento equipamento, Area area) {
	this.numero = numero;
	this.problema = problema;
	this.ajuda = ajuda;
	this.data = data;
	this.severidade = severidade;
	this.hora = hora;
	this.usuario = usuario;
	this.manutencao = manutencao;
	this.equipamento = equipamento;
	this.area = area;
}

  
  
  
  


 
  
  
  
  
  
  
  public void pesquisarChamado(){
  }

  public void abrirChamado() throws SQLException, ClassNotFoundException {
	  ChamadoDAO chamadoDAO = new ChamadoDAO();
	  chamadoDAO.abrirChamado(null, usuario, area, equipamento, null, manutencao);

  }


  
  
}