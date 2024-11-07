/*
 *  Data: 06/10/2024
 * - pagina 696 livro: Java como Programar - Deitel
 *  Descrição: Utilizando algoritmos addAll, frequency e disjoint
 */

package colecoes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Algorithms2 {

    private String[] colors = { "red", "white", "yellow", "blue" };
    private List< String > list;
    private Vector< String > vector = new Vector< String >();

    // Cria List e Vector e os manipula a partir de Collections

    public Algorithms2() {

        //inicializa list e vector
        list = Arrays.asList( colors) ;
        vector.add( "black" );
        vector.add( "red" );
        vector.add( "green" );

        System.out.println( "Antes de addAll, vector contém: " );

        // exibe elementos em vector
        for ( String s : vector) {
            System.out.printf("%s ", s);
        }

        // Adiciona elementos de colors a list
        Collections.addAll(vector, colors);

        System.out.println("\n\nDepois de addAll, vector contém: ");

        // exibe elementos em vector
        for (String s : vector) {
            System.out.printf("%s ", s);

        }

            //obtém a frequência de "red"
            int frequency = Collections.frequency(vector, "red");

            System.out.printf("\n\nFrequencia de red em vector: %d\n", frequency);

            // verifica se list e vectoe têm elementos em comum
        boolean disjoint = Collections.disjoint(list, vector);

        System.out.printf("\nlist e vector %s elementos em comum\n", disjoint ? "Não tem" : "Tem");


    }

    public static void main(String[] args) {
        new Algorithms2();
    }
}
