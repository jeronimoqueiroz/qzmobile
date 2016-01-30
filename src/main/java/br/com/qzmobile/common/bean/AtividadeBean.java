package br.com.qzmobile.common.bean;

import java.util.Date;
import java.util.List;

import br.com.qzmobile.common.annotation.Column;
import br.com.qzmobile.common.annotation.Id;
import br.com.qzmobile.common.annotation.Table;

@Table(name="ATIVIDADE", owner="delivery")
public class AtividadeBean extends AbstractEngineBean {
	
	@Id(autoIncrement="YES")
    @Column(name="id")
    private Long id; 

	 @Column(name="descricao")
	 private String descricao;
	 
	 @Column(name="id_pedido")
	 private Long idPedido;
	 
	 @Column(name="status")
	 private String status;
	 
	 @Column(name="dt_atividade")
	 private Date dtAtividade;
	 
	 private StatusAtividadeBean statusAtividade;
	 
	 private List<ItemPedidoBean> itensPedido;

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

	public Long getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDtAtividade() {
		return dtAtividade;
	}

	public void setDtAtividade(Date dtAtividade) {
		this.dtAtividade = dtAtividade;
	}

	public List<ItemPedidoBean> getItensPedido() {
		return itensPedido;
	}

	public void setItensPedido(List<ItemPedidoBean> itensPedido) {
		this.itensPedido = itensPedido;
	}

	public StatusAtividadeBean getStatusAtividade() {
		return statusAtividade;
	}

	public void setStatusAtividade(StatusAtividadeBean statusAtividade) {
		this.statusAtividade = statusAtividade;
	}


	

}
