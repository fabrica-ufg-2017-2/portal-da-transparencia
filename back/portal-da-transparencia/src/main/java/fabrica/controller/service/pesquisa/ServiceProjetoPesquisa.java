package fabrica.controller.service.pesquisa;

import java.util.Collection;
import java.util.stream.Collectors;

import fabrica.controller.dto.TarefaDTO;
import fabrica.controller.dto.pesquisa.ProjetoPesquisaDTO;
import fabrica.model.dao.GenericDAO.BlocoAtualizar;
import fabrica.model.dao.TarefaDAO;
import fabrica.model.dao.TransacaoHibernate;
import fabrica.model.dao.pesquisa.ProjetoPesquisaDAO;
import fabrica.model.domain.Tarefa;
import fabrica.model.domain.pesquisa.ProjetoPesquisa;

/**
 * 
 * @author Jean Marcos
 * @version 1.0.0
 * 
 *          Classe com todas as depencias necessárias para manipulação da
 *          entidade {@link ProjetoPesquisa}. Aqui podemos ver todas as funcionalidades
 *          relacionadas com ProjetoPesquisa.
 */
public class ServiceProjetoPesquisa {

	private final ProjetoPesquisaDAO projetoPesquisaDAO = new ProjetoPesquisaDAO(new TransacaoHibernate(),
			ProjetoPesquisa.class);


	public Collection<ProjetoPesquisaDTO> listaProjetos() {
		return projetoPesquisaDAO.buscarTodos()
				        .stream()
				        .map(ProjetoPesquisaDTO::converterDominio)
				        .collect(Collectors.toList());
	}
}
