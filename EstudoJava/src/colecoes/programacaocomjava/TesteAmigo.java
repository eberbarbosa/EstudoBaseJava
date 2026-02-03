/*
 *  Data: 16/03/2025
* - pagina 191 livro: Programação com Java - John Hubbard
 *  Descrição: Classe de teste da classe Amigo
 */


package colecoes.programacaocomjava;

/**
 *
 * @author eber
 */
public class TesteAmigo {
    
    public static void main(String[] args) {
        
        Amigo.print();
        
        new Amigo("Leo"    , "19-9191-1111");
        new Amigo("Eduardo", "19-9292-2222");
        new Amigo("Luciana", "19-9393-3333");
        
        Amigo.print();
    }

}
