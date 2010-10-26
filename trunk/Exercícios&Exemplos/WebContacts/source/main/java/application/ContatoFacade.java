package main.java.application;

import java.util.List;

import main.java.domain.model.Contato;
import main.java.domain.repository.ContatoRepository;
import main.java.infrastructure.persistence.ContatoRepositoryImpl;

public class ContatoFacade {
	
	private ContatoRepository repository;
	
	public ContatoFacade(){
		repository = new ContatoRepositoryImpl();
	}
	
	public ContatoFacade(ContatoRepository repository){
		this.repository = repository;
	}
	
	public Contato obterContatoPorId(int idContato){
		
		return  repository.procurarPorId(idContato);
		
	}
	
	public List<Contato> obterContatoPorNome(String nomeDoContato){
		
		return repository.procurarPorNome(nomeDoContato);
		
	}
	
	public Contato salvar(Contato novoContato){
		return repository.salvar(novoContato);
	}
	
}
