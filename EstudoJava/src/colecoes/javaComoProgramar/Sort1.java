/*
 *  02/07/2024
* - pagina 687 livro: Java como Programar - Deitel
 *  Utilizando o algoritmo sort.
 */
package colecoes.javaComoProgramar;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author eber
 */
public class Sort1 {
    
    private static final String suits[] = 
    { "Copas", "Ouro", "Paus", "Espadas"};
    
    // Exibe os elementos do array
    public void printElements() {
        
        List< String > list = Arrays.asList(suits);  // cria a lista
        
        // gera saída da lista
        System.out.printf("Elementos do array não classificados: \n%s\n", list);
        
        Collections.sort(list);     // Classifica ArrayList
        
        // gera a saída da lista
        System.out.printf("Elementos do array classificados: \n%s\n", list);
    }
    
    public static void main(String[] args) {
        
        Sort1 sort1 = new Sort1();
        sort1.printElements();
    }
    
}
