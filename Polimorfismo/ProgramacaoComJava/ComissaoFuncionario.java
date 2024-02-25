/*
 *  06/02/2024 
 * - pagina 347 livro: Java como Programar - Deitel
 *  Classe FuncionarioHorista estende Funcionário 
 *  
 */
package ProgramacaoComJava;

/**
 *
 * @author eber
 */
public class ComissaoFuncionario extends Funcionario_Interface {
    
    private double vendasBrutas;         // vendas brutas semanais
    private double taxaComissao;        // porcentagem da comissão
    
    // construtor de cinco argumentos

    public ComissaoFuncionario( String nome, String sobrenome, String cpf, double vendasBrutas, double taxaComissao ) {
        
        super(nome, sobrenome, cpf);
        this.vendasBrutas = vendasBrutas;
        this.taxaComissao = taxaComissao;
    }

    public double getVendasBrutas() {
        return vendasBrutas;
    }

    public void setVendasBrutas(double vendasBrutas) {
        
        this.vendasBrutas = ( vendasBrutas < 0.0 ) ? 0.0 : vendasBrutas;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(double taxaComissao) {
        
        this.taxaComissao = ( taxaComissao > 0.0 && taxaComissao < 1.0 ) ? taxaComissao : 0.0;
    }

    // Calcula os rendimentos; sobrescreve o método ganhos em Funcionário
    @Override
    public double ganhos() {
        
        return getTaxaComissao() * getVendasBrutas();
    }
    
    // retorna a representação String do objeto ComissaoFuncionario
    @Override
    public String toString() {
        
        return String.format( "%s: %s\n%s: R$%,.2f; %s: %.2f",
                "Comissão Funcionário", super.toString(),
                "Vendas Brutas Semanais", getTaxaComissao(),
                "Porcentagem das Comissão", getTaxaComissao());
        
    }
    
    
    
    
    
    
}
