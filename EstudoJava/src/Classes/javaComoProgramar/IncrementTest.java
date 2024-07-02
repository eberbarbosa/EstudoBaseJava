/*
 *  18/09/2023 
*   pagina 279 livro: Java como Programar - Deitel
 *  Variável de Instância final inicializada com um argumento do construtor
 */
package javaComoProgramar;

/**
 *
 * @author eber
 */
public class IncrementTest {
    
    public static void main(String[] args) {
        
        Increment value = new Increment( 5 );
        
        System.out.printf("Before incrementing: %s\n\n", value );
        
        for ( int i = 1; i <= 3; i++) {
            
            value.addIncrementToTotal();
            
            System.out.printf( "After increment %d: %s\n", i, value );
        }
    }
    
}
