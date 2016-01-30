package br.com.qzmobile.common.dao; 

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.qzmobile.common.bean.MenuBean;
import br.com.qzmobile.common.util.Menu;
import br.com.qzmobile.common.util.MenuItem;

@Repository("menuDAOExt")
public class MenuDAOExt extends MenuDAO {

	 
	private static final String MENU_POR_PERFIL_TOP = 
	" select MN.*                       "+
	" from MENU MN,                     "+ 
	"      PERFIL_MENU PM,              "+ 
	"      PERFIL      PF               "+ 
	" WHERE PF.ID        = ?            "+
	" AND   PF.ID        = PM.ID_PERFIL "+
	" AND   PM.ID_MENU   = MN.ID        "+
	" AND   MN.NIVEL2    = 0            "+
	" ORDER BY NIVEL1 ";
	
	private static final String MENU_POR_PERFIL = 
			" select MN.*                       "+
			" from MENU MN,                     "+ 
			"      PERFIL_MENU PM,              "+ 
			"      PERFIL      PF               "+ 
			" WHERE PF.ID        = ?            "+
			" AND   PF.ID        = PM.ID_PERFIL "+
			" AND   PM.ID_MENU   = MN.ID        "+
			" ORDER BY NIVEL1 ";
	
	private static final String MENU_POR_PERFIL_NAO_RELACIONADO = 
			" SELECT MN.*                          "+
			" FROM MENU MN                         "+
			" WHERE NOT EXISTS (SELECT *           "+
			"			 FROM PERFIL_MENU PM       "+
			"			 WHERE PM.ID_MENU = MN.ID  "+
			"			 AND   PM.ID_PERFIL =  ?)  "+
			" ORDER BY NIVEL1 ";
	
	
	
	
	
	
	private static final String MENU_POR_PERFIL_BOTTON = 
	" select MN.*                        "+
	" from MENU MN,                      "+ 
	"      PERFIL_MENU PM,               "+ 
	"      PERFIL      PF                "+ 
	" WHERE PF.ID        =  ?            "+
	" AND   PF.ID        =  PM.ID_PERFIL "+
	" AND   PM.ID_MENU   =  MN.ID        "+
	" AND   MN.NIVEL1    =  ?            "+
	" AND   MN.NIVEL2    > 0            "+
	" ORDER BY NIVEL1, NIVEL2 ";
	
	
	
    @Override
    public Class<MenuBean> getClassType(){
        return MenuBean.class;
    }
    
    
    public List<MenuBean> getMenuPerfilNaoRelacionado(long idPerfil) throws SQLException{
    	
    	return this.getRecordList(MENU_POR_PERFIL_NAO_RELACIONADO, new Object[]{idPerfil});
    }
    
    public List<MenuBean> getMenuPerfil(long idPerfil) throws SQLException{
    	
    	return this.getRecordList(MENU_POR_PERFIL, new Object[]{idPerfil});
    }
    
    public List<MenuBean> getMenuPorPerfilSuperior(long idPerfil) throws SQLException{
    	
    	return this.getRecordList(MENU_POR_PERFIL_TOP, new Object[]{idPerfil});
    }
    
    public List<MenuBean> getMenuPorPerfilFilhos(long idPerfil, long nivel1) throws SQLException{
    	
    	return this.getRecordList(MENU_POR_PERFIL_BOTTON, new Object[]{idPerfil, nivel1});
    }
    
    public List<Menu> getMenuPorPerfil(long idPerfil){
    	List<Menu> todos = new ArrayList<Menu>();
    	try {
    		List<MenuBean> menus = this.getMenuPorPerfilSuperior(idPerfil);
    		
			for (MenuBean bean : menus) {
				Menu menu = new Menu();
				menu.setMenu(bean);
				List<MenuItem> itensMenu = new ArrayList<MenuItem>();
				List<MenuBean> itens = getMenuPorPerfilFilhos(idPerfil, bean.getNivel1());
				for (MenuBean menuBean : itens) {
					MenuItem item = new MenuItem();
					item.setMenu(menuBean);
					itensMenu.add(item);
				}	
				menu.setItens(itensMenu);
				todos.add(menu);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
    	return todos;
    }
    
    

}
