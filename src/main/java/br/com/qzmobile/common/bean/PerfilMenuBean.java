package br.com.qzmobile.common.bean;

import br.com.qzmobile.common.annotation.Column;
import br.com.qzmobile.common.annotation.Id;
import br.com.qzmobile.common.annotation.Table;

/*
 * Descri��o: Rela��o entre perfil e menu de op��es
 * Gera��o autom�tica: 15/08/2012 11:45:53
 */
@Table(name="PERFIL_MENU", owner="delivery")
public class PerfilMenuBean extends AbstractEngineBean {

	@Id(autoIncrement="YES")
    @Column(name="id")
    private Long id; // Id do relacionamento perfil x menu

    @Column(name="id_perfil")
    private Long idPerfil; // Id do perfil

    @Column(name="id_menu")
    private Long idMenu; // Id do menu


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getIdPerfil() {
        return idPerfil;
    }
    public void setIdPerfil(Long idPerfil) {
        this.idPerfil = idPerfil;
    }
    public Long getIdMenu() {
        return idMenu;
    }
    public void setIdMenu(Long idMenu) {
        this.idMenu = idMenu;
    }

}
