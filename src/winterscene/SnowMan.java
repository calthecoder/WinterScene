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
        setXPos(700);
        setYPos(400);
   }

   public void draw(Graphics window)
   {
      
       //getXPos() = 700;
       //getYPos() = 400;
       
             
      window.setColor (Color.white);
      window.fillOval (-40, -40, 80, 80);  // sun

      window.setColor (Color.white);
      window.fillOval (getXPos()-20, getYPos(), 40, 40);      // head
      window.fillOval (getXPos()-35, getYPos()+35, 70, 70);   // upper torso
      window.fillOval (getXPos()-50, getYPos()+80, 100, 100);  // lower torso

      window.setColor (Color.black);
      window.fillOval (getXPos()-10, getYPos()+10, 5, 5);   // left eye
      window.fillOval (getXPos()+5, getYPos()+10, 5, 5);    // right eye

      window.drawArc (getXPos()-10, getYPos()+20, 20, 10, 190, 160);   // smile
        window.setColor (Color.white);
      window.drawLine (getXPos()-25, getYPos()+60, getXPos()-50, getYPos()+40);  // left arm
      window.drawLine (getXPos()+25, getYPos()+60, getXPos()+55, getYPos()+60);  // right arm

      window.drawLine (getXPos()-20, getYPos()+5, getXPos()+20, getYPos()+5);  // brim of hat
      window.fillRect (getXPos()-15, getYPos()-20, 30, 25);        // getYPos() of hat
      //add code here to make a snowman 	      	
   }
   

   public void moveAndDraw(Graphics window)
   {
      //setYPos(getYPos()-1);
      draw(window);   
   }
    
}