package fabrica.model.dao;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;

import fabrica.model.domain.Portaria;

public class PortariaDAO extends GenericDAO<Portaria, Long> {

	public PortariaDAO(ProvedorTransacao transacao, Class<Portaria> clazzP) {
		super(transacao, clazzP);
	}

	public Portaria buscaPorNumero(Long numero) {

		return (Portaria) trs.txr((em) -> {

			Query query = em.createQuery("SELECT p FROM Portaria p where p.numero = :num");
			query.setParameter("num", numero);

			Portaria portaria = (Portaria) query.getSingleResult();

			return portaria;
		});
	}

}
