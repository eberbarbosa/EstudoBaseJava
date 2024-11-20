/*
 * 19/05/2023 
* - pagina 169 livro: Java como Programar - Deitel
 * Esse programa utiliza o método maximum para retornar o maior numero
 */
package javaComoProgramar;

import java.util.Scanner;

/**
 *
 * @author eber
 */
public class MaximumFinder {
    
    // obtém três valores de ponto flutuante e localiza o valor máximo
    public void determineMaximum() {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira três valores de ponto flutuante separados por espaços: ");
        
        double numero1 = input.nextDouble();
        double numero2 = input.nextDouble();
        double numero3 = input.nextDouble();
        
        // determina o valor máximo
        double reuslt = maximum(numero1, numero2, numero3);
        
        // exibe o valor máximo
        System.out.println("O número maior é: " + reuslt);
    }
    
    // retrorna o máximo dos seus três parâmetros de double
    public double maximum(double x, double y, double z) {
        
        double maximumValue = x;    // supõe que x é o maior valor inicial
        
        // determina se y é maior que maximumValue
        if(y > maximumValue)
            maximumValue = y;
        
        // determina se z é maior que maximumValue
        if(z > maximumValue)
            maximumValue = z;
        
        return maximumValue;
    }
    
}
