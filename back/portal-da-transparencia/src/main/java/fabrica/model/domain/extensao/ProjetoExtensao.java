package fabrica.model.domain.extensao;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.hibernate.annotations.Type;

import fabrica.model.dao.Entidade;
import fabrica.model.domain.ExcecaoNegocio;

/**
 * Classe para representar um Projeto de Extensão
 * @author Rony Nogueira
 * @version 1.0.0
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class ProjetoExtensao extends Entidade {

	@Column(length = 64)
	private String nome;

	@Column(length = 1024)
	private String descricao;

	@Column
	@Type(type="date")
	private Date inicio;

	@Column
	@Type(type="date")
	private Date fim;

	@Column(length = 32)
	private String tipo;
	/**
	 * Salva um novo projeto
	 * @param nome      Nome do Projeto
	 * @param descricao Descrição do Projeto
	 * @param inicio    Data de Inicio
	 * @param fim       Data de Término
	 * @param tipo      Tipo
	 * @return       ProjetoExtensao
	 */
	public ProjetoExtensao novo(final String nome, final String descricao, final Date inicio, final Date fim, final String tipo) {
		if (nome.length() > 64 || nome == null) {
			throw new ExcecaoNegocio(10, "Nome inválido",
					"O nome do projeto deve possuir até 64 caracteres");
		}

		if (descricao.length() > 1024 || descricao == null) {
			throw new ExcecaoNegocio(11, "Descrição inválida",
					"A descrição deve possuir até 1024 caracteres");
		}

		if (inicio == null || fim == null) {
			throw new ExcecaoNegocio(12, "Data inválida",
					"A data de início e fim devem ser informadas");
		}

		if (tipo == null || tipo.length() == 0) {
			throw new ExcecaoNegocio(13, "Tipo inválido",
					"O Tipo do projeto deve ser informado");
		}

		this.nome = nome;
		this.descricao = descricao;
		this.inicio = inicio;
		this.fim = fim;
		this.tipo = tipo;

		return this;
	}

	/**
	 * Retorna o nome do projeto
	 * @return String
	 */
	public String getNome() {
		return this.nome;
	}

	/**
	 * Retorna a descricao de um projeto
	 * @return String
	 */
	public String getDescricao() {
		return this.descricao;
	}

	/**
	 * Retorna a data de inicio de um projeto
	 * @return Date
	 */
	public Date getInicio() {
		return this.inicio;
	}

	/**
	 * Retorna a data de termino de um projeto
	 * @return Date
	 */
	public Date getFim() {
		return this.fim;
	}

	/**
	 * Retorna o tipo do projeto
	 * @return String
	 */
	public String getTipo() {
		return this.tipo;
	}
}
