package fabrica.controller.dto.geral;

import fabrica.controller.dto.DTO;
import fabrica.model.domain.geral.MapaPapel;
import fabrica.model.domain.geral.Papel;

import java.util.Date;

/**
 * @author gabriel
 * @version 1.0.0
 */
public class MapaPapelDTO extends DTO<MapaPapel> {

    private PessoaDTO pessoa;

    private Papel papel;

    private Date dataInicio;

    private Date dataFim;

    public static MapaPapelDTO converterDominio(MapaPapel dominio) {
        MapaPapelDTO dto = new MapaPapelDTO();
            dto.pessoa = PessoaDTO.converterDominio(dominio.getPessoa());
            dto.papel = dominio.getPapel();
            dto.dataInicio = dominio.getDataInicio();
            dto.dataFim = dominio.getDataFim();
        return dto;
    }

    public PessoaDTO getPessoa() {
        return pessoa;
    }

    public void setPessoa(PessoaDTO pessoa) {
        this.pessoa = pessoa;
    }

    public Papel getPapel() {
        return papel;
    }

    public void setPapel(Papel papel) {
        this.papel = papel;
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
