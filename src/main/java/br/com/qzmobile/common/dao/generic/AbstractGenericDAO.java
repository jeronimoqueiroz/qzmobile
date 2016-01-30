package br.com.qzmobile.common.dao.generic;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import br.com.qzmobile.common.annotation.Column;
import br.com.qzmobile.common.annotation.Id;
import br.com.qzmobile.common.annotation.Table;
import br.com.qzmobile.common.bean.AbstractEngineBean;
import br.com.qzmobile.common.jdbc.util.GenericResultSetExtractor;
import br.com.qzmobile.common.jdbc.util.GenericRowMapper;


public abstract class AbstractGenericDAO <BEAN extends AbstractEngineBean, PK> extends GenericDAO<BEAN>{
	
	@Autowired
	protected JdbcTemplate jdbcTemplate;
	
	private static final Logger LOGGER = Logger.getLogger(AbstractGenericDAO.class);

	public abstract Class<BEAN> getClassType();

	// ------------------------------------------------------------------------

	@SuppressWarnings("unchecked")
	public AbstractGenericDAO(){
		
		Class<BEAN> bean = null;
		try{
			bean = (Class<BEAN>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		}catch(Exception e){
			bean = (Class<BEAN>) ((ParameterizedType) getClass().getSuperclass().getGenericSuperclass()).getActualTypeArguments()[0];
		}
		
		if("br.com.qzmobile.common.bean.ProdutoBean".equals(bean.getCanonicalName())){
			System.out.println("Canonicalname = "+bean.getCanonicalName());
		}

		
		Field[] fields =  bean.getDeclaredFields();
		
		for (Field field : fields) {

			Column col = field.getAnnotation(Column.class);
			if(col != null){
				
				fieldItems.add(new FieldItem(field));
			
			
				columnNames.add(col.name());
				
				Id id = field.getAnnotation(Id.class);
				if(id != null){
					sequence = id.sequence();
					tablePk = col.name();
					autoIncrement = id.autoIncrement();
				}else{
					columnSemPK.add(col.name());
				}
				mapfields.put(field.getName(), col.name());
			}
		}
		Table table = bean.getAnnotation(Table.class);
		if(table != null){
			tableName = table.name();
			owner = table.owner();
		}
	}

	// ------------------------------------------------------------------------
	
	public BEAN getById(AbstractEngineBean vo){
		return this.jdbcTemplate.query(this.buildSimpleQueryByPK(), vo.toPk(), new GenericResultSetExtractor<BEAN>(fieldItems, this.getClassType()) );
	}
	
	// ------------------------------------------------------------------------
	
	public BEAN getById(PK id){
		
		Object[] parans = new Object[]{id}; 
		return this.jdbcTemplate.query(this.buildSimpleQueryByPK(), parans, new GenericResultSetExtractor<BEAN>(fieldItems, this.getClassType()) );
		
	}

	// ------------------------------------------------------------------------

	public void delete(AbstractEngineBean vo){
		this.jdbcTemplate.update(this.buildSimpleDelete(), vo.toPk());
	}

	public void delete(PK id){
		Object[] parans = new Object[]{id}; 
		
		this.jdbcTemplate.update(this.buildSimpleDelete(), parans);
		
	}
	
	// ------------------------------------------------------------------------

	public List<BEAN> getAll(){
		return  this.jdbcTemplate.query(this.buildSimpleQuery(), new GenericRowMapper<BEAN>(fieldItems, this.getClassType()));
	}
	
	// ------------------------------------------------------------------------

	public void save(AbstractEngineBean vo){
		if(vo.toPk() == null || vo.toPk()[0] == null){
			this.jdbcTemplate.update(this.buildSimpleInsert(), vo.toInsert());
		}else{
			this.jdbcTemplate.update(this.buildSimpleUpdate(), vo.toUpdate());
		}
	}
	
	// ------------------------------------------------------------------------
	
	public void update(AbstractEngineBean vo){
		this.jdbcTemplate.update(this.buildSimpleUpdate(), vo.toUpdate());
	}
	
	// ------------------------------------------------------------------------

	public void insert(AbstractEngineBean vo){
		
		String sql = this.buildSimpleInsert();
		Object[] params = vo.toInsert();
		
		this.jdbcTemplate.update(this.buildSimpleInsert(), vo.toInsert());
	}
	
	// ------------------------------------------------------------------------
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	// ------------------------------------------------------------------------

	public String sqlFiller(String sql){
		
		String tmp = sql.replace("%tabInf%", owner + PONTO + tableName);
		LOGGER.info("SQL = "+tmp);
		
		return tmp;
	}

	// ------------------------------------------------------------------------

	public String sqlFiller(String sql, String inStr){
		return sql.replace("%tabInf%", owner + PONTO + tableName).replace("%inSeq%", inStr);
	}
	
	// ------------------------------------------------------------------------

	public BEAN getRecord(String query, Object[] values) throws SQLException {
		try {
			return (BEAN) jdbcTemplate.queryForObject(sqlFiller(query), values, new GenericRowMapper<BEAN>(fieldItems, this.getClassType()));
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public BEAN getRecord(String query) throws SQLException {
		try {
			return (BEAN) jdbcTemplate.queryForObject(sqlFiller(query), new GenericRowMapper<BEAN>(fieldItems, this.getClassType()));
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

	// ------------------------------------------------------------------------

	public List<BEAN> getRecordList(String query, Object[] values) throws SQLException {
		return jdbcTemplate.query(sqlFiller(query), values, new GenericRowMapper<BEAN>(fieldItems, this.getClassType()));
	}

	public List<BEAN> getRecordList(String query) throws SQLException {
		return jdbcTemplate.query(sqlFiller(query), new GenericRowMapper<BEAN>(fieldItems, this.getClassType()));
	}

}
