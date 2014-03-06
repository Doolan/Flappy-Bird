/**
 * 
 */
package flappyBird;

//import java.awt.BorderLayout;
//
//import javax.swing.ImageIcon;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.UIManager;
//import javax.swing.UnsupportedLookAndFeelException;


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
		GameLauncer game=new GameLauncer();
		game.launchGame();
		
	}
	

}
