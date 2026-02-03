
package Heranca.estudoIA;

/**
 *
 * @author eber
 */

import Heranca.CommissionEmployee3;
import Heranca.BasePlusCommissionEmployee4;

public class ExperimentoPolimorfismo {
    
    public static void main(String[] args) {
        System.out.println("=== EXPERIMENTO: POLIMORFISMO ===");
        
        // ARRAY da superclasse com objetos de AMBOS os tipos
        CommissionEmployee3[] funcionarios = new CommissionEmployee3[3];
        
        funcionarios[0] = new CommissionEmployee3("Ana", "Comissão", 
                                                  "333-33-3333", 12000, 0.06);
        funcionarios[1] = new BasePlusCommissionEmployee4("Carlos", "Misto",
                                                         "444-44-4444", 9000, 0.05, 1500);
        funcionarios[2] = new BasePlusCommissionEmployee4("Beatriz", "Base",
                                                         "555-55-5555", 15000, 0.07, 2000);
        
        System.out.println("\n--- Folha de Pagamento Polimórfica ---");
        double totalFolha = 0;
        
        for (int i = 0; i < funcionarios.length; i++) {
            double salario = funcionarios[i].earnings(); // POLIMORFISMO!
            System.out.printf("Funcionário %d: %s %s - R$ %.2f%n",
                i + 1,
                funcionarios[i].getFirstName(),
                funcionarios[i].getLastName(),
                salario);
            totalFolha += salario;
        }
        
        System.out.printf("\nTOTAL DA FOLHA: R$ %.2f%n", totalFolha);
        
        System.out.println("\n--- instanceof em Ação ---");
        for (CommissionEmployee3 emp : funcionarios) {
            if (emp instanceof BasePlusCommissionEmployee4) {
                System.out.println(emp.getFirstName() + " TEM salário base");
            } else {
                System.out.println(emp.getFirstName() + " NÃO TEM salário base");
            }
        }
    }
}
