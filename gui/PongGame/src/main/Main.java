/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static sun.applet.AppletResourceLoader.getImage;
import sun.audio.*;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.*;
/**
 *
 * @author Ehtesham Mehmood
 */
public class Main  extends JFrame{
    //Double buffer
    Image dbImage;
    Graphics dbg;
    int GWIDTH=800,GHEIGHT=500;//Size of the frame
    Dimension ScreenSize=new Dimension(GWIDTH,GHEIGHT);
  static  Ball b=new Ball(193,143); //Object of ball class
   Image BackgroundImage;//object of image class will hold the background image.
  JFrame frame;//Jfame object
  
    public Main()
    {

    setTitle("Pong Game Project-Ehtesham Mehmood");//Set the titile
    setSize(ScreenSize);//set the size
  setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
 
    this.addKeyListener(new AL());//Add KeyListener event class.
    setLocationRelativeTo(null);//set frame into the center
  
    
    }
  
    //Paint method
    @Override
    public void paint(Graphics g)
    {
        
          
        dbImage=createImage(getWidth(),getHeight());//take image width,height from the frame
        dbg=dbImage.getGraphics();//get current graphics from the frame 
        draw(dbg);
        g.drawImage(dbImage, 0, 0, this);//here draw image.
     
    }
    public void draw(Graphics g)
    {
        java.net.URL urlBackground = getClass().getResource("Background1.jpg"); //get image from the project folder
BackgroundImage = getImage(urlBackground);
 g.drawImage(BackgroundImage, 0, 0, null);//draw on the frame
    b.draw(g);//here ball will draw
    
    b.p1.draw(g);//here paddle 1 will draw
    b.p2.draw(g);//here paddle 2 will draw
    g.drawString(""+ b.p1Score, 15,50);//for scoring
        g.drawString(""+ b.p2Score, 770,50);
      
    repaint();//again paint will draw
    
    }

  
    public static void main(String[] args) {
        Main m=new Main();//object of main class
        //Create and start thread
        Thread th=new Thread(b);//creates thread for ball
        th.start();
        Thread p1=new Thread(b.p1);//threads for paddle
          Thread p2=new Thread(b.p2);
          p1.start();
          p2.start();

        
    }
    public class AL implements KeyListener
    {

     

        @Override
        //Keypressed event
        public void keyPressed(KeyEvent e) {
       
           
            
            b.p1.keyPressed(e);//for paddle 1 event
           b.p2.keyPressed(e);   //for paddle 2 event
        }
  @Override
  //Keyreleased event
        public void keyReleased(KeyEvent e) {
            b.p1.keyReleased(e);
          b.p2.keyReleased(e);
        }
      @Override
        public void keyTyped(KeyEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        }
}
