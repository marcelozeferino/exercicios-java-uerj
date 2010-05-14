package main.br.com.siscov.suporte;

import main.br.com.siscov.chamado.Chamado;
import main.br.com.siscov.tecnico.Tecnico;




public abstract class Area {

  private int codigo;
  
  private String nome;
  
  private String tipoSuporte;

  private String comentario;

  private String tipoAtendimento;
  
  private Chamado chamado;
  
  private Tecnico tecnico;


  
  
  


public String getTipoSuporte() {
	return tipoSuporte;
}

public void setTipoSuporte(String tipoSuporte) {
	this.tipoSuporte = tipoSuporte;
}

public String getComentario() {
	return comentario;
}

public void setComentario(String comentario) {
	this.comentario = comentario;
}

public String getTipoAtendimento() {
	return tipoAtendimento;
}

public void setTipoAtendimento(String tipoAtendimento) {
	this.tipoAtendimento = tipoAtendimento;
}



  public int getCodigo() {
	return codigo;
}

public void setCodigo(int codigo) {
	this.codigo = codigo;
}


public Chamado getChamado() {
	return chamado;
}

public void setChamado(Chamado chamado) {
	this.chamado = chamado;
}

public Tecnico getTecnico() {
	return tecnico;
}

public void setTecnico(Tecnico tecnico) {
	this.tecnico = tecnico;
}


public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public Area() {}


public Area(int codigo, String nome, String tipoSuporte, String comentario,
		String tipoAtendimento, Chamado chamado, Tecnico tecnico) {
	
	this.codigo = codigo;
	this.nome = nome;
	this.tipoSuporte = tipoSuporte;
	this.comentario = comentario;
	this.tipoAtendimento = tipoAtendimento;
	this.chamado = chamado;
	this.tecnico = tecnico;	
}





//	public abstract void alterar(Area area);
//		
//	public abstract void pesquisar(Area area);
//		
//	public abstract void excluir(Area area);
//		
//	public abstract void incluir(Area area);
}