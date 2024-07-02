/*
 * 27/04/2023
 *   Estudo de caso de GUIs e imagens gráficas do livro Java como Programar 
 * do Deitel, pagina 111 e 112.
 *
 *  Esse programa desenha duas linhas que se cruzam em um painel.
 *
 */
package criandoDesenhosSimples;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author eber
 */
public class DrawPanel extends JPanel {
    
    // desenha um x a partir dos cantos do painel
    public void paintComponent(Graphics g) {
        
        // chama paintComponent para assegurar que o painel é exibido corretamente
        super.paintComponent(g);
        
        int width  = getWidth();     // largura total
        int height = getHeight();   // altura total
        
        //desenha a linha a partir do canto superior esquerdo até o inferior direito
        g.drawLine(0, 0, width, width);
        
        //desenha a linha a partir do canto inferior esquerdo até o superior direito
        g.drawLine(0, height, width, 0);
    }
    
    public static void main(String[] args) {
        
        // cria um painel que contém nosso desenho
        DrawPanel panel = new DrawPanel();
        
        // cria um novo frame para armazenar o painel
        JFrame app = new JFrame();
        
        // configura o frame para ser encerrado quando ele é fechado
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        app.add(panel);                     // adiciona o painel ao frame
        app.setSize(250, 250);      // configura o tamanho do frame
        app.setVisible(true);               //  torna o frame visível
    }
    
}
