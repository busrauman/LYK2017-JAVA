package tr.org.kamp.linux.userinterface.logic;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;

import tr.org.kamp.linux.userinterface.model.AbstractShape;
import tr.org.kamp.linux.userinterface.model.Box;
import tr.org.kamp.linux.userinterface.model.Circle;
import tr.org.kamp.linux.userinterface.model.SimpleRectangle;
import tr.org.kamp.linux.userinterface.painting.PaintPanel;

public class PaintingLogic {

	private Scanner scanner;

	private ArrayList<AbstractShape> shapes;
	private Box box;
	private Circle circle;
	private SimpleRectangle simpleRectangle;
	private PaintPanel panel;

	private int movement = 0;

	public PaintingLogic() {

		scanner = new Scanner(System.in);

		box = new Box(0, 0, 100, 100, Color.BLACK);
		circle = new Circle(0, 0, 100, Color.GREEN);
		simpleRectangle = new SimpleRectangle(200, 200, 350, 60, Color.BLUE);

		shapes = new ArrayList<AbstractShape>();
		shapes.add(box);
		shapes.add(circle);
		shapes.add(simpleRectangle);

		panel = new PaintPanel(shapes);

		startMovement();
		// handleInput();
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
					box.setX(box.getX() + movement);
					panel.repaint();
					// System.out.println("Box position: " + box.getX());
					try {
						Thread.sleep(25);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	}

	private void handleInput() {
		new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					int i = scanner.nextInt();
					if (i == 1) {
						movement = -1;
					} else if (i == 2) {
						movement = 1;
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
		frame.setFocusable(true);
		frame.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					movement = 0;
				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					movement = 0;
				}
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					movement = 1;
				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					movement = -1;
				}
			}
		});
		frame.setVisible(true);
	}
}
