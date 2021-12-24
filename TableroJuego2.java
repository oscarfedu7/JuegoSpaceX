import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.*;
/**
 *
 * @author oscar
 */
public class TableroJuego2 extends JPanel {
    double tiempoI, tiempoF;
    static boolean juego=true;
    double maxX=getBounds().getMaxX();
    double maxxX=Ventana2.ANCHO;
    double maxY=Ventana2.ALTO;
    final int distancia=0;
    Nave22 nave2= new Nave22(Ventana2.ANCHO/2, Ventana2.ALTO/2);
    //crear balas
    Balas2[] balas=new Balas2[7];
    Balas3[] balas3=new Balas3[3];
    Meta2 meta=new Meta2();
    int add=75;
    public TableroJuego2() {
	tiempoI=System.currentTimeMillis();
        setBackground(Color.BLACK);
	int azar;
	int var;
	for(int i=0;i<balas.length;i++){
		azar=(int)(Math.random()*Ventana2.ALTO+1);
		var=Ventana2.ANCHO+(add*i);
    		balas[i]=new Balas2(var,azar);
    	}
	for(int i=0;i<balas3.length;i++){
		azar=(int)(Math.random()*Ventana2.ALTO+1);
                var=Ventana2.ANCHO+(add*(7+i));
                balas3[i]=new Balas3(var,azar);
	}
    }
    public void paintComponent(Graphics g){//hace la pelota
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D)g;
        g2.setColor(Color.WHITE);
        dibujar(g2);
        actualizar();
    }
    public void dibujar(Graphics2D g){
       g.drawImage(Assets2.player, nave2.x, nave2.y, null);
       g.drawString(""+((tiempoF-tiempoI)/1000), 10, 20);
	g.fill(meta.getMeta());
         for(int i=0;i<balas.length;i++){
 	 //	g.fill(balas[i].getBala());
	   	g.drawImage(Assets2.meteoro, balas[i].x, balas[i].y,null);
         }
	 for(int i=0;i<balas3.length;i++){
         //     g.fill(balas[i].getBala());
                g.drawImage(Assets2.meteoro3, balas3[i].x, balas3[i].y,null);
         }
	if(!juego && !Principal.ganar){
                g.drawImage(Assets2.explosion1, nave2.x, nave2.y, null);
                g.drawImage(Assets2.explosion2, nave2.x, nave2.y, null);
                g.drawImage(Assets2.explosion3, nave2.x, nave2.y, null);
                g.drawImage(Assets2.explosion4, nave2.x, nave2.y, null);
        }


    }

    public void actualizar(){
        nave2.moverNave2(getBounds());
	for(int i=0;i<balas.length;i++){
		balas[i].mover(getBounds(), ColisionNave(nave2.getNave2(), balas[i].getBala()));
	}
	for(int i=0;i<balas3.length;i++){
                balas3[i].mover(getBounds(), ColisionNave(nave2.getNave2(), balas3[i].getBala()));
        }

    }
    public void iterarJuego(){
	init();
	int tiempo=3;
        while(juego){
	    if(meta.pasarMision(ColisionNave(nave2.getNave2(), meta.getMeta()))){
		  	juego=false;
			Principal.ganar=true;
			System.out.println("Ganaste");
	    }
            try{
             repaint();
	     tiempoF=System.currentTimeMillis();
        /*     if((tiempoF-tiempoI)>=10000 && tiempo>1){
		  tiempo--;
		  tiempoI=tiempoF;
	     }*/
             Thread.sleep(tiempo);
            }
             catch(Exception ex){
                 Logger.getLogger(Hilo2.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
	repaint();
    }
   
   public boolean ColisionNave(Rectangle2D r, Rectangle2D b){
	return b.intersects(r);
   }
 
    private void init(){
                Assets2.init();
    }


}


