package fabrica.model.servico;

import java.util.Collection;
import java.util.stream.Collectors;

import fabrica.model.dao.TransacaoHibernate;
import fabrica.model.dominio.Portaria;
import fabrica.dto.PortariaDTO;
import fabrica.model.dao.GenericDAO.BlocoAtualizar;
import fabrica.model.dao.PortariaDAO;


public class ServicoPortaria {

	private final PortariaDAO portariaDAO = new PortariaDAO(new TransacaoHibernate(), Portaria.class);

	public PortariaDTO criarPortaria(final PortariaDTO portariaDTO) {
		Portaria portaria = new Portaria();
		portariaDAO.criar(portaria);
		return portariaDTO;
	}

	public PortariaDTO deletarPortaria(final PortariaDTO portariaDTO) {
		portariaDAO.deletar(portariaDTO.getId());
		return portariaDTO;
	}

	public PortariaDTO mesclarPortaria(final PortariaDTO portariaDTO) {
		BlocoAtualizar<Portaria> atualizacao = (registro) -> {
			return registro.NovaPortaria();
		};
		portariaDAO.atualizar(atualizacao, portariaDTO.getId());

		return portariaDTO;
	}

	public Collection<PortariaDTO> buscarTodas() {
		return portariaDAO.buscarTodos()
				        .stream()
				        .map(PortariaDTO::converterDominio)
				        .collect(Collectors.toList());
	}
}