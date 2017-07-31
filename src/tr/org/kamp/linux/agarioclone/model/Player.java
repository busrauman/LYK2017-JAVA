package tr.org.kamp.linux.agarioclone.model;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Player extends GameObject {

	private int speed;
	private BufferedImage image;

	public Player(int x, int y, int radius, int speed, Color color) {
		super(x, y, radius, color);
		this.speed = speed;
		try {
			image = ImageIO.read(getClass().getResource("/guray.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	@Override
	public void draw(Graphics2D g2d) {
		// TODO Auto-generated method stub
//		super.draw(g2d);
		g2d.drawImage(image, getX(), getY(), getRadius(), getRadius(), null);
	}

}
