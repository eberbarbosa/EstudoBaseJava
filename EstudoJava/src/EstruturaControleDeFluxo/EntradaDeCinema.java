
import java.util.Scanner;

/*
 * 26/04/2023
 * O programa calcula o preço de uma entrada de cinema 
 * 
 */


/**
 *
 * @author eber
 */
public class EntradaDeCinema {
    
    public static void main(String[] args) {
        
        short idade;
        byte  diaDaSemana;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a idade do comprador\n");
        idade = scanner.nextShort();

        System.out.print("Digite o dia da semana (1=domingo, 2=segunda, 3=terça, 4=quinta, 5=sexta, 6=sabado): \n");
        diaDaSemana = scanner.nextByte();
        
        float preço = calculaPreco(idade, diaDaSemana);
        
        System.out.printf("O preço da Entrada é  R$%.2f Reais\n\n", preço);
        
    }
    
    /*
     *  Menos de 14 anos e mais de 65 anos pagam meia entrada (R$6,00), caso 
     * contrário R$ 12,00.
     *  De terça a quinta todos pagam meia entrada independente da idade.
     * 
    */    
    public static float calculaPreco(short idade, byte diaDaSemana) {
        
        float preço;        // armazena o preço calculado
        
        if(diaDaSemana >= 3 && diaDaSemana <= 5) {
        
            preço = 6;
        }
        
        else {
            if(idade <= 14 || idade >= 65)
                preço = 6;
            
            else
                preço = 12;
        }
        
        return preço;        
        
    }    
         
}
