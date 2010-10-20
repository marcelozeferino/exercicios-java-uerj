package main.java.infrastructure.web;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.servlet.http.HttpServletRequest;

import main.java.application.ContatoFacade;
import main.java.application.TelefoneFacade;
import main.java.domain.model.Contato;
import main.java.domain.model.Telefone;
import main.java.domain.model.Tipo;


public class ContatosBean {
	
	private static final String MENSAGEM_SUCESSO = "Registro salvo com sucesso.";
	private static final String MENSAGEM_ERRO = "Dados inválidos, preencha com o nome do contato e ao menos um telefone.";
	
	private Contato contato = new Contato();
	private Telefone telefone = new Telefone();
	private List<Telefone> telefones = new ArrayList<Telefone>();
		
	public final Contato getContato() {
		return contato;
	}
	public final void setContato(Contato contato) {
		this.contato = contato;
	}
	public final List<Telefone> getTelefones() {
		return telefones;
	}
	public final void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	
	public final Telefone getTelefone() {
		return telefone;
	}
	public final void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	
	
	public SelectItem[] getTiposCadastrados(){
			
		List<Tipo> tiposCadastrados = new TelefoneFacade().obterTipos();

		SelectItem[] tipoItems = new SelectItem[tiposCadastrados.size()];
		
		for (int i = 0; i < tipoItems.length; i++) {
			
			tipoItems[i] = new SelectItem(tiposCadastrados.get(i), tiposCadastrados.get(i).getDescricao());
			
		}
		
		return tipoItems;
		
	}
	
	public String adicionarTelefone(){
		
		Telefone newTelefone = new Telefone();
		newTelefone.setNumero(telefone.getNumero());
		
		String descricaoTipo = this.telefone.getTipo().getDescricao();
		newTelefone.setTipo( new TelefoneFacade().obterMapaTipos().get(descricaoTipo) );
		
		telefones.add(newTelefone);
		
		this.limpar();
		
		return null;
		
	}
	

	public String limpar(){
		this.telefone = new Telefone();
		return null;
	}
	
	public String limparForm(){
		
		this.contato = new Contato();
		this.telefones.clear();
		limpar();
		
		return null;
		
	}
	
	public String alterar(){
		
		FacesContext context = FacesContext.getCurrentInstance();
		HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();
		Telefone telefoneSelecionado = (Telefone) request.getAttribute("telefone");
		
		this.getTelefones().remove(telefoneSelecionado);
		
		this.telefone = telefoneSelecionado;
	
		return null;
		
	}
	
	public String excluir(){
		
		FacesContext context = FacesContext.getCurrentInstance();
		HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();
		Telefone telefoneSelecionado = (Telefone) request.getAttribute("telefone");
		
		this.getTelefones().remove(telefoneSelecionado);
		
		return null;
		
	}
	
	public String removerTelefone(){
		return null;
	}
	
	public String salvar(){
		
		FacesMessage mensagem = new FacesMessage();
		
		if (!this.contato.getNome().isEmpty() && this.telefones.size() > 0){
			
			try{
	
				Contato contatoSalvo = new ContatoFacade().salvar(this.contato);
				
				if (contatoSalvo != null){
					
					for (Telefone telefone : this.getTelefones()){
						telefone.setContato(contatoSalvo);
						new TelefoneFacade().salvar(telefone);
					}
					
				}	
				
				mensagem.setDetail(MENSAGEM_SUCESSO);
				mensagem.setSeverity(FacesMessage.SEVERITY_INFO);
				
			}catch (Exception e) {
				mensagem.setDetail(e.getMessage());
				mensagem.setSeverity(FacesMessage.SEVERITY_ERROR);
			}
			
			
			
		}else{
			
			mensagem.setDetail(MENSAGEM_ERRO);
			mensagem.setSeverity(FacesMessage.SEVERITY_ERROR);
			
		}
		
		
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, mensagem);
				
		return null;
		
	}
 	

}
