package fabrica.model.dao.geral;

import fabrica.model.dao.GenericDAO;
import fabrica.model.dao.ProvedorTransacao;
import fabrica.model.domain.geral.MapaPapel;

/**
 * @author gabriel
 * @version 1.0.0
 */
public class MapaPapelDAO extends GenericDAO<MapaPapel, Long> {

    /**
     *
     * @param transacao
     *            - Provedor de EntityManager.
     * @param clazzP
     *            - Class da entidade.
     */
    public MapaPapelDAO(ProvedorTransacao transacao, Class<MapaPapel> clazzP) {
        super(transacao, clazzP);
    }

}
