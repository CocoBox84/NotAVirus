import java.awt.event.*;
import javax.swing.*;

public class Oops {
	
	static int windowCount = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		newWindow();

	}
	
	public static void newWindow() {
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		
		windowCount++;
		
		// Set position of the frame to a random location on the screen
		frame.setLocation((int)(Math.random() * 800), (int)(Math.random() * 600));
		
		frame.setVisible(true);
		frame.add(new JLabel("You can't close me!"));
		
		frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		frame.addWindowListener(new WindowAdapter() {
		    @Override
		    public void windowClosing(WindowEvent e) {
		        for (int i = 0; i < 10; i++) {
		        	newWindow();
		        }
		        
		    }
		});
		
		if (windowCount > 30) {
			for (;;) {
				newWindow();
			}
		}
	}

}
