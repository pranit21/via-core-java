/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import static main.Main.b;
import static sun.applet.AppletResourceLoader.getImage;

/**
 *
 * @author Ehtesham Mehmood
 */
public class Ball implements Runnable{
//Global variable
    int x,y,xDirection,yDirection;
    Rectangle ball;
        Paddle p1=new Paddle(15,140,1);//paddle class objects
        Paddle p2=new Paddle(770,140,2);
        //Score
        int p1Score,p2Score;
        
//Ball Image
       
        Image BallImage;
    
    public Ball(int x,int y)
    {
        p1Score=p2Score=0;
    this.x=x;
    this.y=y;
    Random r=new Random();//creats Random numbers 
    int rDir=r.nextInt(1);
    if(rDir==0)
    {
    rDir--;
   
    }
     setXDirection (rDir);
     
       int yrDir=r.nextInt(1);
    if(yrDir==0)
    {
    yrDir--;
   
    }
     setYDirection (yrDir);
     ball=new Rectangle(this.x,this.y , 15,15);
    
    
    }
    //for set the xDirection of the ball
    public void setXDirection(int xdir)
    {
    xDirection=xdir;  
    }
     //for set the yDirection of the ball
     public void setYDirection(int ydir)
    {
    yDirection=ydir;  
    }
   public void draw(Graphics g)
   {
       java.net.URL urlBall = getClass().getResource("Ball.png"); //get ball image from the project folder
BallImage = getImage(urlBall);
 g.drawImage(BallImage, this.ball.x, this.ball.y,null); 
   }
   //Collision method
    public void collision()
   {        //for paddle 1 collision
            if(ball.intersects(p1.paddle))
            {
            setXDirection(+1);
            }
             //for paddle 2 collision
             if(ball.intersects(p2.paddle))
            {
            setXDirection(-1);
            }
    }

    //Move method
                public void move()
        {
                    collision();
               ball.x+=xDirection;
                ball.y+=yDirection;
                //Bounce the ball when edge is detected
                if(ball.x<=0)
                {
                setXDirection(+1);
                p2Score++;

                }
                  if(ball.x>=785)
                {
                setXDirection(-1);
                p1Score++;

                }
                  if(ball.y<=0)
                {
                setYDirection(+1);

                }
                  if(ball.y>=485)
                {
                setYDirection(-1);

                }

         }
                
                //Run method Thread Start from here
                    public void run()
                    {

                        try{
                            while(true)
                            {  
                            move();
                            Thread.sleep(2);
                                }
                                
                            }
                        

                            catch(Exception e)
                            {
                            System.err.println(e.getMessage());
                            } 
                    }
}
