package br.com.qzmobile.common.dao;

import org.springframework.stereotype.Repository;

import br.com.qzmobile.common.bean.StatusAtividadeBean;
import br.com.qzmobile.common.dao.generic.AbstractGenericDAO;
@Repository("statusAtividadeDAO")
public class StatusAtividadeDAO  extends AbstractGenericDAO<StatusAtividadeBean, Long> {

    @Override
    public Class<StatusAtividadeBean> getClassType(){
        return StatusAtividadeBean.class;
    }

}
