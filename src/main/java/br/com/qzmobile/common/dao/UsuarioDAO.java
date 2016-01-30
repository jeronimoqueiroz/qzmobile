package br.com.qzmobile.common.dao; 

import org.springframework.stereotype.Repository;

import br.com.qzmobile.common.bean.UsuarioBean;
import br.com.qzmobile.common.dao.generic.AbstractGenericDAO;

/*
 * Geração automática: 15/08/2012 11:45:53
 */
@Repository("usuarioDAO")
public class UsuarioDAO extends AbstractGenericDAO<UsuarioBean, Long> {

    @Override
    public Class<UsuarioBean> getClassType(){
        return UsuarioBean.class;
    }

}
