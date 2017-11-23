package fabrica.view.api;

import static spark.Spark.delete;
import static spark.Spark.get;
import static spark.Spark.post;
import static spark.Spark.put;

import fabrica.controller.dto.PortariaDTO;
import fabrica.controller.service.ServicoPortaria;

public class ApiPortaria {
	
	private static final SerializadorJson json = new SerializadorJson();
	
	private static final ServicoPortaria servico = new ServicoPortaria();
	
	
	public static void api(String[] args) {
		post("/task", "application/json", (request, response) -> {
			return servico.criarPortaria(json.getGson().fromJson(request.body(), PortariaDTO.class));
						
		}, json);
		
		get("/task","application/json", (request, response) -> {
			return servico.buscarTodas();
		}, json);
		
		delete("/task",(request, response) -> {
			return servico.deletarPortaria(json.getGson().fromJson(request.body(), PortariaDTO.class));
		});
		
		put("/task","application/json", (request, response) -> {
			return servico.mesclarPortaria(json.getGson().fromJson(request.body(), PortariaDTO.class));
		}, json);
	}

}
