import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class FontDemo {
	private JLabel jLabel;
	private Font font;
	
	public FontDemo() {
		JFrame jFrame = new JFrame();
		jFrame.setSize(600, 600);
		
		jFrame.setTitle("Hello World!");
		jFrame.setLayout(new FlowLayout());
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		font = new Font("Tempus Sans ITC", Font.PLAIN, 12);
		jLabel = new JLabel("Hello World");
		//jLabel.setPreferredSize(new Dimension(150, 50));
		jLabel.setFont(font);
		jLabel.setForeground(Color.GRAY);
		
		jFrame.add(jLabel);
		
		jFrame.pack();
		
		jFrame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new FontDemo();
		
		String FontList[];
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		FontList = ge.getAvailableFontFamilyNames();
		for(int i = 0; i < FontList.length; i++)
			System.out.println(FontList[i]);
	}
}