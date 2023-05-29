/*
 * 16/05/2023 
* - pagina 111 livro: Programação Java
 * Esse programa testa o método min() que devolve o menor do inteiro de seus dois argumentos
 */

import java.util.Random;


/**
 *
 * @author eber
 */
public class MenorInteiro {
    
    public static void main(String[] args) {
        
        Random random = new Random();
        
        for(int i = 0; i < 5; i++) {
            int m = random.nextInt(100);
            int n = random.nextInt(100);
            int y = min(m, n); 
            
            System.out.println("menor é (" + m + ", " + n + ") = " + y);
            
        }
        
        
    }
    
    public static int min(int x, int y) {
        
        if(x < y)
            return  x;
        else
            return y;
    }
    
}
