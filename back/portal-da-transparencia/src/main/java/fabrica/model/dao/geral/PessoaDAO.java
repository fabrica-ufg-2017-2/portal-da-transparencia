package fabrica.model.dao.geral;

import fabrica.model.dao.GenericDAO;
import fabrica.model.dao.ProvedorTransacao;
import fabrica.model.domain.geral.MapaPapel;
import fabrica.model.domain.geral.Pessoa;

/**
 * @author gabriel
 * @version 1.0.0
 */
public class PessoaDAO extends GenericDAO<Pessoa, Long> {

    /**
     *
     * @param transacao
     *            - Provedor de EntityManager.
     * @param clazzP
     *            - Class da entidade.
     */
    public PessoaDAO(ProvedorTransacao transacao, Class<Pessoa> clazzP) {
        super(transacao, clazzP);
    }

}
