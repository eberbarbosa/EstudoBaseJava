/*
 * 05/06/2023 
* - pagina 187 livro: Java como Programar - Deitel
 *  Demonstra formas preenchidas
 */
package Metodos.javaComoProgramar;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author eber
 */
public class DrawSmiley extends JPanel {
    
   public void paintComponent( Graphics g) {
       
        super.paintComponent( g );
    
    // desenha o rosto
    g.setColor(Color.YELLOW);
    g.fillOval(10, 10, 200, 200);
    
    // desenha os olhos
    g.setColor(Color.BLACK);
    g.fillOval(55, 65, 30, 30);
    g.fillOval(135, 65, 30, 30);
    
    // desenha a boca
    g.fillOval(50, 110, 120, 60);
    
    // Retoca a boca para criar um sorriso
    g.setColor(Color.YELLOW);
    g.fillRect(50, 110, 120, 30 );
    g.fillOval(50, 120, 120, 40);
    
   }
    
    
}
