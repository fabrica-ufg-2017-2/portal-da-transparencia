package fabrica.view.api;

import com.google.gson.Gson;

import spark.ResponseTransformer;

/**
 * 
 * @author gabriel
 * @version 1.0.0
 * 
 *          Classe que implementa a interface e transformações de respotas do
 *          Spark dessa maneira podemos transformar as repostas da camada de
 *          serviço em JSON.
 */
public class SerializadorJson implements ResponseTransformer {

	/*
	 * Framework para serialização e desserialização com JSON.
	 */
	protected Gson gson = new Gson();

	/**
	 * @param model
	 *            - Objeto retornado da camada de serviço.
	 * @return JSON correspondente a serialização de model.
	 */
	@Override
	public String render(Object model) throws Exception {
		return gson.toJson(model);
	}
	
	/**
	 * Retorna o objeto serializador/desserealizador da instancia
	 * @return {@link Gson}
	 */
	public Gson getGson() {
		return this.gson;
	}
}
