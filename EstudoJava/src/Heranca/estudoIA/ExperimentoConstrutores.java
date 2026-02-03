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

public class ExperimentoConstrutores {
    
    public static void main(String[] args) {
        System.out.println("=== EXPERIMENTO: CONSTRUTORES E super() ===\n");
        
        System.out.println("1. Criando com parâmetros normais:");
        BasePlusCommissionEmployee4 emp1 = new BasePlusCommissionEmployee4(
            "Teste", "Normal", "666-66-6666", 5000, 0.03, 800);
        
        System.out.println("\n2. Tentando valores inválidos:");
        BasePlusCommissionEmployee4 emp2 = new BasePlusCommissionEmployee4(
            "Teste", "Invalido", "777-77-7777", -1000, // Vendas negativas
            1.5, // Taxa > 1.0
            -500); // Salário negativo
        
        System.out.println("\nValidações automáticas:");
        System.out.println("Vendas brutas (deveria ser 0): " + emp2.getGrossSales());
        System.out.println("Taxa (deveria ser 0): " + emp2.getCommissionRate());
        System.out.println("Base salary (deveria ser 0): " + emp2.getBaseSalary());
        
        // EXPERIMENTO EXTRA: Tente criar um construtor sem super()
        System.out.println("\n3. Desafio: Comente super() em BasePlusCommissionEmployee4");
        System.out.println("   e veja o erro de compilação!");
    }
}