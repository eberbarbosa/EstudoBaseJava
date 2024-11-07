/*
 *  Data: 07/11/2024
 * - pagina 1014 livro: Java como Programar - Deitel
 *  Descrição: Construtores da classe String
 */

package String;

public class StringMiscellaneous {

    public static void main(String[] args) {

        String s1 = "hello there";
        char   charArray[] = new char[ 5 ];

        System.out.printf("s1: %s", s1);

        // testa o método length
        System.out.printf("\nComprimento de s1: %d", s1.length());

        // faz loop pelos caracteres em s1 com charAt e os exibe na ordem inversa
        System.out.print("\nA string invertida é: ");

        for (int count = s1.length() - 1; count >= 0; count--)
            System.out.printf("%s ", s1.charAt(count));


        // copia caracteres a partir de string para charArray
        s1.getChars(0, 5, charArray, 0);

        System.out.printf("\nO array de caracteres é: ");

        for (char character : charArray)
            System.out.print(character);

        System.out.println();
    }
}
