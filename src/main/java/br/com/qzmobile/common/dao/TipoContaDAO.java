package br.com.qzmobile.common.dao; 

import org.springframework.stereotype.Repository;

import br.com.qzmobile.common.bean.TipoContaBean;
import br.com.qzmobile.common.dao.generic.AbstractGenericDAO;


@Repository("tipoContaDAO")
public class TipoContaDAO extends AbstractGenericDAO<TipoContaBean, Long> {

    @Override
    public Class<TipoContaBean> getClassType(){
        return TipoContaBean.class;
    }

}
