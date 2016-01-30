package br.com.qzmobile.common.jdbc.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import br.com.qzmobile.common.bean.AbstractEngineBean;
import br.com.qzmobile.common.dao.generic.FieldItem;


public class GenericRowMapper<BEAN extends AbstractEngineBean> extends AbstractResultSetMapper<BEAN> implements RowMapper<BEAN>{
	
	public GenericRowMapper(List<FieldItem> itens,Class<BEAN> classBean){
		this.itens = itens;
		this.classBean = classBean;
	}

	// --------------------------------------------------------------------------------

	public BEAN mapRow(ResultSet rs, int arg1) throws SQLException {
		BEAN bean = this.buildMappedBEAN(rs);
		return bean;
	}

}
