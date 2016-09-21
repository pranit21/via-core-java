import java.io.*;
import java.awt.*;
class BouncingBall extends Thread {
	Graphics g;
	int x,y,dx=1,dy=1;
	BouncingBall(Graphics g) {
		this.g=g;
		x=(int)(Math.random()*600);
		y=(int)(Math.random()*600);
		start();
	}
	public void run() {
		for(; ;) {
			g.setColor(Color.RED);
			g.fillOval(x,y,20,20);
			try {
				Thread.sleep(10);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			g.setColor(Color.WHITE);
			g.fillOval(x,y,20,20);
			x=x+dx;
			y=y+dy;
			if(x>580||x<0)
				dx=-dx;
			if(y>580||y<40)
				dy=-dy;
		}
	}
}
class BouncingBallDemo extends Frame {
	BouncingBallDemo() {
		setSize(600,600);
		setVisible(true);
		BouncingBall b[]=new BouncingBall[10];
		for(int i=0;i<10;i++)
			b[i]=new BouncingBall(getGraphics());
	} 
	public static void main(String rags[]) {
		new BouncingBallDemo();
	}
}  
