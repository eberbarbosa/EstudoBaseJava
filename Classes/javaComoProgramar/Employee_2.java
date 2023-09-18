/*
 *  10/08/2023 
* - pagina 275 livro: Java como Programar - Deitel
 *  Váriavel estática utilizada para manter uma contagem do número de objetos Employee na memória
 *  
 */
package javaComoProgramar;

/**
 *
 * @author eber
 */
public class Employee_2 {
    
    private String firstName;
    private String lastName;
    private static int count = 0;       // número de objetos na memória
    
    // Inicializa Employee, adiciona 1 a static count e 
    // gera a saída de String indicando que o construtor foi chamado

    public Employee_2(String first, String last) {
        
        firstName = first;
        lastName  = last;
        
        count++;        // incrementa contagem estática de empregados
        
        System.out.printf("Employee constructor: %s %s; count = %d\n", firstName, lastName, count );
    }
    
    // Subtraia 1 de static count quando o coletor de lixo chama finalize para limpar o objeto; confirma se finalize foi chamado
    @Override
    protected void finalize() {
        
        count--;        // decrementa contagem estática de empregados
        System.out.printf("Employee finalizer: %s %s; count = %d\n", firstName, lastName, count);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static int getCount() {
        return count;
    }
           
    
}
