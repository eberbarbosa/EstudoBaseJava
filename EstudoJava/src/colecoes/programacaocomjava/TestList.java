/*
 *  Data: 10/02/2025
* - pagina 235 livro: Programação com Java - John Hubbard
 *  Descrição:
 */


package colecoes.programacaocomjava;

import java.util.*;

/**
 *
 * @author eber
 */
public class TestList {
    
    public static void main(String[] args) {
        
        ArrayList list = new ArrayList();
        
        list.add("US");
        list.add("CA");
        list.add("FR");
        list.add("DE");
        
        System.out.println("list: " + list);
        
        System.out.println("A lista contém(\"FR\"): " + list.contains("FR"));
        System.out.println("A lista contém(\"GB\"): " + list.contains("GB"));
        
        Object[] a = list.toArray();
        list.remove("FR");
        
        System.out.println("list: " + list);
        System.out.println("A lista contém(\"FR\"): " + list.contains("FR"));
        
        System.out.println("Tamanho da lista: " + list.size());
        System.out.println("a[2]: " + a[2]);
        
    }

}
