package fabrica.controller.dto;

import java.util.Date;

import fabrica.model.domain.Portaria;

/**
 * @author Erivan
 *
 */
public class PortariaDTO extends DTO<Portaria>{
	
	/**Atributo id */
	private Long id;
	
	/**Atributo numero */
	private Long numero;
	
	/**Atributo dataEmissao */
	private Date dataEmissao;
	
	/**Atributo dataInicio */
	private Date dataInicio;
	
	/**Atributo dataFim */
	private Date dataFim;
	
	/**Atributo integra */
	private String integra;
	
	/**Atributo resumo */
	private String resumo;
	
	/**
	 * Método converterDominio transforma um objeto Portaria em um objeto PortariaDTO.
	 */
	public static PortariaDTO converterDominio(Portaria portaria ) {
		PortariaDTO portariaDTO = new PortariaDTO();
		portariaDTO.id = portaria.getId();
		portariaDTO.numero = portaria.getNumero();
		portariaDTO.dataEmissao = portaria.getDataEmissao();
		portariaDTO.dataInicio = portaria.getDataInicio();
		portariaDTO.dataFim = portaria.getDataFim();
		portariaDTO.integra = portaria.getIntegra();
		portariaDTO.resumo = portaria.getResumo();
		
		return portariaDTO;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * atribui um valor para o campo id
	 * @param Long
	 */
	public void setId(Long id) {
		this.id = id;
	}

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
	
	
}
