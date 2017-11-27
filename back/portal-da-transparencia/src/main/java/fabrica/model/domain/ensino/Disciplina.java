package fabrica.model.domain.ensino;

import fabrica.model.dao.Entidade;
import fabrica.model.domain.ExcecaoNegocio;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import static fabrica.util.UtilValidacao.*;

/**
 * @author gabriel
 * @version 1.0.0
 *
 * Disciplina.
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Disciplina extends Entidade {

    @Column(length = 50)
    private String nomeDisciplina;

    @Column(length = 2000)
    private String descricao;

    @Column
    @Enumerated
    private PublicoDiscente publicoDiscente;

    @Column(precision = 10, scale = 6)
    public BigDecimal indiceAprovacao;

    @OneToMany
    public Collection<Turma> turmas;

    public Disciplina() { }

    /**
     *
     * @param descricao - Descrição sucinta da disciplina.
     * @param publicoDiscente - Público discente ao qual a disciplina se destina.
     */
    public Disciplina(String nomeDisciplina, String descricao, PublicoDiscente publicoDiscente) {
        this.nomeDisciplina = validaString(nomeDisciplina, 50, () -> {
            throw new ExcecaoNegocio(10, "Disciplina nome disciplina.",
                    "Nome disciplina nulo ou acima de 50 caracteres, inválida para cadastro.");
        });
        this.descricao = validaString(descricao, 2000, () -> {
           throw new ExcecaoNegocio(20, "Disciplina descrição.",
                   "Descrição disciplina nula ou acima de 2000 caracteres, inválida para cadastro.");
        });
        this.publicoDiscente = valida(publicoDiscente, () -> {
            throw new ExcecaoNegocio(30, "Disciplina publico discente.",
                    "Público discente nulo, inválido para cadastro.");
        });
        indiceAprovacao = new BigDecimal(0);
    }

    /**
     *
     * @param indiceAprovacao - Índice de aprovação da disciplina.
     * @return Instância de disciplina com índice setado.
     */
    public Disciplina comIndiceDeAprovacao(BigDecimal indiceAprovacao) {
        this.indiceAprovacao = valida(indiceAprovacao, (indiceAprovacaoP) -> {
            return (indiceAprovacaoP == null || indiceAprovacaoP.compareTo(new BigDecimal(0)) == -1);
        }, () -> {
            throw new ExcecaoNegocio(30, "Disciplina índice de aprovação.",
                    "Índice de aprovação nulo ou negativo, inválido para cadastro.");
        });
        return this;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public String getDescricao() {
        return descricao;
    }

    public PublicoDiscente getPublicoDiscente() {
        return publicoDiscente;
    }

    public BigDecimal getIndiceAprovacao() {
        return indiceAprovacao;
    }

    public Collection<Turma> getTurmas() {
        return turmas == null ? new ArrayList<>() : turmas;
    }
}
