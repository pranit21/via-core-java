import java.awt.*;
import java.awt.image.*;
import java.io.File;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
public class ImageAudio
{
    BufferedImage picture;
	Frame f;
	Graphics g;

    public ImageAudio()
    {
		f = new Frame();
		
		f.setSize(500, 500);
		f.setVisible(true);
		
		g = f.getGraphics();
		
		try {
			picture = ImageIO.read(new File("java-logo.jpg"));
			picture = resize(picture, 100, 100);
			g.drawImage(picture, 10, 10, null);

			AudioInputStream audioIn = AudioSystem.getAudioInputStream(ImageAudio.class.getResource("bird_caw.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioIn);
			clip.start();
		} catch(Exception e) {
			e.printStackTrace();
		}
    }
	
	public BufferedImage resize(BufferedImage img, int newW, int newH) { 
		Image tmp = img.getScaledInstance(newW, newH, Image.SCALE_SMOOTH);
		BufferedImage dimg = new BufferedImage(newW, newH, BufferedImage.TYPE_INT_ARGB);

		Graphics2D g2d = dimg.createGraphics();
		g2d.drawImage(tmp, 0, 0, null);
		g2d.dispose();

		return dimg;
	}
	
	public static void main(String[] args) {
		new ImageAudio();
	}
}