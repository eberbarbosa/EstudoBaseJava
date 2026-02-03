/*
 *  Data: 06/12/2024
 * - pagina 1021 livro: Java como Programar - Deitel
 *  Descrição: Métodos String concat.
 */

package String;

public class StringVariadas {

    public static void main(String[] args) {

        String s1 = new String("hello");
        String s2 = new String("GOODBYE");
        String s3 = new String("   spaces    ");

        System.out.printf("s1 = %s\ns2 = %s\ns3 = %s\n\n", s1, s2, s3);

        // testa o método replace
        System.out.printf("Substituir 'l' por 'L' em s1: %s\n\n", s1.replace('l', 'L'));

        // testa o toLowercasee toUpperCase
        System.out.printf("s1.toUpperCase() = %s\n", s1.toUpperCase());
        System.out.printf("s2.toLowerCase() = %s\n\n", s2.toLowerCase());

        // testa o método trim
        System.out.printf("s3 depois do trim = %s\n\n", s3.trim());

        // testa o método toChartArray
        char charArray[] = s1.toCharArray();
        System.out.print("s1 como um character array = ");

        for (char character : charArray) {
            System.out.print(character);
        }

        System.out.println();

    }
}
