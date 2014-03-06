/**
 * 
 */
package flappyBird;

import java.awt.Graphics2D;

/**
 * TODO Put here a description of what this class does.
 * 
 * @author Steven. Created Mar 6, 2014.
 */
public class Bird {
	private boolean sprite;
	private int velocity;
	private double y;
	private double angle;
	private String spritePath;
	private int count;
	private double accl=-14.5;

	public Bird(String path) {
		this.y = Main.FRAMEWIDTH / 2;
		this.velocity = 0;
		this.angle = 0;
		this.spritePath=path;
//		this.spritePath = "penguins";

	}
	private void calculateY(){
	this.velocity+=this.accl;
	this.y-=0.1*this.velocity;
	if(this.angle<Math.PI/3){
		this.angle+=Math.PI/50;
	}
	}
	public void boost() {
		this.velocity=170;
		this.angle=-Math.PI/3;
	}
	public double getY(){
		return this.y;
	}

	public void draw(Graphics2D g2) {
		this.calculateY();
		if (this.sprite) {
			ImageRendering.drawImage(g2, "Graphics/" + this.spritePath
					+ "T.png", Main.FRAMEWIDTH / 2, this.y, this.angle);
			this.count++;
			if (this.count > 4) {
				this.sprite = false;
				this.count = 0;
			}
		} else {
			ImageRendering.drawImage(g2, "Graphics/" + this.spritePath
					+ "D.png", Main.FRAMEWIDTH / 2, this.y, this.angle);
			this.count++;
			if (this.count > 4) {
				this.sprite = true;
				this.count = 0;
			}
		}
	}

}
