package br.com.qzmobile.common.bean;

import br.com.qzmobile.common.annotation.Column;
import br.com.qzmobile.common.annotation.Id;
import br.com.qzmobile.common.annotation.Table;


@Table(name="MENU", owner="delivery")
public class MenuBean extends AbstractEngineBean {

    @Id(autoIncrement="YES")
    @Column(name="id")
    private Long id; // Id do menu

    @Column(name="nivel1")
    private Integer nivel1; // Nivel 1 do menu

    @Column(name="nivel2")
    private Integer nivel2; // Nivel 2 do menu (null no nivel 1)

    @Column(name="item")
    private String item; // Texto exibido no menu do sistema

    @Column(name="link")
    private String link; // Link disparado no acesso do menu

    @Column(name="descricao")
    private String descricao; // Descricao do menu (tooltip)

    @Column(name="situacao")
    private String situacao; // Situado item de menu (Ativo, Cancelado, Teste para administradores)


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Integer getNivel1() {
        return nivel1;
    }
    public void setNivel1(Integer nivel1) {
        this.nivel1 = nivel1;
    }
    public Integer getNivel2() {
        return nivel2;
    }
    public void setNivel2(Integer nivel2) {
        this.nivel2 = nivel2;
    }
    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }
    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getSituacao() {
        return situacao;
    }
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

}
