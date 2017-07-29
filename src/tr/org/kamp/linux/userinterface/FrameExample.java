package tr.org.kamp.linux.userinterface;

import javax.swing.JFrame;

public class FrameExample {
	
	public static void main(String[] args) {
		JPanelExample jPanel = new JPanelExample();
		
		JFrame frame = new JFrame();
		frame.setSize(640, 480);
		frame.setContentPane(jPanel);
		frame.setLocation(500, 500);
		frame.setResizable(true);
		frame.setTitle("Java Rocks!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		jPanel.repaint();
	}

}
