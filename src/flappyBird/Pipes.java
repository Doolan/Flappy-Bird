/**
 * 
 */
package flappyBird;

import java.awt.Graphics2D;
import java.util.Random;

import javax.swing.JComponent;

/**
 * TODO Put here a description of what this class does.
 * 
 * @author Steven. Created Mar 6, 2014.
 */
public class Pipes {
	private int opening;
	private int x;
	private int numberOFparts;
	private String path;

	Pipes(int x, String path) {
		this.x = x;
		Random generator = new Random();
		this.path=path;
		this.numberOFparts = Main.FRAMEHEIGHT / Main.PIPEHEIGHT;
		this.opening = generator.nextInt(this.numberOFparts - 13) + 2;

	}
	public int max(){
		return (this.opening+5)*Main.PIPEHEIGHT;
	}
	public int min(){
		return (int) ((this.opening+.5)*Main.PIPEHEIGHT);
	}
	public void draw(Graphics2D g2,int x) {
		this.x=x;
		for (int i = 0; i < this.opening; i++) {
			ImageRendering.drawImage(g2, "Graphics/"+this.path+"Bottom.png", this.x, i
					* Main.PIPEHEIGHT, 0);
		}
		ImageRendering.drawImage(g2, "Graphics/"+this.path+"Top.png", this.x,
				(this.opening ) * Main.PIPEHEIGHT, Math.PI);
		ImageRendering.drawImage(g2, "Graphics/"+this.path+"Top.png", this.x,
				(this.opening + 5) * Main.PIPEHEIGHT, 0);
		
		for (int i = this.opening+6; i <this.numberOFparts; i++) {
			ImageRendering.drawImage(g2, "Graphics/"+this.path+"Bottom.png", this.x, i
					* Main.PIPEHEIGHT, 0);
		}
	}
}
