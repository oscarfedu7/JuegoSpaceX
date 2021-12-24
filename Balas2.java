import java.awt.geom.Rectangle2D;
import java.awt.Rectangle;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author oscar
 */
public class Balas2 {
    final int ANCHO=45, ALTO=40;
    int x;
    int y;
    int MaxX=Ventana2.ANCHO;
    private int dx=-1, dy=1;
        Balas2(int x, int y){
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
                TableroJuego2.juego=false;
            }
            if(y>=limites.getMaxY()-ALTO){
                dy=-dy;
            }
            if(x<=limites.getMinX()){
                x=MaxX;
                y=(int)(Math.random()*Ventana2.ALTO+1);
            }
             if(y<=limites.getMinY()){
                dy=-dy;
            }
        }
}

