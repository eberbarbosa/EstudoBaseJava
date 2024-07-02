/*
 *  02/08/2023 
* - pagina 272 livro: Java como Programar - Deitel
 *  Declarando um tipo enum com um construtor e campos de instâncias explícitos
 *  e métodos de acesso para esses campos
 */
package javaComoProgramar;

/**
 *
 * @author eber
 */
public enum Book {
    
    // declara constante do tipo enum
    JHTP6(     "Java How to Program 6e",                   "2005" ),
    CHTP4(     "C How to Program 4e",                      "2004" ),
    IW3HTP3(   "Internet & World Wide Web to Program 3 e", "2004" ),
    CPPHTP4(   "C++ How to Program 4e",                    "2003" ),
    VBHTP2(    "Visual Basic .Net How to Program 2e",      "2002" ),
    CSHARPHTP( "C# How to Program",                        "2002" );
    
    // Campos dee instância
    private final String title;              // título do livro
    private final String copyrigthYear;     // ano dos direitos autorais
    
    // construtor enum

    private Book(String title, String copyrigthYear) {
        this.title         = title;
        this.copyrigthYear = copyrigthYear;
    }
    
    // método de acesso para título de campo

    public String getTitle() {
        return title;
    }

    public String getCopyrigthYear() {
        return copyrigthYear;
    }
    
    
    
}
