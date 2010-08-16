package objetos;


public class Setor implements Comparable<Setor> {

	private int codigo;
	private String nome;
	
	/**
	 * Construtor com parametros Cõdigo e Nome
	 * @param codigo
	 * @param nome
	 */
	public Setor(int codigo, String nome){
		
		if (nome == null){
			nome = "";
		}
		
		this.codigo = codigo;
		this.nome = nome;
	}
	
		
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Setor))
			return false;
		Setor other = (Setor) obj;
		if (codigo != other.codigo)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}


	@Override
	public int compareTo(Setor arg0) {
		
		if (this.getCodigo() == arg0.getCodigo())
			return 0;
		else if (this.getCodigo() < arg0.getCodigo())
			return -1;
		else
			return 1;
	}



	
	
	
	
	
	
}
