package fabrica.model.domain.ensino;

import fabrica.model.domain.ExcecaoNegocio;
import fabrica.util.TestCaseBase;
import fabrica.util.UtilStringTest;
import org.junit.Test;

/**
 * @author gabriel
 * @version 1.0.0
 */
public class DisciplinaTest extends TestCaseBase {

    private static final String nomeDisciplina  = "DESENVOLVIMENTO DE SOFTWARE CONCORRENTE";

    private static final String descricaoDisciplina =
            "De forma específica, a disciplina deve possibilitar aos estudantes a capacidade de:\n" +
            "- Discutir os principais desafios diante da atividade de desenvolvimento de software concorrente;\n" +
            "- Explicar e descrever os conceitos básicos relacionados à concorrência em software;\n" +
            "- Identificar as principais ferramentas disponíveis para o desenvolvimento de software concorrente;\n" +
            "- Explicar e descrever as características que são desejáveis em uma ferramenta de\n" +
            "desenvolvimento de software concorrente;\n" +
            "- Explicar e descrever os principais algoritmos concorrentes;\n" +
            "- Explicar e descrever as propriedades de liveness e safety e o conceito de deadlock;\n" +
            "- Implementar programas concorrentes em Java usando threads com foco em propriedades de\n" +
            "liveness e safety;\n" +
            "- Implementar programas concorrentes em Java usando threads com a técnica de semáforos para\n" +
            "lidar com deadlocks.";

    private static final PublicoDiscente publicoDiscente = PublicoDiscente.GRADUCAO;

    @Test
    public void testDisciplinaNomeDisciplina() {
        expectedException(ExcecaoNegocio.class, "10");
        new Disciplina(null, null, null);
    }

    @Test
    public void testDisciplinaNomeDisciplina1() {
        expectedException(ExcecaoNegocio.class, "10");
        new Disciplina(UtilStringTest.concat("a", 51), null, null);
    }

    @Test
    public void testDisciplinaDescricaoDisciplina() {
        expectedException(ExcecaoNegocio.class, "20");
        new Disciplina(nomeDisciplina, null,null);
    }

    @Test
    public void testDisciplinaDescricaoDisciplina1() {
        expectedException(ExcecaoNegocio.class, "20");
        new Disciplina(nomeDisciplina, UtilStringTest.concat("a", 2001),null);
    }

    @Test
    public void testDisciplinaPublicoDiscente() {
        expectedException(ExcecaoNegocio.class, "30");
        new Disciplina(nomeDisciplina, descricaoDisciplina,null);
    }

    @Test
    public void testDisciplina() {
        new Disciplina(nomeDisciplina, descricaoDisciplina, publicoDiscente);
    }

    public static Disciplina disciplina() {
        return new Disciplina(nomeDisciplina, descricaoDisciplina, publicoDiscente);
    }
}