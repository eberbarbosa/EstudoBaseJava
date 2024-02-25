/*
 *  25/02/2024 
 * - pagina 356 livro: Java como Programar - Deitel
 *  Classe Fatura que implementa Interface ContasAPagar
 *  
 */
package ProgramacaoComJava;

import ProgramacaoComJava.ContasAPagar;

/**
 *
 * @author eber
 */
public class Fatura implements ContasAPagar{
    
    private String numeroPeca;
    private String descricao;
    private int    quantidade;
    private double precoItem;
    
    // construto com quatro argumentos

    public Fatura(String numeroPeca, String descricao, int quantidade, double precoItem) {
        
        this.numeroPeca = numeroPeca;
        this.descricao  = descricao;
        
        setQuantidade( quantidade );
        setPrecoItem( precoItem );
        
    }

    public String getNumeroPeca() {
        return numeroPeca;
    }

    public void setNumeroPeca(String numeroPeca) {
        
        this.numeroPeca = numeroPeca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        
        this.quantidade = (quantidade < 0) ? 0 : quantidade;    // quantidade não pode ser negativa
        
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(double precoItem) {
        
        this.precoItem = (precoItem < 0.0) ? 0.0 : precoItem;   // valida preço
    }
    
    
    
    @Override
    public String toString() {
        
        return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: R$%,.2f", 
                "Fatura", "Numero da Peça", getNumeroPeca(), getDescricao(),
                "Quantidade", getQuantidade(), "Preço por Item", getPrecoItem());
       
    }
    
    // método requerido para executar o contrato com a interface ContasAPAgar
    @Override
    public double getValorPagamento() {
        
        return getQuantidade() * getPrecoItem();        // calcula custo total
        
    }
    
    
    
    
}