// Using the Status Window.
import java.awt.*;
import java.applet.*;
/*
<applet code="StatusWindow" width=300 height=50>
</applet>

< APPLET
[CODEBASE = codebaseURL]
CODE = appletFile
[ALT = alternateText]
[NAME = appletInstanceName]
WIDTH = pixels HEIGHT = pixels
[ALIGN = alignment]
[VSPACE = pixels] [HSPACE = pixels]
>
[< PARAM NAME = AttributeName VALUE = AttributeValue>]
[< PARAM NAME = AttributeName2 VALUE = AttributeValue>]
. . .
[HTML Displayed in the absence of Java]
</APPLET>

*/
public class StatusWindow extends Applet{
	public void init() {
		setBackground(Color.cyan);
	}
	// Display msg in applet window.
	public void paint(Graphics g) {
		g.drawString("This is in the applet window.", 10, 20);
		showStatus("This is shown in the status window.");
	}
}