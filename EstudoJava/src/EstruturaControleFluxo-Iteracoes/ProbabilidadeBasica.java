/*
 * 27/04/2023
 * A classe contém alguns métodos estáticos para calculos básicos de probabilidades
 * 
 */

/**
 *
 * @author eber
 */
public class ProbabilidadeBasica {
    
    // Métrodo fatorial calcula o fatorial de um valor inteiro e retorna um double
    public static double fatorial(int valor) {
        
        double fatorial = 1;                // acumulador para o fatorial
        
        for(int i = 1; i <= valor; i++) {   // conta de 1 até o valor
            
            fatorial = fatorial * i;        // multiplicamos cumulativamente            
                     
        } 
        
         return fatorial; 
                        
    }
    
    // O método combinações calcula o número de combinações que podem ser obtidas
    public static double combinações(int Q, int T) {        // Q -> numero total de elemtos
                                                            // T -> tamanho do subgrupo de Q
                                                            
        return fatorial(Q) / (fatorial(T) * fatorial(Q - T));
        
        
    }
    
    // O método permutações calcula o número de permutações que podem ser obtidas
    public static double pemutações(int Q, int T) {
        
        return fatorial(Q) / fatorial(Q - T);
    }   
        
}


