import java.awt.*;
import java.awt.event.*;
public class ButtonDemo1 extends Frame {
	private Button yes, no, maybe;
	private Label result;
	private String msg = "";
	
	public ButtonDemo1() {
		setSize(600, 600);
		
		yes = new Button("Yes");
		no = new Button("No");
		maybe = new Button("Maybe");
		result = new Label("Hello");
		result.setPreferredSize(new Dimension(150, 50));
		
		add(yes);
		add(no);
		add(maybe);
		add(result);
		
		yes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				msg = "You presses Yes.";
				result.setText(msg);
			}
		});
		no.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				msg = "You presses No.";
				result.setText(msg);
			}
		});
		maybe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				msg = "You presses Maybe.";
				result.setText(msg);
			}
		});
		
		setLayout(new FlowLayout());
		
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
	}
	
	public static void main(String[] args) {
		new ButtonDemo1();
	}
}