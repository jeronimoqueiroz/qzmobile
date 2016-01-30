package br.com.qzmobile.common.bean;

import br.com.qzmobile.common.annotation.Column;
import br.com.qzmobile.common.annotation.Id;
import br.com.qzmobile.common.annotation.Table;

/*
 * Descri��o: Cadastro de usuarios do Sistema
 * Gera��o autom�tica: 15/08/2012 11:45:53
 */
@Table(name="USUARIO", owner="delivery")
public class UsuarioBean extends AbstractEngineBean {

	@Id(autoIncrement="YES")
    @Column(name="id")
    private Long id; // Id do usuario

    @Column(name="nome")
    private String nome; // Nome do usu�rio

    @Column(name="email")
    private String email; // e-mail do usu�rio

    @Column(name="login")
    private String login; // login do usuario no sistema

    @Column(name="senha")
    private String senha; // Senha do usuario (criptografada)

    @Column(name="situacao")
    private String situacao; // Situacao do usuario (Ativo, Inativo, Cancelado)

    @Column(name="id_perfil")
    private Long idPerfil; // Id do perfil do usu�rio

    @Column(name="telefone")
    private String telefone; // Telefone do Usu�rio


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
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getSituacao() {
        return situacao;
    }
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    public Long getIdPerfil() {
        return idPerfil;
    }
    public void setIdPerfil(Long idPerfil) {
        this.idPerfil = idPerfil;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
