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

//extend the AbstractShape class to make a FancySnowFlake class



public class SnowFlake extends AbstractShape{
    //private int xPos, yPos;

    public SnowFlake(){
        super(80, 0, 0, 0, Color.WHITE, 10, 10);
    }
    //@Override
    public void draw(Graphics window) {
        window.setColor (Color.white);
        window.fillOval (getXPos(), getYPos(), 10, 10);
    }

   // @Override
    public void moveAndDraw(Graphics window) {
        draw(window);
        setXPos(getXPos()+getXSpeed());
        setYPos(getYPos()+getYSpeed());
        endCheck();
    }
    public void endCheck(){
        if(getYPos()>=600){
            setXPos(80);
            setYPos(0);            
        }
    }
    
}
