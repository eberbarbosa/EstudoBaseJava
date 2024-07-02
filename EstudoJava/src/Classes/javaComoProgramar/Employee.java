/*
 *  02/08/2023 
* - pagina 270 livro: Java como Programar - Deitel
 *  Classe Employee com referências a outros objetos
 */
package Classes.javaComoProgramar;

import java.util.Date;

/**
 *
 * @author eber
 */
public class Employee {
    
    private String firstName;
    private String lastName;
    private Date   birthDate;
    private Date   hireDate;
    
    // construtor para inicializae nome, data de anscimento e data de contratação

    public Employee(String firstName, String lastName, Date birthDate, Date hireDate) {
        
        this.firstName = firstName;
        this.lastName  = lastName;
        this.birthDate = birthDate;     // data de nascimento
        this.hireDate  = hireDate;      // data de contratação
        
    }
    
    // converte Employee em formato de String

    @Override
    public String toString() {
        
        return String.format("%s, %s Hired:  %s Birthday:  %s", firstName,  lastName,  hireDate, birthDate ); 
    }
    
    
    
}
