package fabrica.model.domain.ensino;

import fabrica.model.domain.ExcecaoNegocio;
import fabrica.util.TestCaseBase;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;

/**
 * @author gabriel
 * @version 1.0.0
 */
public class PeridoLetivoTest extends TestCaseBase {

    private static final Date hoje = new Date();
    private static final LocalDateTime ldt = LocalDateTime.ofInstant(hoje.toInstant(), ZoneId.systemDefault());

    @Test
    public void testPeriodoLetivo() {
        expectedException(ExcecaoNegocio.class, "10");
        new PeridoLetivo(null, null);
    }

    @Test
    public void testPeridoLetivo1() {
        expectedException(ExcecaoNegocio.class, "20");
        new PeridoLetivo(hoje, null);

    }

    @Test
    public void testPeriodoLetivo2() {
        expectedException(ExcecaoNegocio.class, "20");
        new PeridoLetivo(
                hoje, Date.from(ldt.minusDays(120).toInstant(ZoneOffset.UTC)));
    }

    public static PeridoLetivo getPeriodoLetivo() {
        return new PeridoLetivo(
                hoje, Date.from(ldt.plusDays(120).toInstant(ZoneOffset.UTC)));
    }
}