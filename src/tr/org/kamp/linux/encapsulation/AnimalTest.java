package tr.org.kamp.linux.encapsulation;

public class AnimalTest {
	public static void main(String[] args) {
		Animal animal = new Animal();
		
		animal.setKind("Sürüngen");
		animal.setColor("Sarı");
		animal.setAge(3);
		
		animal.hunt();
		animal.eat();
		
		System.out.println(" türü : " + animal.getKind()
		+ " rengi : " + animal.getColor()
		+ " yaşı : " + animal.getAge());
		
	}
}
