package tecnicolivro;

import java.util.Date;

import tecnico.Tecnico;

import livro.Livro;

public class TecnicoLivro {

	private int codigo;
	private Date dataAtualizacao;
 
  public Tecnico tecnico;
  public Livro livro;
  
  
  
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




public Livro getLivro() {
	return livro;
}




public void setLivro(Livro livro) {
	this.livro = livro;
}




public Date getDataAtualizacao() {
	return dataAtualizacao;
}

public void setDataAtualizacao(Date dataAtualizacao) {
	this.dataAtualizacao = dataAtualizacao;
}

public TecnicoLivro() {
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