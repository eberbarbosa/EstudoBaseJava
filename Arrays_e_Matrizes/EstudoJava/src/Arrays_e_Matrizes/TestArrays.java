/*
 * 06/05/2023
 *    O programa ilustra a declaração, a inicialização e a impressão de um array.
 * 
 */

/**
 *
 * @author eber
 */
public class TestArrays {
    
    public static void main(String[] args) {
        
        int [] ints = {22, 44, 66, 88};
        
        System.out.println("ints: " + ints);
        System.out.println("ints.length: " + ints.length);
        System.out.println("ints[2]: " + ints[2]);
        
        print(ints);
        
        ints[2] = 99;
        
        System.out.println("ints[2]: " + ints[2]);
        
        print(ints);
    }
    
    public static void print(int[] a) {
        
        for(int i = 0; i < a.length; i++) {
            
            System.out.print(a[i] + " ");   
            
            System.out.println();           
            
        }
    }
    
}
