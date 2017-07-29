package tr.org.kamp.linux.userinterface;

import javax.swing.JFrame;

public class FramePaintExample {

	public static void main(String[] args) {
		System.out.println("Program basladi");
		PaintPanel panel = new PaintPanel();
		System.out.println("Panel yaratildi");
		
		JFrame frame = new JFrame();
		frame.setTitle("Paint Example");
		frame.setContentPane(panel);
		frame.setSize(640,480);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
}
