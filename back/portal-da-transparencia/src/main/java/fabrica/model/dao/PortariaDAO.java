package fabrica.model.dao;

import fabrica.model.domain.Portaria;

public class PortariaDAO extends GenericDAO<Portaria, Long>{

	public PortariaDAO(ProvedorTransacao transacao, Class<Portaria> clazzP) {
		super(transacao, clazzP);
	}

}
