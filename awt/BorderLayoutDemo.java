import java.awt.*;
import java.awt.event.*;
public class BorderLayoutDemo extends Frame implements ActionListener {
	private Button yes, no, maybe;
	private Label result;
	private String msg = "";
	
	public BorderLayoutDemo() {
		setSize(600, 600);
		
		yes = new Button("Yes");
		no = new Button("No");
		maybe = new Button("Maybe");
		result = new Label("Hello");
		//result.setPreferredSize(new Dimension(150, 50));
		
		add(yes, BorderLayout.NORTH);
		add(no, BorderLayout.SOUTH);
		add(maybe, BorderLayout.EAST);
		add(result, BorderLayout.WEST);
		
		yes.addActionListener(this);
		no.addActionListener(this);
		maybe.addActionListener(this);
		
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
	}
	
	public void actionPerformed(ActionEvent ae) {
		String str = ae.getActionCommand();
		if(str.equals("Yes")) {
			msg = "You presses Yes.";
		} else if(str.equals("No")) {
			msg = "You presses No.";
		} else if(str.equals("Maybe")) {
			msg = "You presses Maybe.";
		}
		result.setText(msg);
	}
	
	public static void main(String[] args) {
		new BorderLayoutDemo();
	}
}