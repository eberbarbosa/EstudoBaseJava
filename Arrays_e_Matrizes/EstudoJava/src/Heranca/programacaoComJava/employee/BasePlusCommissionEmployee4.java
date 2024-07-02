/*
 *  17/11/2023 
 * - pagina 321 livro: Java como Programar - Deitel
 *   Classe BasePlusCommissionEmployee4 herda CommissionEmployee3 e acessa
 *   os dados privados de CommissionEmployee3 via métodos public de CommissionEmployee3
 */
package programacaoComJava.employee;

/**
 *
 * @author eber
 */

public class BasePlusCommissionEmployee4 extends CommissionEmployee3 {

    private double baseSalary;       // Sálario base por semana

    // Construtor de seis argumentos
    public BasePlusCommissionEmployee4( String first, String last, String ssn, double sales, double rate, double salary) {

        super(first, last, ssn, sales, rate);
        setBaseSalary(salary);        // valida e armazena salário- base
    }

    // configura o salário-base
    public void setBaseSalary(double salary) {

        baseSalary = (salary < 0.0) ? 0.0 : salary;
    }

    public double getBaseSalary() {

        return baseSalary;
    }

    // Calcula os juros
    @Override
    public double earnings() {

        return getBaseSalary() + super.earnings();
    }

    // Retorna a representação String de BasePlusCommissionEmployee3
    @Override
    public String toString() {

        return String.format("%s %s\n%s: %.2f", "base-salaried",
                super.toString(), "base salary", getBaseSalary());

    }

}
