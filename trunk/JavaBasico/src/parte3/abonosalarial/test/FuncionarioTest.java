package parte3.abonosalarial.test;

import junit.framework.TestCase;

import org.junit.Test;

import parte3.abonosalarial.Funcionario;



public class FuncionarioTest extends TestCase {
	
	@Test
	public void testCalcularSalarioComAbono(){
		
		Funcionario func = new Funcionario();
		func.setNome("Marcelo");
		func.setSalario(100.0);
		
		double percentAbono = 10.0;
		double salarioComAbono = func.calcularSalarioComAbono(percentAbono);
		
		double abono = func.getSalario() * (percentAbono/100);
		
		double novoSalario = abono + func.getSalario();
		
		assertEquals(novoSalario, salarioComAbono);
		
	}

}
