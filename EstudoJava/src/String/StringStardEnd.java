/*
 *  Data: 18/11/2024
 * - pagina 1018 livro: Java como Programar - Deitel
 *  Descrição: Métodos String startsWith e endsWith.
 */


package String;

public class StringStardEnd {

    public static void main(String[] args) {

        String strings[] = { "started", "starting", "ended ", "ending" };

        // testa o método startsWith
        for ( String string : strings) {
            if (string.startsWith("st")){
                System.out.printf("\"%s\"começa com \"st\"\n", string);
            }
        }

        System.out.println();

        // testa o método startsWith iniciando da posição 2 de string
        for ( String string : strings) {
            if (string.startsWith("art", 2)){
                System.out.printf("\"%s\"começa com \"art\" na posição 2\n", string);
            }
        }

        System.out.println();

        // testa o método EndsWith
        for ( String string : strings) {
            if (string.endsWith("edd")){
                System.out.printf("\"%s\"Termina com \"ed\"\n", string);
            }
        }
    }
}
