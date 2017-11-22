package fabrica.controller.dto;


import fabrica.model.domain.ExcecaoNegocio;

/**
 * 
 * @author  gabriel
 * @version 1.0.0
 * 
 * DTO correpondente a entidade {@link ExcecaoNegocio}.
 */
public class ExcecaoNegocioDTO extends DTO<ExcecaoNegocio> {

	public Integer codErro;
	
	public String tituloErro;
	
	public String descricaoErro;

	public Integer getCodErro() {
		return codErro;
	}

	public void setCodErro(Integer codErro) {
		this.codErro = codErro;
	}

	public String getTituloErro() {
		return tituloErro;
	}

	public void setTituloErro(String tituloErro) {
		this.tituloErro = tituloErro;
	}

	public String getDescricaoErro() {
		return descricaoErro;
	}

	public void setDescricaoErro(String descricaoErro) {
		this.descricaoErro = descricaoErro;
	}
	
	public static ExcecaoNegocioDTO converterDominio(ExcecaoNegocio dominio) {
		ExcecaoNegocioDTO excecaoNegocioDTO = new ExcecaoNegocioDTO();
			excecaoNegocioDTO.codErro = dominio.getCodErro();
			excecaoNegocioDTO.tituloErro = dominio.getTituloErro();
			excecaoNegocioDTO.descricaoErro = dominio.getDescricaoErro();
		return excecaoNegocioDTO;
	}
}
