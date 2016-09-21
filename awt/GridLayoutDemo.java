import java.awt.*;
import java.awt.event.*;
public class GridLayoutDemo extends Frame {
	private Button b1, b2, b3, b4, b5, b6;
	
	public GridLayoutDemo() {
		setSize(600, 600);
		
		b1 = new Button("B1");
		b2 = new Button("B2");
		b3 = new Button("B3");
		b4 = new Button("B4");
		b5 = new Button("B5");
		b6 = new Button("B6");
		//result.setPreferredSize(new Dimension(150, 50));
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		
		setVisible(true);
		
		setLayout(new GridLayout(3, 3, 5, 5));
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
	}
	
	public static void main(String[] args) {
		new GridLayoutDemo();
	}
}