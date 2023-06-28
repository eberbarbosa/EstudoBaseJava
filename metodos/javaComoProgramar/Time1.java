/*
 * 18/06/2023 
* - pagina 258 livro: Java como Programar - Deitel
 *  Declaração da classe Time1 mantém a data/hora no formato 24 horas
 */
package javaComoProgramar;

/**
 *
 * @author eber
 */
public class Time1 {
    
    private int hour;       // 0 - 23
    private int minute;     // 0 - 59
    private int second;     // 0 - 59
    
    // configura um novo valor de data/hora usando UTC;
    // assegure que os dados permaneçam consistentes configurando valores inválidos como zero
    public void setTime( int h, int m, int s ) {
        
        hour   = ( ( h >= 0 && h < 24 ) ? h : 0 );      // valida horas
        minute = ( ( m >= 0 && m < 60 ) ? m : 0 );      // valida minutos
        second = ( ( s >= 0 && s < 60 ) ? s : 0 );      // valida segundos
    }
    
    // converte em String no formato de data/hora universal  (HH:MM:SS)
    public String toUniversalString () {
        
        return String.format("%02d:%02d:%02d", hour, minute, second );
        
    }

    // Converte em String no formato padrão de data/hora (HH:MM:SS AM ou PM)
    @Override
    public String toString() {
        
        return String.format("%d:%02d:%02d %s", 
                ( ( hour == 0 || hour == 12 ) ? 12 : hour % 12 ),
                minute, second, ( hour < 12 ? "AM" : "PM" ));
        
    }   
        
}
