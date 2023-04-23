/*
 * 23/04/2023
 * Tem sido observado que os grilos tendema cricrilar no verão em uma taxa que é
 * relacionada com a temperatura pela fórmula T = 40 + c/4, onde c é o número de
 * cricris por minuto e T é a temperatura em graus Fahrenheit. 
 * Escreva e execute um programa java que recebe como entrada o número de cricris 
 * por minuto e fornece saída a temperatura na forma decimal.
 */

package exercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author eber
 */
public class Grilos {
    
    public static void main(String[] args) throws IOException {
        
        int cricri;
        int temp;
        int celsius;
        
        InputStreamReader leitora = new InputStreamReader(System.in);
        BufferedReader e          = new BufferedReader(leitora);
        
        System.out.print("Digite o número de cricris por minuto: ");
        
        cricri = Integer.parseInt(e.readLine());
        temp   = 40 + cricri / 4;
        
        System.out.println("\nA temperatura é " + temp + " graus Fahrenheit.");
        
        celsius = 5 * (temp -32) / 9; 
        
        System.out.println("\nOu se preferir " + celsius + " graus Celsius\n");
        
        
                 
        
    }
    
}
