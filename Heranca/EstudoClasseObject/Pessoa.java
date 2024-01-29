/*
 *  20/01/2024
 * - pagina 41 livro: Java Efetivo - Joshua Bloch
 *  Estudo da classe Object
 *  
 */
package EstudoClasseObject;

import java.util.Arrays;



/**
 *
 * @author eber
 */
public class Pessoa {
    
    public String nome;
    public String sobrenome;
    public int    telefone;
    public int    rg;

    public Pessoa(String nome, String sobrenome, int telefone, int rg) {
        this.nome = nome;
        this.sobrenome = sobrenome;        
        this.telefone = telefone;
        this.rg = rg;
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

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    } 
    

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

   /* @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", sobrenome=" + sobrenome + ", telefone=" + telefone + ", rg=" + rg + 
                "Aluno [curso = " + curso + ", \nnotas = " + Arrays.toString(notas)
				+ "]"'}';
    } */ 
    
    /* @Override
    public String toString() {
        return super.toString() + ", Aluno [curso=" + curso + ",\nnotas=" + Arrays.toString(notas) + "]";
    }*/

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", sobrenome=" + sobrenome + ", telefone=" + telefone + ", rg=" + rg + '}';
    }
    
    
    

    
}
