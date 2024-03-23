/*
 *  28/10/2023 
 * - pagina 195 livro: Programação com Java - John Hubbard
 *  Método equals() da classe String
 *  
 */
package programacaoComJava;

/**
 *
 * @author eber
 */
public class TestStringEquality {
    
    public static void main(String[] args) {
        
        String s2 = "ABC";
        String s3 = new String ("ABC");
        
        System.out.println("s3 == s3: " + (s3 == s2));
        
        System.out.println("s3.equals(s2): " + s3.equals(s2));
    }
    
}
