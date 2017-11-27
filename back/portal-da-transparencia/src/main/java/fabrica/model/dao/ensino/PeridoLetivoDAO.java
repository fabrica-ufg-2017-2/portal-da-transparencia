package fabrica.model.dao.ensino;

import fabrica.model.dao.GenericDAO;
import fabrica.model.dao.ProvedorTransacao;
import fabrica.model.domain.ensino.PeridoLetivo;

/**
 * @author gabriel
 * @version 1.0.0
 */
public class PeridoLetivoDAO extends GenericDAO<PeridoLetivo, Long> {

    /**
     *
     * @param transacao
     *            - Provedor de EntityManager.
     * @param clazz
     *            - Class da entidade.
     */
    public PeridoLetivoDAO(ProvedorTransacao transacao, Class<PeridoLetivo> clazz) {
        super(transacao, clazz);
    }
}
