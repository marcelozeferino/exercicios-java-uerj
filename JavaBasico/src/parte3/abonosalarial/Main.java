package parte3.abonosalarial;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Marcelo");
		funcionario.setSalario(100.0);
		
		System.out.println("O funcionário: " + funcionario.getNome());
		System.out.println("Com salário = " + funcionario.getSalario());
		System.out.println("Terá o salário reajustado para: " + funcionario.calcularSalarioComAbono(15.0));
			
	}

}
