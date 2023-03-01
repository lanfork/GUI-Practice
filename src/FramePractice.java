
import java.awt.*;
import javax.swing.*;

public class FramePractice {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel firstPanel = new JPanel();
		firstPanel.setPreferredSize(new Dimension(150, 100));
		firstPanel.setBackground(Color.green);
		JLabel firstLabel = new JLabel("Kimberly");
		JLabel secondLabel = new JLabel("Lanford");
		firstPanel.add(firstLabel);
		firstPanel.add(secondLabel);
		
		JPanel primary = new JPanel();
		primary.setBackground(Color.blue);
		primary.add(firstPanel);
		
		frame.getContentPane().add(primary);
		frame.pack();
		frame.setVisible(true);
	}
	
	
}
