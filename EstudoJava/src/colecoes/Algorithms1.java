/*
 *  Data: 20/09/2024
 * - pagina 693 livro: Java como Programar - Deitel
 *  Descrição: Utilizando algoritmos reverse, fill, copy, min e max
 */

package colecoes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algorithms1 {

    private Character [] letras = { 'P', 'C', 'M' };
    private Character [] copiaLetras;
    private List<Character> list;
    private List<Character> copiaList;

    // cria uma Lista e a manipula com métodos de Collection
    public Algorithms1() {

        list = Arrays.asList(letras);       // obtém a lista
        copiaLetras = new Character[ 3 ];
        copiaList = Arrays.asList(copiaLetras);     // visualização de lista de copiaLetras

        System.out.println( "Lista Inicial: " );
        output(list);

        Collections.reverse( list );    // inverte a ordem
        System.out.println( "Depois de chamar reverse: " );
        output(list);

        Collections.copy(copiaList, list);      // copia List
        System.out.println( "Depois de copiar: " );
        output(copiaList);

        Collections.fill(list, 'R');    // preenche a lista com Rs
        System.out.println( "Depois de chamar fill: " );
        output(list);
    }

    // Envia informações de List para Saída
    private void output(List<Character> listRef) {

        System.out.print( "A lista é: " );

        for(Character element : listRef) {
            System.out.printf( "%s ", element );
        }

        System.out.printf( "\nMax: %s", Collections.max( listRef ) );
        System.out.printf( " Min: %s\n", Collections.min(listRef) );
    }

    public static void main(String[] args) {

        new Algorithms1();
    }
}
