package fabrica.controller.dto.ensino;

import fabrica.controller.dto.DTO;
import fabrica.controller.dto.geral.MapaPapelDTO;
import fabrica.model.domain.ensino.Docente;

/**
 * @author gabriel
 * @version 1.0.0
 */
public class DocenteDTO extends DTO<Docente> {

    private MapaPapelDTO mapaPapel;

    private String titulacao;

    private Integer jornadaTrabalho;

    private Integer caragaHoraria;

    public static DocenteDTO converterDominio(Docente dominio) {
        DocenteDTO dto = new DocenteDTO();
            dto.mapaPapel = MapaPapelDTO.converterDominio(dominio.getMapaPapel());
            dto.titulacao = dominio.getTitulacao();
            dto.jornadaTrabalho = dominio.getJornadaTrabalho();
            dto.caragaHoraria = dominio.getCaragaHoraria();
        return dto;
    }

    public MapaPapelDTO getMapaPapel() {
        return mapaPapel;
    }

    public void setMapaPapel(MapaPapelDTO mapaPapel) {
        this.mapaPapel = mapaPapel;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public Integer getJornadaTrabalho() {
        return jornadaTrabalho;
    }

    public void setJornadaTrabalho(Integer jornadaTrabalho) {
        this.jornadaTrabalho = jornadaTrabalho;
    }

    public Integer getCaragaHoraria() {
        return caragaHoraria;
    }

    public void setCaragaHoraria(Integer caragaHoraria) {
        this.caragaHoraria = caragaHoraria;
    }
}
