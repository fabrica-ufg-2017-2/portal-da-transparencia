package fabrica.dto;

import java.util.Date;

import fabrica.model.dominio.Portaria;

public class PortariaDTO extends DTO<Portaria>{
	
	private Long numero;
	private Date dataEmissao;
	private Date dataInicio;
	private Date dataFim;
	private String integra;
	
	public static PortariaDTO converterDominio(Portaria portaria ) {
		PortariaDTO portariaDTO = new PortariaDTO();
		portariaDTO.id = portaria.getId();
		portariaDTO.numero = portaria.getNumero();
		portariaDTO.dataEmissao = portaria.getDataEmissao();
		portariaDTO.dataInicio = portaria.getDataInicio();
		portariaDTO.dataFim = portaria.getDataFim();
		portariaDTO.integra = portaria.getIntegra();
		
		return portariaDTO;
	}
	
	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
