package fabrica.model.domain.ensino;

import fabrica.model.dao.Entidade;
import fabrica.model.domain.ExcecaoNegocio;
import fabrica.model.domain.geral.MapaPapel;
import fabrica.model.domain.geral.Papel;

import javax.persistence.*;
import static fabrica.util.UtilValidacao.*;

/**
 * @author gabriel
 * @version 1.0.0
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Docente extends Entidade {

    @OneToOne
    public MapaPapel mapaPapel;

    @Column(length = 50)
    public String titulacao;

    @Column
    private Integer jornadaTrabalho;

    @Column
    private Integer caragaHoraria;

    public Docente() {
    }

    public Docente(MapaPapel mapaPapel,
                   String titulacao,
                   Integer jornadaTrabalho,
                   Integer cargaHoraria) {
        this.mapaPapel = valida(mapaPapel, (mapaPapelP) -> {
           return (mapaPapelP != null &&
                   mapaPapelP.getPapel().equals(Papel.DOCENTE));
        }, () -> {
            throw new ExcecaoNegocio(10,
                    "Docente mapa papel.",
                    "Docente mapa papel nulo ou papel diferente de docente, inválido para cadastro.");
        });
        this.titulacao = validaString(titulacao, 50, () -> {
            throw new ExcecaoNegocio(20,
                    "Docente titulação.",
                    "Docente titulação nula ou maior que 50 caracteres, inválida para cadastro.");
        });
        this.jornadaTrabalho = valida(jornadaTrabalho, (jornadaTrabalhoP) -> {
            return (jornadaTrabalhoP != null && jornadaTrabalhoP > 0);
        }, () -> {
            throw new ExcecaoNegocio(30,
                    "Docente carga horária.",
                    "Jornada de trabalho horária nula o negativa, inválida para cadastro.");
        });
        this.caragaHoraria = valida(cargaHoraria, (caragaHorariaP) -> {
            return (caragaHorariaP != null && caragaHorariaP > 0);
        }, () -> {
            throw new ExcecaoNegocio(40,
                    "Docente carga horária.",
                    "Docente carga horária nula o negativa, inválida para cadastro.");
        });
    }

    public MapaPapel getMapaPapel() {
        return mapaPapel;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public Integer getJornadaTrabalho() {
        return jornadaTrabalho;
    }

    public Integer getCaragaHoraria() {
        return caragaHoraria;
    }
}
