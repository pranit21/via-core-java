import java.awt.*;
import java.awt.event.*;
public class SimpleFrame {
	Frame f;
	public SimpleFrame() {
		f = new Frame();
		f.setSize(600, 600);
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
	}
	
	public static void main(String[] args) {
		new SimpleFrame();
	}
}
/*public class SimpleFrame extends Frame {
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
}*/
/*public class SimpleFrame extends Frame implements WindowListener {
	public SimpleFrame() {
		setSize(600, 600);
		setVisible(true);
		
		addWindowListener(this);
	}
	
	public void windowClosing(WindowEvent e) {
		dispose();
	}
	
	public void windowDeactivated(WindowEvent e) {
		
	}
	
	public void windowActivated(WindowEvent e) {
		
	}
	
	public void windowDeiconified(WindowEvent e) {
		
	}
	
	public void windowIconified(WindowEvent e) {
		
	}
	
	public void windowClosed(WindowEvent e) {
		
	}
	
	public void windowOpened(WindowEvent e) {
		
	}
	
	public static void main(String[] args) {
		new SimpleFrame();
	}
}*/