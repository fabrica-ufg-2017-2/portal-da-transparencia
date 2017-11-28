package fabrica.model.domain.ensino;

import fabrica.model.dao.Entidade;
import fabrica.model.domain.ExcecaoNegocio;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import static fabrica.util.UtilValidacao.*;

/**
 * @author gabriel
 * @version 1.0.0
 *          <p>
 *          Entidade para representar todos os cursos
 *          diponíveis no portal da transparência bem
 *          como seu plano de curso e disciplinas associadas.
 *          </p>
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Curso extends Entidade {

    @Column(columnDefinition = "text")
    private String descricaoPlanoEnsino;

    @OneToMany
    private Collection<Disciplina> disciplinas;

    public Curso() { }

    public Curso(String discricaoPlanoEnsino) {
        this.descricaoPlanoEnsino = valida(discricaoPlanoEnsino, () -> {
            throw new ExcecaoNegocio(10,
                    "Curso descrição plano de ensino.",
                    "Curso descrição plano de ensino nulo, inválido para cadastro.");
        });
    }

    public String getDescricaoPlanoEnsino() {
        return descricaoPlanoEnsino;
    }

    public Collection<Disciplina> getDisciplinas() {
        return disciplinas == null ? new ArrayList<>() : disciplinas;
    }

}
