/*
 * 27/04/2023
 *  Babbage descreve como seu computador poderia tabular funções.
 *  Ele forneceu como exemplo o polinomio f(x) = x² + x + 4.
 *  Polinômio curioso porque gera apenas numeros primos.
 * 
 * Maquina Diferencia lde Babbage teria executado:
 * 
 */

/**
 *
 * @author eber
 */
public class Babbage {
    
    public static void main(String[] args) {
        
        for(int x = 0; x < 10; x++) {
            
            int y = x*x + x + 41;
            
            System.out.println("\t" + x + "\t" + y);
        }
    }
    
}
