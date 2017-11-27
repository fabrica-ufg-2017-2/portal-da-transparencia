package fabrica.model.dao.ensino;

import fabrica.model.dao.GenericDAO;
import fabrica.model.dao.ProvedorTransacao;
import fabrica.model.domain.ensino.Disciplina;
import fabrica.model.domain.ensino.Docente;

/**
 * @author gabriel
 * @version 1.0.0
 */
public class DocenteDAO extends GenericDAO<Docente, Long> {

    /**
     *
     * @param transacao
     *            - Provedor de EntityManager.
     * @param clazz
     *            - Class da entidade.
     */
    public DocenteDAO(ProvedorTransacao transacao, Class<Docente> clazz) {
        super(transacao, clazz);
    }

}
