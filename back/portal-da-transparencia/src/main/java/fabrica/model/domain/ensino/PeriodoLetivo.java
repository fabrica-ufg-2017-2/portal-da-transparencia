package fabrica.model.domain.ensino;

import fabrica.model.dao.Entidade;
import fabrica.model.domain.ExcecaoNegocio;

import javax.persistence.*;
import java.util.Date;

import static fabrica.util.UtilValidacao.*;

/**
 * @author gabriel
 * @version 1.0.0
 *
 * PeriodoLetivo
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class PeriodoLetivo extends Entidade {

    @Column
    @Temporal(TemporalType.DATE)
    private Date dataInicio;

    @Column
    @Temporal(TemporalType.DATE)
    private Date dataFim;

    public PeriodoLetivo() {
    }

    /**
     *
     * @param dataInicio - Data de ínicio do período letivo.
     * @param dataFim - Data fim do período letivo.
     */
    public PeriodoLetivo(Date dataInicio, Date dataFim) {
        this.dataInicio = valida(dataInicio, (dt) -> { return dt != null;}, () -> {
           throw new ExcecaoNegocio(10, "Período Letivo data ínicio",
                                "Data ínicio nula, inválida para cadastro período letivo.");
        });
        this.dataFim = valida(dataFim, (df) -> { return (df != null && this.dataInicio.before(df));}, () -> {
            throw new ExcecaoNegocio(20, "Período Letivo data fim",
                    "Data fim nula ou data fim antes da data de início, inválida para cadastro " +
                            "período letivo.");
        });
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }
}
