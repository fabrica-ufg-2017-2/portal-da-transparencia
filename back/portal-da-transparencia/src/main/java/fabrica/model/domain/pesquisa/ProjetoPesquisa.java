package fabrica.model.domain.pesquisa;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.hibernate.annotations.Type;

import fabrica.model.dao.Entidade;
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
	 * Construtor padrão para um projeto
	 */
	public ProjetoPesquisa() {
		
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
