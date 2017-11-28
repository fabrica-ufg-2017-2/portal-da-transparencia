package fabrica.controller.dto.ensino;

import fabrica.controller.dto.DTO;
import fabrica.model.domain.ensino.Curso;

import java.util.Collection;
import java.util.stream.Collectors;

/**
 * @author gabriel
 * @version 1.0.0
 */
public class CursoDTO extends DTO<Curso> {

    private String descricaoPlanoEnsino;

    private Collection<DisciplinaDTO> disciplinas;

    public static CursoDTO converterDominio(Curso dominio) {
        CursoDTO dto = new CursoDTO();
            dto.descricaoPlanoEnsino = dominio.getDescricaoPlanoEnsino();
            dto.disciplinas = dominio.getDisciplinas()
                                    .stream()
                                    .map(DisciplinaDTO::converterDominio)
                                    .collect(Collectors.toList());
        return dto;
    }

    public String getDescricaoPlanoEnsino() {
        return descricaoPlanoEnsino;
    }

    public void setDescricaoPlanoEnsino(String descricaoPlanoEnsino) {
        this.descricaoPlanoEnsino = descricaoPlanoEnsino;
    }

    public Collection<DisciplinaDTO> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Collection<DisciplinaDTO> disciplinas) {
        this.disciplinas = disciplinas;
    }
}
