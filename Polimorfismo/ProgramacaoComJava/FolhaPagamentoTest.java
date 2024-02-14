/*
 *  14/02/2024 
 * - pagina 350 livro: Java como Programar - Deitel
 *  Programa de Teste da hierarquia Funcionario 
 *  
 */
package ProgramacaoComJava;

/**
 *
 * @author eber
 */
public class FolhaPagamentoTest {
    
    public static void main(String[] args) {
        
        // Cria objetos ce subclasses
        SalarioFuncionario salarioFuncionario = new SalarioFuncionario(800.00, "John", "Smith", "111-111-111-11");
        FuncionarioHorista funcionarioHorista = new FuncionarioHorista("Karen", "Price", "222-222-222-22", 16.75, 40 );
        ComissaoFuncionario comissaoFuncionario = new ComissaoFuncionario(10000, .06, "Sue", "Jones", "333-333-333-33" );
        SalarioBaseMaisComissao salarioBaseMaisComissao = new SalarioBaseMaisComissao(300, 5000, .04, "Bob", "Lewis", "444-444-444-44" );
        
        System.out.println("Funcionários processados individualmente:\n" );
        
        System.out.printf("%s\n%s: R$%,.2f\n\n",
                salarioFuncionario,"Merecido", salarioFuncionario.ganhos());
        
        System.out.printf("%s\n%s: R$%,.2f\n\n",
                funcionarioHorista,"Merecido", funcionarioHorista.ganhos());
        
        System.out.printf("%s\n%s: R$%,.2f\n\n",
                comissaoFuncionario,"Merecido", comissaoFuncionario.ganhos());
        
        System.out.printf("%s\n%s: R$%,.2f\n\n",
                salarioBaseMaisComissao,"Merecido", salarioBaseMaisComissao.ganhos());
        
        
        // cria um array Funcionario de 4 elementos
        Funcionario funcionario[] = new Funcionario[4];
        
        // inicia o array com Funcionario
        funcionario[ 0 ] = salarioFuncionario;
        funcionario[ 1 ] = funcionarioHorista;
        funcionario[ 2 ] = comissaoFuncionario;
        funcionario[ 3 ] = salarioBaseMaisComissao;
        
        System.out.println("Funcionario processado Polimorficamente:\n");
        
        // processa genericamente cada elemento no funionario
        for( Funcionario funcionarioAtual : funcionario ) {
            
            System.out.println(funcionarioAtual );
            
            // determina se elemento é um SalarioBaseMaisComissao
            if( funcionarioAtual instanceof SalarioBaseMaisComissao ) {
                
                
        // dowcast da referência de Funcionario para referência a SalarioBaseMaisComissao
        SalarioBaseMaisComissao funcionarios = ( SalarioBaseMaisComissao ) funcionarioAtual;
        
                double salarioAntigo = funcionarios.getSalarioBaseSemana();
                funcionarios.setSalarioBaseSemana( salarioAntigo * 1.10 );
                
                System.out.printf("novo salário base com aumento de 10%% is: R$%,.2f\n",
                        funcionarios.getSalarioBaseSemana());
            }
            
            System.out.printf( "Merecido R$%,.2f\n\n", funcionarioAtual.ganhos() );
        }
        
        // obtem o nome do tipo de cada objeto no array funcionario
        for( int j = 0; j < funcionario.length; j++ ) {
            
            System.out.printf("Funcionario %d é a %s\n", j, funcionario[ j ].getClass().getName() );
        }
        
    }
    
}
