package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
		// Your mission and you have to accept it:
		// Create a PopcornMaker class (in the popcorn package) and add a main method to it. 
		
		// The main method should create a bag of Popcorn and cook it in the microwave.
		
		// Ask the user for the flavor of the popcorn and the number of minutes to cook it.
		Microwave Micro = new Microwave();
		String flavor = JOptionPane.showInputDialog("What flavor popcorn do you want?");
		Popcorn Pop = new Popcorn(flavor);
		String time = JOptionPane.showInputDialog("How long do you want to cook it for?");
		int Time = Integer.parseInt(time);
		Micro.putInMicrowave(Pop);
		Micro.setTime(Time);
		Micro.startMicrowave();
		Pop.eat();
		
		// Don't change the existing methods.
		 
		
	}
}
