package main.java.domain.repository;

import java.util.List;

import main.java.domain.model.Contato;

public interface ContatoRepository {
	
	public Contato salvar(Contato novoContato);
	public void atualizar(Contato novoContato);
	public void remover(Contato novoContato);
	public Contato procurarPorId(Integer idContato);
	public List<Contato> obterSubContatos(Contato contatoPrincipal);
	

}
