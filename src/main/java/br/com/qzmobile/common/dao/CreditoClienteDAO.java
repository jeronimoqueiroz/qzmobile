package br.com.qzmobile.common.dao; 

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.qzmobile.common.bean.CreditoClienteBean;
import br.com.qzmobile.common.bean.DescontoBean;
import br.com.qzmobile.common.bean.ItemPedidoBean;
import br.com.qzmobile.common.dao.generic.AbstractGenericDAO;


@Repository("creditoClienteDAO")
public class CreditoClienteDAO extends AbstractGenericDAO<CreditoClienteBean, Long> {

    @Override
    public Class<CreditoClienteBean> getClassType(){
        return CreditoClienteBean.class;
    }

    
    
	private static final String GET_BY_CLIENTE =
			"SELECT * " +
			"FROM %tabInf% " + 
			"WHERE id_cliente = ? " +
			"AND status = 'A' ";

	
   public List<CreditoClienteBean> getByCliente(long idCliente) throws SQLException{
    	
    	return this.getRecordList(GET_BY_CLIENTE, new Object[]{idCliente});
    }

}
