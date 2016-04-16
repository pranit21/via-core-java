// Demonstrate check boxes.
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="CheckboxDemo" width=250 height=200>
</applet>
*/
public class CheckboxDemo extends Applet implements ItemListener {
	String msg = "";
	Checkbox win8, linux, solaris, mac;
	public void init() {
		win8 = new Checkbox("Windows 8", null, true);
		linux = new Checkbox("Linux");
		solaris = new Checkbox("Solaris");
		mac = new Checkbox("Mac OS");
		
		add(win8);
		add(linux);
		add(solaris);
		add(mac);
		
		win8.addItemListener(this);
		linux.addItemListener(this);
		solaris.addItemListener(this);
		mac.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie) {
		repaint();
	}
	// Display current state of the check boxes.
	public void paint(Graphics g) {
		msg = "Current state: ";
		g.drawString(msg, 6, 80);
		
		msg = " Windows 8: " + win8.getState();
		g.drawString(msg, 6, 100);
		
		msg = " Linux: " + linux.getState();
		g.drawString(msg, 6, 120);
		
		msg = " Solaris: " + solaris.getState();
		g.drawString(msg, 6, 140);
		
		msg = " Mac OS: " + mac.getState();
		g.drawString(msg, 6, 160);
	}
}