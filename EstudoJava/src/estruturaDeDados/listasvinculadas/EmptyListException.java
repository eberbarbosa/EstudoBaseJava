/*
 *  Data: 01/12/2025
* - pagina 688 livro: Java como Programar - Deitel
 *  Descrição: Definição da classe EmptyListException
 */




package estruturaDeDados.listasvinculadas;

/**
 *
 * @author eber
 */
public class EmptyListException extends RuntimeException{
    
    // construtor sem argumento
    public EmptyListException() {
        
        this("List");   // chama outro construtor do EmptyListException
    }
    
    public EmptyListException(String name) {
        
        super(name + " é vazio");    // chama o construtor de superclasse
    } 
    
       

}
