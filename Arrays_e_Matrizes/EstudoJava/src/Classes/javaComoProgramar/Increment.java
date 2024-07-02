/*
 *  18/09/2023 
*   pagina 279 livro: Java como Programar - Deitel
 *  Variável de Instância final em uma classe
 */


package javaComoProgramar;

/**
 *
 * @author eber
 */
public class Increment {
    
    private int total = 0;          // total de todos incrementos
    private final int INCREMENT;    // Variável constante não inicializada
    
    
    // construtor incializa variável de instância final INVREMENT

    public Increment(int incrementValue) {
        
        INCREMENT = incrementValue;         // inicializa variável constante uma vez
        
    }
    
    // Adiciona INCREMENT ao total
    public void addIncrementToTotal() {
        
        total += INCREMENT;
        
    }
    
    // Retorna representação de String dos dados de um objeto Increment

    @Override
    public String toString() {
        
        return String.format("Total = %d", total );
                
    }
    
    
    
}
