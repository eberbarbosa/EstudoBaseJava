/*
 *  02/02/2024 
 * - pagina 343 livro: Java como Programar - Deitel
 *  Superclasse Abstrata 
 *  
 */
package ProgramacaoComJava;

/**
 *
 * @author eber
 */
public abstract class Funcionario implements ContasAPagar{
    
    private String nome;
    private String sobrenome;
    private String cpf;

    public Funcionario(String nome, String sobrenome, String cpf) {
        
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        
        return String.format("%s %s\nnumero do cpf: %s",
                getNome(), getSobrenome(), getCpf());
    }
    
    // método abstrato sobrescrito pelas subclasses
   // public abstract double ganhos();    // nenhuma implementação aqui  
       
    
    
}


