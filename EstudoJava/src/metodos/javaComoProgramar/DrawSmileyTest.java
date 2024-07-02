package javaComoProgramar;


import javaComoProgramar.DrawSmiley;
import javax.swing.JFrame;

/*
 * 05/06/2023 
* - pagina 187 livro: Java como Programar - Deitel
 *  Aplicativo de teste que exibe um rosto sorridente
 */

/**
 *
 * @author eber
 */
public class DrawSmileyTest {
    
    public static void main(String[] args) {
        
        DrawSmiley panel  = new DrawSmiley();
        JFrame appication = new JFrame();
        
        appication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
        appication.add(panel);
        appication.setSize(230, 250);
        appication.setVisible(true);
    }
    
}
