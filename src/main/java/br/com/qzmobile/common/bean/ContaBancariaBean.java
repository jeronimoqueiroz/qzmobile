package br.com.qzmobile.common.bean;

import java.math.BigDecimal;

import br.com.qzmobile.common.annotation.Column;
import br.com.qzmobile.common.annotation.Id;
import br.com.qzmobile.common.annotation.Table;

/*
 */
@Table(name="CONTA_BANCARIA", owner="delivery")
public class ContaBancariaBean extends AbstractEngineBean {

	@Id(autoIncrement="YES")
    @Column(name="id")
    private Long id; 

    @Column(name="nome")
    private String nome;

    @Column(name="nr_banco")
    private String nrBanco;

    @Column(name="nr_agencia")
    private String nrAgencia;
 
    @Column(name="nr_conta")
    private String nrConta;
 
    @Column(name="vl_inicial")
    private BigDecimal vlInicial;
 
    @Column(name="vl_corrente")
    private BigDecimal vlCorrente;

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

	public String getNrBanco() {
		return nrBanco;
	}

	public void setNrBanco(String nrBanco) {
		this.nrBanco = nrBanco;
	}

	public String getNrAgencia() {
		return nrAgencia;
	}

	public void setNrAgencia(String nrAgencia) {
		this.nrAgencia = nrAgencia;
	}

	public String getNrConta() {
		return nrConta;
	}

	public void setNrConta(String nrConta) {
		this.nrConta = nrConta;
	}

	public BigDecimal getVlInicial() {
		return vlInicial;
	}

	public void setVlInicial(BigDecimal vlInicial) {
		this.vlInicial = vlInicial;
	}

	public BigDecimal getVlCorrente() {
		return vlCorrente;
	}

	public void setVlCorrente(BigDecimal vlCorrente) {
		this.vlCorrente = vlCorrente;
	}}
