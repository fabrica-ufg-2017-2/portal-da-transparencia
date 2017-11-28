package fabrica.model.domain.ensino;

import fabrica.model.domain.ExcecaoNegocio;
import fabrica.model.domain.geral.MapaPapel;
import fabrica.model.domain.geral.Papel;
import fabrica.model.domain.geral.PessoaTest;
import fabrica.util.TestCaseBase;
import fabrica.util.UtilStringTest;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;

/**
 * @author gabriel
 * @version 1.0.0
 */
public class DocenteTest extends TestCaseBase {

    private static final Date hoje = new Date();
    private static final LocalDateTime ldt = LocalDateTime.ofInstant(hoje.toInstant(), ZoneId.systemDefault());
    private static final MapaPapel papel = new  MapaPapel(PessoaTest.getPessoa(),
                                                        Papel.DOCENTE,
                                                        new Date(),
                                                        Date.from(ldt.plusDays(365).toInstant(ZoneOffset.UTC)));
    private static final String titulacao = "Doutor";
    private static final Integer jornadaTrabalho = 44;
    private static final Integer cargaHoraria = 8;

    @Test
    public void testDocenteMapaPapel() {
        expectedException(ExcecaoNegocio.class, "10");
        new Docente(null, null, null, null);
    }

    @Test
    public void testDocenteMapaPapel1() {
        expectedException(ExcecaoNegocio.class, "10");
        MapaPapel papel = new  MapaPapel(PessoaTest.getPessoa(),
                Papel.DICENTE,
                new Date(),
                Date.from(ldt.plusDays(365).toInstant(ZoneOffset.UTC)));
        new Docente(papel, null, null, null);
    }

    @Test
    public void testDocenteTitulacao() {
        expectedException(ExcecaoNegocio.class, "20");
        new Docente(papel, null, null, null);
    }

    @Test
    public void testDocenteTitulacao1() {
        expectedException(ExcecaoNegocio.class, "20");
        new Docente(papel, UtilStringTest.concat("a", 51), null, null);
    }

    @Test
    public void testDocenteJornadaTrabalho() {
        expectedException(ExcecaoNegocio.class, "30");
        new Docente(papel, titulacao, null, null);
    }

    @Test
    public void testDocenteJornadaTrabalho1() {
        expectedException(ExcecaoNegocio.class, "30");
        Integer jornadaTrabalho = -1;
        new Docente(papel, titulacao, jornadaTrabalho, null);
    }

    @Test
    public void testDocenteCargaHoraria() {
        expectedException(ExcecaoNegocio.class, "40");
        new Docente(papel, titulacao, jornadaTrabalho, null);
    }

    @Test
    public void testDocenteCargaHoraria1() {
        expectedException(ExcecaoNegocio.class, "40");
        Integer cargaHoraria = -1;
        new Docente(papel, titulacao, jornadaTrabalho, cargaHoraria);
    }

    @Test
    public void testDocente() {
        new Docente(papel, titulacao, jornadaTrabalho, cargaHoraria);
    }

    public static Docente getDocente() {
        return new Docente(papel,"Doutor", 44, 8);
    }
}