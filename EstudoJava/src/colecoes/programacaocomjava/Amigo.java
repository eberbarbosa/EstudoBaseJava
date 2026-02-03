/*
 *  Data: 16/03/2025
* - pagina 190 livro: Programação com Java - John Hubbard
 *  Descrição: Essa classe mantém uma lista de telefones de amigos
 */


package colecoes.programacaocomjava;

/**
 *
 * @author eber
 */
public class Amigo {
    private String nome;
    private String telefone;
    private Amigo  next;
    static  Amigo  list;
    
    public static void print() {
        
        Amigo amigo = list;
        
        if(amigo == null) {
            System.out.println("!!! A lista esta vazia !!!\n");
        }
        else do {
            System.out.println(amigo);
            amigo = amigo.next;
        }
        
        while(amigo != null);
    }

    public Amigo(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.next = list;
        list = this;
    }

    @Override
    public String toString() {
        //return "Amigo{" + "nome=" + nome + ", telefone=" + telefone + ", next=" + next + '}';
        return new String(nome+":\t"+telefone);
    }  
          
    

}
