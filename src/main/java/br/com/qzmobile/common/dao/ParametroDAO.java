package br.com.qzmobile.common.dao; 

import org.springframework.stereotype.Repository;

import br.com.qzmobile.common.bean.ParametroBean;
import br.com.qzmobile.common.dao.generic.AbstractGenericDAO;

/*
 * Geração automática: 15/08/2012 11:45:53
 */
@Repository("parametroDAO")
public class ParametroDAO extends AbstractGenericDAO<ParametroBean, Long> {

    @Override
    public Class<ParametroBean> getClassType(){
        return ParametroBean.class;
    }

}
