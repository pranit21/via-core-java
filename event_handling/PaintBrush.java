import java.awt.*;
import java.awt.event.*;
class PaintBrush extends Frame implements MouseListener, MouseMotionListener
{
	int oldx,oldy;
	PaintBrush()
	{
		setSize(600,600);
		setVisible(true);
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	public void mouseMoved(MouseEvent me)
	{
		//System.out.println("Mouse moved.");
	}
	public void mouseDragged(MouseEvent me)
	{
		Graphics g=getGraphics();
		int x=me.getX();
		int y =me.getY();
		g.setColor(Color.red);
		//g.fillOval(oldx,oldy,5,5);
		g.drawLine(oldx,oldy,x,y);
		oldx=x;
		oldy=y;
	}
	public void mouseClicked(MouseEvent me)
	{
		//System.out.println("Mouse clicked.");
	}
	public void mouseEntered(MouseEvent me)
	{
		//System.out.println("Mouse entered.");
	}
	public void mouseExited(MouseEvent me)
	{
		//System.out.println("Mouse exited.");
	}
	public void mouseReleased(MouseEvent me)
	{
		//System.out.println("Mouse released.");
	}
	public void mousePressed(MouseEvent me)
	{
		oldx=me.getX();
		oldy=me.getY();
	}
	public static void  main(String args[])
	{
		PaintBrush pb = new PaintBrush();
	}
}