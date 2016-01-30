package br.com.qzmobile.common.dao; 

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.qzmobile.common.bean.DescontoBean;
import br.com.qzmobile.common.bean.ItemPedidoBean;
import br.com.qzmobile.common.dao.generic.AbstractGenericDAO;


@Repository("descontoDAO")
public class DescontoDAO extends AbstractGenericDAO<DescontoBean, Long> {

    @Override
    public Class<DescontoBean> getClassType(){
        return DescontoBean.class;
    }

    
    
	private static final String GET_BY_CLIENTE =
			"SELECT * " +
			"FROM %tabInf% " + 
			"WHERE id_cliente = ? ";

	
   public List<DescontoBean> getByCliente(long idCliente) throws SQLException{
    	
    	return this.getRecordList(GET_BY_CLIENTE, new Object[]{idCliente});
    }

}
