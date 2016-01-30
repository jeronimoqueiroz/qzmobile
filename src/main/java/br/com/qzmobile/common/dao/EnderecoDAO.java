package br.com.qzmobile.common.dao; 

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.qzmobile.common.bean.ClienteBean;
import br.com.qzmobile.common.bean.EnderecoBean;
import br.com.qzmobile.common.dao.generic.AbstractGenericDAO;

/*
 * Gera��o autom�tica: 15/12/2013 
 */
@Repository("enderecoDAO")
public class EnderecoDAO extends AbstractGenericDAO<EnderecoBean, Long> {

    @Override
    public Class<EnderecoBean> getClassType(){
        return EnderecoBean.class;
    }
    
	private static final String GET_ENDERECO_BY_CLIENTE =
			"SELECT * " +
			"FROM ENDERECO END, CLIENTE CLI " +
			" WHERE END.ID_CLIENTE = CLI.ID " +
			" AND CLI.ID = ? " ;
	
	
	private static final String GET_ENDERECO_BY_CLIENTE_TP_ENDERECO =
			"SELECT END.* " +
			"FROM ENDERECO END, TP_ENDERECO TP " +
			" WHERE END.ID_CLIENTE = TP.id_cliente " +
			" AND END.ID_CLIENTE = ? "+
			" AND TP.ID = ? ";
			
	
 
	   public List<EnderecoBean> getEnderecoByCliente(long idCliente) throws SQLException{
	    	
	    	return this.getRecordList(GET_ENDERECO_BY_CLIENTE, new Object[]{idCliente});
	    }  
	   
	   public List<EnderecoBean> getEnderecoByClienteTpEndereco(long idCliente, long idTpEndereco) throws SQLException{
	    	
	    	return this.getRecordList(GET_ENDERECO_BY_CLIENTE_TP_ENDERECO, new Object[]{idCliente, idTpEndereco});
	    }

}
