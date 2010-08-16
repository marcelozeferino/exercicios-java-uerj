package objetos;


import java.util.Set;

public class Funcionario {
	
	private int matricula;
	private String nome;
	private int idade;
	private Set<Setor> setor;
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Set<Setor> getSetor() {
		return setor;
	}
	public void setSetor(Set<Setor> setor) {
		this.setor = setor;
	}
	
	/*
	 * Implementação não OK para equals e hashcode
	 */
	@Override
	public int hashCode(){
		
		return idade;
		
	}
	
	@Override
	public boolean equals(Object obj){
		
		return ((Funcionario)obj).getNome().equals(this.getNome());	
		
	}
	

}
