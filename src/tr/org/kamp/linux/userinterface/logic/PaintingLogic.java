package tr.org.kamp.linux.userinterface.logic;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JFrame;

import tr.org.kamp.linux.userinterface.model.AbstractShape;
import tr.org.kamp.linux.userinterface.model.Box;
import tr.org.kamp.linux.userinterface.model.Circle;
import tr.org.kamp.linux.userinterface.model.SimpleRectangle;
import tr.org.kamp.linux.userinterface.painting.PaintPanel;

public class PaintingLogic {

	private ArrayList<AbstractShape> shapes;
	private Box box;
	private Circle circle;
	private SimpleRectangle simpleRectangle;
	private PaintPanel panel;

	public PaintingLogic() {
		box = new Box(0, 0, 100, 100, Color.BLACK);
		circle = new Circle(0, 0, 100, Color.GREEN);
		simpleRectangle = new SimpleRectangle(200, 200, 350, 60, Color.BLUE);

		shapes = new ArrayList<AbstractShape>();
		shapes.add(box);
		shapes.add(circle);
		shapes.add(simpleRectangle);

		panel = new PaintPanel(shapes);
		startMovement();
		// startMovementWithoutThread();
	}

	private void startMovementWithoutThread() {
		while (true) {
			System.out.println("Kutu su anda: " + box.getX() + " pozisyonunda.");
			box.setX(box.getX() + 5);
			panel.repaint();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void startMovement() {
		new Thread(new Runnable() {

			@Override
			public void run() {
				while ((box.getX() + box.getWidth()) <= 640) {
					box.setX(box.getX() + 1);
					panel.repaint();
					System.out.println("Box position: " + box.getX());
					try {
						Thread.sleep(2);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	}

	public void startApplication() {
		JFrame frame = new JFrame();
		frame.setTitle("Paint Example");
		frame.setContentPane(panel);
		frame.setSize(640, 480);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
