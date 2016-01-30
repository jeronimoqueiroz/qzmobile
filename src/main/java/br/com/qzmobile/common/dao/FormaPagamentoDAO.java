package br.com.qzmobile.common.dao; 

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.qzmobile.common.bean.FormaPagamentoBean;
import br.com.qzmobile.common.bean.PedidoBean;
import br.com.qzmobile.common.dao.generic.AbstractGenericDAO;


@Repository("formaPagamentoDAO")
public class FormaPagamentoDAO extends AbstractGenericDAO<FormaPagamentoBean, Long> {

    @Override
    public Class<FormaPagamentoBean> getClassType(){
        return FormaPagamentoBean.class;
    }
    
    
	private static final String GET_FORMA_BY_PEDIDO = "SELECT * "
			+ "FROM %tabInf% " + "WHERE ID_PEDIDO = ? ";
	
	private static final String UPDATE_FORMA_PAGAMENTO_PEDIDO = " UPDATE delivery.FORMA_PAGAMENTO "
			+ " SET vl_total = ?  WHERE id_pedido = ? ";

    
	
	public List<FormaPagamentoBean> getFormaByPedido(long idPedido) throws SQLException {

		return this.getRecordList(GET_FORMA_BY_PEDIDO, new Object[] { idPedido });
	}
	
	
	public void updateValorTotal(Long idPedido, double valor) {

		final Object[] parametros = new Object[] { valor, idPedido };
		this.jdbcTemplate.update(UPDATE_FORMA_PAGAMENTO_PEDIDO, parametros);

	}

    
}
