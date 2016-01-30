package br.com.qzmobile.common.dao.generic;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import br.com.qzmobile.common.bean.AbstractEngineBean;
import br.com.qzmobile.common.util.StringUtils;

public class GenericDAO <BEAN extends AbstractEngineBean> {
	
	protected List<FieldItem> fieldItems = new LinkedList<FieldItem>();
	protected List<String> columnNames = new LinkedList<String>();
	protected List<String> columnSemPK = new LinkedList<String>();
	protected Map<String, String> mapfields = new LinkedHashMap<String, String>();
	
	protected String owner = "";
	protected String tableName = "";
	protected String tablePk = "";
	protected String sequence = "";
	protected String autoIncrement = "NO";

	protected static final String SELECT = 			"SELECT ";
	protected static final String FROM = 			" FROM ";
	protected static final String WHERE = 			" WHERE ";
	protected static final String IQUAL = 			" = ";
	protected static final String BIND = 			" ? ";
	protected static final String DELETE = 			"DELETE FROM ";
	protected static final String INSERT = 			"INSERT INTO ";
	protected static final String UPDATE = 			"UPDATE ";
	protected static final String OPEN_PARENTES = 	" ( ";
	protected static final String CLOSE_PARENTES =  " ) ";
	protected static final String VALUES =  		" VALUES ";
	protected static final String SET =  			" SET ";
	protected static final String PONTO =  			".";
	
	// -------------------------------------------------------------------------
	
	protected String buildSimpleUpdate(){
		StringBuffer buffer = new StringBuffer();
		buffer.append(UPDATE);
		buffer.append(owner).append(PONTO).append(tableName);
		buffer.append(SET);
		buffer.append(StringUtils.buildUpdateArray2String(columnSemPK));
		buffer.append(buildRestrictionByPK());
		return buffer.toString();
	}

	// -------------------------------------------------------------------------

	protected String buildSimpleDelete(){
		StringBuffer buffer = new StringBuffer();
		buffer.append(DELETE);
		buffer.append(owner).append(PONTO).append(tableName);
		buffer.append(buildRestrictionByPK());
		return buffer.toString();
	}

	// -------------------------------------------------------------------------
	
	protected String buildSimpleQuery(){
		StringBuffer buffer = new StringBuffer();
		buffer.append(SELECT);
		buffer.append(StringUtils.buildArray2String(columnNames));
		buffer.append(FROM);
		buffer.append(owner).append(PONTO).append(tableName);
		return buffer.toString();
	}

	// -------------------------------------------------------------------------

	protected String buildRestrictionByPK(){
		StringBuffer buffer = new StringBuffer();
		buffer.append(WHERE);
		buffer.append(tablePk).append(IQUAL).append(BIND);
		return buffer.toString();
	}
	
	// -------------------------------------------------------------------------

	protected String buildSimpleInsert(){
		StringBuffer buffer = new StringBuffer(INSERT);
		buffer.append(owner).append(PONTO).append(tableName).append(OPEN_PARENTES);
		
		if(autoIncrement.equals("YES")){
			buffer.append(StringUtils.buildArray2String(columnSemPK)).append(CLOSE_PARENTES);
		}else{
			buffer.append(StringUtils.buildArray2String(columnNames)).append(CLOSE_PARENTES);
		}
		
		buffer.append(VALUES).append(OPEN_PARENTES);
		if("".equals(sequence)){
			if(autoIncrement.equals("YES")){
				buffer.append(StringUtils.buildRepetir(BIND, columnSemPK.size())).append(CLOSE_PARENTES);
			}else{
				buffer.append(StringUtils.buildRepetir(BIND, columnNames.size())).append(CLOSE_PARENTES);
			}
		}else{
			buffer.append(owner).append(PONTO).append(sequence).append(",");
			buffer.append(StringUtils.buildRepetir(BIND,(columnNames.size() -1))).append(CLOSE_PARENTES);
		}
		return buffer.toString();
	}
	
	// -------------------------------------------------------------------------
	
	protected String buildSimpleQueryByPK(){
		System.out.println(buildRestrictionByPK());
		StringBuffer buffer = new StringBuffer(buildSimpleQuery());
		buffer.append(buildRestrictionByPK());
		return buffer.toString();
	}
	
}
