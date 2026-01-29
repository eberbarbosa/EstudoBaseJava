/*
 *  04/11/2023 
 * - pagina 311 livro: Java como Programar - Deitel
 *  testando a classe BasePlusCommissionEmployee 
 *  
 */
package programacaoComJava.employee;

/**
 *
 * @author eber
 */
public class BasePlusCommissionEmployeeTest {
    
    public static void main(String[] args) {
        
            // instancia o objeto BasePlusCommissionEmployee
    BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("Eber", "Barbosa", "333-33-3333", 50000, 0.04, 300);
    
    // obtém os dados de empregado comissionado com salário base
    System.out.println("Employee information obtained by get methods: \n");
    
    System.out.printf("%s %s\n", "First name is", employee.getFirstName());
    System.out.printf("%s %s\n", "Last name is", employee.getLastName());
    System.out.printf("%s %s\n", "Social security number is", employee.getSocialSecurityNumber());
    System.out.printf("%s %.2f\n", "Gross sales is", employee.getGrossSales());
    System.out.printf("%s %.2f\n", "Commission rate is", employee.getCommissionRate());
    System.out.printf("%s %,2f\n", "Base Salary is", employee.getBaseSalary());
    
    employee.setBaseSalary(1000 );      // configura o salário base
   
    
    System.out.printf("\n%s:\n\n%s\n", "Update employee information obtained by toString", employee.toString());
    
    
    }
    
            
    
}
