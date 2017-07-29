package tr.org.kamp.linux.userinterface.painting;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;

import tr.org.kamp.linux.userinterface.model.AbstractShape;

public class PaintPanel extends JPanel {


	private ArrayList<AbstractShape> shapes;

	public PaintPanel(ArrayList<AbstractShape> shapes) {
		this.shapes = shapes;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;
		
		for (AbstractShape abstractShape : shapes) {
			abstractShape.draw(g2d);
		}
	}
	



}
