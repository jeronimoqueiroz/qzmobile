package br.com.qzmobile.common.bean;

import java.util.Date;
import java.util.List;

import br.com.qzmobile.common.annotation.Column;
import br.com.qzmobile.common.annotation.Id;
import br.com.qzmobile.common.annotation.Table;

/*
 * Descri��o: Cadastro de Enderecos
 */
@Table(name="ENDERECO", owner="delivery")
public class EnderecoBean extends AbstractEngineBean {

	@Id(autoIncrement="YES")
    @Column(name="id")
    private Long id; 

    @Column(name="id_cliente")
    private Long idCliente; 
 
    @Column(name="id_tp_endereco")
    private Long idTpEndereco; 

    @Column(name="tp_endereco")
    private String tpEndereco; 
    
     @Column(name="logradouro")
    private String logradouro; 

    @Column(name="bairro")
    private String bairro; 

    @Column(name="referencia_endereco")
    private String referenciaEndereco; 

    @Column(name="cidade")
    private String cidade; 

    @Column(name="uf")
    private String uf; 
    
    @Column(name="numero_endereco")
    private String numeroEndereco; 

    @Column(name="complemento_endereco")
    private String complementoEndereco;

    @Column(name="alias_endereco")
    private String aliasEndereco; 

    
    
    
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

	public String getTpEndereco() {
		return tpEndereco;
	}

	public void setTpEndereco(String tpEndereco) {
		this.tpEndereco = tpEndereco;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getReferenciaEndereco() {
		return referenciaEndereco;
	}

	public void setReferenciaEndereco(String referenciaEndereco) {
		this.referenciaEndereco = referenciaEndereco;
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

	public Long getIdTpEndereco() {
		return idTpEndereco;
	}

	public void setIdTpEndereco(Long idTpEndereco) {
		this.idTpEndereco = idTpEndereco;
	}

	public String getAliasEndereco() {
		return aliasEndereco;
	}

	public void setAliasEndereco(String aliasEndereco) {
		this.aliasEndereco = aliasEndereco;
	} 

    //---------------------------------------------------------------------------------//

}
