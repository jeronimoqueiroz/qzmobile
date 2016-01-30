package br.com.qzmobile.common.dao; 

import org.springframework.stereotype.Repository;

import br.com.qzmobile.common.bean.ItemPedidoBean;
import br.com.qzmobile.common.bean.PedidoBean;
import br.com.qzmobile.common.dao.generic.AbstractGenericDAO;

/*
 * Gera��o autom�tica: 19/12/2012 
 */
@Repository("pedidoDAO")
public class PedidoDAO extends AbstractGenericDAO<PedidoBean, Long> {

    @Override
    public Class<PedidoBean> getClassType(){
        return PedidoBean.class;
    }

}
