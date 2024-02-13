/*
 *  02/02/2024 
 * - pagina 345 livro: Java como Programar - Deitel
 *  Classe SalarioFuncionario estende Funcionário 
 *  
 */
package ProgramacaoComJava;

/**
 *
 * @author eber
 */
public class SalarioFuncionario extends Funcionario {
    
    private double salarioSemanal;

    // Construtor com quatro argumentos
    public SalarioFuncionario(double salarioSemanal, String nome, String sobrenome, String cpf) {
        
        super(nome, sobrenome, cpf);            // passa para o construtor Funcionario
        this.salarioSemanal = salarioSemanal;    // valida e armazena o salário
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }
    
    // configura o salário
    public void setSalarioSemanal(double salarioSemanal) {
        
        this.salarioSemanal = salarioSemanal < 0.0 ? 0.0 : salarioSemanal;
    }
    
    // calcula os rendimentos; sobrescreve o método ganhos em Funcionario

    @Override
    public double ganhos() {
        
        return  salarioSemanal;
        
    }

    @Override
    public String toString() {
            
        return String.format(      "Salário Funcionário: %s\n%s: R$%,.2f",
                super.toString(),"Salário Semanal", getSalarioSemanal()) ;
    }
    
    
    
    
    
    
    
    
}
