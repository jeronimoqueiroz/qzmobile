package br.com.qzmobile.common.dao; 

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.qzmobile.common.bean.ClienteBean;
import br.com.qzmobile.common.bean.TaxaEntregaBean;
import br.com.qzmobile.common.dao.generic.AbstractGenericDAO;


@Repository("taxaEntregaDAO")
public class TaxaEntregaDAO extends AbstractGenericDAO<TaxaEntregaBean, Long> {

	private static final String GET_TAXA_BY_DISTANCIA =
			"SELECT * " +
			"FROM TAXA_ENTREGA " + 
			"WHERE ? between distancia_inicial and distancia_final " ;
	
    @Override
    public Class<TaxaEntregaBean> getClassType(){
        return TaxaEntregaBean.class;
    }
    
    public TaxaEntregaBean getTaxaByDistancia(double distancia) throws SQLException{
    	
    	TaxaEntregaBean bean = this.getRecord(GET_TAXA_BY_DISTANCIA, new Object[]{distancia});
    	
    	return bean;
    }
    

}
