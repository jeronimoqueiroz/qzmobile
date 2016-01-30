package br.com.qzmobile.common.dao; 

import org.springframework.stereotype.Repository;

import br.com.qzmobile.common.bean.FilialBean;
import br.com.qzmobile.common.dao.generic.AbstractGenericDAO;

/*
 * Gera��o autom�tica: 16/12/2012 
 */
@Repository("filialDAO")
public class FilialDAO extends AbstractGenericDAO<FilialBean, Long> {

    @Override
    public Class<FilialBean> getClassType(){
        return FilialBean.class;
    }

}
