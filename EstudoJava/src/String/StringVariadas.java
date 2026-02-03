/*
 * Data: 30 de jan. de 2026
 * Página: 474
 * Livro: Java Como Programar – Deitel (8ª edição)
 * Descrição:  Esse aplicativo demonstra os métodos da classe String
     length, charAt e getChars.
 */


package String;

import javax.swing.JOptionPane;

/**
 *
 * @author eber
 */
public class StringVariadas {
    
    public static void main(String[] args) {
        
        String s1 = "Olá Eber\n";
        char[] charArray = new char[10];
        
        System.out.printf("s1: %s", s1);
        
        // Testa o método length
        System.out.printf("Lenght de s1: %d\n", s1.length());
        
        // faz loop pelos caracteres em s1 com charAt e os exibe na ordem inversa
        System.out.printf("%n A String invertida: ");
        
        for (int count = s1.length() - 1; count >= 0; count--){
            System.out.printf("%c ", s1.charAt(count));           
        }        
      
        System.out.println("");        
               
        // copia caracteres a partir de string para charArray
        s1.getChars(0, 9, charArray, 0);
        System.out.printf("A matriz de caracteres é: ");
        
        for(char character : charArray){
            System.out.print(character);
            
        }
        
        System.out.println("");


    }

}
