/*
 *  05/02/2024 
 * - pagina 346 livro: Java como Programar - Deitel
 *  Classe FuncionarioHorista estende Funcionário 
 *  
 */

package ProgramacaoComJava;

/**
 *
 * @author eber
 */
public class FuncionarioHorista extends Funcionario {
    
    private double salarioHora;     // Salário por Hora
    private double hora;            // horas trabalhadas durante a semana
    
    // construtor de cinco argumentos
    public FuncionarioHorista(String nome, String sobrenome, String cpf, double salarioHora, double horasTrabalhadas) {
        
        super(nome, sobrenome, cpf);
        setSalarioHora(salarioHora);    // valida a remuneração por hora
        setHora(hora);                  // valida as horas trabalhadas
        
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        
        this.salarioHora = (salarioHora < 0.0) ? 0.0 : salarioHora;
    }

    public double getHora() {
        return hora;
    }

    public void setHora(double hora) {
        
        this.hora = ((hora >= 0.0) && (hora <= 168.0)) ? hora : 0.0;
    }
    
    //Calcula os rendimentos; sobrescreve o método ganhos em Funcionário
    public double ganhos() {
        
        if( getHora() <= 40 )   // nenhuma hora extra
            return getSalarioHora() * getHora();
        
        else
            return 40 * getSalarioHora() + ( getHora() - 40 ) * getSalarioHora() * 1.5;
    }
    
    public String toString() {
        
        return String.format(      "Funcionário Horista: %s\n%s: R$%,.2f; %s: %,.2f",
                super.toString(),"Salário por hora", getSalarioHora(),
                                     "Horas Trabalhadas", getHora());
    }
    
    
    
}
