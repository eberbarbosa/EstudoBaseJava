
import java.util.Scanner;

/*
 * 23/04/2023
 * Programa exibe a soma de dois números -> livro Deitel
 */

/**
 *
 * @author eber
 */
public class Soma {
    
    // método principal que inicia a execução do programa Java
    public static void main(String[] args) {
        
        // Cria Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);
        
        // Declaração das variáveis
        int numero1;
        int numero2;
        int soma;
        
        System.out.print("Digite o primeiro numero: ");
        numero1 = input.nextInt();      // Lê o primeiro número digitado pelo usuário
        
        System.out.print("Digite o segundo numero: ");
        numero2 = input.nextInt();      // Lê o segundo número digitado pelo usuário
        
        soma = numero1 + numero2;       // soma dos dois números
        
        System.out.printf("\nA soma dos numeros e: %d\n\n", soma);      // exibe a soma
        
        
        
        
    }
    
}
