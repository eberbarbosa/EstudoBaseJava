/*
 * 04/05/2023
 *    Implementação recursiva do trinagulo de pascal.
 * 
 */
package Recursividade;

/**
 *
 * @author eber
 */
public class TrianguloPascal {
    
    public static void main(String[] args) {
        
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j <= i; j++)
                
                System.out.print(format(c(i, j), 8));
            
            System.out.println();
        }
    }
    
    static long c(int n, int k) {
        
        if(k == 0 || k == n) {
            
            return  1;
        }
        
        return c(n - 1, k -1) + c(n - 1, k);
    }
    
    static String format(long n, int widht) {
        
        String BLANKS = "                          ";
        String s      = String.valueOf(n);
        
        return BLANKS.substring(0, widht - s.length()) + s;
    }     
    
}
