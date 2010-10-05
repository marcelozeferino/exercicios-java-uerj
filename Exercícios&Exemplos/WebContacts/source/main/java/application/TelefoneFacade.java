package main.java.application;

import java.util.List;

import test.java.application.TelefoneFacadeTest;

import main.java.domain.model.Telefone;
import main.java.domain.model.Tipo;
import main.java.domain.repository.TelefoneRepositoy;

public class TelefoneFacade {

	private final int INDEX_RESIDENCIAL = 0;
	private final int INDEX_COMERCIAL = 1;
	
	private TelefoneRepositoy repository;
	
	public TelefoneFacade(TelefoneRepositoy repositoy){
		this.repository = repositoy;
	}
	
	public List<Tipo> obterTipos(){
		return repository.obterTipos();
	}
	
	public Tipo tipoResidencial(){
		
		return repository.obterTipos().get(INDEX_RESIDENCIAL);
	
	}
	
	public Tipo tipoComercial(){
		
		return repository.obterTipos().get(INDEX_COMERCIAL);
		
	}
	
	public Telefone salvar(Telefone novoTelefone){
		
		Integer telefoneSalvo = this.repository.salvar(novoTelefone);
		return this.repository.procurarPorId(telefoneSalvo);
		
		
	}
	
	public Telefone getTelefonePorNumero(String numero){
		return this.repository.procurarPorNumero(numero);
	}
	
}
