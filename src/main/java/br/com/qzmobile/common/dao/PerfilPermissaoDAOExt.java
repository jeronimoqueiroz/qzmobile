package br.com.qzmobile.common.dao; 

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.qzmobile.common.bean.PerfilPermissaoBean;



@Repository("perfilPermissaoDAOExt")
public class PerfilPermissaoDAOExt extends PerfilPermissaoDAO {

	String DELETE_PERMISSAO_PERFIL = "DELETE FROM PERFIL_PERMISSAO WHERE ID = ?";
 
	private static final String GET_VALUE_FROM_PERFIL =
			"SELECT * " +
			"FROM PERFIL_PERMISSAO " + 
			"WHERE ID_PERFIL = ? " ;

	public void deleteRelacionamento(Long idPerfilPermissao){
		this.jdbcTemplate.update(DELETE_PERMISSAO_PERFIL, new Object[]{idPerfilPermissao});
		
	}

   public List<PerfilPermissaoBean> getAllByPerfil(long idPerfil) throws SQLException{
    	
    	return this.getRecordList(GET_VALUE_FROM_PERFIL, new Object[]{idPerfil});
    }
	
}
