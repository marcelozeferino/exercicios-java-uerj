package main.funcionario;

public abstract class Funcionario {
	
	private int matricula;
	private String nome;
	private Double salario;
	private Double percentDesconto;
	
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
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public Double getPercentDesconto() {
		return percentDesconto;
	}
	public void setPercentDesconto(Double percentDesconto) {
		this.percentDesconto = percentDesconto;
	}
	
	public Double calcularSalario(){
		
		Double valorASerDescontado = this.salario * (this.percentDesconto/100);
		return this.salario - valorASerDescontado;
		
	}
	
	
	

}
