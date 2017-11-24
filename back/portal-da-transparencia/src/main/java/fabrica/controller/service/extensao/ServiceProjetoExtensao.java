package fabrica.controller.service.extensao;

import java.util.Collection;
import java.util.stream.Collectors;

import fabrica.controller.dto.extensao.ProjetoExtensaoDTO;
import fabrica.model.dao.extensao.ProjetoExtensaoDAO;
import fabrica.model.dao.TransacaoHibernate;
import fabrica.model.domain.extensao.ProjetoExtensao;

/**
 *
 * @author Rony Nogueira
 * @version 1.0.0
 *
 * Classe responsável por manipular a entidade {@link ProjetoExtensao}
 */
public class ServiceProjetoExtensao {
	/**
	 * DAO para Projeto de Extensão
	 */
	private final ProjetoExtensaoDAO projetoDAO = new ProjetoExtensaoDAO(new TransacaoHibernate(),
			ProjetoExtensao.class);
	/**
	 * Cria um novo projeto
	 * @param  final ProjetoExtensaoDTO projetoDTO
	 * @return       ProjetoExtensaoDTO
	 */
	public ProjetoExtensaoDTO criarProjeto(final ProjetoExtensaoDTO projetoDTO) {
		ProjetoExtensao projeto = new ProjetoExtensao().novo(projetoDTO.getNome(),
				projetoDTO.getDescricao(), projetoDTO.getInicio(), projetoDTO.getFim(),
				projetoDTO.getTipo());
		projetoDAO.criar(projeto);
		return projetoDTO;
	}
  /**
   * Busca todos os Projetos de Extensão
   * @return Collection<ProjetoExtensaoDTO>
   */
	public Collection<ProjetoExtensaoDTO> buscarTodas() {
		return projetoDAO.buscarTodos()
				        .stream()
				        .map(ProjetoExtensaoDTO::converterDominio)
				        .collect(Collectors.toList());
	}
}
