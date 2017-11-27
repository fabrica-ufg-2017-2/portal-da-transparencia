package fabrica;


import fabrica.view.api.ApiPortaria;
import org.apache.log4j.PropertyConfigurator;

import fabrica.view.api.WebServiceConfiguracao;
import fabrica.view.api.pesquisa.ApiProjetoPesquisa;
import fabrica.view.api.ApiTarefa;
import fabrica.view.api.extensao.ApiProjetoExtensao;

/**
 *
 * @author  gabriel
 * @version 1.0.0
 *
 */
public class Principal {

	public static void main(String[] args) {
		/**
		 * Configuração de log.
		 */
		PropertyConfigurator.configure(ClassLoader.getSystemResource("log4j.properties"));

		/**
		 * Configuração de funcionamento das APIs Spark.
		 */
		WebServiceConfiguracao.config(args);

		/**
		 * Controllers que estrão ativos.
		 */
	    ApiTarefa.api(args);
	    ApiProjetoPesquisa.api(args);
            ApiProjetoExtensao.api(args);
            ApiPortaria.api(args);
	}
}
