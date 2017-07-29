package tr.org.kamp.linux.userinterface.model;

import java.awt.Color;
import java.awt.Graphics2D;

public class Circle extends AbstractShape {

	public Circle(int x, int y, int radius, Color color) {
		super(x, y, radius, radius, color);
	}

	@Override
	public void draw(Graphics2D g2d) {
		g2d.setColor(getColor());
		g2d.fillOval(getX(), getY(), getWidth(), getHeight());
	}

}
