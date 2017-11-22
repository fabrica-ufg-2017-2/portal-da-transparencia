package fabrica.controller.dto.pesquisa;

import fabrica.controller.dto.DTO;
import java.util.Date;
import fabrica.model.domain.pesquisa.ProjetoPesquisa;

/**
 * 
 * @author  Jean Marcos
 * @version 1.0.0
 * 
 * DTO correpondente a entidade {@link ProjetoPesquisa}.
 */
public class ProjetoPesquisaDTO extends DTO<ProjetoPesquisa> {

	private Long id;
	
	private String nome;
	
	private String situacao;
	
	private String areaConhecimento;
	
	private Date dataInicio;
	
	private Date dataFim;
	
	public static ProjetoPesquisaDTO converterDominio(ProjetoPesquisa dominio) {
		ProjetoPesquisaDTO projetoPesquisaDTO = new ProjetoPesquisaDTO();
		projetoPesquisaDTO.id = dominio.getId();
		projetoPesquisaDTO.nome = dominio.getNome();
		projetoPesquisaDTO.situacao = dominio.getSituacao();
		projetoPesquisaDTO.areaConhecimento = dominio.getAreaConhecimento();
		projetoPesquisaDTO.dataInicio = dominio.getDataInicio();
		projetoPesquisaDTO.dataFim = dominio.getDataFim();
		return projetoPesquisaDTO;
	}

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

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
	public String getAreaConhecimento() {
		return areaConhecimento;
	}

	public void setAreaConhecimento(String areaConhecimento) {
		this.areaConhecimento = areaConhecimento;
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
	
}
