import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oscar
 */
public class Ventana2 extends JFrame{
    static final int ANCHO=800, ALTO=500;
    private TableroJuego2 lamina;
    public Ventana2(){
            setTitle("COSMOS");
               setSize(ANCHO, ALTO);
               setLocationRelativeTo(null);//ubica la ventana en el centro
               setResizable(false);//permite o no cambiar el tamaño de la p$
               lamina=new TableroJuego2();
               add(lamina);
               addKeyListener(new EventoTeclado2());
               setVisible(true);
               setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               lamina.iterarJuego();

    }
}
