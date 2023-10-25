/*
 *  05/10/2023 
 * - pagina 283 livro: Java como Programar - Deitel
 *  Declaração de classe Time1 mantém a data/hora no formato de 24 horas
 *  
 */

package javaComoProgramar;

/**
 *
 * @author eber
 */

public class Time1 {
    
    private int hour;      // 0 - 23
    private int minute;    // 0 - 59
    private int second;    // 0 - 59
    
    //Configura um novo valor de data/hora utilizando data/hora universal; realiza
   // testes de validade nos dados; configura valores inválidos com zero 
    
    public void setTime( int h, int m, int s ) {
        
        hour   = ( ( h >= 0 && h < 24 ) ? h : 0 );      // valida horas
        minute = ( ( m >= 0 && m < 60 ) ? m : 0 );      // valida minutos
        second = ( ( s >= 0 && s < 60 ) ? s : 0 );      // valida segundos
        
    }
    
    // converte em String no formato de data/hora universal (HH:MM:SS)
    public String toUniversalString() {
        
        return String.format("%02d:%02d:%02d", hour, minute, second );
        
    }
    
    // Converte edm String no formato padrão de data/hora (H:MM:SS AM ou PM)
    public String toString() {
        
        return String.format( "%d:%02d:%02d %s", 
                ( (hour == 0 || hour == 12) ? 12 : hour % 12),
                minute, second, (hour < 12 ? "AM" : "PM") );
    }
    
}
