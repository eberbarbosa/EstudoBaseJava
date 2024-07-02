
import java.util.Arrays;

/*
 * 06/05/2023
 *    O programa ilustra os métodos sort(), binarySearch(), fill() e equals() da
 * classe java.util.Arrays.
 * 
 */

/**
 *
 * @author eber
 */
public class TestArrays2 {
    
    public static void main(String[] args) {
        
        int a[] = {44, 77, 55, 22, 99, 88, 33, 66};   
        print(a);
        
        Arrays.sort(a);
        print(a);
        
        int k = Arrays.binarySearch(a, 44);
        System.out.println("Arrays.binarySearch(a, 44):  " + k);
        System.out.println("a[" + k + "]: " + a[k]);
        
        k = Arrays.binarySearch(a, 45);
        System.out.println("Arrays.binarySearch(a, 45):  " + k);
        
        int b[] = new int[8];
        print(b);
        
        Arrays.fill(b, 55);
        print(b);
        
        System.out.println("Arrays.equals(a,b): " + Arrays.equals(a, b));
        
    }

    private static void print(int[] a) {
        
        for(int i = 0; i < a.length; i++) 
            
            System.out.print(a[i] + " ");   
            
            System.out.println();         
                    
    }
    
}
