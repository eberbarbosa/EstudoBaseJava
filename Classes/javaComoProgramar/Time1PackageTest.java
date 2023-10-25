/*
 * 05/10/2023 
* - pagina 284 livro: Java como Programar - Deitel
 *  Objeto Time1 utilizado em um aplicativo
 */

package javaComoProgramar;


/**
 *
 * @author eber
 */

public class Time1PackageTest {
    
    public static void main(String[] args) {
        
        // Cria e inicializa um objeto Time1
        Time1 time = new Time1();
        
        // gera saída de representações de string da data/hora
        System.err.printf("The initial universal time is: ");
        System.out.println(time.toUniversalString());
        System.out.printf("The initial standard time is: ");
        System.out.println(time.toString());
        System.out.println();
        
        // altere a data/hora e gera saída da data/hora atualizada
        time.setTime(13, 27, 6);
        System.out.printf("Universal time after setTime is: ");
        System.out.println(time.toUniversalString());
        System.out.printf("Standard time after setTime is: ");
        System.out.println(time.toString());
        System.out.println();
        
        
        // configura data/hora com valores inválidos; gera saída data/hora atualizada
        time.setTime(99, 99, 99);
        System.out.println("After attemping invalid settings: ");
        System.out.printf("Universal Time: ");
        System.out.println(time.toUniversalString());
        System.out.printf("Standard time: ");
        System.out.println(time.toString());
        
    }
    
}
