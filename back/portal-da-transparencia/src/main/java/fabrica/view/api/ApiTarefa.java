package fabrica.view.api;

import static spark.Spark.*;

import fabrica.controller.dto.TarefaDTO;
import fabrica.controller.service.ServiceTarefa;

/**
 * 
 * @author  gabriel
 * @version 1.0.0
 * 
 *  Api da API para operações de CRUD com task.
 */
public class ApiTarefa implements Api {
	
	private static final SerializadorJson json = new SerializadorJson();
	
	/**
	 * Classe de serviço que contém todas as dependências necessárias
	 * para as operações com a entidade task.
	 */
	private static final ServiceTarefa servico = new ServiceTarefa();
	
	/**
	 * @param args - Args do programa principal.
	 * Metodo com todas as APIs que este view define.
	 */
	public static void api(String[] args) {
		post("/task", "application/json", (request, response) -> {
			return servico.criarTarefa(json.getGson().fromJson(request.body(), TarefaDTO.class));
						
		}, json);
		
		get("/task","application/json", (request, response) -> {
			return servico.buscarTodas();
		}, json);
		
		delete("/task",(request, response) -> {
			return servico.deletarTarefa(json.getGson().fromJson(request.body(), TarefaDTO.class));
		});
		
		put("/task","application/json", (request, response) -> {
			return servico.atualizarTarefa(json.getGson().fromJson(request.body(), TarefaDTO.class));
		}, json);
	}
}
