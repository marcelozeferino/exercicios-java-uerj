package parte3.abonosalarial;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Marcelo");
		funcionario.setSalario(100.0);
		
		System.out.println("O funcion�rio: " + funcionario.getNome());
		System.out.println("Com sal�rio = " + funcionario.getSalario());
		System.out.println("Ter� o sal�rio reajustado para: " + funcionario.calcularSalarioComAbono(15.0));
			
	}

}
