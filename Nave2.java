import java.awt.geom.Rectangle2D;
import java.awt.Rectangle;
/**
 *
 * @author oscar
 */
public class Nave2{
    int x, y;
    static final int ANCHO=38, ALTO=50;
    public Nave2(int x, int y){
        this.x=x;
        this.y=y;
    }
    public Rectangle2D getNave2(){
        return new Rectangle2D.Double(x, y, ANCHO,ALTO);
    }
     public void moverNave2(Rectangle limites){
        if(EventoTeclado.up && y>limites.getMinY()){
            y=y-2;
        }
        if(EventoTeclado.down && y<limites.getMaxY()-ALTO){
            y=y+2;
        }
	if(EventoTeclado.right && x<limites.getMaxX()-ANCHO){
            x=x+2;
        }
	if(EventoTeclado.left && x>limites.getMinX()){
            x=x-2;
        }
    }
     
}

