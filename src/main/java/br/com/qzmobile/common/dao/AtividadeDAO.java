package br.com.qzmobile.common.dao;

import br.com.qzmobile.common.bean.AtividadeBean;
import br.com.qzmobile.common.dao.generic.AbstractGenericDAO;

public class AtividadeDAO  extends AbstractGenericDAO<AtividadeBean, Long> {

    @Override
    public Class<AtividadeBean> getClassType(){
        return AtividadeBean.class;
    }

}
