/*
 *  02/08/2023 
* - pagina 271 livro: Java como Programar - Deitel
 *  Demonstração de Composição
 */
package javaComoProgramar;

/**
 *
 * @author eber
 */
public class EmployeeTest {
    
    public static void main(String[] args) {
        
        Date birth = new Date( 7, 24, 1974 );
        Date hire  = new Date( 3, 12, 1988 );
        Employee employee = new Employee("Eber", "Barbosa", birth, hire);
        
        System.out.println( employee );
    }
    
}
