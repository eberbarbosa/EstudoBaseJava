/*
 *  Data: 02/12/2024
 * - pagina 1021 livro: Java como Programar - Deitel
 *  Descrição: Método String concat.
 */

package String;

public class StringConcatenation {

    public static void main(String[] args) {

        String s1 = new String("Feliz");
        String s2 = new String("Aniversário");

        System.out.printf("s1 = %s\ns2 = %s\n\n", s1, s2);
        System.out.printf("Resultado de s1.concat(s2) = %s\n", s1.concat(s2));
        System.out.printf("s1 após concatenação = %s\n", s1);

    }
}
