// Demonstrate Dialog box.
import java.awt.*;
import java.awt.event.*;
class DialogDemo extends Frame implements ActionListener {
	Dialog d;
	Button b;
	DialogDemo() {
		setSize(300, 300);
		setVisible(true);
		
		setLayout(new FlowLayout());
		
		d = new Dialog(this, "My Dialog");
		d.add(new Label("Click this label"));
		d.add(b = new Button("Cancel"));
		
		d.setSize(200, 200);
		d.setVisible(true);
		
		b.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae) {
		d.dispose();
	}

	public static void main(String args[]) {
		new DialogDemo();
	}
}