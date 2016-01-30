package br.com.qzmobile.common.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.qzmobile.common.bean.ClienteBean;


@Repository("clienteDAOExt")
public class ClienteDAOExt extends ClienteDAO {

	private static final String GET_ALL_BY_FILIAL =
			"SELECT * " +
			"FROM CLIENTE " + 
			"WHERE ID_FILIAL = ? " ;
	
	
	
	private static final String GET_ALL_FILTRO =
			"SELECT * " +
			"FROM CLIENTE WHERE 1 = 1 ";
	
	private static final String AND_NOME = " AND upper(NM_CLIENTE) LIKE '";
	private static final String AND_CPF = " AND CPF LIKE '%";
	private static final String AND_TELEFONE = " AND TELEFONE LIKE '%";
	private static final String AND_EMAIL = " AND EMAIL LIKE '%";
	
	

	private static final String GET_CLIENTE_BY_ITEM_PEDIDO =
			"SELECT * " +
			"FROM CLIENTE CLI, PEDIDO PED, ITEM_PEDIDO IP " +
			" WHERE IP.ID_PEDIDO = PED.ID " +
			" AND PED.ID_CLIENTE = CLI.ID " +
			" AND IP.ID = ? " ;	
	
	private static final String GET_CLIENTE_BY_ID_PEDIDO =
			"SELECT * " +
			"FROM CLIENTE CLI, PEDIDO PED " +
			" WHERE PED.ID_CLIENTE = CLI.ID  " +
			" AND PED.ID = ? " ;	
	// -------------------------------------------------------------------------------------
	
	
	public List<ClienteBean> getAllFintro(String nmCliente, String email, String telefone, String cpf) throws SQLException{
    	
		String query = GET_ALL_FILTRO;
		
		if(nmCliente != null && !"".equals(nmCliente)  ){
			query += AND_NOME+nmCliente.toUpperCase() +"%'";
		}
		
		if(email != null && !"".equals(email)  ){
			query += AND_EMAIL+ email +"%'";
		}
		
		if(telefone != null && !"".equals(telefone)  ){
			query += AND_TELEFONE+ telefone +"%'";
		}
		
		if(cpf != null && !"".equals(cpf)  ){
			query += AND_CPF+ cpf +"%'";
		}
		
		
    	return this.getRecordList(query);
    } 
	
	
	
	   public List<ClienteBean> getAllByFilial(long idFilial) throws SQLException{
	    	
	    	return this.getRecordList(GET_ALL_BY_FILIAL, new Object[]{idFilial});
	    }
	   public List<ClienteBean> getClienteByItemPedido(long idItemPedido) throws SQLException{
	    	
	    	return this.getRecordList(GET_CLIENTE_BY_ITEM_PEDIDO, new Object[]{idItemPedido});
	    }
	   
	   public List<ClienteBean> getClienteByIdPedido(long idIdPedido) throws SQLException{
	    	
	    	return this.getRecordList(GET_CLIENTE_BY_ID_PEDIDO, new Object[]{idIdPedido});
	    }
}
