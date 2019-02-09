package Java_Calculator;

import javax.swing.JFrame;

public class Run {
	public static void main(String[] args) {
				JFrame frame = new JFrame();
				frame.add(new GUI());
				frame.setSize(300,400);
				frame.setLocationRelativeTo(null);			// initialize window to center of screen
				frame.setVisible(true);
	}

}
