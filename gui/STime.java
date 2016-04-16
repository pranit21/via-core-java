import java.awt.*;
import java.lang.*;
import javax.swing.*;
class STime extends JFrame {
	double inc=Math.PI/30, theta=0, mtheta=0, htheta=0;
	int rad=80;
	int srad=60;
	int hrad=40;

	STime() {		
		// Terminate the program when the user closes the application.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(300,300);
		setVisible(true);
	}

	public static void main(String args[]) {
		new STime();
	}
	public void paint(Graphics g) {
		try {
			//g.setColor(Color.RED);
			//g.drawCircle(150,150,200);
			g.setColor(Color.BLUE);
			g.drawRect(60,60,180,180);
			g.fillRect(60,60,180,180);

			int h=0, r=0;
			int a=0, b=0;
			
			while(true) {
				h=(int)(150+hrad*Math.cos(htheta)) ;
				r=(int)(150+hrad*Math.sin(htheta));
				g.setColor(Color.BLACK);
				g.drawLine(150,150,h,r);
				//g.drawOval(150,150,100,100);

				int m=60;
				while(m>0) {
					g.setColor(Color.BLACK);
					g.drawLine(150,150,h,r);

					a=(int)(150+srad*Math.cos(mtheta)) ;
					b=(int)(150+srad*Math.sin(mtheta));

					g.setColor(Color.RED);
					g.drawLine(150,150,a,b);
					//g.drawOval(150,150,5,5);

					int t=60;
					while(t>0) { 
						g.setColor(Color.BLACK);
						g.drawLine(150,150,h,r);

						g.setColor(Color.RED);
						g.drawLine(150,150,a,b);

						int x=(int)(150+rad*Math.cos(theta)) ;
						int y=(int)(150+rad*Math.sin(theta));

						g.setColor(Color.GREEN);
						g.drawLine(150,150,x,y);

						//g.drawOval(150,150,5,5);
						Thread.sleep(1000);

						g.setColor(Color.BLUE);
						g.drawLine(150,150,x,y);
						t--;
						theta+=inc;
					}
					g.setColor(Color.BLUE);
					g.drawLine(150,150,a,b);

					m--;
					mtheta+=inc;
				}
				g.setColor(Color.BLUE);
				g.drawLine(150,150,h,r);

				htheta+=inc;
			}
		}catch(Exception e){}
	}
}
