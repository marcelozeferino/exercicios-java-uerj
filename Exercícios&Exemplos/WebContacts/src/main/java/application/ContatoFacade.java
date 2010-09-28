package main.java.application;

import main.java.domain.repository.ContatoRepository;

public class ContatoFacade {

	private ContatoRepository repository;
	
	public ContatoFacade(ContatoRepository repository){
		this.repository = repository;
	}
	
	
}
