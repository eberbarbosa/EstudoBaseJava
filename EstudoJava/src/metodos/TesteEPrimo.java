/*
 * 05/06/2023 
* - pagina 117 livro: Programação Java
 * Esse programa testa o método booleanos que verfica se se são primos
 */

/**
 *
 * @author eber
 */
public class TesteEPrimo {
    
    public static void main(String[] args) {
        
        for( int i = 0;  i < 100; i++) {
            
            if( Eprimo(i))
                System.out.println(i + " ");
            
            System.out.println("");
        }
    }
    
    public static boolean Eprimo( int n ) {
        
        if( n < 2 )
            return false;
        
        if( n == 2)
            return true;
        
        if( n%2 == 0)
            return false;
        
        for( int d = 3; d <= Math.sqrt(d); d += 2) {
            
            if(n%d == 0)
                return false; 
            
        }                  
        
            return true;
    
    }
    
}
