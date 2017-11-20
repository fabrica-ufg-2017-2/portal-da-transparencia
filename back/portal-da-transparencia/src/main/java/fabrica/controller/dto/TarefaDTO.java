package fabrica.controller.dto;

import fabrica.model.domain.Tarefa;

/**
 * 
 * @author  gabriel
 * @version 1.0.0
 * 
 * DTO correpondente a entidade {@link Tarefa}.
 */
public class TarefaDTO extends DTO<Tarefa> {

	private Long id;
	
	private String titulo;
	
	private String descricao;
	
	public static TarefaDTO converterDominio(Tarefa dominio) {
		TarefaDTO tarefaDTO = new TarefaDTO();
			tarefaDTO.id = dominio.getId();
			tarefaDTO.titulo = dominio.getTitulo();
			tarefaDTO.descricao = dominio.getDescricao();
		return tarefaDTO;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
