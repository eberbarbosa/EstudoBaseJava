/*
 *  10/04/2024 
 * - pagina 680 livro: Java como Programar - Deitel
 *  Utilizando LinkLists
 *  
 */
package Colecoes.java_com_programar;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author eber
 */
public class ListTest {
    
    private static final String colors[]  = { "black", "yellow", "green", "blue", "violet", "silver"};
    private static final String colors2[] = { "gold", "white", "brown", "blue", "gray", "silver" };
    
    // configura e manipula objetos LinkedList
    public ListTest() {
        
        List< String > list1 = new LinkedList< String >();
        List< String > list2 = new LinkedList< String >();
        
        // adiciona elementos a list1
        for ( String color : colors ){
            list1.add(color);
        }
        
        // adiciona elementos a list2
        for ( String color : colors2 ){
            list2.add(color);
        }
        
        list1.addAll(list2);                 // concatena as listas
        list2 = null;                            // libera recursos
        printList( list1 );                 // imprime elementos list1
        
        convertToUppercaseStrings(list1);   // converte a String em letra maiúsculas
        printList(list1);                   // imprime elementos list1   
        
        System.out.print("\nDeletando elementos 4 para 6...");
        removeItems(list1, 4, 7 );  // remove itens 4-7 da lista
        printList(list1);                  // imprime elementos list1
        printReverseList(list1);           // imprime lista na ordem inversa
        
    }
    
    // gera saída do conteúdo de List
    private void printList(List<String> list) {
        
        System.out.println("\nlist: ");
        
        for( String color : list ) {
            System.out.printf("%s ", color );
        }
        
        System.out.println("");
        
    }
    
    // localiza objetos e converte em letras maiúsculas
    private void convertToUppercaseStrings( List< String > list) {
        
        ListIterator< String > iterator = list.listIterator();
        
        while( iterator.hasNext()) {
            
            String color = iterator.next();  // obtém o ítem
            iterator.set(color.toUpperCase() );     // converte em letras maiúsculas
        }
    }
    
    // obtém sublista e utiliza método clear para excluir itens da sublists
    private void removeItems( List< String > list, int start, int end ) {
        
        list.subList(start, end).clear();       // remove itens
        
    }
    
    // imprime lista invertida
    private void printReverseList( List< String > list ) {
        
        ListIterator< String > iterator = list.listIterator( list.size() );
        
        System.out.println("\nLista Invertida: ");
        
        // imprime lista na ordem inversa
        while ( iterator.hasPrevious() ) {
            
            System.out.printf("%s ", iterator.previous() );
            
        }
        
    }
    
    
    public static void main(String[] args) {
        
        new ListTest();
    }  
        
}
