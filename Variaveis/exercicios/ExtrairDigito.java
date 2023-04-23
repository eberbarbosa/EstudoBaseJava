/*
 * 23/04/2023
 * Escreva e execute um programa java que inicializa uma variável inteira n com
 * o valor 5814 e após use os operadores de quociente e resto para extrair e 
 * imprimir cada digito de n .
 */
package exercicios;

/**
 *
 * @author eber
 */
public class ExtrairDigito {
    
    public static void main(String[] args) {
        
        int n = 5814;
        
        System.out.println("n = " + n);
        System.out.print("Os digitos de n são: ");
        System.out.print(n/1000);
        n %= 1000;
        System.out.print(", " + n/100);
        n %= 100;
        System.out.print(", " + n/10);
        n %= 10;
        System.out.println(", e " + n);
        
    }
    
}
