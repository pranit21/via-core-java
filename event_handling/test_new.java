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
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.KeyEvent;
 
/**
 * This class demonstrates how to load an Image from an external file
 */
public class test_new 
{
    Robot r;
	Frame frame;
	int w,h;
	Graphics g;
	Cursor hammer, hammer_pressed;
	Toolkit toolkit;
	Image img;
	int mouseX, mouseY;
    BufferedImage picture;
	JPanel jp;
	JButton btn;
	
    public test_new()
	{
		try
		{
			r = new Robot();
			
			btn=new JButton("Click");
			
			toolkit = Toolkit.getDefaultToolkit();
			Dimension d = toolkit.getScreenSize();
			w = (int) d.getWidth();
			h = (int) d.getHeight();
			System.out.println(w+":"+h);
			
			Image image = toolkit.getImage("hammer.png");
			hammer = toolkit.createCustomCursor(image, new Point(0, 0), "hammer");
			image = toolkit.getImage("hammer-press.png");
			hammer_pressed = toolkit.createCustomCursor(image, new Point(0, 0), "hammer_pressed");
			
			picture = ImageIO.read(new File("screen-crash-1.png"));
				
			frame = new Frame();
			frame.setSize(w,h);
			frame.setLocation(0,0);
			frame.setCursor(hammer);
			frame.setUndecorated(true);
			frame.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.1f));
			
			jp = new JPanel();
			jp.add(btn);
			jp.setOpaque(false);
			jp.setLayout(new GridBagLayout());
			
			frame.add(jp);
			frame.setVisible(true);
			
			frame.addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent me) 
				{
					frame.setCursor(hammer_pressed);
					mouseX = me.getX();
					mouseY = me.getY();
					System.out.println(mouseX + ":" + mouseY);
					g = jp.getGraphics();
					g.drawImage(picture, mouseX-40, mouseY-26, 100, 100, null);
				}
				
				public void mouseReleased(MouseEvent me)
				{
					frame.setCursor(hammer);
				}
			});
		}
		
		catch(Exception e) 
		{
			e.printStackTrace();
		}
    }
 
    public static void main(String[] args) 
	{ 
	
        new test_new();
    }
}