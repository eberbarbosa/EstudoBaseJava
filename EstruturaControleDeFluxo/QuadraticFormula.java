
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/*
 * 25/04/2023
                Condicionais Aninhados -> A Fórmula de Báscara
 * O programa resolve equações do segundo grau na fórmula ax² + bx + c = 0
 * 
 */


/**
 *
 * @author eber
 */
public class QuadraticFormula {
    
    public static void main(String[] args) throws IOException {
        
                
        Reader reader        = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(reader);
        
        System.out.println("Digite três coeficientes: ");
        System.out.print("\ta: ");
        
        int a = Integer.parseInt(input.readLine());
        System.out.print("\tb: ");
        
        int b = Integer.parseInt(input.readLine());
        System.out.print("\tc: ");
        
        int c = Integer.parseInt(input.readLine());
        System.out.print("A equação é: ");
        
        if(a == 0)
            if(b == 0)
                if(c == 0)
                    
                    System.out.println("0 = 0\nQualquer número é a solução.");
        else    // a == 0 && b == 0 && c != 0
                    System.out.println(c + " = 0\nNão exite solução.");
        
        else    // a == 0 && b != 0
                System.out.println(b + "x + " + c + " = 0\n\tx = " + (float)-c/b);
        else    // a != 0
            System.out.println(a +"x² + " + b + "x + " + c + " = 0 ");
        
        int d = b*b - 4*a*c;
        
        if(d < 0)
            System.out.println("Não existe soluçõa real.\n");
        else 
            if(d == 0)
            System.out.println("\tx = " + (float)-b/(2*a));
        
        else  {       // d > 0
                double sd = Math.sqrt(d);
                System.out.println("\tx1 = " + (float) (-b + sd)/(2*a));
                System.out.println("\tx2 = " + (float) (-b - sd)/(2*a));             
                                
         }             
           
    }
    
}
