/*
 *  01/08/2023 
* - pagina 269 livro: Java como Programar - Deitel
 *  Declaração da classe Date
 */
package javaComoProgramar;

/**
 *
 * @author eber
 */
public class Date {
    
    private int month;      // 1-12
    private int day;        // 1-31 conforme o mês
    private int year;      // qualquer ano
    
    // construtor: chama checkMonth pata confirmar o valor adequado para month;
    // chama checkDay para confirmar o valor adequado para day

    public Date(int month, int day, int years) {
        
        this.month = checkMonth(month);     
        this.day   = checkDay(day);
        this.year = years;
        
        System.out.printf("Date object constructor for date %s\n", this);
    }
    
    // método utilitário para confirmar o valor adequado de month
    private int checkMonth(int testMonth){
        
        if(testMonth > 0 && testMonth <=12) {
            return testMonth;
        }
        else {
            System.out.printf("Invalid month (%d) set to 1.", testMonth );
            
            return 1;       // mantém o objeto em estado consistente
        }
    }
    
    // método utilitário para confirmar o valor adequado de day com base em month e year
    private int checkDay( int testDay ) {
        
        int daysPerMonth[] = 
        { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // verifica se day esta no intervalo para month
        if( testDay > 0 && testDay <= daysPerMonth[month] )
            
            return testDay;                   
        
        
        // verifica ano bissexto
        if( month == 2 && testDay == 29 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0 )) )
            
            return testDay;
        
        System.out.printf("Invalid day (%d) set to 1.", testDay );
        
        return 1;
     }
    
    
    // Retorna uma String no formato mês/dia/ano    
    @Override
    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }
    
    
    
}
