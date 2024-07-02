/*
 *  29/01/2024
 * - pagina 55 livro: Java Efetivo - Joshua Bloch
 *  Estudo da classe Object
 *  
 */
package EstudoClasseObject.JavaEfetivo_Cap3;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author eber
 */
public class PhoneNumberTest {
    
    public static void main(String[] args) {
        
        Map<PhoneNumber, String> m = new HashMap<>();
        m.put(new PhoneNumber(707, 867, 5309), "Eber");
        
        System.out.println(m);
    }

    
    
    
    
}
