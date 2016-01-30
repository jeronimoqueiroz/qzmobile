package br.com.qzmobile.common.dao.generic;

import java.lang.reflect.Field;

import br.com.qzmobile.common.annotation.Column;

public class FieldItem {

	private String attributeName;
	private String columName;
	private FieldType type;

	public static final String STRING_TYPE = "java.lang.String";
	public static final String LONG_TYPE = "java.lang.Long";
	public static final String INTEGER_TYPE = "java.lang.Integer";
	public static final String DATE_TYPE = "java.util.Date";
	public static final String DOUBLE_TYPE = "java.lang.Double";
	public static final String BIGDECIMAL_TYPE = "java.math.BigDecimal";
	public static final String BOOLEAN_TYPE = "java.lang.Boolean";
	
	
	// ------------------------------------------------------------------------
	
	public FieldItem(Field field){
		
		Column coluna =	field.getAnnotation(Column.class);
		if(coluna != null){
			if(STRING_TYPE.equals(field.getType().getCanonicalName())){
				this.type = FieldType.STRING;
			}else if(LONG_TYPE.equals(field.getType().getCanonicalName())){
				this.type = FieldType.LONG;
			}else if(INTEGER_TYPE.equals(field.getType().getCanonicalName())){
				this.type = FieldType.INTEGER;
			}else if(DATE_TYPE.equals(field.getType().getCanonicalName())){
				this.type = FieldType.DATE;
			}else if(DOUBLE_TYPE.equals(field.getType().getCanonicalName())){
				this.type = FieldType.DOUBLE;
			}else if(BIGDECIMAL_TYPE.equals(field.getType().getCanonicalName())){
				this.type = FieldType.BIGDECIMAL;
			}else if(BOOLEAN_TYPE.equals(field.getType().getCanonicalName())){
				this.type = FieldType.BOOLEAN;
			}
			this.columName = coluna.name();
			this.attributeName = field.getName();
		}
	}

	// ------------------------------------------------------------------------

	public String getColumName() {
		return columName;
	}
	public void setColumName(String columName) {
		this.columName = columName;
	}
	public FieldType getType() {
		return type;
	}
	public void setType(FieldType type) {
		this.type = type;
	}
	public String getAttributeName() {
		return attributeName;
	}
	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}
}
