package _03_harry_potter;

public class HarryRunner {
	public static void main(String[] args) {
		
		// Create a HarryRunner class in the harry_potter package with a main method.
		 // The main method should:
		  
		// 1. create harry potter
		HarryPotter Harry = new HarryPotter();
		// 2. make him become invisible
		Harry.makeInvisible(true);
		// 3. spy on Professor Snape
		Harry.spyOnSnape();
		// 4. make him become visible again
		Harry.makeInvisible(true);
		// 5. cast a “Stupefy” spell
		Harry.castSpell("Stupefy");
	
	}
}
