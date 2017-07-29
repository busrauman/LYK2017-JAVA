package tr.org.kamp.linux.overrideexample;

import java.util.Random;

public class FairDie {

		Random random;
		
		public FairDie() {
			random = new Random();
		}
		
		public int roll() {
			return random.nextInt(6) + 1;
		}
	
}
