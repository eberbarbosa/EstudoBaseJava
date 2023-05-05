
import java.util.Random;

/*
 * 25/04/2023
                Condicionais Aninhados
 * O programa usa comparações de pares para determinar a ordem ascendente de 
 * três números decimais gerados randomicamente
 */

/**
 *
 * @author eber
 */
public class EscolhendoAlternativa {
    
    public static void main(String[] args) {
        
        Random  random = new Random();
        
        float numero1 = random.nextFloat();
        float numero2 = random.nextFloat();
        float numero3 = random.nextFloat();
        
        System.out.println("numero1 = " + numero1);
        System.out.println("numero2 = " + numero2);
        System.out.println("numero3 = " + numero3);
        
        if(numero1 < numero1) {
            if(numero2 < numero3)
                
                System.out.println("numero1 < numero2 < numero3");
            
        } else // numero1 < numero2 e numero2 > numero3
            if(numero1 < numero3)
                System.out.println("numero1 < numero3 < numero2");
            
            else 
                System.out.println("numero3 < numero1 < numero2");
        
                //numero1 > numero2
            if(numero1 < numero3)
                System.out.println("numero2 < numero1 < numero3");
            
            else
                if(numero2 < numero3)
                    System.out.println("numero2 < numero3 < numero1");
            
            else
                    System.out.println("numero3 < numero2 < numero1");
        
    }
    
}
