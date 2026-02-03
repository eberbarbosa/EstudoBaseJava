/*
 *  Data: 21/12/2025
* - Cronograma de estudo oritentado pelo DeepSeek
 *  Descrição: Estudo de Herança
 */



package Heranca.estudoIA;  // NOTE: pacote DIFERENTE!

/**
 *
 * @author eber
 */ 

// Importe as classes do pacote heranca
import Heranca.CommissionEmployee3;
import Heranca.BasePlusCommissionEmployee4;

public class ExpHerancaBasica {
    
    public static void main(String[] args) {
        System.out.println("=== EXPERIMENTO 1: Criação de Objetos ===");
        
        // EXPERIMENTO A: Criar objeto da superclasse
        System.out.println("\n--- Criando CommissionEmployee3 ---");
        CommissionEmployee3 emp1 = new CommissionEmployee3(
            "João", "Silva", "111-11-1111", 10000, 0.05);
        
        System.out.println("Salário (apenas comissão): R$ " + emp1.earnings());
        System.out.println(emp1.toString());
        
        // EXPERIMENTO B: Criar objeto da subclasse
        System.out.println("\n--- Criando BasePlusCommissionEmployee4 ---");
        BasePlusCommissionEmployee4 emp2 = new BasePlusCommissionEmployee4(
            "Maria", "Santos", "222-22-2222", 8000, 0.04, 1000);
        
        System.out.println("Salário (base + comissão): R$ " + emp2.earnings());
        System.out.println(emp2.toString());
        
        // EXPERIMENTO C: Testar herança
        System.out.println("\n--- Testando Herança ---");
        System.out.println("Maria pode usar getFirstName()? " + emp2.getFirstName());
        System.out.println("Maria pode usar getGrossSales()? " + emp2.getGrossSales());
        System.out.println("Tudo herdado funcionando? SIM!");
    }
}
