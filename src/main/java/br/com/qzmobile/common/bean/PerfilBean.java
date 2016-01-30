package br.com.qzmobile.common.bean;

import br.com.qzmobile.common.annotation.Column;
import br.com.qzmobile.common.annotation.Id;
import br.com.qzmobile.common.annotation.Table;

/*
 * Descri��o: Cadastro de perfil de usuario
 * Gera��o autom�tica: 15/08/2012 11:45:53
 */
@Table(name="PERFIL", owner="delivery")
public class PerfilBean extends AbstractEngineBean {

	@Id(autoIncrement="YES")
    @Column(name="id")
    private Long id; // Id do perfil

    @Column(name="descricao")
    private String descricao; // Descri��o do perfil


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
