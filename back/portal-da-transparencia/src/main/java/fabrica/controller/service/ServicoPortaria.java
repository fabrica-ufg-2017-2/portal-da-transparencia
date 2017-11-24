package fabrica.controller.service;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;
import fabrica.model.dao.TransacaoHibernate;
import fabrica.model.dao.GenericDAO.BlocoAtualizar;
import fabrica.model.domain.Portaria;
import fabrica.controller.dto.PortariaDTO;
import fabrica.model.dao.PortariaDAO;

/**
 * @author Erivan
 *
 */
public class ServicoPortaria {

	/**Atributo portariaDAO */
	private final PortariaDAO portariaDAO = new PortariaDAO(new TransacaoHibernate(), Portaria.class);

	/**
	 * Método criarPortaria popula um objeto Portaria e invoca o método DAO responsável
	 * por salvar a portaria.
	 */
	public PortariaDTO criarPortaria(final PortariaDTO portariaDTO) {

		PortariaDTO resultado = null;

		if (isPortariaValida(portariaDTO)) {

			Portaria portaria = new Portaria();
			portaria.setNumero(portariaDTO.getNumero());
			portaria.setResumo(portariaDTO.getResumo());
			portaria.setDataInicio(portariaDTO.getDataInicio());
			portaria.setDataFim(portariaDTO.getDataFim());
			portaria.setDataEmissao(portaria.getDataEmissao());
			portaria.setIntegra(portariaDTO.getIntegra());
			portariaDAO.criar(portaria);

			resultado = portariaDTO;
		}

		return resultado;
	}

	/**
	 * Método isPortariaValida é responsável por validar se uma portaria é valida ou não.
	 * Na implementação atual ele apenas verificar se a portaria não possui um numero
	 * duplicado.
	 */
	private boolean isPortariaValida(PortariaDTO portariaDTO) {
		boolean resultado = true;
		PortariaDTO portariaBuscada = buscarPorNumero(portariaDTO);
		
		if(Optional.ofNullable(portariaBuscada.getId()).isPresent() ) {
			
			resultado = false;
		}
		
		return resultado;
	}

	/**
	 * Método deletarPortaria é responsável por invocar o método DAO responsável
	 * por deletar a portaria
	 */
	public PortariaDTO deletarPortaria(final PortariaDTO portariaDTO) {
		PortariaDTO portaria = buscarPorNumero(portariaDTO);
		
		portariaDAO.deletar(portaria.getId());
		return portariaDTO;
	}

	/**
	 * Método buscarPorNumero busca uma portaria pelo numero.
	 */
	public PortariaDTO buscarPorNumero(final PortariaDTO portariaDTO) {

		Portaria resultado = portariaDAO.buscaPorNumero(portariaDTO.getNumero());
		
		return PortariaDTO.converterDominio(resultado);
	}

	/**
	 * Método buscarTodas invoca o método DAO responsável por listar todas as portarias
	 */
	public Collection<PortariaDTO> buscarTodas() {
		return portariaDAO.buscarTodos().stream().map(PortariaDTO::converterDominio).collect(Collectors.toList());
	}
}