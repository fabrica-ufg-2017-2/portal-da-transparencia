package fabrica.controller.service;

import static org.junit.Assert.*;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import fabrica.controller.dto.PortariaDTO;


/**
 * 
 * @author  erivan
 * @version 1.0.0
 */
/**
 * @author Erivan
 *
 */
public class PortariaTest {

	/**Atributo servico */
	private ServicoPortaria servico;
	
	/**Atributo portariaDTO */
	private PortariaDTO portariaDTO;
	
	/**
	 * Método setUp prepara atributos e objetos reutilizados pelos outros teste
	 */
	@Before
	public void setUp() throws Exception {
		servico = new ServicoPortaria();
		
		portariaDTO = new PortariaDTO();
		portariaDTO.setNumero(0003l);
		portariaDTO.setIntegra("Teste");
	}

	/**
	 * Método testBuscarPortarias verifica se está sendo buscada uma lista de portarias
	 */
	@Test
	public void testBuscarPortarias() {
		servico.criarPortaria(portariaDTO);
		
		Collection<PortariaDTO> resultado = servico.buscarTodas();
		
		assertTrue(resultado.size() >= 1 );
	}
	

	/**
	 * Método testcriarPortariaComDadosValidos verifica se é possivel inserir um portaria
	 * informando dados válidos.
	 */
	@Test
	public void testcriarPortariaComDadosValidos() {
		PortariaDTO portariaBuscada = servico.buscarPorNumero(portariaDTO);
		
		if(portariaBuscada.getId() != 0 ) {
			servico.deletarPortaria(portariaBuscada);
		}
		
		servico.criarPortaria(portariaDTO);
		PortariaDTO resultado = servico.buscarPorNumero(portariaDTO);
		assertTrue(resultado.getId() != null );
	}
	
	/**
	 * Método buscarPortariaPorNumero verifica se é possivel buscar uma portaria
	 * cadastrada pelo número.
	 */
	@Test
	public void buscarPortariaPorNumero() {
		PortariaDTO portariaTeste = new PortariaDTO();
		portariaTeste.setNumero(501l);
		servico.criarPortaria(portariaTeste);
		
		PortariaDTO resultado = servico.buscarPorNumero(portariaTeste);
		
		assertTrue(resultado.getNumero().compareTo(portariaTeste.getNumero()) == 0 );
	}
	
	/**
	 * Método testDeletarPortariaValida verifica se é possivel deletar uma portaria
	 */
	@Test
	public void testDeletarPortariaValida() {
		PortariaDTO portariaTeste = new PortariaDTO();
		portariaTeste.setNumero(501l);
		servico.criarPortaria(portariaTeste);
		
		PortariaDTO resultado = servico.buscarPorNumero(portariaTeste);

		servico.deletarPortaria(resultado);

		resultado = servico.buscarPorNumero(portariaTeste);
		
		assertTrue(resultado.getId() == null );
	}
}
