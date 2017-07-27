package tr.org.kamp.linux.Car;

public class Car {

	private int speed;
	private int gear;
	private String brand;
	
	public Car(int gear, int speed, String brand) {
		
		this.gear = gear;
		this.speed = speed;
		this.brand = brand;
	}
	public Car() {
		
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	public void speedUp(int inc) {
		if(inc > 0) {
			speed += inc;
		}
	}
	
	public void speedDown(int speed) {
		if(speed > 0) {
			this.speed -= speed; 
		}
	}
	
	
	public void changeGear(int gear) {
		this.gear = gear;
	}
	
	
	
	
	
	
	
}
