package parte3.abonosalarial;

public class Funcionario {

	//Atributos da classe Funcion�rio privados
	private String nome;
	private double salario;
	
	//M�todos de acesso aos atributos
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
	 * M�todo para c�lculo e retorno do salario com abono, de acordo com o
	 * percentual de reajuste.
	 * 
	 * @return double Sal�rio j� com o reajuste.
	 * 
	 * @param double Percentual de reajuste que ser� aplicado ao sal�rio 
	 * do funcion�rio.
	 * 
	 */
	public double calcularSalarioComAbono(double percentualAbono){ 
		
		//Descobrindo o valor que ser� aumentado no sal�rio do funcion�rio		
		double aumento = getSalario() * (percentualAbono / 100);
		
		//Acrescentando o abono ao sal�rio do funcion�rio
		double novoSalario = aumento + getSalario();
		
		//Retornando o valor calculado do novo sal�rio
		return novoSalario;
		
		
	}
	
}
