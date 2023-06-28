/*
 *  28/06/2023 
* - pagina 266 livro: Java como Programar - Deitel
 *  Construtores sobrecarregados utilizados para inicializar objetos Time2
 */

package javaComoProgramar;

/**
 *
 * @author eber
 */
public class Time2Test {
    
    public static void main(String[] args) {
        
        Time2 t1 = new Time2();                       // 00:00:00
        Time2 t2 = new Time2( 2 );                  // 02:00:00
        Time2 t3 = new Time2( 21, 34);            // 21:34:00
        Time2 t4 = new Time2( 12, 25, 42);      // 12:25:42
        Time2 t5 = new Time2( 27, 74, 99);      // 00:00:00
        Time2 t6 = new Time2( t4 );               // 12:25:42
        
        System.out.println("Construtor com:" );
        System.out.println("t1: Todos os argumentos padrão" );
        System.out.printf("  %s\n", t1.toUniversalString());
        System.out.printf("  %s\n", t1.toString());
        
        System.out.println("t2: Hora especificada; minuto e segundos padrão" );
        System.out.printf("  %s\n", t2.toUniversalString());
        System.out.printf("  %s\n", t2.toString());
        
        System.out.println("t3: Hora e minuto especificada; segundos padrão" );
        System.out.printf("  %s\n", t3.toUniversalString());
        System.out.printf("  %s\n", t3.toString());
        
        System.out.println("t4: Hora, minuto e segundo especificada" );
        System.out.printf("  %s\n", t4.toUniversalString());
        System.out.printf("  %s\n", t4.toString());
        
         System.out.println("t5: Todos valores especificados inválidos" );
        System.out.printf("  %s\n", t5.toUniversalString());
        System.out.printf("  %s\n", t5.toString());
        
         System.out.println("t6: Objeto Time2 t4 especificado" );
        System.out.printf("  %s\n", t6.toUniversalString());
        System.out.printf("  %s\n", t6.toString());
    }
    
}
