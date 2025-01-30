/*
 * 06/05/2023
 *    Calcula valores a serem colocados em elementos de um array.
 * 
 */
package Arrays_e_Matrizes;

/**
 *
 * @author eber
 */
public class InitArray2 {
    
    public static void main(String[] args) {
        
        final int ARRAY_LENGTH = 10;        // Declara a constante
        int array[] = new int[ARRAY_LENGTH];  // cria o array
        
        // Calcula o valor de cada elemento do array
        for(int i = 0; i < array.length; i++)
            
            array[i] = 2 + 2 * i;
        
        System.out.printf("%s%8s\n", "Posição", "Valor");   // Títulos da coluna
        
        // gera a saída do valor de cada elemento do array
        for(int j = 0; j < array.length; j++)
            
            System.out.printf("%5d%8d\n", j, array[j]);
        
    }
    
}
