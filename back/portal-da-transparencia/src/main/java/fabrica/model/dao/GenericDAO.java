package fabrica.model.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;



/**
 * 
 * @author gabriel
 * @version 1.0.0
 * 
 *          Classe genérica afim de mapear as operações de CRUD de uma entidade
 *          qualquer do sistema.
 */
public abstract class GenericDAO<T extends Entidade, ID extends Serializable> {

	/**
	 * Fornecedor de EntityManager.
	 */
	protected final ProvedorTransacao trs;

	/**
	 * Classe da entidade correspondete ao DAO.
	 */
	protected final Class<T> clazz;

	/**
	 * 
	 * @param transacao
	 *            - Provedor de transacao que fornecera o EntityManager para
	 *            realizar as operacoes necessarias.
	 * @param clazzP
	 *            - Classe da entidade.
	 */
	public GenericDAO(final ProvedorTransacao transacao,
			final Class<T> clazzP) {
		trs = transacao;
		clazz = clazzP;
	}

	/**
	 * 
	 * @param entity
	 *            - Persiste entidade na base dados.
	 * @return Entidade persistida.
	 */
	public T criar(T entity) {
		trs.tx((em) -> {
			em.persist(entity);
		});
		return entity;
	}

	/**
	 *
	 * @param entity - Persisten a entidade na base de daods.
	 * @param em - Gerenciador de entidade para agrupar operacoes
	 *           em uma transação só.
	 * @return Entidade persistida.
	 */
	public T criar(T entity, EntityManager em) {
		em.persist(entity);
		return entity;
	}

	/**
	 * 
	 * @param entidades
	 *            - Persiste colecao de entidade na base de dados.
	 * @return Colecao de entidades persistidas.
	 */
	public Iterable<T> criar(Iterable<T> entidades) {
		trs.tx((em) -> {
			StreamSupport
			.stream(entidades.spliterator(), false)
			.forEach(a -> em.persist(a));
		});
		return entidades;
	}

	/**
	 *
	 * @param entidades - Persiste colecao de entidade na base de dados.
	 * @param em - Gerenciador de entidade para agrupar operacoes
	 *           em uma transação só.
	 * @return Colecao de entidades persistidas.
	 */
	public Iterable<T> criar(Iterable<T> entidades, EntityManager em) {
		StreamSupport
		.stream(entidades.spliterator(), false)
		.forEach(a -> em.persist(a));
		return entidades;
	}

	/**
	 *
	 * @param b - Bloco de operações a serem executadas antes de atualizar o
	 *          registro.
	 * @param id - Id do registro.
	 */
	public void  atualizar(BlocoAtualizar<T> b, ID id) {
		trs.tx((em) -> {
			T registro = em.find(clazz, id);
			b.atualizacao(registro);
		});
	}

	/**
	 *
	 * @param b - Bloco de operações a serem executadas antes de atualizar o
	 *          registro.
	 * @param id - Id do registro.
	 * @param em - Gerenciador de entidade para agrupar operacoes
	 *           em uma transação só.
	 */
	public void atualizar(BlocoAtualizar<T> b, ID id, EntityManager em) {
		T registro = em.find(clazz, id);
		b.atualizacao(registro);
	}

	/**
	 * 
	 * @param id
	 *            - Id único da entidade.
	 * @return - Entidade.
	 */
	@SuppressWarnings("unchecked")
	public T buscaUm(ID id) {
		return (T) trs.txr((em) -> em.find(clazz, id));
	}

	/**
	 *
	 * @param id - Id único da entidade.
	 * @param em - Gerenciador de entidade para agrupar operacoes
	 *           em uma transação só.
	 * @return - Entidade.
	 */
	public T buscaUm(ID id, EntityManager em) { return em.find(clazz, id);}

	/**
	 * 
	 * @param id
	 *            - Id único da entidade.
	 * @return True caso exista registro False se não existir.
	 */
	public boolean existe(ID id) {
		if (buscaUm(id) != null) {
			return true;
		}
		return false;
	}

	/**
	 *
	 * @param id - Id único da entidade.
	 * @param em - Gerenciador de entidade para agrupar operacoes
	 *           em uma transação só.
	 * @return True caso exista registro False se não existir.
	 */
	public boolean existe(ID id, EntityManager em) {
		if (buscaUm(id, em) != null) {
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @return Todos registros da entidade.
	 */
	@SuppressWarnings("unchecked")
	public Iterable<T> buscarTodosIterable() {
		return (Iterable<T>) trs.txr((em) -> {
			CriteriaBuilder cb = em.getCriteriaBuilder();
			CriteriaQuery<T> cq = cb.createQuery(clazz);
			Root<T> root = cq.from(clazz);
			CriteriaQuery<T> all = cq.select(root);
			TypedQuery<T> allQuery = em.createQuery(all);
			return allQuery.getResultList();
		});
	}

	/**
	 *
	 * @param em - Gerenciador de entidade para agrupar operacoes
	 *           em uma transação só.
	 * @return Todos registros da entidade.
	 */
	public Iterable<T> buscarTodosIterable(EntityManager em) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<T> cq = cb.createQuery(clazz);
		Root<T> root = cq.from(clazz);
		CriteriaQuery<T> all = cq.select(root);
		TypedQuery<T> allQuery = em.createQuery(all);
		return allQuery.getResultList();
	}
	
	/**
	 * 
	 * @return Todos registros da entidade.
	 */
	public Collection<T> buscarTodos() {
		return StreamSupport
			   .stream(buscarTodosIterable().spliterator(), true)
		       .collect(Collectors.toList());
		
	}

	/**
	 *
	 * @param em - Gerenciador de entidade para agrupar operacoes
	 *           em uma transação só.
	 * @return Todos registros da entidade.
	 */
	public Collection<T> buscarTodos(EntityManager em) {
		return StreamSupport
				.stream(buscarTodosIterable(em).spliterator(), true)
				.collect(Collectors.toList());
	}

	/**
	 * 
	 * @return Quantidade de registro da entidade.
	 */
	public Long contar() {
		return (Long) trs.txr((em) -> {
			CriteriaBuilder qb = em.getCriteriaBuilder();
			CriteriaQuery<Long> cq = qb.createQuery(Long.class);
			cq.select(qb.count(cq.from(clazz)));
			return em.createQuery(cq).getSingleResult();
		});
	}

	/**
	 * @return Quantidade de registro da entidade.
	 */
	public Long contar(EntityManager em) {
		CriteriaBuilder qb = em.getCriteriaBuilder();
		CriteriaQuery<Long> cq = qb.createQuery(Long.class);
		cq.select(qb.count(cq.from(clazz)));
		return em.createQuery(cq).getSingleResult();
	}

	/**
	 * 
	 * @param id
	 *            - Id da entidade que deseja deletar.
	 */
	public void deletar(ID id) {
		trs.tx((em) -> {
			em.remove(em.find(clazz, id));
		});
	}

	/**
	 *
	 * @param id - Id da entidade que deseja deletar.
	 * @param em - Gerenciador de entidade para agrupar operacoes
	 *           em uma transação só.
	 */
	public void deletar(ID id, EntityManager em) {
		em.remove(em.find(clazz,id));
	}

	/**
	 * 
	 * @param entidade
	 *            - Entidade que deseja deletar.
	 */
	public void deletar(T entidade) {
		trs.tx((em) -> {
			em.remove(entidade);
		});
	}

	/**
	 *
	 * @param entidade - Entidade que deseja deletar.
	 * @param em - Gerenciador de entidade para agrupar operacoes
	 *           em uma transação só.
	 */
	public void deletar(T entidade, EntityManager em) {
		em.remove(entidade);
	}

	/**
	 * 
	 * @param entidades Deleta todos os registros
	 * da colecao;
	 */
	public void deletar(Iterable<T> entidades) {
		StreamSupport
		.stream(entidades.spliterator(), false)
		.forEach(a -> deletar(a));
	}

	/**
	 *
	 * @param entidades - Entidade que deseja deletar.
	 * @param em - Gerenciador de entidade para agrupar operacoes
	 *           em uma transação só.
	 */
	public void deletar(Iterable<T> entidades, EntityManager em) {
		StreamSupport
		.stream(entidades.spliterator(), false)
		.forEach(a -> deletar(a, em));
	}
	
	/**
	 * Deleta todos registro da entidade.
	 */
	public void deletarTodos() {
		deletar(buscarTodos());
	}

	/**
	 * @param em  - Gerenciador de entidade para agrupar operacoes
	 *           em uma transação só.
	 * Deleta todos registro da entidade.
	 */
	public void deletarTodos(EntityManager em) { deletar(buscarTodos(em), em);}

	/**
	 *
	 * @param <T> - Bloco de operações a serem executados
	 *           antes de atualizar um registro.
	 */
	@FunctionalInterface
	public interface BlocoAtualizar<T> {
		public T atualizacao(T entidade);
	}

	/**
	 *
	 * @return Provedor de Transação para classes
	 * clientes poderem agrupar operações em uma só transação.
	 */
	public ProvedorTransacao provedorTransacao() {
		return trs;
	}
}
