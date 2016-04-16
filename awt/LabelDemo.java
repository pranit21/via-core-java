import java.awt.*;
import java.awt.event.*;
public class LabelDemo extends Frame {
	private Label one, two, three;
	
	public LabelDemo() {
		setSize(600, 600);
		
		one = new Label("One");
		two = new Label("Two");
		three = new Label("Three");
		
		add(one);
		add(two);
		add(three);
		
		setLayout(new FlowLayout());
		
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
	}
	
	public static void main(String[] args) {
		new LabelDemo();
	}
}