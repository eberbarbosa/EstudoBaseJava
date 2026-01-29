/*
 *  01/11/2023 
 * - pagina 304 livro: Java como Programar - Deitel
 *  Classe CommissionEmployee representa um empregado comissionado
 *  
 */
package programacaoComJava.employee;

/**
 *
 * @author eber
 */
public class CommissionEmployee extends Object {
    
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private double grossSales;      // Vendas brutas semanais
    private double commissionRate;  // porcentagem da comissão
    
    // construtor de cinco argumentos

    public CommissionEmployee(String first, String last, String ssn, double sales, double rate) {
        
        // chamada implícita para o construtor Object ocorre aqui        
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
        setGrossSales( sales );     // valida e armazena as vendas brutas
        setCommissionRate( rate );  // valida e armazena a taxa de comissão
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
        
        return commissionRate * grossSales;
    }
    
    // retorna a representação String do objeto CommissionEmployee 

    @Override
    public String toString() {
        
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
                "CommissionEmployee",   firstName, lastName,
                "socialSecurityNumber", socialSecurityNumber,
                "grossSales",           grossSales,
                "commissionRate",       commissionRate);
    }
    
    
    
    
    
}
