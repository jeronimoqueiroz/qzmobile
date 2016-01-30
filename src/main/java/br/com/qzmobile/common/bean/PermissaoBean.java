package br.com.qzmobile.common.bean;

import br.com.qzmobile.common.annotation.Column;
import br.com.qzmobile.common.annotation.Id;
import br.com.qzmobile.common.annotation.Table;

/*
 * Descri��o: Cadastro de Permissoes de usuario
 */
@Table(name="PERMISSAO", owner="delivery")
public class PermissaoBean extends AbstractEngineBean {

	@Id(autoIncrement="YES")
    @Column(name="id")
    private Long id; // Id da Permissao

    @Column(name="descricao")
    private String descricao; // Descricao da permissao

    @Column(name="sigla")
    private String sigla; // sigla da permissão, máximo 10 caracteres


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
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

}
