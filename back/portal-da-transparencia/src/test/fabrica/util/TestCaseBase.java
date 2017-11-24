package fabrica.util;

import org.junit.Rule;
import org.junit.rules.ExpectedException;


/**
 * @author gabriel
 * @version 1.0.0
 *
 * Super classe para servir de base para demais
 * casos de teste com operações comuns a casos
 * de teste e funções genéricas.
 */
public abstract class TestCaseBase {

    /**
     * Exceção esperada por determinado trecho de execusão.
     */
    @Rule
    public ExpectedException exception = ExpectedException.none();

    /**
     *
     * @param tipoExcecao - Tipo da exeção que está sendo esperado
     *                    por determinado trecho de execução.
     * @param msgEsperada  - Mensagem esperada no atributo <code>message</>
     */
    protected void expectedException(Class<? extends Throwable> tipoExcecao, String msgEsperada) {
        exception.expect(tipoExcecao);
        exception.expectMessage(msgEsperada);
    }
}
