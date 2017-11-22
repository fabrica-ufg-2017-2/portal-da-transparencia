package fabrica.util;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author  gabriel
 * @version 1.0.0
 * 
 * Classe para guardar os agurmentos passados na Main
 * da aplicacao.
 */
public final class UtilArgs {
	
	/**
	 * Variavel estática para guardar os argumentos passados.
	 */
	private static Map<Args, String> parametros = new HashMap<>();
	
	/**
	 * 
	 * @param args - Argumentos passados na Main da aplicação.
	 */
	public static void configura(String args[]) {
		Args[] constantes = Args.values();
		for (int i = 0; i < args.length; i++)
			for (int j = 0; j < constantes.length; j++)
				if (args[i].contains(constantes[j].arg))
					parametros.put(constantes[j], args[i].replace(constantes[j].arg, ""));
	}
	
	/**
	 * 
	 * @return Instancia nova com os args da aplicacao.
	 */
	public static Map<Args, String> getParametros() {
		Map<Args, String> novo = new HashMap<>();
		parametros.entrySet()
		          .stream()
		          .forEach(a -> novo.put(a.getKey(), a.getValue()));
		return novo;
	}
	
	public static enum Args {
		
		/**
		 * Dns ou Ip do banco.
		 */
		DNSBD("DNSBD:"),
			
		/**
		 * Nome do schema do banco.
		 */
		NOMEBD("NOMEBD:"),
			
		/**
		 * Porta do banco de dados.
		 */
		PORTBD("PORTBD:"),
		
		/*
		 * Usúario do banco de dados.
		 */
		USUBD("USUBD:"),
		
		/**
		 * Senha do banco de dados.
		 */
		SENHBD("SENHBD:"),

		/**
		 * Porta do serviro que podeŕá ser passada
		 * como parâmetro.
		 */

		PORTAWS("PORTAWS:");
		
		private final String arg;
		
		Args(final String argP) {
			arg = argP;
		}
		
		public String getArg() {
			return arg;
		}
	}
}
