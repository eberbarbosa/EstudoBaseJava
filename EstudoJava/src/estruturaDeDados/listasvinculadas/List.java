/*
 *  Data: 18/11/2025
* - pagina 611 livro: Java como Programar - Deitel
 *  Descrição: Definições da classe List
 */

package estruturaDeDados.listasvinculadas;



/**
 *
 * @author eber
 */
public class List {
    
    private ListNode firstNode;
    private ListNode lastNode;
    private String   name;      // string como "lista" usada na impressão
    
    // construtor cria List vazia com "list como o nome
    public List() {
        
        this("list");
    }
    
    // construtor cria List vazia com um nome
    public List( String listName ) {
        
        name = listName;
        firstNode = lastNode = null;
    }
    
    // insere Object na frente de List
    public void insertAtFront( Object insertItem ) {
        
        if(isEmpty()) {     // PrimeiroNo e ultimoNo referneciam o mesmo objeto
            firstNode = lastNode = new ListNode(insertItem);
            
        }        
        else {          // firstNode referencia o novo nó
                firstNode = new ListNode(insertItem, firstNode );
                    
        }
        
    }
        
        // insere Object no fim de List
        public void insertAtBack( Object insertItem ) {
            
            if( isEmpty()) { // firstNode e lastNode referenciam o mesmo Object
                firstNode = lastNode = new ListNode(insertItem);
                
            } else {        // nextNode do lastNode referencia a novo nó
                lastNode = lastNode.nextNode = new ListNode(insertItem);
            }
            
        }
        
        // remove o primeiro nó de List
        public Object removeFromFont() throws EmptyListException {
            
            if(isEmpty()) {     // lança exceção se List estiver vazia
                throw new EmptyListException(name);
            }
            
            Object removeItem = firstNode.data;     // recupera dados sendo removidos
            
            // atualiza referências firstNode e lastNode
            if(firstNode == lastNode) {
                firstNode = lastNode = null;
                
            } else {
                firstNode = firstNode.nextNode;
            }
            
            return removeItem;      // retorna dados de nó removidsos
        }
            
    
        // Remove o último nó de List
        public Object removeFrontBack() throws EmptyListException {
            
            if(isEmpty()) {     // lança exceção se List estiver vazia
                
                throw new EmptyListException( name );                
            }
            
            Object removeItem = lastNode.data;      // recupera dados sendo removidos
            
            // atualiza referências firstNode e lastNode
            if(firstNode == lastNode) {
                firstNode = lastNode = null;
                
            } else {        // localiza o novo último nó
                ListNode current = firstNode;
                
                // faz o loop enquanto nó atual não referência lastNode
                while(current.nextNode != lastNode) {
                    current = current.nextNode;
                    lastNode = current;     // atual é novo lastNode
                    current.nextNode = null;
                }                
            }
            
            return  removeItem;     // retorna dados de nó removido          
                            
            }
        
        
        // determina se a lista estiver vazia
        public boolean isEmpty() {
            
            return firstNode == null;       // retorna true se List estiver vazia
        }
        
        
        // gera a saída do conteúdo de List
        public void print() {
            
            if(isEmpty()) {
                System.out.printf("Vazio %s\n", name);
                
                return;
            }
            
            System.out.printf("O %s é: ", name);
            ListNode current = firstNode;
            
            // enquanto nõa estiver no fim de lista, gera saída dos dados do nó atual.
            while (current != null) { 
                
                System.out.printf("%s ", current.data);
                current = current.nextNode;
                
            }
            
            System.out.println("\n");
        }     
               
         
    

}
