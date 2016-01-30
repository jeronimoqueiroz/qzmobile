package br.com.qzmobile.common.bean;

import br.com.qzmobile.common.annotation.Column;
import br.com.qzmobile.common.annotation.Id;
import br.com.qzmobile.common.annotation.Table;

/*
 * Descri��o: Rela��o entre perfil e permissao
 */
@Table(name="PERFIL_PERMISSAO", owner="delivery")
public class PerfilPermissaoBean extends AbstractEngineBean {

	@Id(autoIncrement="YES")
    @Column(name="id")
    private Long id; // Id do relacionamento perfil x permissao

    @Column(name="id_perfil")
    private Long idPerfil; // Id do perfil

    @Column(name="id_permissao")
    private Long idPermissao; // Id da Permissao


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
	public Long getIdPermissao() {
		return idPermissao;
	}
	public void setIdPermissao(Long idPermissao) {
		this.idPermissao = idPermissao;
	}
}
