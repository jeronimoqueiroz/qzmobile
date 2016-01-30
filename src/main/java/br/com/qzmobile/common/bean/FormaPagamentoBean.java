package br.com.qzmobile.common.bean;

import java.util.Date;

import br.com.qzmobile.common.annotation.Column;
import br.com.qzmobile.common.annotation.Id;
import br.com.qzmobile.common.annotation.Table;


@Table(name="FORMA_PAGAMENTO", owner="delivery")
public class FormaPagamentoBean extends AbstractEngineBean {

	@Id(autoIncrement="YES")
    @Column(name="id")
    private Long id; 

    @Column(name="vl_total")
    private Double vlTotal; 
    
    @Column(name="tp_pagamento")
    private String tpPagamento; 
    
    @Column(name="bandeira")
    private String bandeira; 

    @Column(name="bandeira_liberada")
    private String bandeiraLiberada; 

    @Column(name="observacao")
    private String observacao;

    @Column(name="id_pedido")
    private Long idPedido;

    @Column(name="nr_parcela")
    private Integer nrParcela;

    @Column(name="dt_pagamento")
    private Date dtPagamento;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getVlTotal() {
		return vlTotal;
	}

	public void setVlTotal(Double vlTotal) {
		this.vlTotal = vlTotal;
	}

	public String getTpPagamento() {
		return tpPagamento;
	}

	public void setTpPagamento(String tpPagamento) {
		this.tpPagamento = tpPagamento;
	}

	public String getBandeira() {
		return bandeira;
	}

	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}

	public String getBandeiraLiberada() {
		return bandeiraLiberada;
	}

	public void setBandeiraLiberada(String bandeiraLiberada) {
		this.bandeiraLiberada = bandeiraLiberada;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Long getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}

	public Integer getNrParcela() {
		return nrParcela;
	}

	public void setNrParcela(Integer nrParcela) {
		this.nrParcela = nrParcela;
	}

	public Date getDtPagamento() {
		return dtPagamento;
	}

	public void setDtPagamento(Date dtPagamento) {
		this.dtPagamento = dtPagamento;
	}
      
}
