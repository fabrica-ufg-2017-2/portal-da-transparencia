package fabrica.controller.service.ensino;

import fabrica.controller.dto.ensino.DisciplinaDTO;
import fabrica.controller.dto.ensino.PeriodoLetivoDTO;
import fabrica.model.dao.TransacaoHibernate;
import fabrica.model.dao.ensino.DisciplinaDAO;
import fabrica.model.domain.ensino.Disciplina;
import fabrica.model.domain.ensino.PeriodoLetivo;

import java.util.Collection;
import java.util.stream.Collectors;

/**
 * @author gabriel
 * @version 1.0.0
 *
 */
public class DisciplinaService {

    private DisciplinaDAO disciplinaDAO = new DisciplinaDAO(new TransacaoHibernate(), Disciplina.class);

    public Collection<DisciplinaDTO> disciplinasPeriodoLetivo(PeriodoLetivoDTO periodoLetivoDTO) {
        PeriodoLetivo periodoLetivo = new PeriodoLetivo(periodoLetivoDTO.getDataInicio(), periodoLetivoDTO.getDataFim());
        return disciplinaDAO.buscarTodos()
                            .stream()
                            .filter(a -> a.getTurmas().stream().filter(b -> b.getPeriodoLetivo().equals(periodoLetivo)).count() > 0)
                            .map(DisciplinaDTO::converterDominio)
                            .collect(Collectors.toList());
    }
}
