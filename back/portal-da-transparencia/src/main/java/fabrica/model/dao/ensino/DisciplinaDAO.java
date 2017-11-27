package fabrica.model.dao.ensino;

import fabrica.model.dao.GenericDAO;
import fabrica.model.dao.ProvedorTransacao;
import fabrica.model.domain.ensino.Disciplina;

/**
 * @author gabriel
 * @version 1.0.0
 */
public class DisciplinaDAO extends GenericDAO<Disciplina, Long> {

    /**
     *
     * @param transacao
     *            - Provedor de EntityManager.
     * @param clazz
     *            - Class da entidade.
     */
    public DisciplinaDAO(ProvedorTransacao transacao, Class<Disciplina> clazz) {
        super(transacao, clazz);
    }

}
