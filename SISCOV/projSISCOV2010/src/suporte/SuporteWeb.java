package suporte;

import java.sql.SQLException;

import tecnico.Tecnico;

import chamado.Chamado;


public class SuporteWeb extends Area {

  private int codigo;
  
  
  

	public int getCodigo() {
	return codigo;
}

	
public void setCodigo(int codigo) {
	this.codigo = codigo;
}







	public SuporteWeb() {
	}
	
	
	


public SuporteWeb(int codigo, String nome, String tipoSuporte,
		String comentario, String tipoAtendimento, Chamado chamado,
		Tecnico tecnico) throws SQLException {
	super(codigo, nome, tipoSuporte, comentario, tipoAtendimento, chamado, tecnico);	
	
}






public void alterar(SuporteWeb area) {
	
	
	
}


public void excluir(SuporteWeb area) {
	// TODO Auto-generated method stub
	
}


public void incluir(SuporteWeb area) {

	
}


public void pesquisar(SuporteWeb area) {
	// TODO Auto-generated method stub
	
}
}