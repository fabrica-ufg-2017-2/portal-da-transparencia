package fabrica.model.dao.ensino;

import fabrica.model.dao.GenericDAO;
import fabrica.model.dao.ProvedorTransacao;
import fabrica.model.domain.ensino.Curso;

/**
 * @author gabriel
 * @version 1.0.0
 */
public class CursoDAO extends GenericDAO<Curso, Long> {

    /**
     *
     * @param transacao
     *            - Provedor de EntityManager.
     * @param clazz
     *            - Class da entidade.
     */
    public CursoDAO(ProvedorTransacao transacao, Class<Curso> clazz) {
        super(transacao, clazz);
    }

}
