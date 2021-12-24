import java.awt.geom.Rectangle2D;
import java.awt.Rectangle;
/**
 *
 * @author oscar
 */
public class Nave22{
    int x, y;
    static final int ANCHO=38, ALTO=50;
    public Nave22(int x, int y){
        this.x=x;
        this.y=y;
    }
    public Rectangle2D getNave2(){
        return new Rectangle2D.Double(x, y, ANCHO,ALTO);
    }
     public void moverNave2(Rectangle limites){
        if(EventoTeclado2.up && y>limites.getMinY()){
            y=y-2;
        }
        if(EventoTeclado2.down && y<limites.getMaxY()-ALTO){
            y=y+2;
        }
	if(EventoTeclado2.right && x<limites.getMaxX()-ANCHO){
            x=x+2;
        }
	if(EventoTeclado2.left && x>limites.getMinX()){
            x=x-2;
        }
    }
     
}

