package equipamento;

import software.Software;
import usuario.Usuario;
import chamado.Chamado;
import fornecedor.Fornecedor;



public class Equipamento {

  private int nepat;
  private String licencaSO;
  private String nome;
  private String modelo;
  private String tipo;
  private int numeroSerie;
  private int especificacao;
  private int lacre;
  private int dataAquisicao;
  private int numeroFiscal;
  private int garantia;

    public Usuario usuario;
    public Chamado chamado;
    public Fornecedor fornecedor;
    /**
   * @element-type Software
   */
  public Software software;

  
  
  
  
  
  
  
    
  
  public int getNepat() {
		return nepat;
	}

	public void setNepat(int nepat) {
		this.nepat = nepat;
	}

	public String getLicencaSO() {
		return licencaSO;
	}

	public void setLicencaSO(String licencaSO) {
		this.licencaSO = licencaSO;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(int numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public int getEspecificacao() {
		return especificacao;
	}

	public void setEspecificacao(int especificacao) {
		this.especificacao = especificacao;
	}

	public int getLacre() {
		return lacre;
	}

	public void setLacre(int lacre) {
		this.lacre = lacre;
	}

	public int getDataAquisicao() {
		return dataAquisicao;
	}

	public void setDataAquisicao(int dataAquisicao) {
		this.dataAquisicao = dataAquisicao;
	}

	public int getNumeroFiscal() {
		return numeroFiscal;
	}

	public void setNumeroFiscal(int numeroFiscal) {
		this.numeroFiscal = numeroFiscal;
	}

	public int getGarantia() {
		return garantia;
	}

	public void setGarantia(int garantia) {
		this.garantia = garantia;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Chamado getChamado() {
		return chamado;
	}

	public void setChamado(Chamado chamado) {
		this.chamado = chamado;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Software getSoftware() {
		return software;
	}

	public void setSoftware(Software software) {
		this.software = software;
	}

	
	
	
	
	
	
	
	
	public Equipamento() {

	}




  public Equipamento(int nepat, String licencaSO, String nome, String modelo,
			String tipo, int numeroSerie, int especificacao, int lacre,
			int dataAquisicao, int numeroFiscal, int garantia, Usuario usuario,
			Chamado chamado, Fornecedor fornecedor, Software software) {
		this.nepat = nepat;
		this.licencaSO = licencaSO;
		this.nome = nome;
		this.modelo = modelo;
		this.tipo = tipo;
		this.numeroSerie = numeroSerie;
		this.especificacao = especificacao;
		this.lacre = lacre;
		this.dataAquisicao = dataAquisicao;
		this.numeroFiscal = numeroFiscal;
		this.garantia = garantia;
		this.usuario = usuario;
		this.chamado = chamado;
		this.fornecedor = fornecedor;
		this.software = software;
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