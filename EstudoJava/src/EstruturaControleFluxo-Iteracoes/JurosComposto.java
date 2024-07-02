/*
 * 04/05/2023
 * Calculo de Juros Composto com for.
 */

/**
 *
 * @author eber
 */
public class JurosComposto {
    
    public static void main(String[] args) {
        
        double vlr_Deposito;            // quantia em depóisito ao fim de cada ano
        double vlr_Inicial = 1000.00;   // quantia inicial antes dos juros
        double juros = 0.05;            // taxa de juros
        
        
        System.out.printf("%s%20s \n", "Ano", "\tValor em depósito");
        
        // Calcula quantia de depósitos para cada um dos dez anos
        for(int ano = 1; ano <= 10; ano++) {
            
            // Calcula nova quantia durante ano especificado
            vlr_Deposito = vlr_Inicial + Math.pow(1.0 + juros, ano);
            
            // exibe o ano e a quantia
            System.out.printf("%4d%,20.2f\n", ano, vlr_Deposito);
        }
        
    }
    
}
