/*
 *  Data: 25/01/2024
* - pagina 1021 livro: Java como Programar - Deitel
 *  Descrição: Métodos Strings replace, toLowerCase, toUpperCase, trim e toCharArray
 */


package String;

/**
 *
 * @author eber
 */
public class StringMiscellaneous2 {
    
    public static void main(String[] args) {
        
    
    
        String s1 = new String("hello");
        String s2 = new String("GOODBYE");
        String s3 = new String("    spaces  ");

        System.out.printf("s1 = %s\ns2 = s1 = %s\ns3 = %s\n\n", s1, s2, s3);
    
        
        // Testa o método replace
        System.out.printf("Replace 'l' por 'L' em s1: %s\n\n", s1.replace('l', 'L'));
        
        // testa o toLowerCase e toUpperCase
        System.out.printf("s1.toUpperCase = %s\n", s1.toUpperCase());
        System.out.printf("s1.toLowerCase = %s\n\n", s2.toLowerCase());
        
        // Testa o método trim
        System.out.printf("s3 depois do trim = \"%s\"\n\n", s3.trim());
        
        // Testa o método toChartArray
        char charArray[] = s1.toCharArray();
        System.out.printf("s1 como uma matriz de caracteres = \n");
        
        for(char character : charArray) {
            System.out.print(character);
            
            System.out.println("");
        }
    
    }

}
