package fabrica.model.dao.pesquisa;

import fabrica.model.dao.GenericDAO;
import fabrica.model.dao.ProvedorTransacao;
import fabrica.model.domain.pesquisa.ProjetoPesquisa;

/**
 * 
 * @author Jean Marcos
 * @version 1.0.0
 * 
 *          Implementação concreta para manipulacao da entidade {@link ProjetoPesquisa}.
 */
public class ProjetoPesquisaDAO extends GenericDAO<ProjetoPesquisa, Long> {

	/**
	 * 
	 * @param transacao
	 *            - Provedor de EntityManager.
	 * @param clazzP
	 *            - Class da entidade.
	 */
	public ProjetoPesquisaDAO(ProvedorTransacao transacao, Class<ProjetoPesquisa> clazzP) {
		super(transacao, clazzP);
	}

}
