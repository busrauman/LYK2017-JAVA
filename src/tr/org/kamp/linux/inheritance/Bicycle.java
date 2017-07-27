package tr.org.kamp.linux.inheritance;

public class Bicycle {
	private int gear;
	private int speed;
	private String color;
	
	public Bicycle(int speed ,  int gear, String color) {
		this.speed = speed;
		this.gear = gear;
		this.color = color;
	}
	
	
	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void changeSpeed(int speed) {
		this.speed += speed;
		
	}
	
	public void changeGear(int gear) {
		if(gear > 0 ) this.gear = gear;
		
		else System.out.println("Vites değeri 0 dan küçük olamaz");
	}


	@Override
	public String toString() {
		return "Bicycle [gear=" + gear + ", speed=" + speed + ", color=" + color + "]";
	}
	
	
	
}
