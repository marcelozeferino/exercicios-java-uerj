package parte3.abonosalarial;

public class Funcionario {

	//Atributos da classe Funcionário privados
	private String nome;
	private double salario;
	
	//Métodos de acesso aos atributos
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	/**
	 * Método para cálculo e retorno do salario com abono, de acordo com o
	 * percentual de reajuste.
	 * 
	 * @return double Salário já com o reajuste.
	 * 
	 * @param double Percentual de reajuste que será aplicado ao salário 
	 * do funcionário.
	 * 
	 */
	public double calcularSalarioComAbono(double percentualAbono){ 
		
		//Descobrindo o valor que será aumentado no salário do funcionário		
		double aumento = getSalario() * (percentualAbono / 100);
		
		//Acrescentando o abono ao salário do funcionário
		double novoSalario = aumento + getSalario();
		
		//Retornando o valor calculado do novo salário
		return novoSalario;
		
		
	}
	
}
