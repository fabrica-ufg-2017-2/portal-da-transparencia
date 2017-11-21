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

	private static final SerializadorJson json = new SerializadorJson();

	private static final ServiceProjetoExtensao projetoService = new ServiceProjetoExtensao();

	/**
	 * @param args - Args do programa principal.
	 */
	public static void api(String[] args) {

		post("/projeto_extensao", "application/json", (request, response) -> {
			return projetoService.criarProjeto(json.gson.fromJson(request.body(), ProjetoExtensaoDTO.class));
		}, json);

		get("/projeto_extensao","application/json", (request, response) -> {
			return projetoService.buscarTodas();
		}, json);
	}
}
