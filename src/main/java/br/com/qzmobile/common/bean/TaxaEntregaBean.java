package br.com.qzmobile.common.bean;

import br.com.qzmobile.common.annotation.Column;
import br.com.qzmobile.common.annotation.Id;
import br.com.qzmobile.common.annotation.Table;

/*
 */
@Table(name="TAXA_ENTREGA", owner="delivery")
public class TaxaEntregaBean extends AbstractEngineBean {

	@Id(autoIncrement="YES")
    @Column(name="id")
    private Long id; 

    @Column(name="taxa")
    private Double taxa; 
    
    @Column(name="distancia_inicial")
    private Long distanciaInicial; 
    
    @Column(name="distancia_final")
    private Long distanciaFinal;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}

	public Long getDistanciaInicial() {
		return distanciaInicial;
	}

	public void setDistanciaInicial(Long distanciaInicial) {
		this.distanciaInicial = distanciaInicial;
	}

	public Long getDistanciaFinal() {
		return distanciaFinal;
	}

	public void setDistanciaFinal(Long distanciaFinal) {
		this.distanciaFinal = distanciaFinal;
	} 

   
}
