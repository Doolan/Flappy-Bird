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
//	private String birdPath;
	final private String PIPEPATH;
	private int x1 = 930;
	private int x2 = 1480;
	private Pipes pipeA;
	private Pipes pipeB;
	private Bird bird;
	private boolean dead;

	/**
	 * 
	 * TODO Put here a description of what this constructor does.
	 * @param birdPath 
	 * @param pipePath 
	 * 
	 */
	public GlassPane(String birdPath, String pipePath) {
		this.bird = new Bird(birdPath);
//		this.birdPath=birdPath;
		this.PIPEPATH=pipePath;
		this.pipeA = new Pipes(this.x1,this.PIPEPATH);
		this.pipeB = new Pipes(this.x2,this.PIPEPATH);
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
		if(!(pipe.max()>this.bird.getY() )|| !(pipe.min()<this.bird.getY())){
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
				this.pipeA = new Pipes(this.x1,this.PIPEPATH);
			}
			if (this.x1 < -151) {
				this.x1 = 930;
				this.pipeA = new Pipes(this.x1,this.PIPEPATH);
			}
			this.x1 -= 4;
			this.x2 -= 4;
			// draws the pipe
			this.pipeA.draw(g2, this.x1);
			this.pipeB.draw(g2, this.x2);
			// bird
			this.bird.draw(g2);
			// Checks if dead
			if(Math.abs(Main.FRAMEWIDTH/2-(this.x1-50))<50){
				this.checkDead(this.pipeA);
			}
			if(Math.abs(Main.FRAMEWIDTH/2-(this.x2-50))<50){
				this.checkDead(this.pipeB);
			}
		} else {
			//death Screen
			ImageRendering.drawImage(g2, "Graphics/gameOver.png", 400, 450, 0);
		}
	}

}
