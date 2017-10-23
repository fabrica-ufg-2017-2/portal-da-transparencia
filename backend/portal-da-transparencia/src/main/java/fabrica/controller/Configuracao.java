package fabrica.controller;

import static spark.Spark.*;

import fabrica.dto.ExcecaoNegocioDTO;
import fabrica.model.dominio.ExcecaoNegocio;
import fabrica.util.UtilArgs;

/**
 * 
 * @author gabriel
 * @version 1.0.0
 * 
 *          Classe para configuração de filtros de requisições, controle de
 *          exeções e demais aspectos que seja inerentes ao webservice.
 */
public final class Configuracao {
	
	private static final SerializadorJson json = new SerializadorJson();
	
	public static void config(String args[]) {
	    
		/**
		 * Passa os argumentos ao ultilitario para guarda-los
		 * em memoria.
		 */
		UtilArgs.configura(args);
		
		/**
		 * Tratamento genérico de exceções.
		 */
		exception(ExcecaoNegocio.class, (excecao, requesicao, resposta) -> {			
			resposta.body(json.gson.toJson(ExcecaoNegocioDTO.converterDominio(excecao)));
			resposta.header("content-type", "application/json");
			
			resposta.status(excecao.getHttpCode());
		});
	}
}
