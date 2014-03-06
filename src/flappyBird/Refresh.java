package flappyBird;
/**
 * 
 */


/**
 *  
 * This class refreshes our glass pane
 * 
 * @author doolansr. Created Mar 06, 2014.
 */
public class Refresh implements Runnable {
	private GlassPane glass;

	/**
	 * Constructor for refresh
	 * 
	 * @param glass
	 */
	public Refresh(GlassPane glass) {
		this.glass = glass;
	}

	/**
	 * this class runs the refresh
	 */
	@Override
	public void run() {
		try {
			while (true) {
				this.glass.refreshPaint();

				Thread.sleep(100);
			}
		} catch (InterruptedException exception) {
			System.out.println("thread broke");
		}
	}

}
