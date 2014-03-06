/**
 * 
 */
package flappyBird;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * TODO Put here a description of what this class does.
 * 
 * @author Steven. Created Mar 6, 2014.
 */
public class MainMenu {

	public MainMenu() {
		JFrame frame = new JFrame("Flappy Bird--Doolan");
		JLabel background = new JLabel(
				new ImageIcon("Graphics/penguinsTri.png"));
		frame.add(background, BorderLayout.CENTER);
		frame.setResizable(false);

		// Bird Theme
		JButton bird = new JButton("Bird Version");
		BirdTheme birdTheme = new BirdTheme();
		bird.addActionListener(birdTheme);

		// Panel
		JPanel panel = new JPanel();
		panel.add(bird);
		frame.add(panel, BorderLayout.SOUTH);

		
		frame.pack();
		frame.setVisible(true);
	}

	private class BirdTheme implements ActionListener {

		/*
		 * (non-Javadoc)
		 * 
		 * @see
		 * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent
		 * )
		 */
		@Override
		public void actionPerformed(ActionEvent arg0) {
			GameLauncer.launchGame("penguins", "Pipe", "CityBackground.png",
					"Bird Version");

		}

	}
}
