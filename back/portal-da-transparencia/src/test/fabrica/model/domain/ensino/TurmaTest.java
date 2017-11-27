package fabrica.model.domain.ensino;

import fabrica.model.domain.ExcecaoNegocio;
import fabrica.util.TestCaseBase;
import fabrica.util.UtilStringTest;
import org.junit.Test;

/**
 * @author gabriel
 * @version 1.0.0
 */
public class TurmaTest extends TestCaseBase {



    private static final String cargaHoraria = "64 horas";
    private static final String horario = "18:10-22:00";


    @Test
    public void testTurmaPeriodoLetivo() {
        expectedException(ExcecaoNegocio.class, "10");
        new Turma(null, null, null, null);
    }

    @Test
    public void testTurmaCargaHoraria() {
        expectedException(ExcecaoNegocio.class, "20");
        new Turma(PeridoLetivoTest.getPeriodoLetivo(), null, null, null);
    }

    @Test
    public void testTurmaCargaHoraria1() {
        expectedException(ExcecaoNegocio.class, "20");
        new Turma(PeridoLetivoTest.getPeriodoLetivo(), UtilStringTest.concat("a", 51), null, null);
    }

    @Test
    public void testTurmaHorario() {
        expectedException(ExcecaoNegocio.class, "30");
        new Turma(PeridoLetivoTest.getPeriodoLetivo(), cargaHoraria, null, null);
    }

    @Test
    public void testTurmaHorario1() {
        expectedException(ExcecaoNegocio.class, "30");
        new Turma(PeridoLetivoTest.getPeriodoLetivo(), cargaHoraria, UtilStringTest.concat("a", 21), null);
    }

    @Test
    public void testTurmaDocenteResponsavel() {
        expectedException(ExcecaoNegocio.class, "40");
        new Turma(PeridoLetivoTest.getPeriodoLetivo(), cargaHoraria, horario, null);
    }

    @Test
    public void testTurma() {
        new Turma(PeridoLetivoTest.getPeriodoLetivo(), cargaHoraria, horario, DocenteTest.getDocente());
    }

    public static Turma getTurma() {
        return new Turma(PeridoLetivoTest.getPeriodoLetivo(), cargaHoraria, horario, DocenteTest.getDocente());
    }
}