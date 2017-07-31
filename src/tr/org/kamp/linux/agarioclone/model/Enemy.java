package tr.org.kamp.linux.agarioclone.model;

import java.awt.Color;

public class Enemy extends GameObject {
	
	private int speed;
	
	public Enemy(int x, int y, int radius, int speed, Color color) {
		super(x, y, radius, color);
		this.speed = speed;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
