// Demonstrate check box group.
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="CBGroup" width=250 height=200>
</applet>
*/
public class CBGroup extends Applet implements ItemListener {
	String msg = "";
	Checkbox male, female, other;
	CheckboxGroup cbg;
	public void init() {
		cbg = new CheckboxGroup();
		male = new Checkbox("Male", cbg, true);
		female = new Checkbox("Female", cbg, false);
		other = new Checkbox("Other", cbg, false);
		
		add(male);
		add(female);
		add(other);
		
		male.addItemListener(this);
		female.addItemListener(this);
		other.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie) {
		repaint();
	}
	// Display current state of the check boxes.
	public void paint(Graphics g) {
		msg = "Current selection: ";
		msg += cbg.getSelectedCheckbox().getLabel();
		g.drawString(msg, 6, 100);
	}
}