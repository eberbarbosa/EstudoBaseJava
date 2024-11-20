/*
 * 29/05/2023 
* - pagina 178 livro: Java como Programar - Deitel
 *  A classe Craps simula o jogo de dados craps
 */
package javaComoProgramar;

import java.util.Random;

/**
 *
 * @author eber
 */
public class Craps {

    // Cria um gerador de números aleatórios paravuso no método rollDie
    private Random randomNumbers = new Random();

    // Enumeração com constantes que representam o status do jogo
    private enum Status {
        CONTINUE, WON, LOST
    };

    // Constantes que representam lançamentos comuns dos dados
    private final static int SNAKE_EYES = 2;
    private final static int TREY        = 3;
    private final static int SEVEN      = 7;
    private final static int YO_LEVEN   = 11;
    private final static int BOX_CARS   = 12;

    // Joga uma partida de craps
    public void play() {

        int    myPoint = 0;    // pontos se não ganhar ou perder na 1ª rolagem
        Status gameStatus;    // pode conter CONTINUE, WON ou LOST

        int sumOfDice = rollDice();   // primeira rolagem dos dados

        // determina o status do jogo e a pontuação com base no primeiro lançamento
        switch (sumOfDice) {
            case SEVEN:     // Ganha com 7 no primeiro lançamento
            case YO_LEVEN:  // Ganha com 11 no primeiro lançamento                
                gameStatus = Status.WON;
                break;
                
            case SNAKE_EYES:    // Perde com 2 no primeiro lançamento
            case TREY:          // Perde com 3 no primeiro lançamento
            case BOX_CARS:      // Perde com 12 no primeiro lançamento
                gameStatus = Status.LOST;
                break;
            
            default:            // Não ganhou e nem perdeu, portanto registra a pontuação
                gameStatus = Status.CONTINUE;       // jogo não terminou
                myPoint    = sumOfDice;             // Informa a pontuação
                
                System.out.printf("Pontuação é %d\n", myPoint);
        }
        
        // Enquanto o jogo não estiver completo
        while(gameStatus == Status.CONTINUE) {        // Nem WON e nem LOST
            
            sumOfDice = rollDice();     // Lança os dados novamente
            
            // Determina o Status do Jogo
            if( sumOfDice == myPoint ) {        // Vitória por pontuação
                
                gameStatus = Status.WON;                
            }
            else
                if( sumOfDice == SEVEN )    // Perde obtendo 7 antes de atingir a pontuação
                    gameStatus = Status.LOST;
        }
        
        // Exibe uma mensagem de ganhou ou perdeu
        if( gameStatus == Status.WON)
            System.out.println("\u001B[32m!!! Jogador Ganhou !!!\u001B[0m");
        
        else
            System.out.println("\u001B[31m!!! Jogador Perdeu !!!\u001B[0m");
    }
    
    // Lança os dados, calcula a soma e exibe os resultados
    public int rollDice() {
        
        // Seleciona os valores aleatórios dos Dados
        int die1 = randomNumbers.nextInt( 6 );      // primeiro lançamento do dado
        int die2 = randomNumbers.nextInt( 6 );      // segundo lançamento do dado
        
        int sum = die1 + die2;      // Soma dos valores dos dados
        
        // Exibe os resultados desse lançamento
        System.out.printf("Jogador rolou os dados %d + %d = %d\n", die1, die2, sum);
        
        return sum;     // Retorna a soma dos dados
    }

}
