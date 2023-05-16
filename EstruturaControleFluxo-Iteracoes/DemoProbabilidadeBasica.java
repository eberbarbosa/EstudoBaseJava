/*
 * 03/05/2023
 * Essa classe demonstra o uso dos métodos estáticos da classe ProbabilidadeBasica
 */

/**
 *
 * @author eber
 */
public class DemoProbabilidadeBasica {
    
    public static void main(String[] args) {

        // Problema de combinações: Quantos conjuntos diferentes de três pessoas
        // podem criar de um grupo de seis pessoas ?
        System.out.println(ProbabilidadeBasica.combinações(6, 3));  // 20
        
        // Problema de combinações: Quantos times diferentes de futebol (titulares)
        // podemos fazer se temos vinte e dois jogadores ?
        System.out.println(ProbabilidadeBasica.combinações(22, 11));
        
        // Problema de combinações: De qunatas maneiras diferentes podemos sentar
        // seis pessoas em uma mesa ?
        System.out.println(ProbabilidadeBasica.combinações(6, 6));
        
        // Problema de combinações: Mas se tivessemos 10 pessoas e somente 5
        // assentos ?
        System.out.println(ProbabilidadeBasica.combinações(10, 5));

    }
    
}
