package main.funcionario;

public class FuncionarioCLTFlex extends Funcionario {
	
	private Double cotaUtilidade;

	public Double getCotaUtilidade() {
		return cotaUtilidade;
	}
	public void setCotaUtilidade(Double cotaUtilidade) {
		this.cotaUtilidade = cotaUtilidade;
	}
	
	@Override
	public Double calcularSalario(){
		
		Double salLiquidoCLT = super.calcularSalario();
		return salLiquidoCLT + this.cotaUtilidade;
		
	}

}
