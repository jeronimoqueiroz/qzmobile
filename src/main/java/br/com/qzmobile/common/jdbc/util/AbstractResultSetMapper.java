package br.com.qzmobile.common.jdbc.util;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import br.com.qzmobile.common.bean.AbstractEngineBean;
import br.com.qzmobile.common.dao.generic.FieldItem;

public abstract class AbstractResultSetMapper<BEAN extends AbstractEngineBean> {
	
	protected List<FieldItem> itens;
	protected Class<BEAN> classBean;
	
	// -----------------------------------------------------------------------
	
	protected BEAN buildMappedBEAN(ResultSet rs){
		BEAN bean = null;
		try{
			
			bean = classBean.newInstance();
			for (FieldItem item : itens) {
				Field field = classBean.getDeclaredField(item.getAttributeName());
				buildAttribute(item, field, bean, rs);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return bean;
	}
	
	// -----------------------------------------------------------------------

	private void buildAttribute(FieldItem item, Field field, BEAN bean, ResultSet rs) throws IllegalArgumentException, IllegalAccessException, SQLException{
		if(item != null && item.getType() != null){
		field.setAccessible(true);
			switch (item.getType()) {
			case DATE:
				field.set(bean, rs.getTimestamp(item.getColumName()));
				break;
			case INTEGER:
				field.set(bean, rs.getInt(item.getColumName()));
				break;	
			case LONG:
				field.set(bean, rs.getLong(item.getColumName()));
				break;	
			case STRING:
				field.set(bean, rs.getString(item.getColumName()));
				break;
			case DOUBLE:
				field.set(bean, rs.getDouble(item.getColumName()));
				break;
			case BIGDECIMAL:
				field.set(bean, rs.getBigDecimal(item.getColumName()));
				break;	
			case BOOLEAN:
				field.set(bean, rs.getBoolean(item.getColumName()));
				break;	
			default:
				break;
			}
		}
	}

}
