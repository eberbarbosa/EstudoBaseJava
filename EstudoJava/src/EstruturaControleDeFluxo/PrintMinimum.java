
import java.util.Random;

/*
 * 25/04/2023
 * Testando dois inteiro randômicos para determinar o menor 
 * 
 */

/**
 *
 * @author eber
 */
public class PrintMinimum {
    
     public static void main(String[] args) {
        
        Random random = new Random();
        
        int numero1 = random.nextInt();
        int numero2 = random.nextInt();
        
        System.out.println("numero1 = " + numero1);
        System.out.println("numero2 = " + numero2);
        
        if(numero1 < numero2) {
            
            System.out.println("\u001B[31mO valor menor é o numero 1 =\u001B[0m " + numero1);
        }
        else
                    System.out.println("\u001B[32mO valor menor é o numero 2 =\u001B[0m " + numero2);        
        
    }
    
}
