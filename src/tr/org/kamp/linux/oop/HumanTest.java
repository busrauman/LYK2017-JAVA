package tr.org.kamp.linux.oop;

public class HumanTest {
	public static void main(String[] args) {
		// Sınıf üzerinden Instance yarattık
		Human busra = new Human();
		Human halid = new Human("1" , "Halid", "Erkek", 10);
		
		// Nesnenin durumlarını atadık.
		busra.name = "Büşra";
		busra.age = 24;
		busra.id = "123";
		busra.gender = "Kadın";
		
		//Nesnenin davranışlarını gördük
		busra.eat();
		busra.speak();
		
		
	}
}
