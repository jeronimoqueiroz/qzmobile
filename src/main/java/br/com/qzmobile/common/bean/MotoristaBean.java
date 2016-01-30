package br.com.qzmobile.common.bean;

import br.com.qzmobile.common.annotation.Column;
import br.com.qzmobile.common.annotation.Id;
import br.com.qzmobile.common.annotation.Table;

/*
 */
@Table(name="MOTORISTA", owner="delivery")
public class MotoristaBean extends AbstractEngineBean {

	@Id(autoIncrement="YES")
    @Column(name="id")
    private Long id; 

    @Column(name="nm_motorista")
    private String nmMotorista;
    
    @Column(name="st_ativo")
    private String stAtivo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNmMotorista() {
		return nmMotorista;
	}

	public void setNmMotorista(String nmMotorista) {
		this.nmMotorista = nmMotorista;
	}

	public String getStAtivo() {
		return stAtivo;
	}

	public void setStAtivo(String stAtivo) {
		this.stAtivo = stAtivo;
	}

    
}
