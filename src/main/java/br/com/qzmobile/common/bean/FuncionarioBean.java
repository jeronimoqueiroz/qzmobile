package br.com.qzmobile.common.bean;

import br.com.qzmobile.common.annotation.Column;
import br.com.qzmobile.common.annotation.Id;
import br.com.qzmobile.common.annotation.Table;

/*
 * Descri��o: Funcionario do sistema
 * Gera��o autom�tica: 16/12/2012 
 */
@Table(name="FUNCIONARIO", owner="delivery")
public class FuncionarioBean extends AbstractEngineBean {

	@Id(autoIncrement="YES")
    @Column(name="id")
    private Long id; 

    @Column(name="nome")
    private String nome; 

    @Column(name="email")
    private String email;
    
    @Column(name="telefone_res")
    private String telefoneRes;
    
    @Column(name="telefone_cel")
    private String telefoneCel;

    @Column(name="endereco")
    private String endereco;

    @Column(name="cpf")
    private String cpf;
    
    @Column(name="id_setor")
    private Long idSetor;
    
    @Column(name="id_filial")
    private Long idFilial;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefoneRes() {
		return telefoneRes;
	}

	public void setTelefoneRes(String telefoneRes) {
		this.telefoneRes = telefoneRes;
	}

	public String getTelefoneCel() {
		return telefoneCel;
	}

	public void setTelefoneCel(String telefoneCel) {
		this.telefoneCel = telefoneCel;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Long getIdFilial() {
		return idFilial;
	}

	public void setIdFilial(Long idFilial) {
		this.idFilial = idFilial;
	}

	public Long getIdSetor() {
		return idSetor;
	}

	public void setIdSetor(Long idSetor) {
		this.idSetor = idSetor;
	}

}
