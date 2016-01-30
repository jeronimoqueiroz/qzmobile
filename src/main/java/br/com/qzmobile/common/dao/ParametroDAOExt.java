package br.com.qzmobile.common.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;


@Repository("parametroDAOExt")
public class ParametroDAOExt extends ParametroDAO {

	private static final String GET_VALUE =
		"SELECT valor " +
		"FROM %tabInf% " + 
		"WHERE nome = ? " +
		"	AND tipo = ? ";

	private static final String GET_TIPOS =
		"SELECT DISTINCT tipo " +
		"FROM %tabInf% " + 
		"ORDER BY tipo " ;

	// -------------------------------------------------------------------------------------
	
	public String getValueByNomeTipo(String nome, String tipo) throws SQLException {
		final Object[] parametros = new Object[]{nome, tipo};
		return (String) jdbcTemplate.queryForObject(sqlFiller(GET_VALUE), parametros, String.class);
	}

	// -------------------------------------------------------------------------------------
	
	public List<String> getTipos() throws SQLException {
		return jdbcTemplate.queryForList(sqlFiller(GET_TIPOS), String.class);
	}
	
}
