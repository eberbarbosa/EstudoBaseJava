/*
 *  Data: 15/10/2024
 * - pagina 700 livro: Java como Programar - Deitel
 *  Descrição: Programa de teste da classe de biblioteca padrão PriorityQueue
 */

package colecoes;

import java.util.PriorityQueue;

public class PriorityQueueTest {

    public static void main(String[] args) {

        // fila de capacidade 11
        PriorityQueue<Double> queue = new PriorityQueue<Double>();

        // insere elementos na fila
        queue.offer( 3.2 );
        queue.offer( 9.8 );
        queue.offer( 5.4 );

        System.out.print("Pesquisa da fila: ");

        // exibe elementos na fila
        while (queue.size() > 0 ) {
            System.out.printf("%.1f ", queue.peek());       // visualiza elemento superior
            queue.poll();                                   // remove elemento superior
        }
    }
}
