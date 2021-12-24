import java.awt.image.BufferedImage;

public class Assets2 {
	
	public static BufferedImage player;
	public static BufferedImage meteoro;
	public static BufferedImage meteoro2;
	public static BufferedImage meteoro3;
	public static BufferedImage explosion1;
        public static BufferedImage explosion2;
        public static BufferedImage explosion3;
        public static BufferedImage explosion4;

	public static void init()
	{
		player = Loader2.ImageLoader("/ships/Player.png");
		meteoro= Loader2.ImageLoader("/Game/meteors/med2.png");
		meteoro2= Loader2.ImageLoader("/Game/meteors/small1.png");
		meteoro3= Loader2.ImageLoader("/Game/meteors/big4.png");
		explosion1= Loader2.ImageLoader("/Game/explosion/2.png");
                explosion2= Loader2.ImageLoader("/Game/explosion/3.png");
                explosion3= Loader2.ImageLoader("/Game/explosion/4.png");
                explosion4= Loader2.ImageLoader("/Game/explosion/5.png");

	}
	
}
