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

import java.util.Scanner;

public class MenuExperimentos {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n=== MENU DE EXPERIMENTOS - HERANÇA ===");
            System.out.println("1. Herança Básica");
            System.out.println("2. Polimorfismo");
            System.out.println("3. Construtores e super()");
            System.out.println("4. Sobrescrita de Métodos");
            System.out.println("5. instanceof e Casting");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            
            int opcao = input.nextInt();
            
            switch (opcao) {
                case 1:
                    ExpHerancaBasica.main(new String[]{});
                    break;
                case 2:
                    ExperimentoPolimorfismo.main(new String[]{});
                    break;
                case 3:
                    ExperimentoConstrutores.main(new String[]{});
                    break;
                case 4:
                    ExpSobrescrita.main(new String[]{});
                    break;
                case 5:
                    ExpInstanceOf.main(new String[]{});
                    break;
                case 0:
                    System.out.println("Até mais!");
                    input.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
            
            System.out.println("\nPressione Enter para continuar...");
            input.nextLine(); // Limpar buffer
            input.nextLine(); // Esperar Enter
        }
    }
}
