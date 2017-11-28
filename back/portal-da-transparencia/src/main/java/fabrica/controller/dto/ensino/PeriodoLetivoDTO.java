package fabrica.controller.dto.ensino;

import fabrica.controller.dto.DTO;
import fabrica.model.domain.ensino.PeriodoLetivo;

import java.util.Date;

/**
 * @author gabriel
 * @version 1.0.0
 */
public class PeriodoLetivoDTO extends DTO<PeriodoLetivo> {

    private Date dataInicio;

    private Date dataFim;

    public static PeriodoLetivoDTO converterDominio(PeriodoLetivo dominio) {
        PeriodoLetivoDTO dto = new PeriodoLetivoDTO();
            dto.dataInicio = dominio.getDataInicio();
            dto.dataFim = dominio.getDataFim();
        return dto;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }
}
