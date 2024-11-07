/*
 *  Data: 29/09/2024
 * - pagina 695 livro: Java como Programar - Deitel
 *  Descrição: Utilizando o algoritmo binarySearch
 */
package colecoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest {

    private static final String colors[] = { "red", "white", "blue", "black", "yellow", "purple", "tan", "pink" };
    private List< String > list;        // referência de ArrayList

    // cria, classifica e gera saída da lista
    public BinarySearchTest() {

        list = new ArrayList< String >(Arrays.asList(colors));
        Collections.sort(list);     // classifica a ArrayList
        System.out.printf("ArrayList Ordenado: %s\n", list);
    }

    // pesquisa varios valores na lista
    private void search() {

        printSearchResults( colors[3]);     // pirmeiro item
        printSearchResults( colors[0]);     // item do meio
        printSearchResults( colors[7]);     // último item
        printSearchResults( "aqua");        // abaixo do mais baixo
        printSearchResults( "gray");        // não existe
        printSearchResults( "teal");        // não exite
    }

    // realiza pesquisas e exibe o resultado da pesquisa
    private void printSearchResults( String key) {

        int result = 0;

        System.out.printf( "Procurando por: %s\n", key );
        result = Collections.binarySearch( list, key );

        if ( result >= 0) {
            System.out.printf( "Encontrado no índice %d\n", result );
        }
        else {
            System.out.printf( "Não encontrado (%d)\n", result );
        }
    }

    public static void main(String[] args) {

        BinarySearchTest binarySearchTest = new BinarySearchTest();

        binarySearchTest.search();
    }
}
