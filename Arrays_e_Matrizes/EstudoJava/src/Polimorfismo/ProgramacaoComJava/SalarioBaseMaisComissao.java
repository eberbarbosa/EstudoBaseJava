/*
 *  13/02/2024 
 * - pagina 348 livro: Java como Programar - Deitel
 *  Classe SalarioBaseMaisComissao estende Funcionário 
 *  
 */
package ProgramacaoComJava;

/**
 *
 * @author eber
 */
public class SalarioBaseMaisComissao extends ComissaoFuncionario {
    
    private double salarioBaseSemana;       // salário base por semana
    
    // construtor de seis argumentos

    public SalarioBaseMaisComissao( String nome, String sobrenome, String cpf, double salarioBaseSemana, double vendasBrutas, double taxaComissao ) {
        super( nome, sobrenome, cpf, vendasBrutas, taxaComissao );
        this.salarioBaseSemana = salarioBaseSemana;
    }
    

    

    public double getSalarioBaseSemana() {
        
        return salarioBaseSemana;
    }

    public void setSalarioBaseSemana(double salarioBaseSemana) {
        
        this.salarioBaseSemana = ( salarioBaseSemana < 0.0 ) ? 0.0 : salarioBaseSemana;   //não negativo
    }
    
    // calcula os vencimentos; sobrescreve em salarioFuncionario
    @Override
    public double ganhos() {
                    
        return getSalarioBaseSemana() + super.ganhos();
        
    }
    
    
    // retorna a representação String do objeto SlarioBaseComissao
    public String toString() {
        
        return String.format("%s %s; %s: R$%,.2f",
                "Salário Base", super.toString(),
                "Base Salário", getSalarioBaseSemana());
        
    }   
        
    
}
