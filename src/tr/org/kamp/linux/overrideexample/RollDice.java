package tr.org.kamp.linux.overrideexample;

public class RollDice {

	public static void main(String[] args) {
		FairDie die1 = new FairDie();
		FairDie die2 = new FairDie();
		System.out.println("Hadi duses: " + die1.roll() + " - " + die2.roll());
		
		GamblersDie gDie1 = new GamblersDie();
		GamblersDie gDie2 = new GamblersDie();
		
		System.out.println("Gambler: " + gDie1.roll() + " - " + gDie2.roll());
	}

}
