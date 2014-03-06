/**
 * 
 */
package flappyBird;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

/**
 * TODO Put here a description of what this class does.
 * 
 * @author Steven. Created Mar 6, 2014.
 */
public class GlassPane extends JComponent {
	private int x1 = 930;
	private int x2 = 1480;
	private Pipes pipeA = new Pipes(this.x1);
	private Pipes pipeB = new Pipes(this.x2);
	private Bird bird;
	private boolean dead;

	/**
	 * 
	 * TODO Put here a description of what this constructor does.
	 * 
	 */
	public GlassPane() {
		this.bird = new Bird();

	}

	/**
	 * TODO Put here a description of what this method does.
	 * 
	 */
	public void refreshPaint() {
		// this.paintComponent()
		this.repaint();
	}

	public Bird getBird() {
		return this.bird;
	}
	public void checkDead(Pipes pipe){
		if(!(pipe.max()>bird.getY() )|| !(pipe.min()<bird.getY())){
			this.dead=true;
		}
	}
	@Override
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		if (!this.dead) {
			// Updates the x value of the pipe
			if (this.x1 < -151) {
				this.x1 = 930;
				this.pipeA = new Pipes(this.x1);
			}
			if (this.x1 < -151) {
				this.x1 = 930;
				this.pipeA = new Pipes(this.x1);
			}
			this.x1 -= 4;
			this.x2 -= 4;
			// draws the pipe
			this.pipeA.draw(g2, this.x1);
			this.pipeB.draw(g2, this.x2);
			// bird
			this.bird.draw(g2);
			// Checks if dead
			if(Math.abs(Main.FRAMEWIDTH/2-(x1-50))<50){
				this.checkDead(pipeA);
			}
			if(Math.abs(Main.FRAMEWIDTH/2-(x2-50))<50){
				this.checkDead(pipeB);
			}
		} else {
			//death Screen
			ImageRendering.drawImage(g2, "Graphics/gameOver.png", 400, 450, 0);
		}
	}

}
