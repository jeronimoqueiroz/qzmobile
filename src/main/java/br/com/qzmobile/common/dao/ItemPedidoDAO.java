package br.com.qzmobile.common.dao; 

import org.springframework.stereotype.Repository;

import br.com.qzmobile.common.bean.ItemPedidoBean;
import br.com.qzmobile.common.dao.generic.AbstractGenericDAO;

/*
 * Gera��o autom�tica: 19/12/2012 
 */
@Repository("itemPedidoDAO")
public class ItemPedidoDAO extends AbstractGenericDAO<ItemPedidoBean, Long> {

    @Override
    public Class<ItemPedidoBean> getClassType(){
        return ItemPedidoBean.class;
    }

}
