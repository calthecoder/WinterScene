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

/**
 *
 * @author calvin Kinateder
 */
public class Mountains extends AbstractShape{
    
    public Mountains(int x, int y, int wid, int ht, Color col){
        super(x, y, wid, ht, col, 1,1);
    }
    public void draw(Graphics window) {
        int x, y;
        x = getXPos();
        y=getYPos();
        int[] xs = new int[]{x,x+65,x+150};
        int[] ys = new int[]{y,y-60,y};
        Graphics2D g2 = (Graphics2D)window;
        g2.setStroke(new BasicStroke(3));
        g2.setColor(getColor());
        //g2.fillRect(getXPos(), getYPos(), getWidth(),getHeight());
        g2.fillPolygon(xs,ys,3);
    }

    @Override
    public void moveAndDraw(Graphics window) {
        draw(window);
    }
    
}
