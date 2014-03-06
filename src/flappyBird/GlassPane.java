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
	private int x3 = 180;
	private Pipes pipeA = new Pipes(this.x1);
	private Pipes pipeB = new Pipes(this.x2);
	private Pipes pipeC = new Pipes(this.x3);

	/**
	 * 
	 * TODO Put here a description of what this constructor does.
	 * 
	 */
	public GlassPane() {

	}

	/**
	 * TODO Put here a description of what this method does.
	 * 
	 */
	public void refreshPaint() {
		// this.paintComponent()
		this.repaint();
	}

	@Override
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		// this.g2=g2;

		if (this.x1 < -151) {
			this.x1 = 930;
			this.pipeA = new Pipes(this.x1);
		}
		if (this.x1 < -151) {
			this.x1 = 930;
			this.pipeA = new Pipes(this.x1);
		}
		if (this.x3 < -151) {
			this.x3 = 930;
			this.pipeC = new Pipes(this.x3);
		}
		this.x1 -= 5;
		this.x2 -= 5;
		this.x3 -= 5;
//		System.out.println(x1 + "__" + x2 + "___" + x3);

		this.pipeA.draw(g2, this.x1);
		 this.pipeB.draw(g2, this.x2);
//		 this.pipeC.draw(g2, this.x3);

		// ImageRendering.drawImage(g2,"Graphics/PipeTop.png",50,120,Math.PI);

	}

}
