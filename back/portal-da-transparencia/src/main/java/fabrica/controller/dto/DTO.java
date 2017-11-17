package fabrica.controller.dto;

/**
 * 
 * @author gabriel
 * @version 1.0.0
 * 
 * @param <T>
 *            - Entidade do modelo de domain que deseja-se passar para o DTO.
 */
public abstract class DTO<T> {

	/**
	 * 
	 * @param dominio
	 *            - Instancia do modelo de domínio.
	 * @return Instancia do DTO correspondete ao modelo de domínio.
	 */
	public static <T> DTO<T> converterDominio(T dominio) {
		return null;
	}
}
