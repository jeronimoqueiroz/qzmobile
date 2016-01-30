package br.com.qzmobile.common.bean;

import java.util.Date;

import br.com.qzmobile.common.annotation.Column;
import br.com.qzmobile.common.annotation.Id;
import br.com.qzmobile.common.annotation.Table;

/*
 * CreditoCliente: Cadastro de CreditoCliente
 */
@Table(name="CREDITO_CLIENTE", owner="delivery")
public class CreditoClienteBean extends AbstractEngineBean {

	@Id(autoIncrement="YES")
    @Column(name="id")
    private Long id; 

    @Column(name="id_cliente")
    private Long idCliente; 

    @Column(name="id_usuario")
    private Long usuarioCriacao; 

    @Column(name="valor")
    private Double valor; 
    
    @Column(name="descricao")
    private String descricao; 

    @Column(name="status")    //ativo(A), inativo(I)
    private String status;

    @Column(name="dt_criacao")
    private Date dtCriacao;
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getUsuarioCriacao() {
		return usuarioCriacao;
	}

	public void setUsuarioCriacao(Long usuarioCriacao) {
		this.usuarioCriacao = usuarioCriacao;
	}

	public Date getDtCriacao() {
		return dtCriacao;
	}

	public void setDtCriacao(Date dtCriacao) {
		this.dtCriacao = dtCriacao;
	}

    

}
