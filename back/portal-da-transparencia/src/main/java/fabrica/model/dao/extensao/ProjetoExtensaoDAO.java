package fabrica.model.dao.extensao;

import fabrica.model.domain.extensao.ProjetoExtensao;
import fabrica.model.dao.GenericDAO;
import fabrica.model.dao.ProvedorTransacao;

/**
 *
 * @author Rony Nogueira
 * @version 1.0.0
 */
public class ProjetoExtensaoDAO extends GenericDAO<ProjetoExtensao, Long> {

	/**
	 *
	 * @param transacao
	 *            - Provedor de EntityManager.
	 * @param clazzP
	 *            - Class da entidade.
	 */
	public ProjetoExtensaoDAO(ProvedorTransacao transacao, Class<ProjetoExtensao> clazzP) {
		super(transacao, clazzP);
	}

}
