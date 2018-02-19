/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package winterscene;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 *
 * @author calvi
 */
public class Tree extends AbstractShape{

    public Tree(int x, int y, int wid, int ht, Color col){
        super(x, y, wid, ht, col, 0,0);
    }
    public void draw(Graphics window) {
        Graphics2D g2 = (Graphics2D)window;
        
        g2.setColor(getColor());
        g2.fillRect(getXPos(), getYPos(), getWidth(), getHeight());
        g2.setColor(new Color(139,69,19));
        g2.setStroke(new BasicStroke(10));/*
        g2.drawLine(getXPos()-80, getYPos()-80,getXPos()+0, getYPos()+0);
        g2.drawLine(getXPos()+80+getWidth(), getYPos()-60,getXPos()+getWidth(), getYPos()+0);
        g2.drawLine(getXPos()+getWidth()/2, getYPos()-60,getXPos()+getWidth(), getYPos()+0);
    */
        g2.setColor(new Color(128,128,0));
        g2.fillOval(getXPos()+getWidth()/2, getYPos()-50, 150, 150);
        g2.setColor(new Color(139,100,0));
        g2.fillOval(getXPos()+getWidth()/2-75, getYPos()-125, 150, 150);
        g2.setColor(new Color(139,69,0));
        g2.fillOval(getXPos()+getWidth()/2-135, getYPos()-75, 150, 150);
        
    }

    @Override
    public void moveAndDraw(Graphics window) {
        draw(window);
    }
    
}
