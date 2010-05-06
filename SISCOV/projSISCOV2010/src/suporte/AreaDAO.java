package suporte;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import tecnico.Tecnico;

import chamado.Chamado;

import dao.DAO;




public class AreaDAO {
	
	
	private Tecnico tecnico;
	private Chamado chamado;
	private Area area;
	private DAO dao;
	
	
	
	
	
	
	
	
	





	public int alterarArea(Area area) throws SQLException, ClassNotFoundException{
		
    	String sql = "update AREA set codigo ='"+area.getCodigo()+"'," +
    										"tipoSuporte='"+area.getTipoSuporte()+"'," +
    										"comentario='"+area.getComentario()+"'," +
    										"tipoAtendimento='"+area.getTipoAtendimento()+"'," + 
    										"numeroChamado='"+chamado.getNumero()+"'," +
    										"matricula='"+tecnico.getMatricula()+"')";

    	return dao.atualizaSQL(sql);
		
	}
	
	
	
	public int excluirArea(Area area) throws SQLException, ClassNotFoundException {
		
	      String sql = "delete * from AREA where codigo = '"+area.getCodigo()+"'";
	      return dao.atualizaSQL(sql);
	}
	
	
	

	
	
	public int cadastrarArea(Area area) throws SQLException, ClassNotFoundException{
	      
    		
    	String sql = "insert into AREA(codigo, tipoSuporte, comentario, tipoAtendimento, numeroChamado, matricula) values('" +
    										area.getCodigo()+"','" +
    										area.getTipoSuporte()+"','" +
    										area.getComentario()+"','" +
    										area.getTipoAtendimento()+"','" +
    										chamado.getNumero()+"','" +
    										tecnico.getMatricula()+"')";
    										
    	// se retorna 0, mal sucedido sucedida a atualização sql
		// se retronar 1 , bem sucedida a atualização sql
    	return dao.atualizaSQL(sql);
    	
    }
	
	
	
	
	
	
	
	
	
	
	
	public List<Area> consultarArea(Area area) throws SQLException, ClassNotFoundException{
		
		List<Area> lista = new ArrayList<Area>();
		String sql = "";
				
		sql = "select * from AREA where (codigo='"+area.getCodigo()+"'or"+"nome like'%"+area.getNome()+"%')";
		
		ResultSet rs = dao.selecionaSQL(sql); 
		while(rs.next()){
			lista.add((Area)rs.getObject("nome"));
		}

		return lista;	
	}
	
	
	
	
	
	

	
}
