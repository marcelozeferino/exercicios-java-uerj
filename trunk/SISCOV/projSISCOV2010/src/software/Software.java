package main.br.com.siscov.software;


import java.util.Date;

import main.br.com.siscov.equipamento.Equipamento;
import main.br.com.siscov.fabricante.Fabricante;
import main.br.com.siscov.fornecedor.Fornecedor;
import main.br.com.siscov.livro.Livro;

public class Software {
  private int codigo; 
  private String nome;
  private String descricao;
  private String versao;
  private Date dataCompra;
  private int qtdLicencas;
  private Date dataAtualizacao;
  public Fabricante fabricante;
  
  public Equipamento equipamento;

  public Fornecedor fornecedor;
 
  public Livro livro;
  
  
  
  
  
  

  public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public Date getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}

	public int getQtdLicencas() {
		return qtdLicencas;
	}

	public void setQtdLicencas(int qtdLicencas) {
		this.qtdLicencas = qtdLicencas;
	}

	public Date getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public Equipamento getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(Equipamento equipamento) {
		this.equipamento = equipamento;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
	 public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

public Software() {

  }

  public void incluir() {

  }

  public void altera() {

  }

  public void excluir() {

  }

  public void pesquisar() {

  }
}