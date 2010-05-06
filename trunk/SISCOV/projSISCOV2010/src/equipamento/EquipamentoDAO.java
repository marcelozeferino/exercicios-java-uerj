package equipamento;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

import software.Software;
import usuario.Usuario;
import dao.DAO;
import fornecedor.Fornecedor;

public class EquipamentoDAO {

	
	Equipamento equipamento;
	Usuario usuario;
	Fornecedor fornecedor;
	Software software;
	DAO dao;
	
	
	
	public int alterar(Equipamento equipamento , Usuario usuario , Fornecedor fornecedor , Software software) throws SQLException, ClassNotFoundException{
	
		DAO dao = new DAO();
		dao.abrirConexao();
		
    	String sql = "update EQUIPAMENTO set nepat ='"+equipamento.getNepat()+"'," +
    										"licensaSO='"+equipamento.getLicencaSO()+"'," +
    										"nome='"+equipamento.getNome()+"'," +
    										"modelo='"+equipamento.getModelo()+"'," +
    										"tipo='"+equipamento.getTipo()+"'," +
    										"numeroSerie='"+equipamento.getNumeroSerie()+"'," +
    										"especicicacao='"+equipamento.getEspecificacao()+"'," +
    										"lacre='"+equipamento.getLacre()+"'," +
    										"dataAquisicao='"+equipamento.getDataAquisicao()+"'," +
    										"numeroFiscal='"+equipamento.getNumeroFiscal()+"'," +
    										"garantia='"+equipamento.getGarantia()+"'," +
    										"cnpj='"+fornecedor.getCNPJ()+"'," +
    										"matricula='"+usuario.getMatricula()+"'," +
    										"codigoSoftware='"+software.getCodigo()+"')";
    	int retorno = dao.atualizaSQL(sql);
    	dao.fecharConexao();
    	// se retorna 0, mal sucedido sucedida a atualização sql
		// se retronar 1 , bem sucedida a atualização sql
    	return retorno;
    	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int excluir(Equipamento equipamento) throws ClassNotFoundException, SQLException {
		
		DAO dao = new DAO();
		dao.abrirConexao();
		
		String sql = "delete * from EQUIPAMENTO where nepat = '"+equipamento.getNepat()+"'";
		
				
		int retorno = dao.atualizaSQL(sql);
    	dao.fecharConexao();
    	// se retorna 0, mal sucedido sucedida a atualização sql
		// se retronar 1 , bem sucedida a atualização sql
    	return retorno;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int cadastrar(Equipamento equipamento , Fornecedor fornecedor , Usuario usuario , Software software) throws ClassNotFoundException, SQLException{
	      
		DAO dao = new DAO();
		dao.abrirConexao();
    		
    	
    	String sql = "insert into EQUIPAMENTO(nepat, licensaSO, nome, modelo, tipo, numeroSerie, especificacao, lacre, dataAquisicao, numeroFiscal, garantia, cnpj, matricula, codigoSoftware) values('" +
    										equipamento.getNepat()+"','" +
    										equipamento.getLicencaSO()+"','" +
    										equipamento.getNome()+"','" +
    										equipamento.getModelo()+"','" +
    										equipamento.getTipo()+"','" +
    										equipamento.getNumeroSerie()+"','" +
    										equipamento.getEspecificacao()+"','" +
    										equipamento.getLacre()+"','" +
    										equipamento.getDataAquisicao()+"','" +
    										equipamento.getNumeroFiscal()+"','"+
    										equipamento.getGarantia()+"','"+
    										fornecedor.getCNPJ()+"','"+
    										usuario.getMatricula()+"','"+
    										software.getCodigo()+"')";
    	int retorno = dao.atualizaSQL(sql);
    	dao.fecharConexao();
    	// se retorna 0, mal sucedido sucedida a atualização sql
		// se retronar 1 , bem sucedida a atualização sql
    	return retorno;
    	
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public ArrayList<Equipamento> consultar(Equipamento equipamento) throws ClassNotFoundException, SQLException {
		
		DAO dao = new DAO();
		dao.abrirConexao();
		

		String sql = "select * from EQUIPAENTO where (nepat ='"+equipamento.getNepat()+"'or"+"nome like'%"+equipamento.getNome()+"%')";
		
		ResultSet resultSet = dao.selecionaSQL(sql);
		ArrayList<Equipamento> lista = new ArrayList<Equipamento>();
		
		while(resultSet.next()){
				lista.add((Equipamento) resultSet.getObject(resultSet.getRow()));
		}
			
		
		return lista;
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Vector listarEquipamento ()throws Exception{
		Vector vector = null;
		String sql = "";
		
		sql = "SELECT NOME FROM EQUIPAMENTO WHERE NOME = LIKE'%"+equipamento.getNome()+"%'";
		
		Statement statement = dao.getConnection().createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		
		while (resultSet.next()){
			vector.add(resultSet.getString("nome"));
			
		}
		resultSet.close();
		statement.close();
		return vector ;	
	}


}
