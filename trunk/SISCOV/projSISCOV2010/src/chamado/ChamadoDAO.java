package chamado;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import suporte.Area;
import tecnico.Tecnico;
import usuario.Usuario;

import manutencao.Manutencao;

import dao.DAO;
import equipamento.Equipamento;



public class ChamadoDAO {
	
	Chamado chamado;
	Usuario usuario;
	Area area;
	Equipamento equipamento;
	Tecnico tecnico;
	Manutencao manutencao;
	
	
	public ChamadoDAO() {
	}
		
	

	
	public ChamadoDAO(Chamado chamado, Usuario usuario, Area area,
			Equipamento equipamento, Tecnico tecnico) {
		super();
		this.chamado = chamado;
		this.usuario = usuario;
		this.area = area;
		this.equipamento = equipamento;
		this.tecnico = tecnico;
	}



	public int alterar(Chamado chamado , Usuario usuario , 	Area area , Equipamento equipamento , Tecnico tecnico , Manutencao manutencao) throws SQLException, ClassNotFoundException{
		
    	String sql = "update CHAMADO set	 numero ='"+chamado.getNumero()+"'," +
    										"problema='"+chamado.getProblema()+"'," +
    										"severidade='"+chamado.getSeveridade()+"'," +
    										"data='"+chamado.getData()+"'," + 
    										"hora='"+chamado.getHora()+"'," +
    										"matriculaUsuario='"+usuario.getMatricula()+"'," +
    										"codigoArea='"+area.getCodigo()+"'," +
    										"nepat='"+equipamento.getNepat()+"'," +
    										"matriculaTecnico='"+tecnico.getMatricula()+"'," +
    										"codigoStatus='"+manutencao.getStatus()+"'" +
    										"')";
		DAO dao = new DAO();
		return dao.atualizaSQL(sql);
		
	}
	
	
	
	
	// excluir......
	public int excluir(Chamado chamado) throws SQLException, ClassNotFoundException{

	      String sql = "delete * from CHAMADO where numero = '"+chamado.getNumero()+"'";
	      
	      DAO dao = new DAO();
	      return dao.atualizaSQL(sql);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int abrirChamado(Chamado chamado , Usuario usuario , Area area , Equipamento equipamento , Tecnico tecnico , Manutencao manutencao) throws SQLException, ClassNotFoundException {

    	String sql = "insert into CHAMADO(numero, problema, severidade, data, hora, matriculaUsuario, " +
    									", nepat, matriculaTecnico , codigoArea , codigoStatus ) values('" +
									    	chamado.getNumero()+"','" +
											chamado.getProblema()+"','" +
											chamado.getSeveridade()+"','" +
											chamado.getData()+"','" + 
											chamado.getHora()+"','" +
											usuario.getMatricula()+"','" +
											equipamento.getNepat()+"','" +
											tecnico.getMatricula()+"','" +
											area.getCodigo()+"','" +
											manutencao.getStatus()+")";
											
											
    	
    	// se retorna 0, mal sucedido sucedida a atualização sql
		// se retronar 1 , bem sucedida a atualização sql
    	DAO dao = new DAO();
	    return dao.atualizaSQL(sql);
    	
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Chamado pesquisar(Chamado chamado) throws SQLException, ClassNotFoundException{
		
		
		String sql = "select * from CHAMADO where numero='"+chamado.getNumero()+"'";
		
		DAO dao = new DAO();
	    ResultSet resultSet = dao.selecionaSQL(sql);
	    
	    return (Chamado)resultSet.getObject(1);
		
	}
	

	
	
	/// excluir...............
	public ArrayList<Integer> listar ()throws SQLException, ClassNotFoundException{
	
		String sql = "SELECT NUMERO FROM CHAMADO WHERE NUMERO = '"+chamado.getNumero()+"'";
		
		DAO dao = new DAO();
		ResultSet resultSet = dao.selecionaSQL(sql);
		 
		ArrayList<Integer> collection = new ArrayList<Integer>();
		while(resultSet.next()){
			collection.add(Integer.parseInt(resultSet.getString(1)));
		}
		
		return collection;
			
	}



}
