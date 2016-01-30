package br.com.qzmobile.common.dao; 

import org.springframework.stereotype.Repository;

import br.com.qzmobile.common.bean.PerfilMenuBean;
import br.com.qzmobile.common.dao.generic.AbstractGenericDAO;

/*
 * Geração automática: 15/08/2012 11:45:53
 */
@Repository("perfilMenuDAO")
public class PerfilMenuDAO extends AbstractGenericDAO<PerfilMenuBean, Long> {

    @Override
    public Class<PerfilMenuBean> getClassType(){
        return PerfilMenuBean.class;
    }

}
