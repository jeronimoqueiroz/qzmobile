package br.com.qzmobile.common.dao; 

import org.springframework.stereotype.Repository;

import br.com.qzmobile.common.bean.ContaBancariaBean;
import br.com.qzmobile.common.dao.generic.AbstractGenericDAO;


@Repository("contaBancariaDAO")
public class ContaBancariaDAO extends AbstractGenericDAO<ContaBancariaBean, Long> {

    @Override
    public Class<ContaBancariaBean> getClassType(){
        return ContaBancariaBean.class;
    }
    

}
