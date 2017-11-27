package fabrica.model.domain.ensino;

import fabrica.model.dao.Entidade;
import fabrica.model.domain.ExcecaoNegocio;

import javax.persistence.*;
import java.math.BigDecimal;
import static fabrica.util.UtilValidacao.*;

/**
 * @author gabriel
 * @version 1.0.0
 *
 * Turma.
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Turma extends Entidade {

    @OneToOne
    private PeriodoLetivo periodoLetivo;

    @Column
    private Integer qtdAlunos;

    @Column
    private Integer qtdVagas;

    @Column(length = 50)
    private String cargaHoraria;

    @Column(length = 20)
    private String horario;

    @OneToOne
    private Docente docenteResponsavel;

    @Column(precision = 10, scale = 6)
    private BigDecimal mediaGlobal;

    @Column(precision = 10, scale = 6)
    private BigDecimal avaliacaoInstitucional;

    public Turma() { }

    public Turma(PeriodoLetivo periodoLetivo,
                 String cargaHoraria,
                 String horario,
                 Docente docenteResponsavel) {
        this.periodoLetivo = valida(periodoLetivo, () -> {
           throw new ExcecaoNegocio(10,
                                    "Turma período letivo",
                                    "Período letivo nulo inválido para cadastro.");
        });
        this.cargaHoraria = validaString(cargaHoraria, 50, () -> {
            throw new ExcecaoNegocio(20,
                    "Turma carga horária",
                    "Carga horária nula ou acima de 50 caracteres, inválida para cadastro.");

        });
        this.horario = validaString(horario, 20, () -> {
            throw new ExcecaoNegocio(30,
                    "Turma horário",
                    "Horário nulo ou acima de 20 caracteres, inválido para cadastro.");
        });
        this.docenteResponsavel = valida(docenteResponsavel, (docenteResponsavelP) -> {
           return (docenteResponsavelP != null &&
                   docenteResponsavelP.mapaPapel.getDataFim().after(this.periodoLetivo.getDataInicio()));
        }, () -> {
            throw new ExcecaoNegocio(40,
                    "Turma docente responsável.",
                    "Docente responsável nulo ou docente responsável não está ativo como docente" +
                            " no intervalo de datas de período letivo, inválido para cadastro.");
        });
        this.qtdAlunos = 0;
        this.qtdVagas  = 0;
        this.mediaGlobal = new BigDecimal(0);
        this.avaliacaoInstitucional = new BigDecimal(0);
    }

    public Turma comAlunos(Integer qtdAlunos) {
        this.qtdAlunos = valida(qtdAlunos, (qtdAlunosP) -> {
            return (qtdAlunosP == null || qtdAlunosP < 0);
        }, () -> {
            throw new ExcecaoNegocio(50,
                    "Turma quantidade de alunos.",
                    "Quantidade de alunos nula ou negativa inválida para cadastro.");
        });
        return this;
    }

    public Turma comVagas(Integer qtdVagas) {
        this.qtdVagas = valida(qtdVagas, (qtdVagasP) -> {
            return (qtdVagasP == null || qtdVagasP < 0);
        }, () -> {
            throw new ExcecaoNegocio(60,
                    "Turma quantidade de vagas.",
                    "Quantidade de vagas nula ou negativa inválida para cadastro.");
        });
        return this;
    }

    public Turma comMediaGlobal(BigDecimal mediaGlobal) {
        this.mediaGlobal = valida(mediaGlobal, (mediaGlobalP) -> {
            return (mediaGlobalP == null || mediaGlobalP.compareTo(new BigDecimal(0)) == -1);
        }, () -> {
            throw new ExcecaoNegocio(60,
                    "Turma media global.",
                    "Media global nula ou negativa inválida para cadastro.");
        });
        return this;
    }

    public Turma comAvaliacaoInstitucional(BigDecimal avaliacaoInstitucional) {
        this.avaliacaoInstitucional = valida(avaliacaoInstitucional, (avaliacaoInstitucionalP) -> {
            return (avaliacaoInstitucionalP == null || avaliacaoInstitucionalP.compareTo(new BigDecimal(0)) == -1);
        }, () -> {
            throw new ExcecaoNegocio(60,
                    "Turma avaliação institucional.",
                    "Avaliação institucional nula ou negativa inválida para cadastro.");
        });
        return this;
    }

    public PeriodoLetivo getPeriodoLetivo() {
        return periodoLetivo;
    }

    public Integer getQtdAlunos() {
        return qtdAlunos;
    }

    public Integer getQtdVagas() {
        return qtdVagas - qtdAlunos;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public String getHorario() {
        return horario;
    }

    public Docente getDocenteResponsavel() {
        return docenteResponsavel;
    }

    public BigDecimal getMediaGlobal() {
        return mediaGlobal;
    }

    public BigDecimal getAvaliacaoInstitucional() {
        return avaliacaoInstitucional;
    }
}
