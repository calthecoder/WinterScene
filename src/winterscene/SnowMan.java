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

public class SnowMan extends AbstractShape
{
   public SnowMan(){
       super(0, 0, 0, 0, Color.WHITE, 0, 0);
   }
   public SnowMan(int x, int y, int w, int h )
   {
		super(x, y, w, h, Color.WHITE, 0, 0);
   }

   public void draw(Graphics window)
   {
       final int cent = 700;
        final int top = 400;
             
      window.setColor (Color.white);
      window.fillOval (-40, -40, 80, 80);  // sun

      window.setColor (Color.white);
      window.fillOval (cent-20, top, 40, 40);      // head
      window.fillOval (cent-35, top+35, 70, 70);   // upper torso
      window.fillOval (cent-50, top+80, 100, 100);  // lower torso

      window.setColor (Color.black);
      window.fillOval (cent-10, top+10, 5, 5);   // left eye
      window.fillOval (cent+5, top+10, 5, 5);    // right eye

      window.drawArc (cent-10, top+20, 20, 10, 190, 160);   // smile
        window.setColor (Color.white);
      window.drawLine (cent-25, top+60, cent-50, top+40);  // left arm
      window.drawLine (cent+25, top+60, cent+55, top+60);  // right arm

      window.drawLine (cent-20, top+5, cent+20, top+5);  // brim of hat
      window.fillRect (cent-15, top-20, 30, 25);        // top of hat
      //add code here to make a snowman 	      	
   }

   public void moveAndDraw(Graphics window)
   {
      draw(window);   
   }
}