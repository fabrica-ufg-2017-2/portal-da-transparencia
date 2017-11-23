package fabrica.util;

/**
 * @author gabriel
 * @version 1.0.0
 */
public final class UtilStringTest {

    /**
     *
     * @param a - Caractere a ser repetido.
     * @param j - Número de vezes que o caractere ira aparecer.
     * @return String com o j caracteres a.
     */
    public static String concat(String a, int j) {
        StringBuilder s = new StringBuilder();
        for (; j > 0; j--) {
            s.append(a);
        }
        return s.toString();
    }
}
