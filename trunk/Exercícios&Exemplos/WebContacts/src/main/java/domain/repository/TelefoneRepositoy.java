package main.java.domain.repository;

import main.java.domain.model.Telefone;

public interface TelefoneRepositoy {

	public Telefone salvar(Telefone novoTelefone);
	public Telefone atualizar(Telefone novoTelefone);
	public Telefone remover(Telefone novoTelefone);
	public Telefone procurarPorId(Integer idTelefone);
	
}
