package tr.org.kamp.linux.encapsulation;

public class Animal {
	
	//fields - states -durumlar
	private String kind;
	private String color;
	private int age;
	
	// get set methods
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//ends of get set methods
	public void eat() {
		System.out.println("Animal yemek yedi ");
	}
	
	public void hunt() {
		System.out.println("Animal avlandı");
	}
	

}
