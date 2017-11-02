package fabrica.model.servico;

import java.util.Collection;
import java.util.stream.Collectors;

import fabrica.dto.TarefaDTO;
import fabrica.model.dao.GenericDAO.BlocoAtualizar;
import fabrica.model.dao.TarefaDAO;
import fabrica.model.dao.TransacaoHibernate;
import fabrica.model.dominio.Tarefa;

/**
 * 
 * @author gabriel
 * @version 1.0.0
 * 
 *          Classe com todas as depencias necessárias para manipulação da
 *          entidade {@link Tarefa}. Aqui podemos ver todas as funcionalidades
 *          relacionadas com Tarefa.
 */
public class ServicoTarefa {

	private final TarefaDAO tarefaDAO = new TarefaDAO(new TransacaoHibernate(),
			Tarefa.class);

	public TarefaDTO criarTarefa(final TarefaDTO tarefaDTO) {
		Tarefa tarefa = new Tarefa().NovaTarefa(tarefaDTO.getTitulo(),
				tarefaDTO.getDescricao());
		tarefaDAO.criar(tarefa);
		return tarefaDTO;
	}

	public TarefaDTO deletarTarefa(final TarefaDTO tarefaDTO) {
		tarefaDAO.deletar(tarefaDTO.getId());
		return tarefaDTO;
	}

	public TarefaDTO atualizarTarefa(final TarefaDTO tarefaDTO) {
		BlocoAtualizar<Tarefa> atualizacao = (registro) -> {
			return registro.NovaTarefa(tarefaDTO.getTitulo(),
					tarefaDTO.getDescricao());
		};
		tarefaDAO.atualizar(atualizacao, tarefaDTO.getId());

		return tarefaDTO;
	}

	public Collection<TarefaDTO> buscarTodas() {
		return tarefaDAO.buscarTodos()
				        .stream()
				        .map(TarefaDTO::converterDominio)
				        .collect(Collectors.toList());
	}
}
