/*
 * 16/05/2023 
* - pagina 116 livro: Programação Java
 * - Implementação recursiva da Função Fatorial
 */

/**
 *
 * @author eber
 */
public class Metodo_Fatorial {
    
    public static void main(String[] args) {
        
        for(int i = 0; i < 9; i++)
            
            System.out.println("fatorial(" + i + ") = " + fatorial(i));
            
    }
    
    public static long fatorial(int n) {
        
        if( n < 2 )
            return 1;
        return n*fatorial(n-1);
    }
    
}

