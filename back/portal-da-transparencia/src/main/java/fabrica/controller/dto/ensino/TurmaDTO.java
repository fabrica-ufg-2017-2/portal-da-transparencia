package fabrica.controller.dto.ensino;

import fabrica.controller.dto.DTO;
import fabrica.model.domain.ensino.Turma;

import java.math.BigDecimal;

/**
 * @author gabriel
 * @version 1.0.0
 */
public class TurmaDTO extends DTO<Turma> {

    private PeriodoLetivoDTO periodoLetivo;

    private Integer qtdAlunos;

    private Integer qtdVagas;

    private String cargaHoraria;

    private String horario;

    private DocenteDTO docenteResponsavel;

    private BigDecimal mediaGlobal;

    private BigDecimal avaliacaoInstitucional;

    public static TurmaDTO converterDominio(Turma dominio) {
        TurmaDTO dto = new TurmaDTO();
            dto.periodoLetivo = PeriodoLetivoDTO.converterDominio(dominio.getPeriodoLetivo());
            dto.qtdAlunos = dominio.getQtdAlunos();
            dto.qtdVagas = dominio.getQtdVagas();
            dto.cargaHoraria = dominio.getCargaHoraria();
            dto.horario = dominio.getHorario();
            dto.docenteResponsavel = DocenteDTO.converterDominio(dominio.getDocenteResponsavel());
            dto.mediaGlobal = dominio.getMediaGlobal();
            dto.avaliacaoInstitucional = dto.avaliacaoInstitucional;
        return dto;
    }

    public PeriodoLetivoDTO getPeriodoLetivo() {
        return periodoLetivo;
    }

    public void setPeriodoLetivo(PeriodoLetivoDTO periodoLetivo) {
        this.periodoLetivo = periodoLetivo;
    }

    public Integer getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(Integer qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }

    public Integer getQtdVagas() {
        return qtdVagas;
    }

    public void setQtdVagas(Integer qtdVagas) {
        this.qtdVagas = qtdVagas;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public DocenteDTO getDocenteResponsavel() {
        return docenteResponsavel;
    }

    public void setDocenteResponsavel(DocenteDTO docenteResponsavel) {
        this.docenteResponsavel = docenteResponsavel;
    }

    public BigDecimal getMediaGlobal() {
        return mediaGlobal;
    }

    public void setMediaGlobal(BigDecimal mediaGlobal) {
        this.mediaGlobal = mediaGlobal;
    }

    public BigDecimal getAvaliacaoInstitucional() {
        return avaliacaoInstitucional;
    }

    public void setAvaliacaoInstitucional(BigDecimal avaliacaoInstitucional) {
        this.avaliacaoInstitucional = avaliacaoInstitucional;
    }
}
