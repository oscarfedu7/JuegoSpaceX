import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author oscar
 */
public class Principal {
	static boolean nivel2=false;
	static boolean ganar=false;
        public static void main(String args[]){
  	  	Ventana ventana=new Ventana();//nivel1
		if(nivel2){//nivel 2
			Ventana2 ventana2=new Ventana2();
		}
		if(ganar)//ganas
			JOptionPane.showMessageDialog(null, "GANASTE!!!");
	}
}

