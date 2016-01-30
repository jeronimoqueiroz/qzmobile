package br.com.qzmobile.common.dao; 

import org.springframework.stereotype.Repository;

import br.com.qzmobile.common.bean.ClienteBean;
import br.com.qzmobile.common.dao.generic.AbstractGenericDAO;

/*
 * Gera��o autom�tica: 19/12/2012 
 */
@Repository("clienteDAO")
public class ClienteDAO extends AbstractGenericDAO<ClienteBean, Long> {

    @Override
    public Class<ClienteBean> getClassType(){
        return ClienteBean.class;
    }

}
