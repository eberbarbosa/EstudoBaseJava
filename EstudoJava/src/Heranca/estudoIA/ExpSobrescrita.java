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

public class ExpSobrescrita {
    
    public static void main(String[] args) {
        System.out.println("=== EXPERIMENTO: SOBRESCRITA DE MÉTODOS ===\n");
        
        System.out.println("1. Criando objetos de ambos os tipos:");
        CommissionEmployee3 empComissao = new CommissionEmployee3(
            "Carlos", "Comissão", "111-11-1111", 10000, 0.06);
        
        BasePlusCommissionEmployee4 empBaseComissao = new BasePlusCommissionEmployee4(
            "Ana", "Mista", "222-22-2222", 8000, 0.05, 1200);
        
        System.out.println("\n2. Comparando earnings() - Método SOBRESCRITO:");
        System.out.printf("Carlos (somente comissão): R$ %.2f%n", 
                         empComissao.earnings());
        System.out.printf("Ana (base + comissão): R$ %.2f%n", 
                         empBaseComissao.earnings());
        
        System.out.println("\n3. Detalhando o cálculo de Ana:");
        System.out.printf("   - Base salary: R$ %.2f%n", empBaseComissao.getBaseSalary());
        System.out.printf("   - Comissão (super.earnings()): R$ %.2f%n", 
                         empBaseComissao.getGrossSales() * empBaseComissao.getCommissionRate());
        System.out.printf("   = TOTAL: R$ %.2f%n", empBaseComissao.earnings());
        
        System.out.println("\n4. Comparando toString() - Também SOBRESCRITO:");
        System.out.println("\nCarlos (superclasse):");
        System.out.println(empComissao.toString());
        
        System.out.println("\nAna (subclasse - com info extra):");
        System.out.println(empBaseComissao.toString());
        
        System.out.println("\n5. EXPERIMENTO: E se remover @Override?");
        System.out.println("   Vá para BasePlusCommissionEmployee4 e:");
        System.out.println("   a) Comente @Override acima de earnings()");
        System.out.println("   b) Mude o nome para earnings2()");
        System.out.println("   c) Veja que ainda compila, mas não sobrescreve!");
        
        System.out.println("\n6. EXPERIMENTO: Método final não pode ser sobrescrito");
        System.out.println("   Em CommissionEmployee3, adicione:");
        System.out.println("   public final String getTipo() { return \"Comissionado\"; }");
        System.out.println("   Tente sobrescrever na subclasse - ERRO!");
    }
}
