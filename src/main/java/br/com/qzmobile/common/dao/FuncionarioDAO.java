package br.com.qzmobile.common.dao; 

import org.springframework.stereotype.Repository;

import br.com.qzmobile.common.bean.FuncionarioBean;
import br.com.qzmobile.common.dao.generic.AbstractGenericDAO;

/*
 * Gera��o autom�tica: 16/12/2012 
 */
@Repository("funcionarioDAO")
public class FuncionarioDAO extends AbstractGenericDAO<FuncionarioBean, Long> {

    @Override
    public Class<FuncionarioBean> getClassType(){
        return FuncionarioBean.class;
    }

}
