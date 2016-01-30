package br.com.qzmobile.common.bean;

import java.math.BigDecimal;
import java.util.Date;

import br.com.qzmobile.common.annotation.Column;
import br.com.qzmobile.common.annotation.Id;
import br.com.qzmobile.common.annotation.Table;

/*
 */
@Table(name="CONTA", owner="delivery")
public class ContaBean extends AbstractEngineBean {

	@Id(autoIncrement="YES")
    @Column(name="id")
    private Long id; 

    @Column(name="nome")
    private String nome;

    @Column(name="descricao")
    private String descricao;

    @Column(name="origem")
    private String origem;
 
    @Column(name="dt_vencimento")
    private Date dtVencimento;
 
    @Column(name="dt_cadastro")
    private Date dtCadastro;
 
    @Column(name="valor")
    private BigDecimal valor;
 
    @Column(name="st_recorrente")
    private String stRecorrente;

   
    @Column(name="id_tipo_conta")
    private Long idTipoConta;
 
    private TipoContaBean tipoConta;
    

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

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public Date getDtVencimento() {
		return dtVencimento;
	}

	public void setDtVencimento(Date dtVencimento) {
		this.dtVencimento = dtVencimento;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Long getIdTipoConta() {
		return idTipoConta;
	}

	public void setIdTipoConta(Long idTipoConta) {
		this.idTipoConta = idTipoConta;
	}

	public Date getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(Date dtCadastro) {
		this.dtCadastro = dtCadastro;
	}

	public String getStRecorrente() {
		return stRecorrente;
	}

	public void setStRecorrente(String stRecorrente) {
		this.stRecorrente = stRecorrente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoContaBean getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(TipoContaBean tipoConta) {
		this.tipoConta = tipoConta;
	} 
    
}
