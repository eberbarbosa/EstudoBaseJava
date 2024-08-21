/*
 *  Data: 20/08/2024
* - pagina 675 livro: Java como Programar - Deitel
 *  Descrição: Utilizando arrays Java
 */


package colecoes;

import java.util.Arrays;

/**
 *
 * @author eber
 */
public class UsingArrays {
    private final int    intArray[]    = { 1, 2, 3, 4, 5, 6 };
    private final double doubleArray[] = { 8.4, 9.3, 0.2, 7.9, 3.4 };
    private final int[] filledIntArray;
    private final int[] intArrayCopy;
    
    // o construto inicializa arrays

    public UsingArrays() {
        
        filledIntArray = new int[10];  // cria o array int com 10 elementos
        intArrayCopy   = new int[intArray.length];  
        
        Arrays.fill(filledIntArray, 7);  //preenche com 7s
        Arrays.sort(doubleArray);        // classifica doubleArray ascendente
        
        // copia o array intArray no array intArrayCopy
        System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
    } 
    
    // gera a saída de valores de cada array
    public void printArrays() {
        
        System.out.print("doubleArrays: ");
        for(double doubleValue : doubleArray){
            System.out.printf("%.1f ", doubleValue);
        }
        
        System.out.print("\nintArrays: ");
        for(int intValue : intArray){
            System.out.printf("%d", intValue);
        }
        
        System.out.print("\nfileedIntArrayArrays: ");
        for(int intValue : filledIntArray){
            System.out.printf("%d", intValue);
        }
        
        System.out.print("\nintArrayCopy: ");
        for(int intValue : intArrayCopy){
            System.out.printf("%d ", intValue);
        }
        
        System.out.println("\n");
    }
    
    // localiza valor no array inArray
    public int searchForInt( int value ) {        
        return Arrays.binarySearch(intArray, value);        
    }
    
    // compara o conteúdo dos arrays
    public void printEquality() {
        boolean b = Arrays.equals(intArray, intArrayCopy);
        
        System.out.printf("intArray %s intArrayCopy\n", (b ? "==" : "!="));
        
        b = Arrays.equals(intArray, filledIntArray);
        System.out.printf("intArray %s filledIntArray\n", (b ? "==" : "!="));
        
    }
    
    
    public static void main(String[] args) {
        
        UsingArrays usingArrays = new UsingArrays();
        
        usingArrays.printArrays();
        usingArrays.printEquality();
        
        int location = usingArrays.searchForInt(5);
        
        if(location >= 0){
            System.out.printf("Foram encontrados 5 elementos em intArray\n", location);
        }
        else {
            System.out.println("5 elementos não encontrados em intArray");
        }
        
        location = usingArrays.searchForInt(8763);
        if(location >= 0){
            System.out.printf("Foram encontrados 8763 elementos em intArray\n", location);
            
        }
        else {
            System.out.println("8763 elementos não encontrados em intArray");
        }
               
    }       
    
}
