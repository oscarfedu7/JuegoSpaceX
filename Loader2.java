import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Loader2{
	
	public static BufferedImage ImageLoader(String path){
		try {
			return ImageIO.read(Loader2.class.getResource(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null; //en caso de que no se carge la imagen
	}
	
}
