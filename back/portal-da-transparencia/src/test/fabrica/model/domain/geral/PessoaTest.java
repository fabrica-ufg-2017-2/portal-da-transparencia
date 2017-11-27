package fabrica.model.domain.geral;

import fabrica.model.domain.ExcecaoNegocio;
import fabrica.util.TestCaseBase;
import fabrica.util.UtilStringTest;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author gabriel
 * @version 1.0.0
 *
 */
public class PessoaTest extends TestCaseBase {

    private static final String NOME  = "Marcelo Quinta";

    private static final String EMAIL = "marcelo@inf.com.br";

    private static final String CPF   = "19376780400";

    @Test(expected = ExcecaoNegocio.class)
    public void testPessoa() {
        new Pessoa(null, null, null);
    }

    @Test
    public void testPessoNome() {
        expectedException(ExcecaoNegocio.class, "10");
        new Pessoa(null, null, null);
    }

    @Test
    public void testPessoaNome1() {
        expectedException(ExcecaoNegocio.class, "10");
        new Pessoa("", null, null);
    }

    @Test
    public void testPessoaNome2() {
        expectedException(ExcecaoNegocio.class, "10");
        new Pessoa(UtilStringTest.concat("a", 51), null, null);
    }

    @Test
    public void testPessoaEmail() {
        expectedException(ExcecaoNegocio.class, "20");
        new Pessoa(NOME, null, null);
    }

    @Test
    public void testePessoaEmail1() {
        expectedException(ExcecaoNegocio.class, "20");
        new Pessoa(NOME, "", null);
    }

    @Test
    public void testePessoaEmail2() {
        expectedException(ExcecaoNegocio.class, "20");
        new Pessoa(NOME, UtilStringTest.concat("a", 51), null);
    }

    @Test
    public void testPessoaEmail3() {
        expectedException(ExcecaoNegocio.class, "20");
        new Pessoa(NOME, UtilStringTest.concat("a", 50), null);
    }

    @Test
    public void testPessoaCpf() {
        expectedException(ExcecaoNegocio.class, "30");
        new Pessoa(NOME, EMAIL, null);
    }

    @Test
    public void testPessoaCpf1() {
        expectedException(ExcecaoNegocio.class, "30");
        new Pessoa(NOME, EMAIL, "");
    }

    @Test
    public void testPessoaCpf2() {
        expectedException(ExcecaoNegocio.class, "30");
        new Pessoa(NOME, EMAIL, UtilStringTest.concat("0", 12));
    }

    @Test
    public void testPessoaCpf3() {
        expectedException(ExcecaoNegocio.class, "30");
        new Pessoa(NOME, EMAIL, UtilStringTest.concat("b", 11));
    }

    @Test
    public void testPessoaCpf4() {
        new Pessoa(NOME, EMAIL, CPF);
    }

    public static Pessoa getPessoa() {
        return new Pessoa(NOME, EMAIL, CPF);
    }
}
