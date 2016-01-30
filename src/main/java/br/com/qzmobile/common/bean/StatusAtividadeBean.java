package br.com.qzmobile.common.bean;

import br.com.qzmobile.common.annotation.Column;
import br.com.qzmobile.common.annotation.Id;
import br.com.qzmobile.common.annotation.Table;

@Table(name="STATUS_ATIVIDADE", owner="delivery")
public class StatusAtividadeBean extends AbstractEngineBean {
	
	@Id(autoIncrement="YES")
    @Column(name="id")
    private Long id; 

	 @Column(name="nm_status")
	 private String nmStatus;
	 
	 @Column(name="cor")
	 private String cor;
	 
	 @Column(name="time_out")
	 private Long timeOut;

		 
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Long getTimeOut() {
		return timeOut;
	}

	public void setTimeOut(Long timeOut) {
		this.timeOut = timeOut;
	}

	public String getNmStatus() {
		return nmStatus;
	}

	public void setNmStatus(String nmStatus) {
		this.nmStatus = nmStatus;
	}
	 


}
