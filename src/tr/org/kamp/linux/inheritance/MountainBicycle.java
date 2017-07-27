package tr.org.kamp.linux.inheritance;

public class MountainBicycle  extends Bicycle{
	private int spin;
	
	public MountainBicycle(int speed, int gear, String color, int spin) {
		super(speed, gear, color);
		this.spin = spin;
	}
	
	public void changeSpin(int spin) {
		this.spin += spin;
	}

	@Override
	public String toString() {
		return "MountainBicycle [spin=" + spin + " color =" + super.getColor() + 
				" gear = "  + super.getGear() + " speed = " + super.getSpeed()+ "]" ;
	}
	
	

}
