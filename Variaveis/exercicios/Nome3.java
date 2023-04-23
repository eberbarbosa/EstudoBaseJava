/*
 * 23/04/2023
 * Escreva e execute um programa java que solicita ao usário seu sobrenome e seu
 * primeiro nome separadamente e imprima uma saudação de Hello! 
 */
package exercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author eber
 */
public class Nome3 {
    
    public static void main(String[] args) throws IOException {
        
        String sobrenome;
        String nome;
        
        BufferedReader e;
        e = new BufferedReader(new InputStreamReader(System.in));                  
                
        System.out.println("Digite seu sobrenome:");
        sobrenome = e.readLine();
        
        System.out.println("Digite seu nome: ");
        nome = e.readLine();
        
        System.out.println("Hello, " + nome + " " + sobrenome);        
        
    }
    
}
