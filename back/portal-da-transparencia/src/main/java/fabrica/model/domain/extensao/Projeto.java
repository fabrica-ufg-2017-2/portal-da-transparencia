package fabrica.model.domain.extensao;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.hibernate.annotations.Type;

import fabrica.model.dao.Entidade;
/**
 * Classe para representar um Projeto de Extensão
 * @author Rony Nogueira
 * @version 1.0.0
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Projeto extends Entidade {
	
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
	 * Construtor padrão para um projeto
	 */
	public Projeto() {
		
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
