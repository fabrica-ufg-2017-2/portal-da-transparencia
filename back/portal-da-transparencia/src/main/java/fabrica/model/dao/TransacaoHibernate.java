package fabrica.model.dao;

import static fabrica.util.UtilArgs.getParametros;

import java.util.Map;
import java.util.HashMap;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fabrica.util.UtilArgs.Args;

/**
 * 
 * @author gabriel
 * @version 1.0.0
 * 
 *          Implementacao de transacao unsando framework Hibernate.
 */
public final class TransacaoHibernate extends ProvedorTransacao {

	/*
	 * Entity manager referente a base dados mapeada em nosso arquivo de
	 * configuração persistence.xml.
	 */
	private static EntityManagerFactory emf = getManager();

	/**
	 * 
	 * @return EntityManagerFactory configurado. Configura o entity Manager do
	 *         Hibernate de maneira dinamica caso os argumentos tenham sido
	 *         passador
	 */
	private static EntityManagerFactory getManager() {
		Map<Args, String> parametros = getParametros();

		if (!parametros.isEmpty()) {
			Map<String, String> config = new HashMap<>();

			/**
			 * Configuracoes estaticas.
			 */
			config.put("javax.persistence.jdbc.driver",
					"com.mysql.jdbc.Driver");
			config.put("hibernate.dialect",
					"org.hibernate.dialect.MySQL5InnoDBDialect");
			config.put("hibernate.connection.shutdown", "true");
			config.put("hibernate.hbm2ddl.auto", "update");
			config.put("hibernate.show_sql", "false");
			config.put("hibernate.format_sql", "false");

			/**
			 * Configuracoes dinamicas.
			 */
			String dnsBanco = "jdbc:mysql://localhost:3306/portaltransparencia?useTimezone=true&serverTimezone=UTC";

			if (parametros.containsKey(Args.DNSBD))
				dnsBanco = dnsBanco.replace("localhost",
						parametros.get(Args.DNSBD));

			if (parametros.containsKey(Args.NOMEBD))
				dnsBanco = dnsBanco.replace("portaltransparencia",
						parametros.get(Args.NOMEBD));

			if (parametros.containsKey(Args.PORTBD))
				dnsBanco = dnsBanco.replace("3306",
						parametros.get(Args.PORTBD));

			config.put("javax.persistence.jdbc.url", dnsBanco);

			if (parametros.containsKey(Args.USUBD))
				config.put("javax.persistence.jdbc.user",
						parametros.get(Args.USUBD));

			if (parametros.containsKey(Args.SENHBD))
				config.put("javax.persistence.jdbc.password",
						parametros.get(Args.SENHBD));

			config.entrySet().stream().forEach(a -> System.out
					.println("\t" + a.getKey() + "->" + a.getValue() + "\n"));

			return Persistence
					.createEntityManagerFactory("portal-transparencia", config);

		}

		return Persistence.createEntityManagerFactory("portal-transparencia");
	}

	public void tx(final BlocoTransacao b) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		b.exc(em);
		em.getTransaction().commit();
		em.close();
	}

	public Object txr(BlocoTransacaoRetorno b) {
		final Object o;
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		o = b.exc(em);
		em.getTransaction().commit();
		em.close();
		return o;
	}
}
