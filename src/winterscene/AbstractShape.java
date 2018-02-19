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
import java.awt.Graphics2D;

public abstract class AbstractShape
{
   //instance variables
	private int xPos;
	private int yPos;

	private int width;
	private int height;

	private Color color;

	private double xSpeed;
	private double ySpeed;

   public AbstractShape(int x, int y, int wid, int ht)
   {
		xPos = x;
		yPos = y;
		width = wid;
		height = ht;
		color = Color.WHITE;
		xSpeed = 0;
		ySpeed= 0;
   }
   
   public AbstractShape(int x, int y, int wid, int ht, Color col)
   {
		xPos = x;
		yPos = y;
		width = wid;
		height = ht;
		color = col;
		xSpeed = 0;
		ySpeed= 0;
   }   
   
   public AbstractShape(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {
		xPos = x;
		yPos = y;
		width = wid;
		height = ht;
		color = col;
		xSpeed = xSpd;
		ySpeed= ySpd;
   }  
  
   //add in set and get methods for pos and speed
   public void setXPos( int xp)
   {
   	xPos = xp;
   }
   
   public void setYPos( int yp)
   {
   	yPos = yp;
   }
   
   public void setXSpeed( double xs)
   {
   	xSpeed = xs;
   }
   
   public void setYSpeed(double ys)
   {
   	ySpeed = ys;
   }
   
   public double getYSpeed()
   {
   	return ySpeed;
   }
   
   public double getXSpeed()
   {
   	return xSpeed;
   }
   
   public int getXPos()
   {
   	return xPos;
   }
   
   public int getYPos()
   {
   	return yPos;
   }
   
   public Color getColor()
   {
   	return color;
   }
   
   public int getWidth()
   {
   	return width;
   }
   
   public int getHeight()
   {
   	return height;
   }

   public abstract void draw(Graphics window);

   public abstract void moveAndDraw(Graphics window);

   public String toString()
   {
   	return xPos+" "+yPos+" "+width+" "+height+" "+color+" "+xSpeed+" "+ySpeed;
   }
}