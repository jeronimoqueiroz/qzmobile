package br.com.qzmobile.common.dao; 

import org.springframework.stereotype.Repository;

import br.com.qzmobile.common.bean.MotoristaBean;
import br.com.qzmobile.common.dao.generic.AbstractGenericDAO;


@Repository("motoristaDAO")
public class MotoristaDAO extends AbstractGenericDAO<MotoristaBean, Long> {

    @Override
    public Class<MotoristaBean> getClassType(){
        return MotoristaBean.class;
    }
    
}
