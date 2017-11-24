package fabrica.model.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import fabrica.model.dao.Entidade;

/**
 * @author Erivan
 *
 */
@Entity
public class Portaria extends Entidade {

	/**Atributo numero */
	@Column (unique = true)
	private Long numero;

	/**Atributo dataEmissao */
	@Column(name = "data_emissao")
	private Date dataEmissao;

	/**Atributo resumo */
	@Column
	private String resumo;

	/**Atributo dataInicio */
	@Column
	private Date dataInicio;

	/**Atributo dataFim */
	@Column
	private Date dataFim;

	/**Atributo integra */
	@Column
	private String integra;
	
	/**Atributo origem */
	@Column
	@Enumerated(EnumType.STRING)
	private EnumOrigemPortaria origem;

	/**
	 * @return the numero
	 */
	public Long getNumero() {
		return numero;
	}

	/**
	 * atribui um valor para o campo numero
	 * @param Long
	 */
	public void setNumero(Long numero) {
		this.numero = numero;
	}

	/**
	 * @return the dataEmissao
	 */
	public Date getDataEmissao() {
		return dataEmissao;
	}

	/**
	 * atribui um valor para o campo dataEmissao
	 * @param Date
	 */
	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	/**
	 * @return the resumo
	 */
	public String getResumo() {
		return resumo;
	}

	/**
	 * atribui um valor para o campo resumo
	 * @param String
	 */
	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	/**
	 * @return the dataInicio
	 */
	public Date getDataInicio() {
		return dataInicio;
	}

	/**
	 * atribui um valor para o campo dataInicio
	 * @param Date
	 */
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	/**
	 * @return the dataFim
	 */
	public Date getDataFim() {
		return dataFim;
	}

	/**
	 * atribui um valor para o campo dataFim
	 * @param Date
	 */
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	/**
	 * @return the integra
	 */
	public String getIntegra() {
		return integra;
	}

	/**
	 * atribui um valor para o campo integra
	 * @param String
	 */
	public void setIntegra(String integra) {
		this.integra = integra;
	}


	public EnumOrigemPortaria getOrigem() {
		return origem;
	}

	public void setOrigem(EnumOrigemPortaria origem) {
		this.origem = origem;
	}
	
	
}
