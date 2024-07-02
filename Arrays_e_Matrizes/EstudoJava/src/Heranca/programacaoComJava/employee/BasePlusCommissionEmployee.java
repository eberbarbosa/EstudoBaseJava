/*
 *  04/11/2023 
 * - pagina 308 livro: Java como Programar - Deitel
 *  Classe BasePlusCommissionEmployee representa um empregado um empregado
 *  que recebe um salário além da comissão
 *  
 */
package programacaoComJava.employee;

/**
 *
 * @author eber
 */
public class BasePlusCommissionEmployee extends Object {
    
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private double grossSales;      // Vendas brutas semanais
    private double commissionRate;  // porcentagem da comissão
    private double baseSalary;      // salário base por semana
    
    // construtor de seis argumentos

    public BasePlusCommissionEmployee(String first, String last, String ssn, double sales, double rate, double salary) {
        
        // chamada implícita para o construtor Object ocorre aqui        
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
        setGrossSales( sales );     // valida e armazena as vendas brutas
        setCommissionRate( rate );  // valida e armazena a taxa de comissão
        setBaseSalary( salary );                // valida e armazena o sálario base
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getGrossSales() {
        return grossSales;
    }

    // configura a quantida de vendas brutas
    public void setGrossSales(double grossSales) {
        
        this.grossSales = ( grossSales < 0.0) ? 0.0 : grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }
    
    // configura a taxa de comissão
    public void setCommissionRate(double commissionRate) {
        
        this.commissionRate = (commissionRate > 0.0 && commissionRate < 1.0) ? commissionRate : 0.0;
    }
    
    // calcula os lucros
    public double earnings() {
        
        return baseSalary + (commissionRate * grossSales );
    }

    public double getBaseSalary() {
        return baseSalary;
    }
    
    // Configura o salário Base
    public void setBaseSalary(double salary) {
        
        baseSalary = ( salary < 0.0 ) ? 0.0 : salary;
    }
    
    
    
    // retorna a representação String do objeto CommissionEmployee 

    @Override
    public String toString() {
        
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
                "CommissionEmployee",   firstName, lastName,
                "socialSecurityNumber", socialSecurityNumber,
                "grossSales",           grossSales,
                "commissionRate",       commissionRate,
                    "base salary",      baseSalary);
    }
    
    
    
    
    
}
