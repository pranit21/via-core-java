// Anonymous inner class demo.
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class AnonymousInnerClassDemo extends Frame {
	public AnonymousInnerClassDemo() {
		setSize(600, 600);
		setVisible(true);
		
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent me) {
				System.out.println("Mouse Pressed");
			}
		});
	}
	
	public static void main(String[] args) {
		new AnonymousInnerClassDemo();
	}
}