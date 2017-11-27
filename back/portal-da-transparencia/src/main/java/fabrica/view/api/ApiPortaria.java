package fabrica.view.api;

import static spark.Spark.delete;
import static spark.Spark.get;
import static spark.Spark.post;

import fabrica.controller.dto.PortariaDTO;
import fabrica.controller.service.ServicoPortaria;

public class ApiPortaria implements Api{
	
	private static final SerializadorJson json = new SerializadorJson();
	
	private static final ServicoPortaria servico = new ServicoPortaria();
	
	private static final String BASE_PATH = "/api/portaria";
	
	private static final String CONTENT_TYPE = "application/json";
	
	public static void api(String[] args) {
		post(BASE_PATH, CONTENT_TYPE, (request, response) -> {
                        response.type(CONTENT_TYPE);
			return servico.criarPortaria(json.getGson().fromJson(request.body(), PortariaDTO.class));
						
		}, json);
		
		get(BASE_PATH,CONTENT_TYPE, (request, response) -> {
                        response.type(CONTENT_TYPE);
			return servico.buscarTodas();
		}, json);
		
		delete(BASE_PATH,(request, response) -> {
                        response.type(CONTENT_TYPE);
			return servico.deletarPortaria(json.getGson().fromJson(request.body(), PortariaDTO.class));
		});
	}

}
