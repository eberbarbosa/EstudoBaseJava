/*
 *  Data: 12/09/2024
 * - pagina 689 livro: Java como Programar - Deitel
 *  Descrição: Classe Comparator personalizada que compara dois objetos Time2
 */

package colecoes;

import Metodos.javaComoProgramar.Time2;

import java.util.Comparator;

public class TimeComparator implements Comparator<Time2> {

    public int compare(Time2 time1, Time2 time2) {

        int hourCompare   = time1.getHour() - time2.getHour();      // compara a hora
        int minuteCompare = time2.getMinute() - time2.getMinute();  // compara o minuto
        int secondCompare = time2.getSecond() - time2.getSecond();  // compata o segundo

        // testa a primeira hora
        if(hourCompare != 0) {
            return hourCompare;
        }

        // então testa o minuto
        if(minuteCompare != 0) {
            return minuteCompare;
        }

        return secondCompare;       // retorna a comparação de segundos
    }
}
