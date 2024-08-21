/*
 *  03/07/2024
* - pagina 688 livro: Java como Programar - Deitel
 *  Utilizando o objeto comparador com o algoritmo sort.
 */
package colecoes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author eber
 */

public class Sort2 {
    
    private static final String suits[] = 
    { "Copas", "Ouro", "Paus", "Espadas"};
    
    // Gera saída de elementos List
    public void printElements() {
        
        List< String > list = Arrays.asList(suits);  // cria a lista
        
        // Gera saída de elementos List
        System.out.printf("Elementos do array não classificados: \n%s\n", list);
        
        // Classifica em ordem decrescente utilizando um compardor
        Collections.sort(list, Collections.reverseOrder());     
        
        // gera a saída da lista
        System.out.printf("Elementos do array classificados: \n%s\n", list);
    }
    
    public static void main(String[] args) {
        
        Sort2 sort2 = new Sort2();
        sort2.printElements();
    }
    

}
