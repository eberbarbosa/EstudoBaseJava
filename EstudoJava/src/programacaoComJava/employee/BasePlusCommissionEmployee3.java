/*
 *  15/11/2023 
 * - pagina 316 livro: Java como Programar - Deitel
 *   BasePlusCommissionEmployee3 herda CommissionEmployee2 e tem acesso a
 *   membros protect de CommissionEmployee2
 */
package programacaoComJava.employee;

/**
 *
 * @author eber
 */
public class BasePlusCommissionEmployee3 extends CommissionEmployee2 {
    
    private double baseSalary;       // Sálario base por semana
    
    // Construtor de seis argumentos

    public BasePlusCommissionEmployee3(String first, String last, String ssn, double sales, double rate, double salary) {
        
        super(first, last, ssn, sales, rate);
        setBaseSalary( salary );        // valida e armazena salário- base
    }
    
    // configura o salário-base
    public void setBaseSalary( double salary) {
        
        baseSalary = ( salary < 0.0 ) ? 0.0 : salary;
    }
    
    public double getBaseSalary() {
        
        return baseSalary;
    }
    
    // Calcula os juros
    public double earnings() {
        
        return baseSalary + ( commissionRate * grossSales );
    }
    
    // Retorna a representação String de BasePlusCommissionEmployee3
     public String toString() {
        
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
                "base-salaried commission emplyoee",   firstName, lastName,
                "socialSecurityNumber", socialSecurityNumber,
                "grossSales",           grossSales,
                "commissionRate",       commissionRate,
                "base salary", baseSalary );
    } 
    
    
}
