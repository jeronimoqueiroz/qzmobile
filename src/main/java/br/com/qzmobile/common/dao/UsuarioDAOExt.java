package br.com.qzmobile.common.dao;

import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import br.com.qzmobile.common.bean.UsuarioBean;


@Repository("usuarioDAOExt")
public class UsuarioDAOExt extends UsuarioDAO  {

	private static final String GET_BY_CREDENTIALS =
		"SELECT * " +
		"FROM %tabInf% " + 
		"WHERE situacao = 'A' " +
		"	AND login = ? " +
		"	AND senha = ? " ;
	
	
	
	private static final String GET_BY_CREDENTIALS_BY_PASS =
			"SELECT * " +
			"FROM %tabInf% " + 
			"WHERE situacao = 'A' " +
			"	AND senha = ? " +
			" limit 1" ;

	// -------------------------------------------------------------------------------------
	
	public UsuarioBean getByCredentials(String login, String senha) throws SQLException {
		final Object[] parametros = new Object[]{login, senha};
		return this.getRecord(GET_BY_CREDENTIALS, parametros);
	}
	
	
	public UsuarioBean getByCredentialByPass(String senha) throws SQLException {
		final Object[] parametros = new Object[]{senha};
		return this.getRecord(GET_BY_CREDENTIALS_BY_PASS, parametros);
	}

}
