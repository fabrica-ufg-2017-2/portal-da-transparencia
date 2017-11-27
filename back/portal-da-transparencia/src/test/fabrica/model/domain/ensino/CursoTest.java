package fabrica.model.domain.ensino;

import fabrica.model.domain.ExcecaoNegocio;
import fabrica.util.TestCaseBase;
import fabrica.util.UtilStringTest;
import org.junit.Test;

/**
 * @author gabriel
 * @version 1.0.0
 */
public class CursoTest extends TestCaseBase {

    private static String descricaoPlanoEnsino = "Resumo\n" +
            "Introdução\n" +
            "Este  documento  apresenta  o  projeto  pedagógico  do  curso  de  graduação  em  Engenharia  de  Software,   modalidade \n" +
            "bacharelado, oferecido pelo Instituto de Informática da Universidade Federal de Goiás (UFG). O referido curso foi criado pelo \n" +
            "Conselho Universitário  da UFG na reunião  plenária de 27  de junho  de  2008  conforme a  resolução CONSUNI 10/2008. O \n" +
            "presente projeto pedagógico foi aprovado  em reunião extraordinária do Conselho Diretor  do Instituto  de  Informática no dia \n" +
            "12/02/2009. \n" +
            "Versões anteriores  e preliminares do presente projeto pedagógico foram publicadas  e receberam sugestões de melhorias. \n" +
            "Convém destacar duas versões delas, publicadas nos artigos:\n" +
            "•\n" +
            "Bacharelado em Engenharia de Software na Universidade Federal de Goiás, \n" +
            "Fórum de Educação  em Engenharia de \n" +
            "Software (Simpósio  Brasileiro de Engenharia de Software), Monografias em Ciência da Computação, número 43/08,  \n" +
            "páginas 16-21, Campinas/SP, 17/10/2008, ISSN 0103-9741. \n" +
            "•\n" +
            "Engenharia  de Software: Graduação  (bacharelado) em Engenharia de  Software,  \n" +
            "Engenharia de  Software Magazine, \n" +
            "Ano I, 10a. edição, páginas 56-60, fevereiro de 2009, ISSN 1983127-7.\n" +
            "Contexto\n" +
            "O Instituto de Informática possui extensa experiência no ensino superior  e  consistente envolvimento com  empresas locais \n" +
            "de  Tecnologia da Informação (TI).  O  resultado  é um  rico conjunto de  lições aprendidas, que adicionadas à percepção  de \n" +
            "que a educação  em  Engenharia de  Software é o  fator  mais relevante para a promoção da indústria  de  software regional, \n" +
            "conduziram  ao  presente   projeto  pedagógico  de  curso  (PPC).  Conforme  [Garg  2008],  a  educação  em  Engenharia  de \n" +
            "Software é o principal fator para a promoção da indústria de software de vários países. \n" +
            "O que é Engenharia de Software?\n" +
            "Engenharia de Software  é “a aplicação de uma abordagem  sistemática,  disciplinada  e quantificável  no desenvolvimento, na \n" +
            "operação  e  na  manutenção  de  software,  ou  seja,  a  aplicação  de  engenharia  a  software,  além   do  estudo  de  tais \n" +
            "abordagens”  [IEEE  1990].  Suas  principais  bases  estão  na  Ciência  da  Computação  e  na  Matemática  [SEEK  2004]  e  se \n" +
            "dedica  aos  problemas   práticos  da  produção  de  software  [Sommerville  2006].  O  conhecimento  pertinente  encontra-se \n" +
            "devidamente documentado  [SWEBOK 2004]. A Engenharia de Software usa a matemática, a ciência  da computação e a \n" +
            "engenharia para resolver problemas em domínios de aplicação. ";

    @Test
    public void testCursoDescricaoPlanoEnsino() {
        expectedException(ExcecaoNegocio.class, "10");
        new Curso(null);
    }

    @Test
    public void testCurso() {
        new Curso(descricaoPlanoEnsino);
    }

    public static Curso getCurso() {
        return new Curso(descricaoPlanoEnsino);
    }
}