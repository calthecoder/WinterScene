/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package winterscene;

/**
 *
 * @author calvin Kinateder
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.Random;

//extend the AbstractShape class to make a FancySnowFlake class



public class SnowFlake extends AbstractShape{
    //private int xPos, yPos;
    private Random rand = new Random();
    private double oldxspd,wspd,step;
    
    public boolean wflag = false;
    public SnowFlake(int x, int y, int wid, int ht, Color col, int xsp, int ysp){
        super(x, y, wid, ht, col, xsp, ysp);
        step=.03;
        oldxspd=getXSpeed();
    }
    
    //@Override
    public void draw(Graphics window) {
        window.setColor (getColor());
        window.fillOval (getXPos(), getYPos(), getWidth(), getHeight());
    }
    public void accDraw(Graphics window, int x, int y){
        window.setColor (Color.white);
        window.fillOval (x, y, 10, 10);
    }
   // @Override
    public void moveAndDraw(Graphics window) {
        draw(window);
        int x = (int) getXSpeed();
        int y = (int) getYSpeed();
        setXPos(getXPos()+x);
        setYPos(getYPos()+y);
        //endCheck(window);
    }
    public void endCheck(Graphics window){
        if(getYPos()>=600||getXPos()>=800){
            //and accumulate
            
            boolean tf = rand.nextBoolean();
            if(tf==true){
                 setYPos(rand.nextInt(700));
              setXPos(0); 
            }
            else{
               setXPos(rand.nextInt(700));
              setYPos(0);  
            }         
        }
    }
    public void wind(Graphics window){
        setXSpeed(getXSpeed()+step);
        wspd = getXSpeed();
    }
    public void stopWind(Graphics window){
       // while(getXSpeed()>oldxspd){
            setXSpeed(getXSpeed()-step*3);
            wspd=getXSpeed();
          //  System.out.println("XSPd in sf"+getXSpeed());
            if(getXSpeed()<0){
                wspd=0;
                wflag=false;
                //System.out.println("LESS THAN O");
            }
       // }
    }
    public double getOldXSpd(){
        return oldxspd;
    }
    public double getWspd(){
        return wspd;
    }
}
