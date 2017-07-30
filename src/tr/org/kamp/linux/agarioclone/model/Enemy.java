package tr.org.kamp.linux.agarioclone.model;

import java.awt.Color;

public class Enemy extends GameObject {
	
	private int speed;
	
	public Enemy(int x, int y, int radius, Color color) {
		super(x, y, radius, color);
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
