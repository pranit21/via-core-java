import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.Frame;
import java.awt.image.BufferedImage;

public class Zoom extends Frame implements Runnable {
	Robot r;
	Window wnd;
	int w,h;
	public Zoom() {
		try {
			r = new Robot();
			Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
			w=(int) d.getWidth();
			h=(int) d.getHeight();
			System.out.println(w+":"+h);
			wnd =new Window(this);

			wnd.setSize(400,400);
			wnd.setLocation(0,0);
			wnd.setVisible(true);
		} catch(Exception e) {
			e.printStackTrace();
		}
		Thread t= new Thread(this);
		t.start();
	}

	public void run() {
		while(true) {
			PointerInfo pi=MouseInfo.getPointerInfo();
			Point p=pi.getLocation();
			int x=(int) p.getX();
			int y=(int) p.getY();

			Graphics g=wnd.getGraphics();
			Rectangle rect = new Rectangle(x,y,150,150);
			BufferedImage img=r.createScreenCapture(rect);
			g.drawImage(img,0,0,500,500,this);
		}
	}
	public static void main(String[] args) {
		new Zoom();
	}
}