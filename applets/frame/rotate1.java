import java.awt.*;
import java.util.*;
import javax.imageio.*;
import java.io.*;
import java.awt.image.*;

class rotate1 extends Frame implements Runnable
{
    BufferedImage img;
    int x=400,y=400;
    double theta,incr=0.5*Math.PI/180;


    rotate1()
    {
        setSize(800,800);
        
     try
     {
         File f=new File("logo.png");
         img=ImageIO.read(f);
     }

     catch(Exception e)
     {

     }

        setVisible(true);
        Thread t=new Thread(this);
         t.start();
    }

    public void run()
    {
        repaint();
    }

    public void paint(Graphics g)
    {
        Graphics2D g2= (Graphics2D)g;
        while(true)
        {


        g.drawImage(img,x,y,200,200,null);


        g2.rotate(theta,500,500);
        try
        {
            Thread.sleep(100);
        }
        catch(Exception e){}
        theta+=incr;
        }



    }
    public static void main(String a[])
    {
        new rotate1();

    }



}
