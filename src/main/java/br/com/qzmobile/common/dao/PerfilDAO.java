package br.com.qzmobile.common.dao; 

import org.springframework.stereotype.Repository;

import br.com.qzmobile.common.bean.PerfilBean;
import br.com.qzmobile.common.dao.generic.AbstractGenericDAO;

/*
 * Geração automática: 15/08/2012 11:45:53
 */
@Repository("perfilDAO")
public class PerfilDAO extends AbstractGenericDAO<PerfilBean, Long> {

    @Override
    public Class<PerfilBean> getClassType(){
        return PerfilBean.class;
    }

}
