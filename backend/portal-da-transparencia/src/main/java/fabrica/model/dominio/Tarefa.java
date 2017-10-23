package fabrica.model.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import fabrica.model.dao.Entidade;

/**
 * 
 * @author  gabriel
 * @version 1.0.0
 */

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Tarefa extends Entidade {

	@Column(length = 30)
	private String titulo;

	@Column(length = 1000)
	private String descricao;

	public Tarefa() {
	}

	/**
	 * 
	 * @param tituloP
	 *            - Titutlo da tarefa.
	 * @param descricaoP
	 *            - Descricao da tarefa.
	 */
	public Tarefa NovaTarefa(final String tituloP, final String descricaoP) {
		
		if (tituloP == null || tituloP.length() > 30)
			throw new ExcecaoNegocio(1, "Titulo inválido",
					"Título da tarefa nulo ou maior que 30 caracteres.", 400);
		
		if (descricaoP == null || descricaoP.length() > 1000)
			throw new ExcecaoNegocio(2, "Descrição inválida",
					"Descrição da tarefa nula ou maior que 1000 caracteres.", 400);

		titulo = tituloP;
		descricao = descricaoP;
		return this;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getDescricao() {
		return descricao;
	}
}
