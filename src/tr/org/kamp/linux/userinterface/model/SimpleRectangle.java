package tr.org.kamp.linux.userinterface.model;

import java.awt.Color;
import java.awt.Graphics2D;

public class SimpleRectangle extends AbstractShape {

	public SimpleRectangle(int x, int y, int width, int height, Color color) {
		super(x, y, width, height, color);
	}
	
	@Override
	public void draw(Graphics2D g2d) {
		g2d.setColor(getColor());
		g2d.drawRect(getX(), getY(), getWidth(), getHeight());
	}

}
