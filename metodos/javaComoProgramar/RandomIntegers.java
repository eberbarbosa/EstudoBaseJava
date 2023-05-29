/*
 * 26/05/2023 
* - pagina 175 livro: Java como Programar - Deitel
 * Inteiros aleatórios deslocados e escalonados
 */
package javaComoProgramar;

import java.util.Random;

/**
 *
 * @author eber
 */
public class RandomIntegers {
    
    public static void main(String[] args) {
        
        Random randomNumbers = new Random();     // gerador de número aleatório
        int face;                               // armazena cada inteiro aleatório
        
        // Faz o loop 20 vezes
        for ( int counter = 1; counter <= 20; counter++) {
            
            // Seleciona o inteiro aleatório de 1 a 6
            face = 1 + randomNumbers.nextInt(6);
            
            System.out.printf("%d ", face);      // exibe valor gerado
            
            // Se o contador for divisível por 5, inicia uma nova linha de saída
            if ( counter % 5 == 0)
                
                System.out.println();
        }
    }
    
}
