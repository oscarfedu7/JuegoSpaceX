import java.awt.event.*;
/**
 *
 * @author oscar
 */
public class EventoTeclado extends KeyAdapter {
    static boolean w, s, up, down, left, right;
    @Override
    public void keyPressed(KeyEvent e){
        int id=e.getKeyCode();
	if(id== KeyEvent.VK_RIGHT){
            right=true;
        }
	if(id== KeyEvent.VK_LEFT){
            left=true;
        }
        if(id== KeyEvent.VK_W){
            w=true;
        }
         if(id== KeyEvent.VK_S){
            s=true;
        }
         if(id== KeyEvent.VK_UP){
            up=true;
        } 
         if(id== KeyEvent.VK_DOWN){
            down=true;
        }
    }
    @Override
    public void keyReleased(KeyEvent e){
        int id= e.getKeyCode();
	if(id== KeyEvent.VK_RIGHT){
            right=false;
        }
	if(id== KeyEvent.VK_LEFT){
            left=false;
        }
        if(id== KeyEvent.VK_W){
            w=false;
        }
        if(id== KeyEvent.VK_S){
            s=false;
        }
        if(id== KeyEvent.VK_UP){
            up=false;
        }
        if(id== KeyEvent.VK_DOWN){
            down=false;
        }
    }
}
