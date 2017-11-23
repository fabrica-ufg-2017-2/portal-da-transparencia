package fabrica.model.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import fabrica.model.dao.Entidade;

@Entity
// @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Portaria extends Entidade {

	@Column
	private Long numero;

	@Column(name = "data_emissao")
	private Date dataEmissao;

	@Column
	private String resumo;

	@Column
	private Date dataInicio;

	@Column
	private Date dataFim;

	@Column
	private String integra;

	public Portaria NovaPortaria() {
		return this;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public String getIntegra() {
		return integra;
	}

	public void setIntegra(String integra) {
		this.integra = integra;
	}

}
