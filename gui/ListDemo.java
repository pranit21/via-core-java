import java.awt.*;
import java.awt.event.*;
class ListDemo extends Frame implements ActionListener {
	ListDemo() {
		List lst = new List(4);
		lst.add("Red");
		lst.add("Green");
		lst.add("Blue");

		add(lst, BorderLayout.WEST);
		
		setSize(600,600);
		setVisible(true);
		setTitle("List Demo");
		
		lst.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		String str=ae.getActionCommand();
		if(str.equals("Red"))
			setBackground(Color.RED);
		else if(str.equals("Green"))
			setBackground(Color.GREEN);
		else if(str.equals("Blue"))
			setBackground(Color.BLUE);
	}
	public static void main(String args[]) {
		new ListDemo();
	}
}