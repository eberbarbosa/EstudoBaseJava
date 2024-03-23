/*
 *  23/03/2024
 * - pagina 235 livro: Programação com Java - John Hubbard
 *  Testando um objeto ArrayList
 *  
 */
package Colecoes;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author eber
 */
public class TestList {
    
    public static void main(String[] args) {
        
        Collection list = new ArrayList();
        
        list.add("US");
        list.add("CA");
        list.add("FR");
        list.add("DE");
        
        System.out.println("list: " + list);
        System.out.println("list.contains(\"FR\"): " + list.contains("FR"));
        System.out.println("list.contains(\"GB\"): " + list.contains("GB"));
        
        Object[] a = list.toArray();
        list.remove("FR");
        
        System.out.println("list: " + list);
        System.out.println("list.contains(\"FR\"): " + list.contains("FR"));
        System.out.println("list.size(): " + list.size());
        System.out.println("a[2]: " + a[2]);
    }
    
}
