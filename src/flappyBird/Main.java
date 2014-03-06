/**
 * 
 */
package flappyBird;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


/**
 * TODO Put here a description of what this class does.
 *
 * @author Steven.
 *         Created Mar 6, 2014.
 */
public class Main {
	public static int FRAMEHEIGHT = 1000;
	public static int FRAMEWIDTH = 800;
	public static int PIPEHEIGHT=40;
	/**
	 *  
	 * TODO Put here a description of what this method does.
	 *
	 * @param args
	 */
	public static void main(String[] args){
//		try {
//			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//		} catch (ClassNotFoundException | InstantiationException
//				| IllegalAccessException | UnsupportedLookAndFeelException exception) {
//			exception.printStackTrace();
//		}
		
		//Frame setup
		JFrame frame=new JFrame();
		frame.setSize(FRAMEWIDTH,FRAMEHEIGHT);
		frame.setResizable(false);
		JLabel background = new JLabel(new ImageIcon(
				"Graphics/CityBackground_skinny1.png"));
		frame.add(background, BorderLayout.CENTER);
		
		//Glass Pane
		GlassPane glass=new GlassPane();
		frame.setGlassPane(glass);
		glass.setVisible(true);
		glass.refreshPaint();
		frame.setVisible(true);
		
		//KeyHandler
		KeyHandler keys=new KeyHandler(glass.getBird());
		frame.addKeyListener(keys);
		frame.requestFocus();
		
		//Thread
		Refresh runn = new Refresh(glass);
		Thread t1 = new Thread(runn);

		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		t1.start();
		
	}
	

}
