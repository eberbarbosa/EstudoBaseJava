/*
 * 04/05/2023
 *    Demonstra a solução recursiva para o problema das Torres de Hanoi.
 * 
 */
package Recursividade;

/**
 *
 * @author eber
 */
public class TorreDeHanoi {
    
    public static void main(String[] args) {
        
        torresDeHanoi(4, "primeiro pino", "pino final", "pino temporario");
    }
    
    private static void torresDeHanoi(int numeroDeAneis, String origem, String destino, String auxiliar) {
        
        if(numeroDeAneis > 0) {
            
            // movemos todos os anéis (menos o ultimo ) para o pino auxiliar,
            // usando o pino destino como auxiliar temporário
            torresDeHanoi(numeroDeAneis - 1, origem, auxiliar, destino);
            
            // movemos o ultimo pino da origem para o destino diretamente
            System.out.println("Mover pino "+numeroDeAneis+" de "+origem+" para "+destino);
            
            // Movemos todos os pino (menos o ultimo) do pino auxiliar para o pino
            // de destino usando o pino dse origem como auxiliar temporário
            torresDeHanoi(numeroDeAneis - 1, auxiliar, destino, origem);
        }
    }
    
}
