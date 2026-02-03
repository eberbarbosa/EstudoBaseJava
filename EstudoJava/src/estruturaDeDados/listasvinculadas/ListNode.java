/*
 *  Data: 17/11/2025
* - pagina 611 livro: Java como Programar - Deitel
 *  Descrição: Definições da classe ListNode
 */


package estruturaDeDados.listasvinculadas;

/**
 *
 * @author eber
 */

 // classe para representar um nó em uma lista
public class ListNode {  
       
    // membros de acesso de pacote; List pode acessar esses diretamente
    Object   data;
    ListNode nextNode;
    
    // construtor cria um ListNode que referencia o obejto
    ListNode( Object object ) {
        
        this( object, null );
    }
    
    // construtor cria ListNode que referencia Object e o próximo ListNode
    public ListNode(Object object, ListNode node) {
        data     = object;
        nextNode = node;
    }
    
    // retorna referência aos dados do nó
    Object getObject() {
        
        return data;        // retorna Object nesse nó
    }
    
    // retorna referência ao próximo nó da lista

    ListNode getNext() {
        
        return nextNode;
    }
    
    
    

}
