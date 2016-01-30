package br.com.qzmobile.common.bean;

import br.com.qzmobile.common.annotation.Column;
import br.com.qzmobile.common.annotation.Id;
import br.com.qzmobile.common.annotation.Table;

/*
 * Descri��o: Cadastro de filial
 */
@Table(name="DESCONTO", owner="delivery")
public class DescontoBean extends AbstractEngineBean {

	@Id(autoIncrement="YES")
    @Column(name="id")
    private Long id; 

    @Column(name="nome")
    private String nome; 
    
    @Column(name="vl_desconto")
    private Double vlDesconto; 
    
    @Column(name="percentagem")
    private Double percentagem; 

    @Column(name="id_usuario")
    private Long usuarioCriacao;
    
    @Column(name="id_pedido")
    private Long idPedido;

    @Column(name="id_cliente")
    private Long idCliente;
    
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

	public Double getVlDesconto() {
		return vlDesconto;
	}

	public void setVlDesconto(Double vlDesconto) {
		this.vlDesconto = vlDesconto;
	}

	public Double getPercentagem() {
		return percentagem;
	}

	public void setPercentagem(Double percentagem) {
		this.percentagem = percentagem;
	}

	public Long getUsuarioCriacao() {
		return usuarioCriacao;
	}

	public void setUsuarioCriacao(Long usuarioCriacao) {
		this.usuarioCriacao = usuarioCriacao;
	}

	public Long getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}


   
}
