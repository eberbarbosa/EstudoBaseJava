/*
 *  Data: 04/11/2024
 * - pagina 1013 livro: Java como Programar - Deitel
 *  Descrição: Construtores da classe String
 */

package String;

public class StringConstructors {

    public static void main(String[] args) {

        char charArray[] = {'b', 'i', 'r', 't', 'h', ' ', 'd', 'a', 'y'};
        String s = new String("Hello");

        // utiliza os construtores String
        String s1 = new String();
        String s2 = new String(s);
        String s3 = new String(charArray);
        String s4 = new String(charArray, 6, 3);

        System.out.printf("s1 = %s\ns2 = %s\ns3 = %s\ns4 = %s\n", s1, s2, s3, s4);      // exibe Strings);

    }

}
