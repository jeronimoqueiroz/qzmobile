package br.com.qzmobile.common.bean;

import java.util.Date;
import java.util.List;

import br.com.qzmobile.common.annotation.Column;
import br.com.qzmobile.common.annotation.Id;
import br.com.qzmobile.common.annotation.Table;

/*
 * Descri��o: Cadastro de Cliente
 */
@Table(name="CLIENTE", owner="delivery")
public class ClienteBean extends AbstractEngineBean {

	@Id(autoIncrement="YES")
    @Column(name="id")
    private Long id; 

    @Column(name="nm_cliente")
    private String nmCliente; 
    
    @Column(name="tp_cliente") // Pessoa Fisica(PF) e Pessoa Jurídica(PJ)
    private String tpCliente; 

    @Column(name="cpf")
    private String cpf; 

    @Column(name="cnpj")
    private String cnpj; 

    @Column(name="ie")
    private String ie; 

    @Column(name="st_sexo")
    private String stSexo; 

    @Column(name="website")
    private String website; 

    @Column(name="email")
    private String email; 

    @Column(name="telefone")
    private String telefone; 

    @Column(name="logradouro")
    private String logradouro; 

    @Column(name="bairro")
    private String bairro; 

   @Column(name="cidade")
    private String cidade; 

    @Column(name="uf")
    private String uf; 
    
    @Column(name="nm_empresa_cliente")
    private String nmEmpresaCliente; 

    @Column(name="id_filial")
    private Long idFilial;

    @Column(name="forma_conhecimento")
    private String formaConhecimento; 

    @Column(name="qual_campanha")
    private String qualCampanha; 

    @Column(name="qual_website")
    private String qualWebsite; 
        
    @Column(name="telefone_comercial")
    private String telefoneComercial; 

    @Column(name="telefone_celular")
    private String telefoneCelular; 
 
    @Column(name="email_trabalho")
    private String emailTrabalho; 

    @Column(name="referencia_endereco")
    private String referenciaEndereco; 


    @Column(name="dt_nascimento")
    private Date dtNascimento; 
 
    @Column(name="genero")
    private String genero; 

    @Column(name="numero_endereco")
    private String numeroEndereco; 

    @Column(name="complemento_endereco")
    private String complementoEndereco; 

    @Column(name="qual_anuncio")
    private String qualAnuncio; 

    @Column(name="qual_rede")
    private String qualRede; 
 
    @Column(name="indicacao")
    private String indicacao; 

    @Column(name="nome_empresa")//para pedidos de PJs, este campo cadastra o nome da empresa.
    private String nomeEmpresa; 
    
    @Column(name="setor_contato") //nome do setor da empresa em que trabalha o contato para o pedido.
    private String setorContato; 
 
    private List<EnderecoBean> enderecos;
    
    private List<PedidoBean> pedidos;
    //---------------------------------------------------------------------------------//

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNmCliente() {
		return nmCliente;
	}

	public void setNmCliente(String nmCliente) {
		this.nmCliente = nmCliente;
	}

	public String getStSexo() {
		return stSexo;
	}

	public void setStSexo(String stSexo) {
		this.stSexo = stSexo;
	}

	public String getTpCliente() {
		return tpCliente;
	}

	public void setTpCliente(String tpCliente) {
		this.tpCliente = tpCliente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getIe() {
		return ie;
	}

	public void setIe(String ie) {
		this.ie = ie;
	}

	public String getNmEmpresaCliente() {
		return nmEmpresaCliente;
	}

	public void setNmEmpresaCliente(String nmEmpresaCliente) {
		this.nmEmpresaCliente = nmEmpresaCliente;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
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

	public Long getIdFilial() {
		return idFilial;
	}

	public void setIdFilial(Long idFilial) {
		this.idFilial = idFilial;
	}

	public List<PedidoBean> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<PedidoBean> pedidos) {
		this.pedidos = pedidos;
	}

	public String getFormaConhecimento() {
		return formaConhecimento;
	}

	public void setFormaConhecimento(String formaConhecimento) {
		this.formaConhecimento = formaConhecimento;
	}

	public String getQualCampanha() {
		return qualCampanha;
	}

	public void setQualCampanha(String qualCampanha) {
		this.qualCampanha = qualCampanha;
	}

	public String getQualWebsite() {
		return qualWebsite;
	}

	public void setQualWebsite(String qualWebsite) {
		this.qualWebsite = qualWebsite;
	}

	public String getTelefoneComercial() {
		return telefoneComercial;
	}

	public void setTelefoneComercial(String telefoneComercial) {
		this.telefoneComercial = telefoneComercial;
	}

	public String getTelefoneCelular() {
		return telefoneCelular;
	}

	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}

	public String getEmailTrabalho() {
		return emailTrabalho;
	}

	public void setEmailTrabalho(String emailTrabalho) {
		this.emailTrabalho = emailTrabalho;
	}

	public String getReferenciaEndereco() {
		return referenciaEndereco;
	}

	public void setReferenciaEndereco(String referenciaEndereco) {
		this.referenciaEndereco = referenciaEndereco;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
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

	public String getQualAnuncio() {
		return qualAnuncio;
	}

	public void setQualAnuncio(String qualAnuncio) {
		this.qualAnuncio = qualAnuncio;
	}

	public String getQualRede() {
		return qualRede;
	}

	public void setQualRede(String qualRede) {
		this.qualRede = qualRede;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getSetorContato() {
		return setorContato;
	}

	public void setSetorContato(String setorContato) {
		this.setorContato = setorContato;
	}

	public List<EnderecoBean> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<EnderecoBean> enderecos) {
		this.enderecos = enderecos;
	}

	public String getIndicacao() {
		return indicacao;
	}

	public void setIndicacao(String indicacao) {
		this.indicacao = indicacao;
	}

}
