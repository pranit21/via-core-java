import java.awt.image.*;
import java.awt.*;
import javax.imageio.*;
import java.io.*;

class Image extends Frame {	
	BufferedImage img;
	Image()
	{
		File f1=new File("wallpaper.jpg");
		try{
			img=ImageIO.read(f1);
		} catch(Exception e){ };
		
		int w=img.getWidth();
		int h=img.getHeight();

		int sepiaDepth = 20;
		for(int y=0;y<h;y++)
			for(int x=0;x<w;x++)
			{
				int argb=img.getRGB(x,y);
				
				Color color = new Color(argb, true);
            int r = color.getRed();
            int g = color.getGreen();
            int b = color.getBlue();
            int gry = (r + g + b) / 3;

            r = g = b = gry;
            r = r + (sepiaDepth * 2);
            g = g + sepiaDepth;

            if (r > 255) {
                r = 255;
            }
            if (g > 255) {
                g = 255;
            }
            if (b > 255) {
                b = 255;
            }

            // Darken blue color to increase sepia effect
            //b -= 60;

            // normalize if out of bounds
            if (b < 0) {
                b = 0;
            }
            if (b > 255) {
                b = 255;
            }

            color = new Color(r, g, b, color.getAlpha());
            //img.setRGB(x, y, color.getRGB());
				b=argb & 0xFF;
				int gr=(argb>>8) & 0xFF;
				r=(argb>>16) & 0xFF;

				r=255-r;
				gr=255-gr;
				b=255-b;

				argb=0xFF000000|r<<16|gr<<8|b;
				img.setRGB(x,y,argb);

			}
		setVisible(true);
		setSize(800,800);
	}

	public void paint(Graphics g)
	{
		g.drawImage(img,0,0,this);
	}

	public static void main(String args[])
	{
		new Image();
	}

}