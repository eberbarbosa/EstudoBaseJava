/*
 *  Data: 21/10/2024
 * - pagina 702 livro: Java como Programar - Deitel
 *  Descrição: Utilizando TreeSet e SortedSet
 */

package colecoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {

    private static final String names[] = {"yellow", "green", "black", "tan", "grey", "white", "orange", "red," +
             "green"};

            // cria um conjunto classificado com TreeSet, e depoid manipula
            public SortedSetTest() {

                // Cria TreeSet
                SortedSet<String> tree = new TreeSet<String>(Arrays.asList(names));

                System.out.println("Elementos ordenados:  ");
                printSet(tree);     // conteúdo de saída de árvore

                // obtém o heaSet com base em "orange"
                System.out.print("\nheadSet (\"orange\"): ");
                printSet(tree.headSet("orange"));

                // obtém tailSet baseado em Orange
                System.out.print("\ntailSet (\"orange\"): ");
                printSet(tree.tailSet("orange"));

                // Obtém o primeiro e o último elementos
                System.out.printf("Primeiro: %s\n", tree.first());
                System.out.printf("Ultimo: %s\n", tree.last());
            }

            // gera saída do conjunto
            private void printSet(SortedSet<String> set) {

                for(String s : set) {
                    System.out.printf("%s", s);

                    System.out.println();
                }
            }

    public static void main(String[] args) {

                new SortedSetTest();
    }

}
