/*
 *  25/02/2024 
 * - pagina 361 livro: Java como Programar - Deitel
 *  TEsta a Interface ContasAPagar
 *  
 */
package ProgramacaoComJava;

import ProgramacaoComJava.ContasAPagar;
import ProgramacaoComJava.Fatura;

/**
 *
 * @author eber
 */
public class ContasAPagarInterfaceTest {
    
    public static void main(String[] args) {
        
        // cria array ContaAPagar de quatro elementos
        ContasAPagar contasAPagarObjeto[] = new ContasAPagar[ 4 ];
        
        // preenche o array com objtos que implemental ContasAPagar
        contasAPagarObjeto[ 0 ] = new Fatura("01234", "Assento", 2, 375.00);
        contasAPagarObjeto[ 1 ] = new Fatura("56789", "pneu", 24, 79.95 );
        contasAPagarObjeto[ 2 ] = new SalarioFuncionario("John", "Smith", "111.111.111-11", 800.00);
        contasAPagarObjeto[ 3 ] = new SalarioFuncionario("Lisa", "Barner", "222.222.222-22", 1200.00);
        
        System.out.println("Faturas e Funcionários processado polimorficamente:\n");
        
        // processa genericamente cada elemento no array contasAPagarObjeto
        for(ContasAPagar salarioAtual : contasAPagarObjeto) {
            
            // gera a saída de salario atual e sua quantia de pagamento apropriada
            System.out.printf("%s \n%s: R$%,.2f\n\n", salarioAtual.toString(),
                    "Pagamento Devido", salarioAtual.getValorPagamento());
        }
        
        
    }
    
}
