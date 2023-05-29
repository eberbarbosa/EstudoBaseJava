/*
 * 16/05/2023 
* - pagina 111 livro: Programação Java
 * Esse programa testa o método cubo() que devolve o cubo do inteiro passado a ele
 */
/**
 *
 * @author eber
 */
public class Cubo {
    
    public static void main(String[] args) {
        
        for(int i = 0; i < 6; i++) {
                        
            System.out.println(i + "\t" + cubo(i));            
            
        }
        
        
    }
    
    public static int cubo(int n) {       
               
        return n * n * n;
    }
   
    
    
}
