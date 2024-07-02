
import java.util.Random;

/*
 * 25/04/2023
 * O programa usa um gerador de numeros randômicos para gerar um inteiro 
 * randomico e então indicar se o inteiro é negativo. 
 */

/**
 *
 * @author eber
 */
public class RandomInteger {
    
    public static void main(String[] args) {
        
        Random random = new Random();
        
        int numero = random.nextInt();
        
        System.out.println("numero = " + numero);
        
        if(numero < 0) {
            
            System.out.println("\u001B[31m***** numero < 0 *****\u001B[0m");
        }
        else
                    System.out.println("\u001B[32mnumero > 0\u001B[0m");
        
        System.out.println("!!! Tchau !!!");
    }
    
}
