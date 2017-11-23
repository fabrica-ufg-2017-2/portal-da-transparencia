package fabrica.model.dao;

import fabrica.model.domain.Tarefa;

/**
 * 
 * @author gabriel
 * @version 1.0.0
 * 
 *          Implementação concreta para manipulacao da entidade {@link Tarefa}.
 */
public class TarefaDAO extends GenericDAO<Tarefa, Long> {

	/**
	 * 
	 * @param transacao
	 *            - Provedor de EntityManager.
	 * @param clazzP
	 *            - Class da entidade.
	 */
	public TarefaDAO(ProvedorTransacao transacao, Class<Tarefa> clazzP) {
		super(transacao, clazzP);
	}

}
