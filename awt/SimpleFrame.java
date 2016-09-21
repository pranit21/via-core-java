import java.awt.*;
import java.awt.event.*;
/*public class SimpleFrame extends Frame {
	public SimpleFrame() {
		setSize(600, 600);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
	}
	
	public static void main(String[] args) {
		new SimpleFrame();
	}
}*/
public class SimpleFrame extends Frame {
	public SimpleFrame() {
		setSize(600, 600);
		setVisible(true);
		
		addWindowListener(new MyWindowAdapter());
	}
	
	class MyWindowAdapter extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			dispose();
		}
	}
	
	public static void main(String[] args) {
		new SimpleFrame();
	}
}