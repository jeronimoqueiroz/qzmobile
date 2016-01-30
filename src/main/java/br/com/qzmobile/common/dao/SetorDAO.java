package br.com.qzmobile.common.dao; 

import org.springframework.stereotype.Repository;

import br.com.qzmobile.common.bean.SetorBean;
import br.com.qzmobile.common.dao.generic.AbstractGenericDAO;

/*
 * Gera��o autom�tica: 16/12/2012 
 */
@Repository("setorDAO")
public class SetorDAO extends AbstractGenericDAO<SetorBean, Long> {

    @Override
    public Class<SetorBean> getClassType(){
        return SetorBean.class;
    }

}
