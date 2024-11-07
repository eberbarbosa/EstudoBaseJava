/*
 *  Data: 15/10/2024
 * - pagina 701 livro: Java como Programar - Deitel
 *  Descrição: Utilizando um HashSet para remover duplicatas
 */

package colecoes;

import java.util.*;

public class SetTest {

    private static final String colors[] = { "red", "white", "blue", "green", "gray", "orange", "tan", "white",
            "cyan", "peach", "gray", "orange" };

    // cria e gera saída ArrayList
    public SetTest() {

        List<String> list = Arrays.asList(colors);
        System.out.printf("ArrayList: %s\n", list);
        printNonDuplicates(list);

    }

    // cria conjunto de arrays para eliminar duplicatas
    private void printNonDuplicates(Collection<String> collection) {

        // cria um HashSet
        Set<String> set = new HashSet<String>(collection);

        System.out.println("\nNão duplicados sao: ");

        for (String s : set) {
            System.out.printf("%s ", s);
        }

        System.out.println();
    }

    public static void main(String[] args) {

        new SetTest();
    }
}
