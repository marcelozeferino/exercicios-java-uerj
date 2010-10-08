package main.java.application;

import main.java.domain.model.Contato;
import main.java.domain.repository.ContatoRepository;

public class ContatoFacade {
	
	private ContatoRepository repository;
	
	public ContatoFacade(ContatoRepository repository){
		this.repository = repository;
	}
	
	public Contato obterContatoPorId(int idContato){
		
		return  repository.procurarPorId(idContato);
		
	}
	
	public Contato salvar(Contato novoContato){
		return repository.salvar(novoContato);
	}
	
}
