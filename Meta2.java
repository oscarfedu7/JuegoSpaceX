import java.awt.geom.Rectangle2D;
import java.awt.Rectangle;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Meta2 {
    final int ANCHO=25, ALTO=25;
    int x;
    int y;
    boolean pasar=false;
    int MaxX=Ventana2.ANCHO;
        Meta2(){
            this.x=MaxX-30;
            this.y=(int)(Math.random()*Ventana2.ALTO+1);
        }
        public Rectangle2D getMeta(){
            return new Rectangle2D.Double(x,y,ANCHO, ALTO);
        }
        public boolean pasarMision(boolean colision){
            if(colision){
                pasar=true;
            }
	    return pasar;
        }
}

