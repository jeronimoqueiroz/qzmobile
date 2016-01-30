package br.com.qzmobile.common.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.qzmobile.common.bean.ProdutoBean;


@Repository("produtoDAOExt")
public class ProdutoDAOExt extends ProdutoDAO {

	private static final String GET_ALL_BY_FILIAL =
			"SELECT * " +
			"FROM PRODUTO " + 
			"WHERE ID_FILIAL = ? " ;
	
	private static final String GET_ALL_BY_TP_PRODUTO_ORDERED =
			"SELECT * " +
			"FROM PRODUTO " + 
			"WHERE TP_PRODUTO LIKE '%Salgado%' " +
			"ORDER BY SG_PRODUTO ASC " ;
	// -------------------------------------------------------------------------------------
	
	
	   public List<ProdutoBean> getAllByFilial(long idFilial) throws SQLException{
	    	
	    	return this.getRecordList(GET_ALL_BY_FILIAL, new Object[]{idFilial});
	    }

	   public List<ProdutoBean> getAllByTpProdutoOrdered() throws SQLException{
	    	
	    	return this.getRecordList(GET_ALL_BY_TP_PRODUTO_ORDERED, new Object[]{});
	    }  
}
