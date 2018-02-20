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
 * @author calvi
 */
public class Ground extends AbstractShape{
    private int cflag,ct;
    public Ground(int x, int y, int wid, int ht, Color col){
        super(x, y, wid, ht, col, 1,1);
        ct=0;
        cflag=100;
    }
    public void draw(Graphics window) {
        Graphics2D g2 = (Graphics2D)window;
        g2.setStroke(new BasicStroke(10));
        g2.setColor(getColor());
        g2.fillRect(getXPos(), getYPos(), getWidth(),getHeight());
    }

    @Override
    public void moveAndDraw(Graphics window) {
        draw(window);
        if(ct>=cflag){
        setYPos(getYPos()-1);ct=0;
        }
        ct++;
    }
}
