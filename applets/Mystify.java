import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import javax.swing.JFrame;
public class Mystify extends Frame implements Runnable {

    MyPoint p[];

    public Mystify() {
        p = new MyPoint[4];
        for (int i = 0; i < p.length; i++)
            p[i]=new MyPoint();
        for (int i = 0; i < p.length; i++) {
            p[i].x = (int) (Math.random() * 600);
            p[i].y = (int) (Math.random() * 600);

        }
        setSize(600, 600);
        setVisible(true);
       
        
        Thread t = new Thread(this);
        t.start();
    }

    public void run() {
        Graphics g = getGraphics();
        while (true) {
            for (int i = 0; i < p.length; i++) {
                move(p[i]);
            }

            g.setColor(Color.red);
            draw(g);
            try {
                Thread.sleep(10);
            } catch (Exception ex) {
            }
            g.setColor(Color.white);
            draw(g);
        }
    }

    void draw(Graphics g) {
        for (int i = 0; i < p.length - 1; i++) {
            g.drawLine(p[i].x, p[i].y, p[i + 1].x, p[i + 1].y);

        }
        g.drawLine(p[3].x, p[3].y, p[0].x, p[0].y);
    }

    void move(MyPoint p) {
        p.x = p.x + p.dx;
        p.y = p.y + p.dy;
        if (p.x >= 600 || p.x <= 0) {
            p.dx = -p.dx;
        }
        if (p.y >= 600 || p.y <= 0) {
            p.dy = -p.dy;
        }
    }

    public static void main(String[] args) {
        Mystify m = new Mystify();
    }
}
