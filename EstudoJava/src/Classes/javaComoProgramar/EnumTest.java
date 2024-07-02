/*
 *  08/08/2023 
* - pagina 273 livro: Java como Programar - Deitel
 *  
 */
package javaComoProgramar;

import java.util.EnumSet;

/**
 *
 * @author eber
 */
public class EnumTest {
    
    public static void main(String[] args) {
        
        System.out.println("All Books:\n");
        
        // Imprime todos os livros em enum Book
        for (Book book : Book.values() )
            System.out.printf("%-10s%-45s%s\n", book,
                    book.getTitle(), book.getCopyrigthYear());
        
        System.out.println("\nDisplay a range of enum constants:\n" );
        
        // Imprime os primeiros quatro livros
        for ( Book book : EnumSet.range( Book.JHTP6, Book.CPPHTP4 )) 
            System.out.printf("%-10s%-45s%s\n", book,
                    book.getTitle(), book.getCopyrigthYear());
    }
    
}
