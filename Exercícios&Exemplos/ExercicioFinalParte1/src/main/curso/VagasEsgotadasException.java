package main.curso;

public class VagasEsgotadasException extends Exception {
	
	public VagasEsgotadasException(){
		super("N�o h� vagas dispon�veis para esta turma!");
	}

}
