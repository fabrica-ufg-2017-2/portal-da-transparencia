package fabrica;


import org.apache.log4j.PropertyConfigurator;

import fabrica.controller.Configuracao;
import fabrica.controller.ControllerTarefa;

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
		Configuracao.config(args);
		
		/**
		 * Controllers que estrão ativos.
		 */
	    ControllerTarefa.api(args);
	}
}
