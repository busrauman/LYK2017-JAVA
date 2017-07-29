package tr.org.kamp.linux.userinterface;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class PaintPanel extends JPanel {

	private Box box;

	public PaintPanel() {
		box = new Box(Color.BLACK);
		System.out.println("Kutu yaratildi");
		startMovement();
//		startMovementWithoutThread();
		System.out.println("kutu hareketi basladi");
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;
		g2d.fillRect(box.getX(), box.getY(), box.getWidth(), box.getHeight());
	}
	
	private void startMovementWithoutThread() {
		while (true) {
			System.out.println("Kutu su anda: " + box.getX() + " pozisyonunda.");
			box.setX(box.getX() + 5);
			repaint();
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
					box.setX(box.getX() + 5);
					repaint();
					try {
						Thread.sleep(250);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	}
}
