package fabrica.model.domain.pesquisa;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.hibernate.annotations.Type;

import fabrica.model.dao.Entidade;
import fabrica.model.domain.ExcecaoNegocio;

/**
 * Classe para representar um Projeto de Pesquisa
 * @author Jean Marcos
 * @version 1.0.0
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class ProjetoPesquisa extends Entidade {
	
	@Column(length = 64)
	private String nome;
	
	@Column(length = 64)
	private String situacao;
	
	@Column(length = 1024)
	private String areaConhecimento;
	
	@Column
	@Type(type="date")
	private Date dataInicio;
	
	@Column
	@Type(type="date")
	private Date dataFim;
	
	/**
	 * Cria uma instância do objeto validando as propriedades
	 * @param nome
	 * @param situacao
	 * @param areaConhecimento
	 * @return {@link ProjetoPesquisa} A nova instância
	 */
	public ProjetoPesquisa novoProjetoPesquisa(final String nome, final String situacao, 
			final String areaConhecimento) {
		
		if (nome == null || nome.length() > 64) {
			throw new ExcecaoNegocio(1, "Nome inválido",
					"Nome do projeto nulo ou maior que 64 caracteres.");
		}
		
		if (situacao == null || situacao.length() > 64) {
			throw new ExcecaoNegocio(2, "Situação inválida",
					"Situação do projeto nula ou maior que 64 caracteres.");
		}
		
		if (areaConhecimento == null || areaConhecimento.length() > 1024) {
			throw new ExcecaoNegocio(3, "Área de conhecimento inválida",
					"Àrea de conhecimento do projeto nula ou maior que 1024 caracteres.");
		}

		this.nome = nome;
		this.situacao = situacao;
		this.areaConhecimento = areaConhecimento;
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
	 * Retorna a situacao de um projeto
	 * @return String
	 */
	public String getSituacao() {
		return this.situacao;
	}
	
	/**
	 * Retorna a situacao de um projeto
	 * @return String
	 */
	public String getAreaConhecimento() {
		return this.areaConhecimento;
	}
	
	/**
	 * Retorna a data de inicio de um projeto
	 * @return Date
	 */
	public Date getDataInicio() {
		return this.dataInicio;
	}
	
	/**
	 * Retorna a data de termino de um projeto
	 * @return Date
	 */
	public Date getDataFim() {
		return this.dataFim;
	}

}
