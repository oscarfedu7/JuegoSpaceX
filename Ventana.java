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
public class Ventana extends JFrame{
    static final int ANCHO=800, ALTO=500;
    private TableroJuego lamina;
    public Ventana(){
            setTitle("COSMOS");
               setSize(ANCHO, ALTO);
               setLocationRelativeTo(null);//ubica la ventana en el centro
               setResizable(false);//permite o no cambiar el tamaño de la p$
               lamina=new TableroJuego();
               add(lamina);
               addKeyListener(new EventoTeclado());
               setVisible(true);
               setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               lamina.iterarJuego();

    }
}
