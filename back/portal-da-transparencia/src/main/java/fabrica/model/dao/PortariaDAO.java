package fabrica.model.dao;

import javax.persistence.NoResultException;
import javax.persistence.Query;


import fabrica.model.domain.Portaria;

/**
 * @author Erivan
 *
 */
public class PortariaDAO extends GenericDAO<Portaria, Long> {

	public PortariaDAO(ProvedorTransacao transacao, Class<Portaria> clazzP) {
		super(transacao, clazzP);
	}

	/**
	 * Método buscaPorNumero busca um portaria através do número.
	 */
	public Portaria buscaPorNumero(Long numero) {

		return (Portaria) trs.txr((em) -> {

			Query query = em.createQuery("SELECT p FROM Portaria p where p.numero = :num");
			query.setParameter("num", numero);

			Portaria portaria = null;
			try {
			portaria =  (Portaria) query.getSingleResult();
			}
			catch (NoResultException e) {
				portaria = new Portaria();
			}
			return portaria;
		});
	}
}
