/*
 *  Data: 20/11/2024
 * - pagina 1019 livro: Java como Programar - Deitel
 *  Descrição: Métodos de pesquisa de String IndexOf e lastIndexOf.
 */

package String;

public class StringIndexMethods {

    public static void main(String[] args) {

        String letras = "abcdefghijklm";

        // testa indexOf para localizar um caractere em uma string
        System.out.printf("'c' esta localizado no indice %d\n", letras.indexOf('c'));
        System.out.printf("'a' esta localizado no indice %d\n", letras.indexOf('a', 1));
        System.out.printf("'$' esta localizado no indice %d\n\n", letras.indexOf('$'));

        // Testa lastIndexOf para localizar um caractere em uma String
        System.out.printf("O último 'c' está localizado no índice %d\n", letras.lastIndexOf('c'));
        System.out.printf("O último 'a' está localizado no índice %d\n", letras.lastIndexOf('a', 25));
        System.out.printf("O último '$' está localizado no índice %d\n\n", letras.lastIndexOf('$'));

        // teste indexOf para localizar uma substring em uma string
        System.out.printf("\"def\" esta localizado no indice %d\n", letras.indexOf("def"));
        System.out.printf("\"def\" esta localizado no indice %d\n", letras.indexOf("def", 7));
        System.out.printf("\"hello\" esta localizado no indice %d\n\n", letras.indexOf("hello"));

        // Testa lastIndexOf para localizar uma substring em uma String
        System.out.printf("O último \"def\" está localizado no índice %d\n", letras.lastIndexOf("def"));
        System.out.printf("O último \"def\" está localizado no índice %d\n", letras.lastIndexOf("def", 7));
        System.out.printf("O último \"hello\" está localizado no índice %d\n\n", letras.lastIndexOf("hello"));


    }
}
