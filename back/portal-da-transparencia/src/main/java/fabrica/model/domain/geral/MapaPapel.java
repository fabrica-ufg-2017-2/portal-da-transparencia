package fabrica.model.domain.geral;

import fabrica.model.dao.Entidade;
import fabrica.model.domain.ExcecaoNegocio;

import static fabrica.util.UtilValidacao.*;

import javax.persistence.*;
import java.util.Date;


/**
 * @author gabriel
 * @version 1.0.0
 *          <p>
 *          MapaPapel registra o papel assumido pela pessoa
 *          em determinado ponto no tempo(<code>dataInicio</code> - <code>dataFim</code>)
 *          assim quando queremos saber se uma pessoa e um Docente basta consultarmos
 *          nesta tabela com a data atual para o intervalo de dadas e a pessoa para
 *          a pessoa de MapaPapel
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class MapaPapel extends Entidade {

    @OneToOne
    private Pessoa pessoa;

    @Column
    @Enumerated(EnumType.ORDINAL)
    private Papel papel;

    @Column
    @Temporal(TemporalType.DATE)
    private Date dataInicio;

    @Column
    @Temporal(TemporalType.DATE)
    private Date dataFim;

    public MapaPapel() {
    }

    /**
     * @param pessoa     - Pessoa que assume papel no intervalo de tempo passado.
     * @param papel      - Papel assumido pela pessoa.
     * @param dataInicio - Data ínicio do período do papel.
     * @param dataFim    - Data fim do período do papel.
     */
    public MapaPapel(Pessoa pessoa, Papel papel, Date dataInicio, Date dataFim) {
        this.pessoa = valida(pessoa, () -> {
            throw new ExcecaoNegocio(10, "MapaPapel pessoa", "Pessoa nula inválida para cadastro.");
        });

        this.papel = valida(papel, () -> {
            throw new ExcecaoNegocio(20, "MapaPapel papel", "Papel nulo inválido para cadastro.");
        });

        this.dataInicio = valida(dataInicio, () -> {
            throw new ExcecaoNegocio(20, "MapaPapel dataInicio", "Data íncio nula inválida para cadastro.");
        });

        this.dataFim = valida(dataFim, (dtFim) -> {
                    return (dtFim == null || dtFim.after(this.dataInicio));
                },
                () -> {
                    throw new ExcecaoNegocio(30, "MapaPapel dataFim", "Data fim nulo ou data fim em peŕiodo antes da data ínicio");
                });
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public Papel getPapel() {
        return papel;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }
}
