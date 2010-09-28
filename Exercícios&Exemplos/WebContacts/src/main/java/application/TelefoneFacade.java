package main.java.application;

import main.java.domain.repository.TelefoneRepositoy;

public class TelefoneFacade {

	private TelefoneRepositoy repositoy;
	
	public TelefoneFacade(TelefoneRepositoy repositoy){
		this.repositoy = repositoy;
	}
}
