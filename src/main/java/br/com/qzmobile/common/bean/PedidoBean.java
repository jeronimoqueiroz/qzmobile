package br.com.qzmobile.common.bean;

import java.util.Date;
import java.util.List;

import br.com.qzmobile.common.annotation.Column;
import br.com.qzmobile.common.annotation.Id;
import br.com.qzmobile.common.annotation.Table;

/*
 * Descriï¿½ï¿½o: Cadastro de pedido
 */
@Table(name="PEDIDO", owner="delivery")
public class PedidoBean extends AbstractEngineBean {
	
	public static final String STATUS_AGENDADO = "Agendado";
	public static final String STATUS_EM_PRODUCAO = "Em Produção";
	public static final String STATUS_PRONTO_PARA_ENTREGA = "Pronto para Entrega";
	public static final String EXPEDIDO = "Expedido";
	public static final String CANCELADO = "Cancelado";

	@Id(autoIncrement="YES")
    @Column(name="id")
    private Long id; 
	
	@Column(name="vl_total")
    private Double vlTotal;

    @Column(name="id_filial")
    private Long idFilial;

    @Column(name="id_cliente")
    private Long idCliente;
    
    @Column(name="id_usuario")
    private Long idUsuario;

    @Column(name="nr_pedido")
    private Long nrPedido;

    @Column(name="dt_entrega")
    private Date dtEntrega;
    
    @Column(name="status")
    private String status;

    @Column(name="dt_alteracao")
    private Date dtAlteracao;
    
    @Column(name="logradouro")
    private String logradouro;

    @Column(name="numero_endereco")
    private String numeroEndereco;

    @Column(name="complemento_endereco")
    private String complementoEndereco;

    @Column(name="referencia_endereco")
    private String referenciaEndereco;

    @Column(name="bairro")
    private String bairro;

    @Column(name="cidade")
    private String cidade;

    @Column(name="uf")
    private String uf;

    @Column(name="telefone_contato")
    private String telefoneContato;

    @Column(name="usa_endereco_residencia")
    private String usaEnderecoResidencia;
    
    @Column(name="distancia")
    private long distancia;

	@Column(name="taxa_extra")
    private Double taxaExtra;

	@Column(name="st_cancela_tx_entrega")
    private Boolean stCancelaTxEntrega;

    @Column(name="motivo_retira_taxa")
    private String motivoRetiraTaxa;
 	
    @Column(name="id_motorista")
    private Long idMotorista;

    private ClienteBean cliente;


    private List<ItemPedidoBean> itensPedido;

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



	public List<ItemPedidoBean> getItensPedido() {
		return itensPedido;
	}



	public void setItensPedido(List<ItemPedidoBean> itensPedido) {
		this.itensPedido = itensPedido;
	}



	public Long getIdFilial() {
		return idFilial;
	}



	public void setIdFilial(Long idFilial) {
		this.idFilial = idFilial;
	}



	public Long getIdCliente() {
		return idCliente;
	}



	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}



	public Long getIdUsuario() {
		return idUsuario;
	}



	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}



	public Date getDtAlteracao() {
		return dtAlteracao;
	}



	public void setDtAlteracao(Date dtAlteracao) {
		this.dtAlteracao = dtAlteracao;
	}



	public Long getNrPedido() {
		return nrPedido;
	}



	public void setNrPedido(Long nrPedido) {
		this.nrPedido = nrPedido;
	}



	public Date getDtEntrega() {
		return dtEntrega;
	}



	public void setDtEntrega(Date dtEntrega) {
		this.dtEntrega = dtEntrega;
	}



	public ClienteBean getCliente() {
		return cliente;
	}



	public void setCliente(ClienteBean cliente) {
		this.cliente = cliente;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public String getLogradouro() {
		return logradouro;
	}



	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}



	public String getNumeroEndereco() {
		return numeroEndereco;
	}



	public void setNumeroEndereco(String numeroEndereco) {
		this.numeroEndereco = numeroEndereco;
	}



	public String getComplementoEndereco() {
		return complementoEndereco;
	}



	public void setComplementoEndereco(String complementoEndereco) {
		this.complementoEndereco = complementoEndereco;
	}



	public String getReferenciaEndereco() {
		return referenciaEndereco;
	}



	public void setReferenciaEndereco(String referenciaEndereco) {
		this.referenciaEndereco = referenciaEndereco;
	}



	public String getBairro() {
		return bairro;
	}



	public void setBairro(String bairro) {
		this.bairro = bairro;
	}



	public String getCidade() {
		return cidade;
	}



	public void setCidade(String cidade) {
		this.cidade = cidade;
	}



	public String getUf() {
		return uf;
	}



	public void setUf(String uf) {
		this.uf = uf;
	}



	public String getTelefoneContato() {
		return telefoneContato;
	}



	public void setTelefoneContato(String telefoneContato) {
		this.telefoneContato = telefoneContato;
	}



	public String getUsaEnderecoResidencia() {
		return usaEnderecoResidencia;
	}



	public void setUsaEnderecoResidencia(String usaEnderecoResidencia) {
		this.usaEnderecoResidencia = usaEnderecoResidencia;
	}



	public long getDistancia() {
		return distancia;
	}



	public void setDistancia(long distancia) {
		this.distancia = distancia;
	}



	public Double getTaxaExtra() {
		return taxaExtra;
	}



	public void setTaxaExtra(Double taxaExtra) {
		this.taxaExtra = taxaExtra;
	}



	public Boolean getStCancelaTxEntrega() {
		return stCancelaTxEntrega;
	}



	public void setStCancelaTxEntrega(Boolean stCancelaTxEntrega) {
		this.stCancelaTxEntrega = stCancelaTxEntrega;
	}



	public String getMotivoRetiraTaxa() {
		return motivoRetiraTaxa;
	}



	public void setMotivoRetiraTaxa(String motivoRetiraTaxa) {
		this.motivoRetiraTaxa = motivoRetiraTaxa;
	}



	public Long getIdMotorista() {
		return idMotorista;
	}



	public void setIdMotorista(Long idMotorista) {
		this.idMotorista = idMotorista;
	}


   
}
