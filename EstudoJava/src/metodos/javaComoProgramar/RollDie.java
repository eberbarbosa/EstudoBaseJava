/*
 * 19/05/2023 
* - pagina 176 livro: Java como Programar - Deitel
 * Esse programa rola um dado de seis lados 6000 vezes
 */
package javaComoProgramar;

import java.util.Random;

/**
 *
 * @author eber
 */
public class RollDie {

    public static void main(String[] args) {

        Random randomNumbers = new Random();       // gerador de número aleatório

        int frequency1 = 0;     // mantém a contagem de 1s lançados
        int frequency2 = 0;     // contagem de 2s lançados
        int frequency3 = 0;     // contagem de 3s lançados
        int frequency4 = 0;     // contagem de 4s lançados
        int frequency5 = 0;     // contagem de 5s lançados
        int frequency6 = 0;     // contagem de 6s lançados

        int face;      // armazena o valor lançado mais recente

        // resume os resultados de 6000 lançamentos de um lado
        for (int roll = 1; roll <= 6000; roll++) {

            face = 1 + randomNumbers.nextInt(6);      // número de 1 a 6

            // determina valor de lançamento de 1 a 6 e incrementa o contador apropriado
            switch (face) {

                case 1:
                    ++frequency1;       // incrementa o contador 1s
                    break;

                case 2:
                    ++frequency2;
                    break;

                case 3:
                    ++frequency3;
                    break;

                case 4:
                    ++frequency4;
                    break;

                case 5:
                    ++frequency5;
                    break;

                case 6:
                    ++frequency6;
                    break;
            }

        }
        
        System.out.println("Face\tFrequency");      // cabeçalhos ded saída
        
        System.out.printf("1\t%d\n2\t%d\n3\t%d\n4\t%d\n5\t%d\n6\t%d\n",
                frequency1, frequency2, frequency3, frequency4, frequency5, frequency6);

    }

}
