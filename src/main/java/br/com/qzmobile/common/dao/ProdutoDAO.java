package br.com.qzmobile.common.dao; 

import org.springframework.stereotype.Repository;

import br.com.qzmobile.common.bean.ProdutoBean;
import br.com.qzmobile.common.dao.generic.AbstractGenericDAO;


@Repository("produtoDAO")
public class ProdutoDAO extends AbstractGenericDAO<ProdutoBean, Long> {

    @Override
    public Class<ProdutoBean> getClassType(){
        return ProdutoBean.class;
    }

}
