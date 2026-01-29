/*
 *  01/11/2023 
 * - pagina 307 livro: Java como Programar - Deitel
 *  testando a classe CommissionEmployee 
 *  
 */
package programacaoComJava.employee;

/**
 *
 * @author eber
 */
public class CommissionEmployeeTest {
    
    public static void main(String[] args) {
        
            // instancia o objeto CommissionEmployee
    CommissionEmployee employee = new CommissionEmployee("Sue", "Jones", "222-22-2222", 10000, 0.06);
    
    // obtém os dados de empregado comissionado
    System.out.println("Employee information obtained by get methods: \n");
    
    System.out.printf("%s %s\n", "First name is", employee.getFirstName());
    System.out.printf("%s %s\n", "Last name is", employee.getLastName());
    System.out.printf("%s %s\n", "Social security number is", employee.getSocialSecurityNumber());
    System.out.printf("%s %.2f\n", "Gross sales is", employee.getGrossSales());
    System.out.printf("%s %.2f\n", "Commission rate is", employee.getCommissionRate());
    
    employee.setGrossSales( 500 );      // configura as vensas brutas
    employee.setCommissionRate(.1);  // configura a taxa de comissão
    
    System.out.printf("\n%s:\n\n%s\n", "Update employee informstion obtained by toString", employee);
    
    
    }
    
            
    
}
