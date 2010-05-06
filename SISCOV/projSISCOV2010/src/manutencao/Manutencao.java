package manutencao;


import java.util.Date;

import tecnico.Tecnico;


import chamado.Chamado;

public class Manutencao {

  private Date data;
  private String problema;
  private String solucao;
  private Date hora;
  private int codigo;

  public Tecnico tecnico;
  public Chamado chamado;
  public Status status;
  
  
  
 

public Status getStatus() {
	return status;
}

public void setStatus(Status status) {
	this.status = status;
}

public Date getData() {
	return data;
}

public void setData(Date data) {
	this.data = data;
}

public String getProblema() {
	return problema;
}

public void setProblema(String problema) {
	this.problema = problema;
}

public String getSolucao() {
	return solucao;
}

public void setSolucao(String solucao) {
	this.solucao = solucao;
}

public Date getHora() {
	return hora;
}

public void setHora(Date hora) {
	this.hora = hora;
}

public int getCodigo() {
	return codigo;
}

public void setCodigo(int codigo) {
	this.codigo = codigo;
}



public Tecnico getTecnico() {
	return tecnico;
}

public void setTecnico(Tecnico tecnico) {
	this.tecnico = tecnico;
}

public Chamado getChamado() {
	return chamado;
}

public void setChamado(Chamado chamado) {
	this.chamado = chamado;
}

public Manutencao() {
  }

  public void alterar() {
  }

  public void excluir() {
  }

  public void incluir() {
  }

  public void pesquisar() {
  }
}