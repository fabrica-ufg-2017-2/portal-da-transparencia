package fabrica.controller.dto.extensao;

import fabrica.model.domain.extensao.ProjetoExtensao;
import fabrica.controller.dto.DTO;
import java.util.Date;

/**
 *
 * @author  Rony Nogueira
 * @version 1.0.0
 *
 * DTO para a entidade {@link ProjetoExtensao}.
 */
public class ProjetoExtensaoDTO extends DTO<ProjetoExtensao> {

	private Long id;

  private String nome;

  private String descricao;

  private Date inicio;

  private Date fim;

  private String tipo;
	/**
	 * Realiza a conversão de um ProjetoExtensao para o seu respectivo DTO
	 * @param  ProjetoExtensao projeto
	 * @return ProjetoExtensaoDTO
	 */
	public static ProjetoExtensaoDTO converterDominio(ProjetoExtensao projeto) {
		ProjetoExtensaoDTO projetoDTO = new ProjetoExtensaoDTO();
		projetoDTO.id = projeto.getId();
		projetoDTO.nome = projeto.getNome();
		projetoDTO.descricao = projeto.getDescricao();
		projetoDTO.inicio = projeto.getInicio();
		projetoDTO.fim = projeto.getFim();
		projetoDTO.tipo = projeto.getTipo();
		return projetoDTO;
	}

	public Long getId() {
		return this.id;
	}

  public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return this.nome;
	}

  public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return this.descricao;
	}

  public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getInicio() {
		return this.inicio;
	}

  public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getFim() {
		return this.fim;
	}

  public void setFim(Date fim) {
		this.fim = fim;
	}

	public String getTipo() {
		return this.tipo;
	}

  public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
