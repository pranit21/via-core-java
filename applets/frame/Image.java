import java.awt.image.*;
import java.awt.*;
import javax.imageio.*;
import java.io.*;

class Image extends Frame
{	
	BufferedImage img;
	Image()
	{
		File f1=new File("wallpaper.jpg");
		try{
			img=ImageIO.read(f1);
		} catch(Exception e){ };
		
		int w=img.getWidth();
		int h=img.getHeight();

		for(int y=0;y<h;y++)
			for(int x=0;x<w;x++)
			{
				int argb=img.getRGB(x,y);
				int b=argb & 0xFF;
				int gr=(argb>>8) & 0xFF;
				int r=(argb>>16) & 0xFF;

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