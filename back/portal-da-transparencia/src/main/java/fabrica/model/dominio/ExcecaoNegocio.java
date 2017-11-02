package fabrica.model.dominio;

public class ExcecaoNegocio extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer codErro;
	
	private String tituloErro;
	
	private String descricaoErro;
	
	private Integer httpCode;

	public ExcecaoNegocio(Integer codErro, String tituloErro,
			String descricaoErro, Integer httpCode) {
		super();
		this.codErro = codErro;
		this.tituloErro = tituloErro;
		this.descricaoErro = descricaoErro;
		this.httpCode = httpCode;
	}

	public Integer getCodErro() {
		return codErro;
	}

	public String getTituloErro() {
		return tituloErro;
	}

	public String getDescricaoErro() {
		return descricaoErro;
	}

	public Integer getHttpCode() {
		return httpCode;
	}
}
