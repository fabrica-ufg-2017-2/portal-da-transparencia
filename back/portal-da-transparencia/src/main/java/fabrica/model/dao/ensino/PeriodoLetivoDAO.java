package fabrica.model.dao.ensino;

import fabrica.model.dao.GenericDAO;
import fabrica.model.dao.ProvedorTransacao;
import fabrica.model.domain.ensino.PeriodoLetivo;

/**
 * @author gabriel
 * @version 1.0.0
 */
public class PeriodoLetivoDAO extends GenericDAO<PeriodoLetivo, Long> {

    /**
     *
     * @param transacao
     *            - Provedor de EntityManager.
     * @param clazz
     *            - Class da entidade.
     */
    public PeriodoLetivoDAO(ProvedorTransacao transacao, Class<PeriodoLetivo> clazz) {
        super(transacao, clazz);
    }
}
