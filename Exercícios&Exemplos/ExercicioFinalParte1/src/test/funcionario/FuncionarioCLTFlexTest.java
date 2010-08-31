package test.funcionario;

import static org.junit.Assert.assertTrue;
import main.funcionario.FuncionarioCLTFlex;

import org.junit.Test;

public class FuncionarioCLTFlexTest {

	@Test
	public void testCalcularSalario() {
		
		FuncionarioCLTFlex fun = new FuncionarioCLTFlex();
		fun.setSalario(200.0);
		fun.setPercentDesconto(10.0);
		fun.setCotaUtilidade(100.0);
		
		assertTrue(fun.calcularSalario().equals(280.0));
		
	}

}
