
/*
 * 06/05/2023
 *    O programa encontra números Primos pelo Crivo de Eratóstenes
 * 
 * 
 */

/**
 *
 * @author eber
 */
public class CrivoEratostenes {
    
    final static int P=800;
    static boolean[] isPrimo = new boolean[P];

    public CrivoEratostenes() {
        
        for(int i = 2; i < P; i++)
            isPrimo[i] = true;
        
        for(int i = 2; i < P/2; i++)
            
            if(isPrimo[i])
                for(int j = 2*i; j < P; j += i)
                    isPrimo[j] = false;
                    
    }    
    
    
    public static void main(String[] args) {
        
        new CrivoEratostenes();
        
        print();
        
    }
    
    private static void print() {
        
        for(int i = 0; i < P; i++) 
            if(isPrimo[i])            
            System.out.print(i + " ");   
        
            else if(i%90 == 0)
                System.out.println();                    
                
            System.out.println();        
                    
    }
    
}
