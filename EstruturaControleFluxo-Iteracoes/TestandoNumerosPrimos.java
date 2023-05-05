
import java.util.Random;

/*
 * 27/04/2023
 *      Este programa gera um numero randômico no intervalo de 2 a 100 e então 
 *  testa se ele é primo. 
 *  Lembrando que número primo é um inteiro maior que 1 e dividido por 1 e por 
 * ele mesmo.
 */

/**
 *
 * @author eber
 */
public class TestandoNumerosPrimos{
    
    public static void main(String[] args) {
        
        Random random = new Random();
        
        int numero = random.nextInt(100);
        
        for(int x = 2; x < x; x++) {           
                       
            System.out.print(" . ");
            
            if(numero%x == 0) {
                
                System.out.println("\n" + numero + " !!! Não é primo !!!");
                
                return;
            }
        }
        
        System.out.println("\n" + numero + " !!! É primo !!! \n");
    }
    
}

