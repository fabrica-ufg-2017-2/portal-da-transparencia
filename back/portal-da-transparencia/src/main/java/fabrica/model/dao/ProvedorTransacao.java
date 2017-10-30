package fabrica.model.dao;

import javax.persistence.EntityManager;

/**
 * 
 * @author  gabriel
 * @version 1.0.0
 * 
 * Provedor generico de transacoes para entidades.
 */
public abstract class ProvedorTransacao {

	/**
	 * @param b
	 *            - Bloco de código que será executado no corpo da transação.
	 *            Inteface funcional a ser implementada pela classe
	 *            TransacaoHibernate.
	 */
	public abstract void tx(final BlocoTransacao b);
	
	/**
	 * @param b
	 *            - Bloco de código que será executado no corpo da transação.
	 *            Inteface funcional a ser implementada pela classe
	 *            TransacaoHibernate.
	 */
	public abstract Object txr(BlocoTransacaoRetorno b);
	
	/**
	 * 
	 * @author gabriel
	 * @version 1.0.0
	 * 
	 *          Inteface funcional para representar o bloco de código que será
	 *          executado dentre de uma transação de Banco de Dados.
	 */
	@FunctionalInterface
	public interface BlocoTransacao {

		/**
		 * @param em
		 *            - EntityManager necessário para a manipulação do banco de
		 *            dados. Metódo que será chamado ao abri-se a transação de banco
		 *            de dados.
		 */
		public void exc(EntityManager em);
	}
	
	
	/**
	 * 
	 * @author gabriel
	 * @version 1.0.0
	 * 
	 * 
	 */
	@FunctionalInterface
	public interface BlocoTransacaoRetorno {
		
		/**
		 * @param em
		 *            - EntityManager necessário para a manipulação do banco de
		 *            dados. Metódo que será chamado ao abri-se a transação de banco
		 *            de dados.
		 */
		public Object exc(EntityManager em);
	}
}
