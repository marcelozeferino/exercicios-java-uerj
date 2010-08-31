package test.funcionario;

import static org.junit.Assert.assertTrue;
import main.funcionario.FuncionarioCLT;

import org.junit.Test;

public class FuncionarioTest {

	@Test
	public void testCalcularSalario() {
		
		FuncionarioCLT fun = new FuncionarioCLT();
		fun.setSalario(200.0);
		fun.setPercentDesconto(10.0);
		
		assertTrue(fun.calcularSalario().equals(180.0));
		
	}

}
