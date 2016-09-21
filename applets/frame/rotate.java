import java.awt.image.*;
import java.awt.*;
import javax.imageio.*;
import java.io.*;

class Rotate extends Frame implements Runnable {
	double theta = 1*(Math.PI/180);
	BufferedImage img1;

	Graphics g;
	Graphics2D g2;
	Rotate() {
		setVisible(true);
		setSize(800,800);
		g = getGraphics();
		g2 = (Graphics2D)g;
		File f1 = new File("wallpaper.png");
		
		try {
			img1 = ImageIO.read(f1);
		} catch(Exception e){ };
		
		Thread t = new Thread(this);
		t.start();
	}

	public void run() {
		System.out.println(img1.getHeight());
		System.out.println(img1.getWidth());
		for(; ; ) {
			g.drawImage(img1,356,356,null);

			g2.rotate(theta,500,500);
			try {
				Thread.sleep(10);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String args[]) {
		new Rotate();
	}
}