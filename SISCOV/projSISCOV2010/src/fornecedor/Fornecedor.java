package fornecedor;

import software.Software;
import equipamento.Equipamento;



public class Fornecedor {

  private int CNPJ;
  private String nome;
  private String nomeFantasia;
  private int CEP;
  private int telefone;
  private String ramoAtividade;
  private String endereco;

public  Equipamento equipamento;
  public Software software;
  

  
  
  
  
  
  
  public int getCNPJ() {
	return CNPJ;
}

public void setCNPJ(int CNPJ) {
	this.CNPJ = CNPJ;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getNomeFantasia() {
	return nomeFantasia;
}

public void setNomeFantasia(String nomeFantasia) {
	this.nomeFantasia = nomeFantasia;
}

public int getCEP() {
	return CEP;
}

public void setCEP(int CEP) {
	this.CEP = CEP;
}

public int getTelefone() {
	return telefone;
}

public void setTelefone(int telefone) {
	this.telefone = telefone;
}

public String getRamoAtividade() {
	return ramoAtividade;
}

public void setRamoAtividade(String ramoAtividade) {
	this.ramoAtividade = ramoAtividade;
}

public String getEndereco() {
	return endereco;
}

public void setEndereco(String endereco) {
	this.endereco = endereco;
}


public Equipamento getEquipamento() {
	return equipamento;
}

public void setEquipamento(Equipamento equipamento) {
	this.equipamento = equipamento;
}

public Software getSoftware() {
	return software;
}

public void setSoftware(Software software) {
	this.software = software;
}

public Fornecedor() {

  }

  public void altera() {

  }

  public void excluir() {

  }

  public void incluir() {

  }

  public void pesquisar() {

  }
}