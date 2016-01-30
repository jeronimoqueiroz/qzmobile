package br.com.qzmobile.common.dao; 

import org.springframework.stereotype.Repository;

import br.com.qzmobile.common.bean.PerfilMenuBean;



@Repository("perfilMenuDAOExt")
public class PerfilMenuDAOExt extends PerfilMenuDAO {

	String DELETE_PERMISSAO_MENU = "DELETE FROM PERFIL_MENU WHERE ID_PERFIL = ? AND ID_MENU = ? ";
 
	public void deleteRelacionamento(PerfilMenuBean perfilMenu){
		this.jdbcTemplate.update(DELETE_PERMISSAO_MENU, new Object[]{perfilMenu.getIdPerfil(), perfilMenu.getIdMenu()});
	}
	

}
