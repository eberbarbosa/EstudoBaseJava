/*
 *  28/06/2023 
* - pagina 258 livro: Java como Programar - Deitel
 *  Declaração da classe Time2 com construtores sobrecarregados
 */
package Metodos.javaComoProgramar;

/**
 *
 * @author eber
 */
public class Time2 {
    
    private int hour;       // 0 - 23
    private int minute;     // 0 - 59
    private int second;     // 0 - 59
    
    // construtor sem argumento Time2: inicializa cada variável de instância
    // com zero; assegura que objetos Time2 iniciam em estado consistente
    public Time2() {
        
        this( 0, 0, 0 );        // invova o construtor Time2 com três argumentos
        
    }
    
    // hora fornecida, minuto e segundo padronizado para 0
    public Time2( int h ) {
        
        this( h, 0, 0 );      // invoca o construtor Time2 com três argumentos
        
    }
    
    public Time2( int h, int m) {
        
        this( h, m, 0 );        // invoca o construtor Time2 com três argumentos
        
    }
    
    public Time2(int h, int m, int s) {
        
        setTime( h, m, s );        // invoca setTime para validar data/hora
        
    }
    
    // Construtor Time2: outro objeto Time2 fornecido
    public Time2( Time2 time) {
        
       this( time.getHour(), time.getMinute(), time.getSecond());
        
    }
    
    
    // configura um novo valor de data/hora usando UTC;
    // assegure que os dados permaneçam consistentes configurando valores inválidos como zero
    public void setTime( int h, int m, int s ) {
        
        setHour( h) ;      // configura horas
        setMinute( m );      // configura minutos
        setSecond ( s );      // configura segundos
    }

    public void setHour(int h) {
        
        hour = ( ( h >= 0 && h < 24 ) ? h : 0 ); ;
    }

    public void setMinute(int m) {
        
        minute = ( ( m >= 0 && m < 60 ) ? m : 0 );;
    }

    public void setSecond(int s) {
        
        second = ( ( s >= 0 && s < 60 ) ? s : 0 );
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
        
        
    // converte em String no formato de data/hora universal  (HH:MM:SS)
    public String toUniversalString () {
        
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond() );
        
    }

    // Converte em String no formato padrão de data/hora (HH:MM:SS AM ou PM)
    @Override
    public String toString() {
        
        return String.format("%d:%02d:%02d %s", 
                ( ( getHour() == 0 || getHour() == 12 ) ? 12 : getHour() % 12 ),
                getMinute(), getSecond(), ( getHour() < 12 ? "AM" : "PM" ));
        
    }   
        
}
