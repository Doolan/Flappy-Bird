/**
 * 
 */
package flappyBird;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * TODO Put here a description of what this class does.
 * 
 * @author Steven. Created Mar 6, 2014.
 */
public class KeyHandler implements KeyListener {
	private Bird bird;

	public KeyHandler(Bird bird) {
		this.bird = bird;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_SPACE) {
			this.bird.boost();
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.KeyListener#keyReleased(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.KeyListener#keyTyped(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

}
