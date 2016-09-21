// Inner class demo.
import java.awt.*;
import java.awt.event.*;
public class InnerClassDemo extends Frame {
	Label label;
	public InnerClassDemo() {
		setSize(600, 600);
		setVisible(true);
		
		label = new Label("hello");
		
		add(label);
		
		label.addMouseListener(new MyMouseAdapter());
	}
	
	class MyMouseAdapter extends MouseAdapter {
		public void mousePressed(MouseEvent me) {
			System.out.println("Mouse Pressed");
		}
	}
	
	public static void main(String[] args) {
		new InnerClassDemo();
	}
}