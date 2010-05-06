package tecnico;

import suporte.Area;
import tecnicolivro.TecnicoLivro;
import manutencao.Manutencao;
import chamado.Chamado;



public class Tecnico {

  private int matricula;
  private String senha;
  private String login;
  private String nomeTecnico;
  private int telefone;
  public  Manutencao manutencao;
  public TecnicoLivro tecnicoLivro;
  public Area area;
  public Chamado chamado;

  
  
  public int getMatricula() {
	return matricula;
}

public void setMatricula(int matricula) {
	this.matricula = matricula;
}

public String getSenha() {
	return senha;
}

public void setSenha(String senha) {
	this.senha = senha;
}

public String getLogin() {
	return login;
}

public void setLogin(String login) {
	this.login = login;
}

public String getNomeTecnico() {
	return nomeTecnico;
}

public void setNomeTecnico(String nomeTecnico) {
	this.nomeTecnico = nomeTecnico;
}

public int getTelefone() {
	return telefone;
}

public void setTelefone(int telefone) {
	this.telefone = telefone;
}

public Manutencao getManutencao() {
	return manutencao;
}

public void setManutencao(Manutencao manutencao) {
	this.manutencao = manutencao;
}

public TecnicoLivro getTecnicoLivro() {
	return tecnicoLivro;
}

public void setTecnicoLivro(TecnicoLivro tecnicoLivro) {
	this.tecnicoLivro = tecnicoLivro;
}

public Area getArea() {
	return area;
}

public void setArea(Area area) {
	this.area = area;
}




public Chamado getChamado() {
	return chamado;
}

public void setChamado(Chamado chamado) {
	this.chamado = chamado;
}

public Tecnico() {

  }

  public void incluir() {

  }

  public void alterar() {

  }

  public void excluir() {

  }

  public void pesquisar() {

  }
}