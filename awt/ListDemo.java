import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.ListSelectionModel;
public class ListDemo {
	private JList jList;
	
	public ListDemo() {
		JFrame jFrame = new JFrame();
		jFrame.setSize(600, 600);
		
		jFrame.setTitle("JList Demo");
		jFrame.setLayout(new FlowLayout());
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		DefaultListModel colorsName = new DefaultListModel();

		colorsName.addElement("Red");
		colorsName.addElement("Green");
		colorsName.addElement("Blue");
		
		jList = new JList(colorsName);
		jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		jList.setSelectedIndex(0);
		jList.setVisibleRowCount(3);
		
		jFrame.add(jList, BorderLayout.WEST);
		
		jList.addListSelectionListener(new ListSelectionListener() {
			public void actionPerformed(ActionEvent ae) {
				String str = ae.getActionCommand();
				if(str.equals("Red")) {
					jFrame.setBackground(Color.RED);
				} else if(str.equals("Green")) {
					jFrame.setBackground(Color.GREEN);
				} else if(str.equals("Blue")) {
					jFrame.setBackground(Color.BLUE);
				}
			}
		});
		
		jFrame.pack();
		
		jFrame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new ListDemo();
	}
}