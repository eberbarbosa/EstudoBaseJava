/*
 *  Data: 21/08/2024
* - pagina 678 livro: Java como Programar - Deitel
 *  Descrição: Utilizando Interface Collection
 */

package colecoes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author eber
 */
public class CollectionTest {
    
    private static final String[] colors =
    {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
     private static final String[] removeColors =
    {"RED", "WHITE", "BLUE"};
     
     // Cria o ArrayList, adiciona Colors a ela e a manipula
     public CollectionTest() {
         
         List<String> list = new ArrayList<String>();
         List<String> removeList = new ArrayList<String>();
         
         // adiciona elementos no array colors a listar
         for(String color : colors){
             list.add(color);
         }
         
         // adiciona elementpos de removeColors a removeList
         for(String color : removeColors){
             list.add(color);
         }
         
         System.out.println("ArrayList: ");
         
         // gera saída do conteúdo da lista
         for(int count = 0; count < list.size(); count++){
         
            System.out.printf("%s ", list.get(count));            
         }
         
         // remove cores contidas em removeList
         removeColors(list, removeList);
         
         System.out.println("\n\nArrayList após chamar removeColors: ");
         
         // gera a saída do conteúdo da lista
         for(String color : list) {
             System.out.printf("%s ", color);
         }        
             
     }
     
     // remove cores especificadas em collection2 a partir de collection1,
     private void removeColors(Collection<String> collection1, Collection<String> collection2 ){
         
         // obtém o iterador
         Iterator<String> iterator = collection1.iterator();
         
         // loop enquanto a coleção tiver itens
         while(iterator.hasNext()) {
             if(collection2.contains(iterator.next())){
                 iterator.remove();
             }
         }
         
         
     }
     
     public static void main(String[] args) {
        
         new CollectionTest();
    }


}
