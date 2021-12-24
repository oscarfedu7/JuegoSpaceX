/**
 *
 * @author oscar
 */
import java.util.logging.Level;
import java.util.logging.Logger;
public class Hilo2 extends Thread {
    TableroJuego2 lamina;
    public Hilo2(TableroJuego2 lamina){
            this.lamina=lamina;
    }
    public void run(){
               while(true){
                   try{
                       Thread.sleep(2);
                   }
                   catch(InterruptedException ex){
                       Logger.getLogger(Hilo2.class.getName()).log(Level.SEVERE, null, ex);
                   }
                   lamina.repaint();
               }
    }
}
