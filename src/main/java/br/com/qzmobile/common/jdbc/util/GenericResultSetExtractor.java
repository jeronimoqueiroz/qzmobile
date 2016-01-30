package br.com.qzmobile.common.jdbc.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import br.com.qzmobile.common.bean.AbstractEngineBean;
import br.com.qzmobile.common.dao.generic.FieldItem;

public class GenericResultSetExtractor<BEAN extends AbstractEngineBean> extends AbstractResultSetMapper<BEAN> implements ResultSetExtractor<BEAN> {

	
	public GenericResultSetExtractor(List<FieldItem> itens, Class<BEAN> classBean){
		this.itens = itens;
		this.classBean = classBean;
	}
	
	// --------------------------------------------------------------------------------
	
	public BEAN extractData(ResultSet rs) throws SQLException, DataAccessException {
		rs.next();
		BEAN bean = this.buildMappedBEAN(rs);
		return bean;
	}
}
