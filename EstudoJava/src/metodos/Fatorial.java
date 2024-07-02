/*
 * 16/05/2023 
* - pagina 112 livro: Programação Java
 * Esse programa testa o método fat() que implementa a função fatorial.
 */

/**
 *
 * @author eber
 */
public class Fatorial {
    
    public static void main(String[] args) {
        
        for(int i = 0; i < 9; i++)
            
            System.out.println("fatorial(" + i + ") = " + fatorial(i));
            
    }
    
    public static long fatorial(int n) {
        
        long f = 1;
        while(n > 1) {
            f*= n--;       
        }
        return f;
    }
    
}
