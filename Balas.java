import java.awt.geom.Rectangle2D;
import java.awt.Rectangle;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author oscar
 */
public class Balas {
    final int ANCHO=45, ALTO=40;
    int x;
    int y;
    int MaxX=Ventana.ANCHO;
    private int dx=-1, dy=1;
        Balas(int x, int y){
            this.x=x;
            this.y=y;
        }
        public Rectangle2D getBala(){
            return new Rectangle2D.Double(x,y,ANCHO, ALTO);
        }
        public void mover(Rectangle limites, boolean colision){
            x=x+dx;
           // y=y+dy;
            if(colision){
                TableroJuego.juego=false;
            }
            if(y>=limites.getMaxY()-ALTO){
                dy=-dy;
            }
            if(x<=limites.getMinX()){
                x=MaxX;
                y=(int)(Math.random()*Ventana.ALTO+1);
            }
             if(y<=limites.getMinY()){
                dy=-dy;
            }
        }
}

