import java.awt.image.BufferedImage;

public class Assets {
	
	public static BufferedImage player;
	public static BufferedImage meteoro;
	public static BufferedImage explosion1;
	public static BufferedImage explosion2;
	public static BufferedImage explosion3;
	public static BufferedImage explosion4;

	public static void init()
	{
		player = Loader.ImageLoader("/ships/Player.png");
		meteoro= Loader.ImageLoader("/Game/meteors/med2.png");
		explosion1= Loader2.ImageLoader("/Game/explosion/2.png");
		explosion2= Loader2.ImageLoader("/Game/explosion/3.png");
		explosion3= Loader2.ImageLoader("/Game/explosion/4.png");
		explosion4= Loader2.ImageLoader("/Game/explosion/5.png");
	}
	
}
