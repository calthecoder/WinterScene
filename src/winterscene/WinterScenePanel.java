/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package winterscene;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.Font;
import java.awt.RenderingHints;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

public class WinterScenePanel extends JPanel implements Runnable
{
	private AbstractShape[] shapes; 	
	private AbstractShape sMan;
        private AbstractShape[] flakes;
        private AbstractShape tree,ground;
        private Color backg = new Color(0, 00, 100); // Color white
        private Color tq = new Color(205,133,63);//tree color
        private Random rand = new Random();
        private ArrayList<AbstractShape> acu = new ArrayList<AbstractShape>();
	public WinterScenePanel()
	{
            setVisible(true);

            //instantiate the array to hold 50 AbstractShape references
            //populate the array with 50 unique snowflakes
            flakes = new SnowFlake[150];
            for(int i = 0; i < flakes.length; i++){
                int size =rand.nextInt(8)+1;
                flakes[i]=new SnowFlake(rand.nextInt(700),
                0,
                size,
                size,
                Color.white,
                rand.nextInt(20)+1,
                rand.nextInt(20)+1);

            }
            
            //instantiate a snowman                
            sMan = new SnowMan(700,370,50,50);
            tree = new Tree(150,300,50,300,tq);
            ground = new Ground(00,540,800,8000,Color.white);
            //smm = new SManMover();
            //smm.setFocusable(true);
            new Thread(this).start();
	}
	
	public void update(Graphics window)   
	{
		paint(window);	
	}

	public void paint(Graphics window)
	{
            window.setColor(backg);
            window.fillRect(0,0,getWidth(), getHeight());
            Graphics2D g2 = (Graphics2D)window;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, 
                RenderingHints.VALUE_ANTIALIAS_ON); //anything that uses g2 will
            //be antialiased!!
            tree.moveAndDraw(window); 
            //boolean tf = rand.nextBoolean();//random front/back
            
              sMan.moveAndDraw(window);
                for(int i = 0; i < flakes.length; i++){
                flakes[i].moveAndDraw(window);
                ((SnowFlake)flakes[i]).endCheck(window);
                }           
           // tree.moveAndDraw(window);   
           
            
            ground.moveAndDraw(window);
            //make the snowman appear
            //make the snowflakes appear and move down the screen
            
		//check to see if any of the snowflakes need to be reset to the top of the screen
	}
	
   public void run()
   {
   	try
   	{
            while(true)
            {
               Thread.currentThread().sleep(35);
        repaint();
        revalidate();
         }
      }catch(Exception e)
      {
      }
  	}	

    
    
}