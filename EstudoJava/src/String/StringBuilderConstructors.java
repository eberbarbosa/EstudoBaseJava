/*
 * Data: 30 de jan. de 2026
 * Página: 483
 * Livro: Java Como Programar – Deitel (8ª edição)
 * Descrição:  Construtores StringBuilder.
 */


package String;

/**
 *
 * @author eber
 */
public class StringBuilderConstructors {
    
    public static void main(String[] args) {
        
        StringBuilder buffer1 = new StringBuilder();
        StringBuilder buffer2 = new StringBuilder(10);
        StringBuilder buffer3 = new StringBuilder("Hello");
        
        System.out.printf("buffer1 = \"%s\"\n", buffer1);
        System.out.printf("buffer2 = \"%s\"\n", buffer2);
        System.out.printf("buffer3 = \"%s\"\n", buffer3);
    }

}
