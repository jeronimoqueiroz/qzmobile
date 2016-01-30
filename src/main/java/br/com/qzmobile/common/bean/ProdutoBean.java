package br.com.qzmobile.common.bean;

import java.util.Date;

import br.com.qzmobile.common.annotation.Column;
import br.com.qzmobile.common.annotation.Id;
import br.com.qzmobile.common.annotation.Table;

/*
 * Descri��o: Cadastro de Produto
 */
@Table(name="PRODUTO", owner="delivery")
public class ProdutoBean extends AbstractEngineBean {

	@Id(autoIncrement="YES")
    @Column(name="id")
    private Long id; 

    @Column(name="tp_produto")
    private String tpProduto; 
    
    @Column(name="nm_produto")
    private String nmProduto; 

    @Column(name="sg_produto") 
    private String sgProduto; 

    @Column(name="vl_produto")
    private Double vlProduto;

    @Column(name="id_usuario") 
    private Long idUsuario; 

    @Column(name="dt_alteracao")
    private Date dtAlteracao;

    @Column(name="id_filial")
    private Long idFilial;
   
    
    //----------------------------------------------------------
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTpProduto() {
		return tpProduto;
	}

	public void setTpProduto(String tpProduto) {
		this.tpProduto = tpProduto;
	}

	public String getNmProduto() {
		return nmProduto;
	}

	public void setNmProduto(String nmProduto) {
		this.nmProduto = nmProduto;
	}

	public Date getDtAlteracao() {
		return dtAlteracao;
	}

	public void setDtAlteracao(Date dtAlteracao) {
		this.dtAlteracao = dtAlteracao;
	}

	public Long getIdFilial() {
		return idFilial;
	}

	public void setIdFilial(Long idFilial) {
		this.idFilial = idFilial;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getSgProduto() {
		return sgProduto;
	}

	public void setSgProduto(String sgProduto) {
		this.sgProduto = sgProduto;
	}

	public Double getVlProduto() {
		return vlProduto;
	}

	public void setVlProduto(Double vlProduto) {
		this.vlProduto = vlProduto;
	}


}
