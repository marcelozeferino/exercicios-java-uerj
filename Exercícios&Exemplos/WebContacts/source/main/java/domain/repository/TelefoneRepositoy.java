package main.java.domain.repository;

import java.util.List;

import main.java.domain.model.Telefone;
import main.java.domain.model.Tipo;

public interface TelefoneRepositoy {

	public void salvar(Telefone novoTelefone);
	public void atualizar(Telefone novoTelefone);
	public void remover(Telefone novoTelefone);
	public Telefone procurarPorNumero(String numero);
	public Telefone procurarPorId(Integer id);
	public List<Tipo> obterTipos();
	
}
