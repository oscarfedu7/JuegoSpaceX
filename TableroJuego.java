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
public class TableroJuego extends JPanel {
    double tiempoI, tiempoF;
    static boolean juego=true;
    double maxX=getBounds().getMaxX();
    double maxxX=Ventana.ANCHO;
    double maxY=Ventana.ALTO;
    final int distancia=0;
    Nave2 nave2= new Nave2(Ventana.ANCHO/2, Ventana.ALTO/2);
    //crear balas
    Balas[] balas=new Balas[10];
    Meta meta=new Meta();
    int add=75;
    public TableroJuego() {
	tiempoI=System.currentTimeMillis();
        setBackground(Color.BLACK);
	int azar;
	int var;
	for(int i=0;i<balas.length;i++){
		azar=(int)(Math.random()*Ventana.ALTO+1);
		var=Ventana.ANCHO+(add*i);
    		balas[i]=new Balas(var,azar);
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
       g.drawImage(Assets.player, nave2.x, nave2.y, null);
       g.drawString(""+((tiempoF-tiempoI)/1000), 10, 20);
	g.fill(meta.getMeta());
         for(int i=0;i<balas.length;i++){
 	 //	g.fill(balas[i].getBala());
	   	g.drawImage(Assets.meteoro, balas[i].x, balas[i].y,null);
         }
	if(!juego && Principal.nivel2==false){
                g.drawImage(Assets.explosion1, nave2.x, nave2.y, null);
		g.drawImage(Assets.explosion2, nave2.x, nave2.y, null);
		g.drawImage(Assets.explosion3, nave2.x, nave2.y, null);
		g.drawImage(Assets.explosion4, nave2.x, nave2.y, null);
        }
    }

    public void actualizar(){
        nave2.moverNave2(getBounds());
	for(int i=0;i<balas.length;i++){
		balas[i].mover(getBounds(), ColisionNave(nave2.getNave2(), balas[i].getBala()));
	}

    }
    public void iterarJuego(){
	init();
	int tiempo=3;
        while(juego){
	    if(meta.pasarMision(ColisionNave(nave2.getNave2(), meta.getMeta()))){
		  	juego=false;
			Principal.nivel2=true;
	    }
            try{
             repaint();
	     tiempoF=System.currentTimeMillis();
             if((tiempoF-tiempoI)>=10000 && tiempo>1){//sssssssssssss
		  tiempo--;
		  tiempoI=tiempoF;
	     }///ssssssssssssssssssss
             Thread.sleep(tiempo);
            }
             catch(Exception ex){
                 Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
	repaint();
    }
   
   public boolean ColisionNave(Rectangle2D r, Rectangle2D b){
	return b.intersects(r);
   }
 
    private void init(){
                Assets.init();
    }


}


