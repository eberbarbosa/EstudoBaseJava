/*
 *  Data: 21/12/2025
* - Cronograma de estudo oritentado pelo DeepSeek
 *  Descrição: Estudo de Herança
 */

package Heranca.estudoIA;

/**
 *
 * @author eber
 */

import Heranca.CommissionEmployee3;
import Heranca.BasePlusCommissionEmployee4;

public class ExpInstanceOf {
    
    public static void main(String[] args) {
        System.out.println("=== EXPERIMENTO: instanceof E CASTING ===\n");
        
        // Criando array misto
        CommissionEmployee3[] funcionarios = new CommissionEmployee3[4];
        
        funcionarios[0] = new CommissionEmployee3("João", "A", "001", 5000, 0.04);
        funcionarios[1] = new BasePlusCommissionEmployee4("Maria", "B", "002", 6000, 0.05, 1000);
        funcionarios[2] = new CommissionEmployee3("Pedro", "C", "003", 7000, 0.06);
        funcionarios[3] = new BasePlusCommissionEmployee4("Ana", "D", "004", 8000, 0.07, 1500);
        
        System.out.println("1. Usando instanceof para identificar tipos:");
        System.out.println("Índice | Nome      | Tipo");
        System.out.println("-------+-----------+------------------");
        
        for (int i = 0; i < funcionarios.length; i++) {
            String tipo;
            
            if (funcionarios[i] instanceof BasePlusCommissionEmployee4) {
                tipo = "Base+Comissão";
            } else if (funcionarios[i] instanceof CommissionEmployee3) {
                tipo = "Apenas Comissão";
            } else {
                tipo = "Desconhecido";
            }
            
            System.out.printf("  %d    | %-9s | %s%n", 
                             i, funcionarios[i].getFirstName(), tipo);
        }
        
        System.out.println("\n2. Casting SEGURO (com verificação):");
        double totalBaseSalaries = 0;
        int contBasePlus = 0;
        
        for (CommissionEmployee3 emp : funcionarios) {
            if (emp instanceof BasePlusCommissionEmployee4) {
                // Casting seguro
                BasePlusCommissionEmployee4 empBase = (BasePlusCommissionEmployee4) emp;
                totalBaseSalaries += empBase.getBaseSalary();
                contBasePlus++;
                
                System.out.printf("%s: Base salary = R$ %.2f%n",
                                 emp.getFirstName(), empBase.getBaseSalary());
            }
        }
        
        System.out.printf("\nTotal de funcionários com salário base: %d%n", contBasePlus);
        System.out.printf("Soma dos salários base: R$ %.2f%n", totalBaseSalaries);
        
        System.out.println("\n3. Casting INSEGURO (causa ClassCastException):");
        System.out.println("   // Tente este código (comente para não quebrar):");
        System.out.println("   BasePlusCommissionEmployee4 empErro = ");
        System.out.println("       (BasePlusCommissionEmployee4) funcionarios[0];");
        System.out.println("   // funcionarios[0] é CommissionEmployee3, não BasePlus...");
        System.out.println("   // Resultado: Exception in thread \"main\"");
        System.out.println("   //   java.lang.ClassCastException");
        
        System.out.println("\n4. instanceof com null:");
        CommissionEmployee3 empNull = null;
        System.out.println("   empNull instanceof CommissionEmployee3: " + 
                         (empNull instanceof CommissionEmployee3));
        System.out.println("   (null instanceof QualquerClasse) sempre retorna false");
        
        System.out.println("\n5. Cadeia de herança:");
        BasePlusCommissionEmployee4 empTeste = 
            new BasePlusCommissionEmployee4("Teste", "Herança", "999", 1000, 0.1, 500);
        
        System.out.println("   empTeste instanceof BasePlusCommissionEmployee4: " +
                         (empTeste instanceof BasePlusCommissionEmployee4));
        System.out.println("   empTeste instanceof CommissionEmployee3: " +
                         (empTeste instanceof CommissionEmployee3));
        System.out.println("   empTeste instanceof Object: " +
                         (empTeste instanceof Object));
    }
}
