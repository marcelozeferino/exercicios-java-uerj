package main.java.infrastructure.web;

import java.util.ArrayList;
import java.util.List;

import main.java.application.ContatoFacade;
import main.java.domain.model.Contato;

public class PesquisaContatoBean {

	private String nomeContato;
	private List<Contato> contatosEncontrados = new ArrayList<Contato>();
	private Integer pagina;
	private boolean buscaAutomatica = false;

	public final String getNomeContato() {
		return nomeContato;
	}

	public final void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}

	public final List<Contato> getContatosEncontrados() {
		return contatosEncontrados;
	}

	public final void setContatosEncontrados(List<Contato> contatosEncontrados) {
		this.contatosEncontrados = contatosEncontrados;
	}

	public final boolean isBuscaAutomatica() {
		return buscaAutomatica;
	}

	public final void setBuscaAutomatica(boolean buscaAutomatica) {
		this.buscaAutomatica = buscaAutomatica;
	}

	public final Integer getPagina() {
		return pagina;
	}

	public final void setPagina(Integer pagina) {
		this.pagina = pagina;
	}

	public String pesquisarContato() {

		contatosEncontrados.clear();
		contatosEncontrados.addAll(new ContatoFacade().obterContatoPorNome(nomeContato));

		return null;

	}

	public String pesquisarContatoAutomaticamente() {

		if (getNomeContato().length() >= 3 && isBuscaAutomatica() ) {
			contatosEncontrados.clear();
			contatosEncontrados.addAll(new ContatoFacade().obterContatoPorNome(nomeContato));
		}

		return null;

	}
	
}
