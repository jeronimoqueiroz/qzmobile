package br.com.qzmobile.common.bean;

import br.com.qzmobile.common.annotation.Column;
import br.com.qzmobile.common.annotation.Id;
import br.com.qzmobile.common.annotation.Table;

@Table(name="ITEM_PEDIDO", owner="delivery")
public class ItemPedidoBean extends AbstractEngineBean{

	@Id(autoIncrement="YES")
    @Column(name="id")
	private Long id;
	
	@Column(name="qtd")
	private Long qtd;

	@Column(name="id_produto")
	private Long idProduto;
	
	@Column(name="id_pedido")
	private Long idPedido;
	
	@Column(name="valor_parcial")
	private Double valorParcial;

	@Column(name="soma_valor_itens")
	private Double somaValorItens;

	private ProdutoBean produto;


	public Long getId() {
		return id;
	}


	public Long getQtd() {
		return qtd;
	}


	public void setQtd(Long qtd) {
		this.qtd = qtd;
	}



	public Long getIdProduto() {
		return idProduto;
	}


	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}


	public Long getIdPedido() {
		return idPedido;
	}


	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public ProdutoBean getProduto() {
		return produto;
	}


	public void setProduto(ProdutoBean produto) {
		this.produto = produto;
	}


	public Double getValorParcial() {
		return valorParcial;
	}


	public void setValorParcial(Double valorParcial) {
		this.valorParcial = valorParcial;
	}


	public Double getSomaValorItens() {
		return somaValorItens;
	}


	public void setSomaValorItens(Double somaValorItens) {
		this.somaValorItens = somaValorItens;
	}

	
}
