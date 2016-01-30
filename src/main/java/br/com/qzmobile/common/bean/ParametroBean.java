package br.com.qzmobile.common.bean;

import br.com.qzmobile.common.annotation.Column;
import br.com.qzmobile.common.annotation.Id;
import br.com.qzmobile.common.annotation.Table;

/*
 * Descri��o: Parametros gerais do sistema
 * Gera��o autom�tica: 15/08/2012 11:45:53
 */
@Table(name="PARAMETRO", owner="delivery")
public class ParametroBean extends AbstractEngineBean {

	@Id(autoIncrement="YES")
    @Column(name="id")
    private Long id; // Id do parametro

    @Column(name="nome")
    private String nome; // Nome do Parametro

    @Column(name="tipo")
    private String tipo; // Tipo do parametro (agrupamento dos parametros)

    @Column(name="valor")
    private String valor; // Valor do parametro

    @Column(name="observacao")
    private String observacao; // Observa��es sobre o Parametro (indicando uso no sistema)


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getValor() {
        return valor;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }
    public String getObservacao() {
        return observacao;
    }
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

}
