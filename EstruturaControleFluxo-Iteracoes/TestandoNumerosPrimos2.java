
import java.util.Random;

/*
 * 27/04/2023
 *      Este programa gera um numero randômico no intervalo de 2 a 100 e então 
 *  testa se ele é primo. 
 *      Usa uma variavel boolean e um comando break para interrompero laço   
 * quando o divisor for encontrado
 */

/**
 *
 * @author eber
 */
public class TestandoNumerosPrimos2{
    
    public static void main(String[] args) {
        
        Random random = new Random();
        
        int numero = random.nextInt(100);
        boolean nãoÉPrimo = (numero%2 == 0);
        
        for(int x = 3; x < x; x += 2) {           
                       
            if(nãoÉPrimo) break;
            
            System.out.println(" . ");
            
            nãoÉPrimo = (numero%x == 0);
        }
        
            System.out.println("\n" + numero);
        
        if(nãoÉPrimo) {
            
            System.out.println("\u001B[31m!!! Não é Primo !!!\n\u001B[0m");
            
        }
         else
        
            System.out.println( "\u001B[32m !!! É primo !!! \nu\001B[0m");
    }
    
}

