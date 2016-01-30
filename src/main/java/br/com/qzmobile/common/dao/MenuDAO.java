package br.com.qzmobile.common.dao; 

import org.springframework.stereotype.Repository;

import br.com.qzmobile.common.bean.MenuBean;
import br.com.qzmobile.common.dao.generic.AbstractGenericDAO;

@Repository("menuDAO")
public class MenuDAO extends AbstractGenericDAO<MenuBean, Long> {

    @Override
    public Class<MenuBean> getClassType(){
        return MenuBean.class;
    }

}
