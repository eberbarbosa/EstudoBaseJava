/*
 *  Data: 28/11/2024
 * - pagina 1020 livro: Java como Programar - Deitel
 *  Descrição: Métodos de substring da classe String.
 */

package String;

public class SubString {

    public static void main(String[] args) {

        String letters = "abcdefghijklmabcdefghijklm";

        // testa métodos substring
        System.out.printf("Substring do índice 20 até o final é \"%s\"\n", letters.substring( 20 ));

        System.out.printf("%s \"%s\"\n", "Substring do índice 3 até, mas não incluindo 6 é", letters.substring( 3, 6 ));

    }
}
