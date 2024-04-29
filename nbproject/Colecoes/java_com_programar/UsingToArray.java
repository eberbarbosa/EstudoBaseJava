/*
 *  29/04/2024 
 * - pagina 682 livro: Java como Programar - Deitel
 *  Utilizando o método toArray
 *  
 */
package Colecoes.java_com_programar;

import java.util.Arrays;
import java.util.LinkedList;
/**
 *
 * @author eber
 */
public class UsingToArray {
    
    // construtor cria LinkedList, adiciona elementos e converte em array
    public UsingToArray() {
        
        String colors[] = { "black", "blue", "yellow" };
        
        LinkedList< String > links = new LinkedList< String >(Arrays.asList( colors ));
        
        links.addLast( "red" );                 // adiciona como ultimo ítem
        links.add( "pink" );                    // adiciona ao final
        links.add( 3, "green" );       // adiciona no terceiro índice
        links.addFirst("cyan" );               // adiciona como primeiro ítem
        
        // obtém elementos LinkedList como um array
        colors = links.toArray( new String[ links.size() ] );
        
        System.out.println( "colors: " );
        
        for ( String color : colors ) {
            
            System.out.println( color );
        }
        
    }
    
    public static void main(String[] args) {
        
        new UsingToArray();
    }
    
}
