import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Applet1 extends Applet{
    Applet other;
    @Override
    public void init() {
		AppletContext ac=getAppletContext();
		other = ac.getApplet("Applet2");
		Button b= new Button("Click");
		add(b);
		b.addActionListener(new ActionListener() {              //Anonymous Inner Class
			public void actionPerformed(ActionEvent e) {
				int r = (int)(Math.random() * 255);
				int g = (int)(Math.random() * 255);
				int bl = (int)(Math.random() * 255);
				Color c = new Color(r,g,bl);
				other.setBackground(c);
			}
        });
    }
}
