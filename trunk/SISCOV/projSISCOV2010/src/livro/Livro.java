package livro;

import software.Software;
import tecnico.Tecnico;
import tecnicolivro.TecnicoLivro;



public class Livro {

  private int codigo;
  private String nome;
  private int tipoSuporte;
  private int numeroSerie;
  private int quantidade;
  private int ISBN;

  public TecnicoLivro tecnicoLivro;
  public Software software;
  public Tecnico tecnico;

  
  
  
  public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public int getTipoSuporte() {
	return tipoSuporte;
}

public void setTipoSuporte(int tipoSuporte) {
	this.tipoSuporte = tipoSuporte;
}

public int getNumeroSerie() {
	return numeroSerie;
}

public void setNumeroSerie(int numeroSerie) {
	this.numeroSerie = numeroSerie;
}

public int getQuantidade() {
	return quantidade;
}

public void setQuantidade(int quantidade) {
	this.quantidade = quantidade;
}

public int getISBN() {
	return ISBN;
}

public void setISBN(int iSBN) {
	ISBN = iSBN;
}

public TecnicoLivro getTecnicoLivro() {
	return tecnicoLivro;
}

public void setTecnicoLivro(TecnicoLivro tecnicoLivro) {
	this.tecnicoLivro = tecnicoLivro;
}

public Software getSoftware() {
	return software;
}

public void setSoftware(Software software) {
	this.software = software;
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

public void altera() {

  }

  public void pesquisar() {

  }

  public Livro() {

  }

  public void excluir() {

  }

  public void incluir() {

  }
}