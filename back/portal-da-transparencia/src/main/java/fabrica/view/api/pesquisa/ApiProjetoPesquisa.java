package fabrica.view.api.pesquisa;

import static spark.Spark.*;

import fabrica.controller.dto.pesquisa.ProjetoPesquisaDTO;
import fabrica.controller.service.pesquisa.ServiceProjetoPesquisa;
import fabrica.view.api.Api;
import fabrica.view.api.SerializadorJson;

/**
 * 
 * @author  Jean Marcos
 * @version 1.0.0
 * 
 *  Api da API para operações de CRUD com ProjetoPesquisa.
 */
public class ApiProjetoPesquisa implements Api {
	
	private static final SerializadorJson json = new SerializadorJson();
	
	private static final String BASE_PATH = "/api/pesquisa/projetos";
	
	private static final String CONTENT_TYPE = "application/json";
	
	/**
	 * Classe de serviço que contém todas as dependências necessárias
	 * para as operações com a entidade ProjetoPesquisa.
	 */
	private static final ServiceProjetoPesquisa servico = new ServiceProjetoPesquisa();
	
	/**
	 * @param args - Args do programa principal.
	 * Metodo com todas as APIs que este view define.
	 */
	public static void api(String[] args) {	
		get(BASE_PATH, CONTENT_TYPE, (request, response) -> {
			response.type(CONTENT_TYPE);
			return servico.listaProjetos();
		}, json);
		
		post(BASE_PATH, CONTENT_TYPE, (request, response) -> {
			response.type(CONTENT_TYPE);
			return servico.criarProjetoPesquisa(json.getGson().fromJson(request.body(), ProjetoPesquisaDTO.class));
		}, json);
	}
}
