package br.com.qzmobile.common.dao; 

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.qzmobile.common.bean.ContaBean;
import br.com.qzmobile.common.bean.DescontoBean;
import br.com.qzmobile.common.dao.generic.AbstractGenericDAO;


@Repository("contaDAO")
public class ContaDAO extends AbstractGenericDAO<ContaBean, Long> {

    @Override
    public Class<ContaBean> getClassType(){
        return ContaBean.class;
    }
    
	private static final String GET_BY_TIPO_CONTA =
			"SELECT * " +
			"FROM %tabInf% " + 
			"WHERE id_tipo_conta = ? ";

	private static final String GET_ALL_ORDERED_BY_TIPO =
			"SELECT * " +
			"FROM %tabInf% " + 
			"ORDER BY id_tipo_conta ";

	
   public List<ContaBean> getByCliente(long idTipoConta) throws SQLException{
    	
    	return this.getRecordList(GET_BY_TIPO_CONTA, new Object[]{idTipoConta});
    }
   public List<ContaBean> getAllOrderedByTipo(long idTipoConta) throws SQLException{
   	
   	return this.getRecordList(GET_ALL_ORDERED_BY_TIPO, new Object[]{idTipoConta});
   }


}
