package fabrica.model.dao.ensino;

import fabrica.model.dao.GenericDAO;
import fabrica.model.dao.ProvedorTransacao;
import fabrica.model.domain.ensino.Turma;

/**
 * @author gabriel
 * @version 1.0.0
 */
public class TurmaDAO extends GenericDAO<Turma, Long> {

    /**
     *
     * @param transacao
     *            - Provedor de EntityManager.
     * @param clazz
     *            - Class da entidade.
     */
    public TurmaDAO(ProvedorTransacao transacao, Class<Turma> clazz) {
        super(transacao, clazz);
    }
}
