package br.com.qzmobile.common.dao; 

import org.springframework.stereotype.Repository;

import br.com.qzmobile.common.bean.PerfilPermissaoBean;
import br.com.qzmobile.common.dao.generic.AbstractGenericDAO;


@Repository("perfilPermissaoDAO")
public class PerfilPermissaoDAO extends AbstractGenericDAO<PerfilPermissaoBean, Long> {

    @Override
    public Class<PerfilPermissaoBean> getClassType(){
        return PerfilPermissaoBean.class;
    }

}
