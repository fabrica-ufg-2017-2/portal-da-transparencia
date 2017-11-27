package fabrica.view.api.ensino;

import fabrica.controller.dto.ensino.PeriodoLetivoDTO;
import fabrica.controller.service.ensino.DisciplinaService;
import fabrica.view.api.Api;
import fabrica.view.api.SerializadorJson;
import static spark.Spark.*;
/**
 * @author gabriel
 * @version 1.0.0
 */
public class ApiEnsino implements Api {

    /**
     * Serializador de Objetos para JSON
     */
    private static final SerializadorJson json = new SerializadorJson();

    private static final DisciplinaService disciplinaService = new DisciplinaService();

    /**
     * URL base para serviços projeto ensino
     */
    private static final String BASE_PATH = "/api/ensino";
    /**
     * Content-Type padrão para recebimento e retorno de dados
     */
    private static final String CONTENT_TYPE = "application/json";


    /**
     * @param args - Args do programa principal.
     * Metodo com todas as APIs que este view define.
     */
    public static void api(String[] args) {
        post(BASE_PATH + "/displinas/periodoletivo", CONTENT_TYPE, (request, response) -> {
            response.type(CONTENT_TYPE);
            return disciplinaService.disciplinasPeriodoLetivo(json.getGson().fromJson(request.body(), PeriodoLetivoDTO.class));
        }, json);
    }
}
