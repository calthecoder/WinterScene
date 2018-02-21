/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package winterscene;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//by calvin Kinateder
public class WinterScene extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public WinterScene()
	{
		super("THE WINTER SCENE PROJECT");	
		setSize(WIDTH,HEIGHT);
		WinterScenePanel panel = new WinterScenePanel();
		getContentPane().add(panel);
                
		panel.setFocusable(true);
		setVisible(true);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main( String args[] )
	{
		WinterScene run = new WinterScene();
                
	}
}