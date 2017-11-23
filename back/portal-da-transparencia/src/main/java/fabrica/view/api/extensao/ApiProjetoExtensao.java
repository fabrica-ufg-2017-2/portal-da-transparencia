package fabrica.view.api.extensao;

import static spark.Spark.*;

import fabrica.controller.service.extensao.ServiceProjetoExtensao;
import fabrica.view.api.SerializadorJson;
import fabrica.view.api.Api;
import fabrica.controller.dto.extensao.ProjetoExtensaoDTO;
/**
 *
 * @author  Rony Nogueira
 * @version 1.0.0
 *
 *  Classe para operações relacionadas a entidade {@link ProjetoExtensao}
 */
public class ApiProjetoExtensao implements Api {

	/**
	 * Serializador de Objetos para JSON
	 */
	private static final SerializadorJson json = new SerializadorJson();
	/**
	 * Serviço para Projeto de Extensão
	 */
	private static final ServiceProjetoExtensao projetoService = new ServiceProjetoExtensao();
	/**
	 * URL base para projetos de Extensão
	 */
	private static final String BASE_PATH = "/api/extensao/projetos";
	/**
	 * Content-Type padrão para recebimento e retorno de dados
	 */
	private static final String CONTENT_TYPE = "application/json";

	/**
	 * @param args - Args do programa principal.
	 */
	public static void api(String[] args) {

		post(BASE_PATH,  CONTENT_TYPE, (request, response) -> {
			response.type(CONTENT_TYPE);
			return projetoService.criarProjeto(json.getGson().fromJson(request.body(), ProjetoExtensaoDTO.class));
		}, json);

		get(BASE_PATH, CONTENT_TYPE, (request, response) -> {
			response.type(CONTENT_TYPE);
			return projetoService.buscarTodas();
		}, json);
	}
}
