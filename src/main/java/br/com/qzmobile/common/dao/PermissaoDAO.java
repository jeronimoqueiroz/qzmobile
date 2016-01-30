package br.com.qzmobile.common.dao; 

import org.springframework.stereotype.Repository;

import br.com.qzmobile.common.bean.PermissaoBean;
import br.com.qzmobile.common.dao.generic.AbstractGenericDAO;

/*
 * Gera��o: 26/11/2012 15:59:53
 */
@Repository("permissaoDAO")
public class PermissaoDAO extends AbstractGenericDAO<PermissaoBean, Long> {

    @Override
    public Class<PermissaoBean> getClassType(){
        return PermissaoBean.class;
    }

}
