package br.com.qzmobile.common.dao; 

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.qzmobile.common.bean.ItemPedidoBean;
import br.com.qzmobile.common.bean.TpEnderecoBean;
import br.com.qzmobile.common.dao.generic.AbstractGenericDAO;

/*
 * Gera��o autom�tica: 15/12/2013 
 */
@Repository("tpEnderecoDAO")
public class TpEnderecoDAO extends AbstractGenericDAO<TpEnderecoBean, Long> {

    @Override
    public Class<TpEnderecoBean> getClassType(){
        return TpEnderecoBean.class;
    }

    
	private static final String GET_ALL_BY_CLIENTE =
			"SELECT * " +
			"FROM %tabInf% " + 
			"WHERE ID_CLIENTE = ? " ;

	
	   public List<TpEnderecoBean> getAllByCliente(long idCliente) throws SQLException{
	    	
	    	return this.getRecordList(GET_ALL_BY_CLIENTE, new Object[]{idCliente});
	    }

}
