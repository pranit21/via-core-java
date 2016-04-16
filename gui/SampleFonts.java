// Show fonts.
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="SampleFonts" width=200 height=100>
</applet>
*/
public class SampleFonts extends Applet {
	int next = 0;
	Font f;
	String msg;
	
	/*Font f = g.getFont();
	String fontName = f.getName();
	String fontFamily = f.getFamily();
	int fontSize = f.getSize();
	int fontStyle = f.getStyle();*/
	
	/*
	FontMetrics fm = g.getFontMetrics();
	curY += fm.getHeight();
	curX = 0;
	*/
	public void init() {
		f = new Font("Dialog", Font.PLAIN, 12); // Monospaced, Serif, SansSerif
		msg = "Dialog";
		setFont(f);
	}
	public void paint(Graphics g) {
		g.drawString(msg, 4, 20);
	}
}