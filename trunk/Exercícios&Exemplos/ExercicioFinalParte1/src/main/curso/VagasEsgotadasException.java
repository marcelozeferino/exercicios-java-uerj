package main.curso;

public class VagasEsgotadasException extends Exception {
	
	public VagasEsgotadasException(){
		super("Não há vagas disponíveis para esta turma!");
	}

}
