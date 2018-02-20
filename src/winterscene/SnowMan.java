/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package winterscene;

/**
 *
 * @author calvi
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SnowMan extends AbstractShape{
   public SnowMan(){
       super(0, 0, 0, 0, Color.WHITE, 0, 0);
       setXPos(700);
       setYPos(400);
   }
   public SnowMan(int x, int y, int w, int h )
   {
        super(x, y, w, h, Color.WHITE, 0, 0);
        //setXPos(700);
        //setYPos(400);
   }

   public void draw(Graphics window)
   {
      
       //getXPos() = 700;
       //getYPos() = 400;
      Graphics2D g2 = (Graphics2D)window;
      g2.setStroke(new BasicStroke(3));

        g2.setColor (new Color(210,105,30));
        g2.drawLine (getXPos()+25, getYPos()+60, getXPos()+55, getYPos()+60);
      g2.drawLine (getXPos()-25, getYPos()+60, getXPos()-55, getYPos()+60);
      
      g2.setColor (Color.white);
      g2.fillOval (getXPos()-20, getYPos(), 40, 40);      
      g2.fillOval (getXPos()-35, getYPos()+35, 70, 70);   
      g2.fillOval (getXPos()-50, getYPos()+80, 100, 100);    
        g2.setColor (Color.black);
        g2.drawArc (getXPos()-10, getYPos()+20, 20, 10, 190, 160);  
      g2.fillOval (getXPos()-10, getYPos()+10, 5, 5);  
      g2.fillOval (getXPos()+5, getYPos()+10, 5, 5);  
      g2.drawLine (getXPos()-20, getYPos()+5, getXPos()+20, getYPos()+5); 
      g2.fillRect (getXPos()-15, getYPos()-20, 30, 25);
      //add code here to make a snowman 	      	
   }
   

   public void moveAndDraw(Graphics window)
   {
      //setYPos(getYPos()-1);
      draw(window);   
   }
    
}