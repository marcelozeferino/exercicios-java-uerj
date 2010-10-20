package main.java.application;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import main.java.domain.model.Telefone;
import main.java.domain.model.Tipo;
import main.java.domain.repository.TelefoneRepositoy;
import main.java.infrastructure.persistence.TelefoneRepositoryImpl;

public class TelefoneFacade {
	
	private final int INDEX_COMERCIAL = 0;
	private final int INDEX_RESIDENCIAL = 1;
	
	private TelefoneRepositoy repository;
	
	public TelefoneFacade(){
		this.repository = new TelefoneRepositoryImpl();
	}
	
	public TelefoneFacade(TelefoneRepositoy repositoy){
		this.repository = repositoy;
	}
	
	public List<Tipo> obterTipos(){
		return repository.obterTipos();
	}
	
	public Map<String, Tipo> obterMapaTipos(){
		
		Map<String, Tipo> mapaDeTipos = new TreeMap<String, Tipo>();
		
		for(Tipo tipo : repository.obterTipos()){
			mapaDeTipos.put(tipo.getDescricao(), tipo);
		}
		
		return mapaDeTipos;
		
	}
	
	public Tipo tipoResidencial(){
		
		return repository.obterTipos().get(INDEX_RESIDENCIAL);
	
	}
	
	public Tipo tipoComercial(){
		
		return repository.obterTipos().get(INDEX_COMERCIAL);
		
	}
	
	public Telefone salvar(Telefone novoTelefone){
		
		this.repository.salvar(novoTelefone);
		return this.repository.procurarPorNumero(novoTelefone.getNumero());
		
		
	}
	
	public Telefone getTelefonePorNumero(String numero){
		return this.repository.procurarPorNumero(numero);
	}
	
}
