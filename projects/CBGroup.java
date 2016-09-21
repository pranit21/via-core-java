// Demonstrate check box group.
import java.awt.*;
import java.awt.event.*;
public class CBGroup extends Frame implements ItemListener {
	String msg = "";
	Checkbox male, female, other;
	CheckboxGroup cbg;
	Label lbl;
	Panel panel;
	
	public CBGroup() {
		panel = new Panel();
		panel.setLayout(null);
		
		cbg = new CheckboxGroup();
		male = new Checkbox("Male", cbg, true);
		female = new Checkbox("Female", cbg, false);
		other = new Checkbox("Other", cbg, false);
		
		lbl = new Label("");
		
		panel.add(male);
		panel.add(female);
		panel.add(other);
		
		panel.add(lbl);
		
		Insets insets = panel.getInsets();
		Dimension size = male.getPreferredSize();
		male.setBounds(25 + insets.left, 5 + insets.top, size.width + 50, size.height + 20);
		size = female.getPreferredSize();
		female.setBounds(25 + insets.left, 40 + insets.top, size.width + 50, size.height + 20);
		size = other.getPreferredSize();
		other.setBounds(150 + insets.left, 5 + insets.top, size.width + 50, size.height + 20);
		
		size = lbl.getPreferredSize();
		lbl.setBounds(150 + insets.left, 40 + insets.top, size.width + 150, size.height + 20);
		
		add(panel);
		
		male.addItemListener(this);
		female.addItemListener(this);
		other.addItemListener(this);
		
		setSize(300 + insets.left + insets.right, 125 + insets.top + insets.bottom);
		setVisible(true);
	}
	
	public void itemStateChanged(ItemEvent ie) {
		msg = "Current selection: ";
		msg += cbg.getSelectedCheckbox().getLabel();
		lbl.setText(msg);
	}
	
	public static void main(String[] args) {
		new CBGroup();
	}
}