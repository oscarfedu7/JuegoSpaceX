import java.awt.geom.Rectangle2D;
import java.awt.Rectangle;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Meta {
    final int ANCHO=25, ALTO=25;
    int x;
    int y;
    boolean pasar=false;
    int MaxX=Ventana.ANCHO;
        Meta(){
            this.x=MaxX-30;
            this.y=(int)(Math.random()*Ventana.ALTO+1);
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

