import java.awt.*;
import java.awt.event.*;
class TestFrame extends Frame
{
	TestFrame()
	{
		setSize(600,600);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
	}
	public static void main(String args[])
	{
		new TestFrame();
	}
}
