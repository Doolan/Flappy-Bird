/**
 * 
 */
package flappyBird;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * TODO Put here a description of what this class does.
 * 
 * @author Steven. Created Mar 6, 2014.
 */
public class GameLauncer {

	public static void launchGame(String birdType, String pipeType,
			String backgroundPath,String frameTitle) {

		// Frame setup
		JFrame frame = new JFrame(frameTitle);
		frame.setSize(Main.FRAMEWIDTH, Main.FRAMEHEIGHT);
		frame.setResizable(false);
		JLabel background = new JLabel(new ImageIcon("Graphics/"
				+ backgroundPath));
		frame.add(background, BorderLayout.CENTER);

		// Glass Pane
		GlassPane glass = new GlassPane(birdType, pipeType);
		frame.setGlassPane(glass);
		glass.setVisible(true);
		glass.refreshPaint();
		frame.setVisible(true);

		// KeyHandler
		KeyHandler keys = new KeyHandler(glass.getBird());
		frame.addKeyListener(keys);
		frame.requestFocus();

		// Thread
		Refresh runn = new Refresh(glass);
		Thread t1 = new Thread(runn);

		try {
			Thread.sleep(30);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		t1.start();
	}
}
