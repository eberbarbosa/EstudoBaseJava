/*
 *  Data: 15/11/2024
 * - pagina 1016 livro: Java como Programar - Deitel
 *  Descrição: Métodos String equals, equalsIgnoreCase, ccompareTo e regionMatches.
 */

package String;

public class StringCompare {

    public static void main(String[] args) {

        String s1 = new String( "hello" );      // s1 é uma cópia de "hello"
        String s2 = "goddbye";
        String s3 = "Happy Birthday";
        String s4 = "happy birthday";

        System.out.printf("s1 = %s\ns2 = %s\ns3 = %s\ns4 = %s\n\n", s1, s2, s3, s4);

        // teste para igualdade
        if (s1.equals("hello")) {     // true
            System.out.println("s1 igual \"hello\"");
    }
        else
            System.out.println("s1 não é igual a \"hello\"");

        // testa quanto a igualdade com ==
        if (s1 == "hello"){        // false; eles não são os mesmos objetos
            System.out.println("s1 é o mesmo objeto que \"hello\"");
        }
        else
        System.out.println("s1 não é o mesmo objeto que \"hello\"");

        // testa quanto a igualdade (ignora maiúsculas e minúsculas)
        if (s3.equalsIgnoreCase(s4)){       // true
            System.out.printf("%s Igual %s com maiúsculas e minúsculas ignoradas\n", s3, s4);
        }
        else
            System.out.println("s3 não é igual a s4");


        // testa compareTo
        System.out.printf("\ns1.compareTo( s2 ) é %d", s1.compareTo( s2 ));
        System.out.printf("\ns2.compareTo( s1 ) é %d", s2.compareTo( s1 ));
        System.out.printf("\ns1.compareTo( s1 ) é %d", s1.compareTo( s1 ));
        System.out.printf("\ns3.compareTo( s4 ) é %d", s3.compareTo( s4 ));
        System.out.printf("\ns4.compareTo( s3 ) é %d\n\n", s4.compareTo( s3 ));

        // testa regionMatches (distingue maiúsculas e minúsculas)
        if ( s3.regionMatches( 0, s4, 0, 5)){
            System.out.println("Os primeiros 5 caracteres de s3 e s4 correspondem");
        }
        else
            System.out.println("Os primeiros 5 caracteres de s3 e s4 não correspondem");

        // testa regionMatches (ignora maiúsculas e minúsculas)
        if (s3.regionMatches( true, 0, s4, 0, 5 )){
            System.out.println("Os primeiros 5 caracteres de s3 e s4 correspondem");
        }
        else
            System.out.println("Os primeiros 5 caracteres de s3 e s4 não correspondem");

    }

}
