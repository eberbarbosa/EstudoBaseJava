/*
 * 06/05/2023
 *    O programa ilustra a declaração, a inicialização e a impressão de um array.
 * 
 */

/**
 *
 * @author eber
 */
public class InitArray {
    
    public static void main(String[] args) {
        
        int array[];                // declara o array identificado
        
        array = new int[10];        // cria o espaço para o array
                 
        System.out.printf("%s%8s\n", "Posição", "Valor");   // Títulos da coluna
        
        // gera a saída do valor de cada elemento do array
        for(int counter = 0; counter < array.length; counter++) {
            
            System.out.printf("%5d%8d\n", counter, array[counter]);
        }
    }
    
}
