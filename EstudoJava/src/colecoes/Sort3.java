/*
 *  Data: 12/09/2024
 * - pagina 690 livro: Java como Programar - Deitel
 *  Descrição: Classifica uma lista utilizando a classe Comparator TimeComparator personalizada
 */


package colecoes;

import Metodos.javaComoProgramar.Time2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Sort3 {

    public void printElements() {

        List<Time2> list = new ArrayList<Time2>();      // cria a lista

        list.add(new Time2( 6, 24, 34 ) );
        list.add(new Time2( 18, 14, 58 ) );
        list.add(new Time2( 6, 05, 34 ) );
        list.add(new Time2( 12, 14, 58 ) );
        list.add(new Time2( 6, 24, 22 ) );

        // gera a saída de elementos List
        System.out.printf("Elementos da matriz não classificados:\n%s\n", list);

        // classifica em ordem utilizando um comparador
        Collections.sort(list, new TimeComparator());

        // gera a saída de elementos List
        System.out.printf("Elementos da matriz classificados:\n%s\n", list);
    }

    public static void main(String[] args) {

        Sort3 sort3 = new Sort3();
        sort3.printElements();
    }
}
