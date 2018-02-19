/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package winterscene;

import java.awt.event.KeyListener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author calvi
 */
public class SManMover implements KeyListener{

    public SManMover(){
        
    }
    public void keyTyped(KeyEvent ke) {
        
    }

    
    public void keyPressed(KeyEvent key) {
        if (key.getKeyCode() == key.VK_DOWN){
            System.out.println("fas");
        }
    }

    
    public void keyReleased(KeyEvent ke) {
        
    }
    
}
