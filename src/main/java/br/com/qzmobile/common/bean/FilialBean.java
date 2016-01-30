package br.com.qzmobile.common.bean;

import br.com.qzmobile.common.annotation.Column;
import br.com.qzmobile.common.annotation.Id;
import br.com.qzmobile.common.annotation.Table;

/*
 * Descri��o: Cadastro de filial
 */
@Table(name="FILIAL", owner="delivery")
public class FilialBean extends AbstractEngineBean {

	@Id(autoIncrement="YES")
    @Column(name="id")
    private Long id; 

    @Column(name="nm_filial")
    private String nmFilial; 
    
    @Column(name="endereco")
    private String endereco; 
    
    @Column(name="telefone")
    private String telefone; 

    @Column(name="st_matriz")
    private boolean stMatriz;

    @Column(name="contato")
    private String contato;
    
    @Column(name="email_contato")
    private String emailContato;

    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNmFilial() {
		return nmFilial;
	}

	public void setNmFilial(String nmFilial) {
		this.nmFilial = nmFilial;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getEmailContato() {
		return emailContato;
	}

	public void setEmailContato(String emailContato) {
		this.emailContato = emailContato;
	}

	public boolean isStMatriz() {
		return stMatriz;
	}

	public void setStMatriz(boolean stMatriz) {
		this.stMatriz = stMatriz;
	} 
    
}
