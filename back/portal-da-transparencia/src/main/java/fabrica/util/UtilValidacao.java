package fabrica.util;

import fabrica.model.domain.ExcecaoNegocio;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.regex.Pattern;

/**
 * @author gabriel
 * @version 1.0.0
 *
 * Classe com funções ultilitárias para validação de Strings.
 */
public final class UtilValidacao {

    public static final String REGEX_EMAIL = loadRegexEmail();

    /**
     *
     * @param s - String a ser validada.
     * @param maxLenght - Tamanho máximo string.
     * @param exeption - Função para lançar exeção caso validação
     * @param <T> Tipo Exceção que sera lançada
     * @return String passada como parâmetro.
     * @throws T Subclasse de Throwable que lança exeção caso string inválida.
     */
    public static <T extends ExcecaoNegocio> String validaString(String s, int maxLenght, Supplier<? extends T> exeption) throws T {
        if (s == null || s.isEmpty() || s.length() > maxLenght)
            throw exeption.get();
        return s;
    }

    /**
     *
     * @param s - String a ser validada.
     * @param maxLenght - Tamanho máximo string.
     * @param regex - Regex para validação de strings que será havaliada
     * @param exeption - Função para lançar exeção caso validação
     * @param <T> Tipo Exceção que sera lançada
     * @return String passada como parâmetro.
     * @throws T Subclasse de Throwable que lança exeção caso string inválida.
     */
    public static <T extends ExcecaoNegocio> String validaString(String s, int maxLenght, String regex, Supplier<? extends T> exeption) throws T {
        if (s == null || s.isEmpty() || s.length() > maxLenght)
            throw exeption.get();
        if (!Pattern.compile(regex, Pattern.CASE_INSENSITIVE).matcher(s).matches())
            throw exeption.get();
        return s;
    }

    /**
     *
     * @param s - String a ser validada.
     * @param invalido - Função que implementa lógica de validação da
     *        string para casos específicos de valídação de strings.
     * @param <T> Tipo Exceção que sera lançada
     * @return String passada como parâmetro.
     * @throws T Subclasse de Throwable que lança exeção caso string inválida.
     */
    public static <T extends ExcecaoNegocio> String validaString(String s, Function<String, Boolean> invalido, String regex, Supplier<? extends T> exception) throws T {
        if (!invalido.apply(s))
            throw exception.get();
        return s;
    }

    /**
     *
     * @param objeto - Objeto a ser válidado.
     * @param exception - Função que lança exeção.
     * @param <X> - Tipo do Objeto a ser validado.
     * @param <T>  - Tipo Exceção que será lançada.
     * @return Objeto passado como parâmetro.
     * @throws T Subclasse de Throwable que lança exeção caso inválido.
     */
    public static <X extends Object, T extends ExcecaoNegocio> X valida(X objeto, Supplier<? extends T> exception) throws T {
        if (objeto == null) {
            throw exception.get();
        }
        return objeto;
    }

    /**
     *
     * @param objeto - Objeto a ser válidado.
     * @param invalido - Função para validação.
     * @param exception - Função que lança exeção.
     * @param <X> - Tipo do Objeto a ser validado.
     * @param <T>  - Tipo Exceção que será lançada.
     * @return Objeto passado como parâmetro.
     * @throws T Subclasse de Throwable que lança exeção caso inválido.
     */
    public static <X extends Object, T extends ExcecaoNegocio> X valida(X objeto, Function<X, Boolean> invalido, Supplier<? extends T> exception) throws T {
        if (!invalido.apply(objeto)) {
            throw exception.get();
        }
        return objeto;
    }

    private static String loadRegexEmail() {
        try {
             return Files.lines(Paths.get(
                          ClassLoader.getSystemResource("regex/emailRFC822.data").toURI()))
                         .reduce( "", (a, b) -> a.concat(b));

        } catch (Exception e) {
            return null;
        }
    }
}
