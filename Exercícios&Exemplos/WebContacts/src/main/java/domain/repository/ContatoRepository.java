package main.java.domain.repository;

import main.java.domain.model.Contato;

public interface ContatoRepository {
	
	public Contato salvar(Contato novoTelefone);
	public Contato atualizar(Contato novoTelefone);
	public Contato remover(Contato novoTelefone);
	public Contato procurarPorId(Integer idContato);
	

}
