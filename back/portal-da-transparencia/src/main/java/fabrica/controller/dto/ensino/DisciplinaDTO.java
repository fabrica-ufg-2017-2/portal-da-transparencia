package fabrica.controller.dto.ensino;

import fabrica.controller.dto.DTO;
import fabrica.model.domain.ensino.Disciplina;
import fabrica.model.domain.ensino.PublicoDiscente;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.stream.Collectors;

/**
 * @author gabriel
 * @version 1.0.0
 */
public class DisciplinaDTO extends DTO<Disciplina> {

    private String nomeDisciplina;

    private String descricao;

    private PublicoDiscente publicoDiscente;

    public BigDecimal indiceAprovacao;

    public Collection<TurmaDTO> turmas;


    public static DisciplinaDTO converterDominio(Disciplina dominio) {
        DisciplinaDTO dto = new DisciplinaDTO();
            dto.nomeDisciplina = dominio.getNomeDisciplina();
            dto.descricao = dominio.getDescricao();
            dto.publicoDiscente = dominio.getPublicoDiscente();
            dto.indiceAprovacao = dominio.getIndiceAprovacao();
            dto.turmas = dominio.getTurmas()
                                .stream()
                                .map(TurmaDTO::converterDominio)
                                .collect(Collectors.toList());
        return dto;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public PublicoDiscente getPublicoDiscente() {
        return publicoDiscente;
    }

    public void setPublicoDiscente(PublicoDiscente publicoDiscente) {
        this.publicoDiscente = publicoDiscente;
    }

    public BigDecimal getIndiceAprovacao() {
        return indiceAprovacao;
    }

    public void setIndiceAprovacao(BigDecimal indiceAprovacao) {
        this.indiceAprovacao = indiceAprovacao;
    }

    public Collection<TurmaDTO> getTurmas() {
        return turmas;
    }

    public void setTurmas(Collection<TurmaDTO> turmas) {
        this.turmas = turmas;
    }
}
