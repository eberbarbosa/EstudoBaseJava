/*
 * 04/05/2023
 *    A classe demonstra o cálculo da somatória dos primeiros N números inteiros
 * através da chamada recursiva de um método estático
 */
package Recursividade;

import java.util.Scanner;

/**
 *
 * @author eber
 */
public class SomatoriaRecursiva {
    
    public static void main(String[] args) {
        
        System.out.println("\t\u001B[34m!!! Este programa calcula a somatória dos N primeiros"
                + " números usando um método recursivo !!!");
        
        
        System.out.printf("Digite o valor de N: ");
        
        Scanner keyboard = new Scanner(System.in);        
        int n = keyboard.nextInt();
        
        long resultado = somatoria(n);
        
        System.out.println("\nA somatória é "+resultado+".\n");
        
    }
    
    // O método somatória calcula a soma dos N primeiros numeros inteiros recursivamente
    static long somatoria(int N) {
        
        System.out.println("Vamos calcular a somatória dos "+N+" primerios números ...\n");
        
        if(N == 0) {
            System.out.println("Não precisamos calcular a somatória dos 0 primeiros números\n");
            
            return 0;
        }
        else {
            long soma = somatoria(N - 1);
            
            System.out.println("O resultado da somatória dos "+N+" primeiros números é "+
                    N+"+"+soma+" = "+(N + soma));
            
            return N + soma;
                    
        }
        
    }
    
}
