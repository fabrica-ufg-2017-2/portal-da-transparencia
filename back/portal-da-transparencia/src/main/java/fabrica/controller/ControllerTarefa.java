package fabrica.controller;

import static spark.Spark.*;

import fabrica.dto.TarefaDTO;
import fabrica.model.servico.ServicoTarefa;

/**
 * 
 * @author  gabriel
 * @version 1.0.0
 * 
 *  Controller da API para operações de CRUD com tarefa.
 */
public class ControllerTarefa implements Controller {
	
	private static final SerializadorJson json = new SerializadorJson();
	
	/**
	 * Classe de serviço que contém todas as dependências necessárias
	 * para as operações com a entidade tarefa.
	 */
	private static final ServicoTarefa servico = new ServicoTarefa();
	
	/**
	 * @param args - Args do programa principal.
	 * Metodo com todas as APIs que este controller define.
	 */
	public static void api(String[] args) {
		post("/tarefa", "application/json", (request, response) -> {
			return servico.criarTarefa(json.gson.fromJson(request.body(), TarefaDTO.class));
						
		}, json);
		
		get("/tarefa","application/json", (request, response) -> {
			return servico.buscarTodas();
		}, json);
		
		delete("/tarefa",(request, response) -> {
			return servico.deletarTarefa(json.gson.fromJson(request.body(), TarefaDTO.class));
		});
		
		put("/tarefa","application/json", (request, response) -> {
			return servico.atualizarTarefa(json.gson.fromJson(request.body(), TarefaDTO.class));
		}, json);
	}
}
