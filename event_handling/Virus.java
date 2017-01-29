import java.awt.Robot;
import java.awt.*;
import java.awt.event.*;
public class Virus extends Frame {
	Robot r;
	public Virus() {
        try{
            //setSize(400, 400);
            //setVisible(true);
            r=new Robot();
            r.mouseMove(10,10);
    		r.mousePress(InputEvent.BUTTON1_MASK );
            r.delay(10);
            r.mouseRelease(InputEvent.BUTTON1_MASK);

            r.mouseMove(20,145);
            r.mousePress(InputEvent.BUTTON1_MASK );
            r.delay(10);
            r.mouseRelease(InputEvent.BUTTON1_MASK);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        setSize(400, 400);
		setVisible(true);
		
		try {
			r=new Robot();
			/*while(true) {
				int x=(int)(Math.random()*1024);
				int y=(int)(Math.random()*768);
				r.mouseMove(x,y);
				r.delay(10);
			}*/
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Virus();
    }

}
